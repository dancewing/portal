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

package com.liferay.portal.kernel.dao.jdbc;

import com.liferay.portal.kernel.bean.Util;
import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;

import javax.sql.DataSource;

/**
 * @author Brian Wing Shun Chan
 */
@Util
public class SqlUpdateFactoryUtil {

	public static SqlUpdate getSqlUpdate(
		DataSource dataSource, String sql, int[] types) {

		return getSqlUpdateFactory().getSqlUpdate(dataSource, sql, types);
	}

	public static SqlUpdateFactory getSqlUpdateFactory() {
		PortalRuntimePermission.checkGetBeanProperty(
			SqlUpdateFactoryUtil.class);

		return _sqlUpdateFactory;
	}

	public void setSqlUpdateFactory(SqlUpdateFactory sqlUpdateFactory) {
		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_sqlUpdateFactory = sqlUpdateFactory;
	}

	private static SqlUpdateFactory _sqlUpdateFactory;

}