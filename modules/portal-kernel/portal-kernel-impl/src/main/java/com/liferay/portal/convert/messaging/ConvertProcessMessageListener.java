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

package com.liferay.portal.convert.messaging;

import com.liferay.portal.convert.ConvertProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.util.InstancePool;
import com.liferay.portal.util.ShutdownUtil;

/**
 * @author Alexander Chow
 */
public class ConvertProcessMessageListener implements MessageListener {

	@Override
	public void receive(Message message) {
		try {
			doReceive(message);
		}
		catch (Exception e) {
			_log.error("Unable to process message " + message, e);

			ShutdownUtil.shutdown(0);
		}
	}

	protected void doReceive(Message message) throws Exception {
		String className = (String)message.getPayload();

		ConvertProcess convertProcess = (ConvertProcess)InstancePool.get(
			className);

		convertProcess.convert();
	}

	private static final Logger _log = LoggerFactory.getLogger(
		ConvertProcessMessageListener.class);

}