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

package com.liferay.portal.velocity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.velocity.app.event.MethodExceptionEventHandler;

/**
 * @author Raymond Augé
 */
public class LiferayMethodExceptionEventHandler
	implements MethodExceptionEventHandler {

	@Override
	public Object methodException(
			@SuppressWarnings("rawtypes") Class clazz, String method,
			Exception e)
		throws Exception {

		_log.error(e.getMessage(), e);

		return null;
	}

	private static final Logger _log = LoggerFactory.getLogger(
		LiferayMethodExceptionEventHandler.class);

}