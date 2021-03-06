/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.dao.jdbc.util;

import com.liferay.portal.dao.orm.hibernate.SessionFactoryImpl;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.hibernate.PortalHibernateConfiguration;
import com.liferay.portal.spring.jpa.LocalContainerEntityManagerFactoryBean;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.PropsValues;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import javax.sql.DataSource;

import org.hibernate.engine.spi.SessionFactoryImplementor;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;

/**
 * @author Shuyang Zhou
 */
public class DataSourceSwapper {

	public static void swapCounterDataSource(Properties properties)
		throws Exception {

		if (_log.isInfoEnabled()) {
			_log.info("Create new counter data source");
		}

		DataSource newDataSource = DataSourceFactoryUtil.initDataSource(
			properties);

		DataSource oldDataSource =
			_counterDataSourceWrapper.getWrappedDataSource();

		if (_log.isInfoEnabled()) {
			_log.info("Set new counter data source");
		}

		_counterDataSourceWrapper.setWrappedDataSource(newDataSource);

		if (_log.isInfoEnabled()) {
			_log.info("Destroy old counter data source");
		}

		DataSourceFactoryUtil.destroyDataSource(oldDataSource);

		if (StringUtil.equalsIgnoreCase(
				PropsValues.PERSISTENCE_PROVIDER, "jpa")) {

			if (_log.isInfoEnabled()) {
				_log.info("Reinitialize Hibernate for new counter data source");
			}

			_reinitializeJPA("counterSessionFactory", newDataSource);
		}
		else {
			if (_log.isInfoEnabled()) {
				_log.info("Reinitialize JPA for new counter data source");
			}

			_reinitializeHibernate("counterSessionFactory", newDataSource);
		}
	}

	public void setCounterDataSourceWrapper(
		DataSourceWrapper counterDataSourceWrapper) {

		_counterDataSourceWrapper = counterDataSourceWrapper;
	}

	public void setLiferayDataSourceWrapper(
		DataSourceWrapper liferayDataSourceWrapper) {

		_liferayDataSourceWrapper = liferayDataSourceWrapper;
	}

	private static void _reinitializeHibernate(
			String name, DataSource dataSource)
		throws Exception {

		PortalHibernateConfiguration portalHibernateConfiguration =
			new PortalHibernateConfiguration();

		portalHibernateConfiguration.setDataSource(dataSource);

		portalHibernateConfiguration.afterPropertiesSet();

		SessionFactoryImplementor sessionFactoryImplementor =
			(SessionFactoryImplementor)portalHibernateConfiguration.getObject();

		SessionFactoryImpl sessionFactoryImpl =
			(SessionFactoryImpl)PortalBeanLocatorUtil.locate(name);

		sessionFactoryImpl.setSessionFactoryImplementor(
			sessionFactoryImplementor);

		AbstractPlatformTransactionManager abstractPlatformTransactionManager =
			(AbstractPlatformTransactionManager)PortalBeanLocatorUtil.locate(
				"liferayTransactionManager");

		if (abstractPlatformTransactionManager instanceof
				HibernateTransactionManager) {

			HibernateTransactionManager hibernateTransactionManager =
				(HibernateTransactionManager)abstractPlatformTransactionManager;

			hibernateTransactionManager.setSessionFactory(
				sessionFactoryImplementor);
		}
		else if (_log.isWarnEnabled()) {
			_log.warn(
				"Unable to swap to session factory for " +
					abstractPlatformTransactionManager.getClass() +
						" which may cause subsequent transaction failures");
		}
	}

	private static void _reinitializeJPA(String name, DataSource dataSource)
		throws Exception {

		LocalContainerEntityManagerFactoryBean
			localContainerEntityManagerFactoryBean =
				new LocalContainerEntityManagerFactoryBean();

		localContainerEntityManagerFactoryBean.setDataSource(dataSource);

		localContainerEntityManagerFactoryBean.afterPropertiesSet();

		EntityManagerFactory entityManagerFactory =
			localContainerEntityManagerFactoryBean.getObject();

		com.liferay.portal.dao.orm.jpa.SessionFactoryImpl sessionFactoryImpl =
			(com.liferay.portal.dao.orm.jpa.SessionFactoryImpl)
				PortalBeanLocatorUtil.locate(name);

		sessionFactoryImpl.setEntityManagerFactory(entityManagerFactory);
	}

	private static final Logger _log = LoggerFactory.getLogger(DataSourceSwapper.class);

	private static DataSourceWrapper _counterDataSourceWrapper;
	private static DataSourceWrapper _liferayDataSourceWrapper;

}