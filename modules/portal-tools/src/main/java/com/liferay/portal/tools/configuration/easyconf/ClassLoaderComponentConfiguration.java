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

package com.liferay.portal.tools.configuration.easyconf;

import com.germinus.easyconf.*;
import com.liferay.portal.kernel.util.SystemProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;

/**
 * @author Raymond Augé
 */
public class ClassLoaderComponentConfiguration extends ComponentConfiguration {

	public ClassLoaderComponentConfiguration(
		ClassLoader classLoader, String companyId, String componentName) {

		super(companyId, componentName);

		_classLoader = classLoader;
		_companyId = companyId;
		_componentName = componentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ComponentConfiguration)) {
			return false;
		}

		ComponentConfiguration componentConfiguration =
			(ComponentConfiguration)obj;

		return _componentName.equals(componentConfiguration.getComponentName());
	}

	@Override
	public String getComponentName() {
		return _componentName;
	}

	@Override
	public Object getConfigurationObject() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getConfigurationObject(String configurationName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ComponentProperties getProperties() {
		ComponentProperties componentProperties = _getAvailableProperties();

		if (!componentProperties.hasBaseConfiguration()) {
			throw new ConfigurationNotFoundException(
				_componentName, "The base properties file was not found");
		}

		return componentProperties;
	}

	@Override
	public int hashCode() {
		return _componentName.hashCode();
	}

	@Override
	public void saveConfigurationObject(Object configurationObject) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void saveConfigurationObject(
		String confName, Object configurationObject) {

		throw new UnsupportedOperationException();
	}

	private ComponentProperties _getAvailableProperties() {
		if (_properties != null) {
			return _properties;
		}

		SystemProperties.set("base.path", ".");

		ClassLoaderAggregateProperties classLoaderAggregateProperties =
			new ClassLoaderAggregateProperties(
				_classLoader, _companyId, _componentName);

		classLoaderAggregateProperties.addGlobalFileName(
			Conventions.GLOBAL_CONFIGURATION_FILE +
				Conventions.PROPERTIES_EXTENSION);

		classLoaderAggregateProperties.addBaseFileName(
			_componentName + Conventions.PROPERTIES_EXTENSION);

		if (_log.isInfoEnabled()) {
			_log.info(
				"Properties for " + _componentName + " loaded from " +
					classLoaderAggregateProperties.loadedSources());
		}

		try {
			_properties = _constructor.newInstance(
				new Object[] {classLoaderAggregateProperties});
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return _properties;
	}

	private static final Logger _log = LoggerFactory.getLogger(
		ClassLoaderComponentConfiguration.class);

	private static Constructor<ComponentProperties> _constructor;

	static {
		try {
			_constructor = ComponentProperties.class.getDeclaredConstructor(
				AggregatedProperties.class);

			_constructor.setAccessible(true);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}
	}

	private ClassLoader _classLoader;
	private String _companyId;
	private String _componentName;
	private ComponentProperties _properties;

}