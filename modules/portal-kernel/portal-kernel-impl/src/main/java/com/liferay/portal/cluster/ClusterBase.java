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

package com.liferay.portal.cluster;

import com.liferay.portal.kernel.cluster.Address;
import com.liferay.portal.kernel.io.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InetAddressUtil;
import com.liferay.portal.kernel.util.SocketUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PropsValues;

import java.io.Serializable;

import java.net.InetAddress;
import java.net.NetworkInterface;

import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jgroups.JChannel;
import org.jgroups.Receiver;
import org.jgroups.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;

/**
 * @author Shuyang Zhou
 */
public abstract class ClusterBase {

    public static final String CONTROL_CHANNEL_SUFFIX = "_control";

	public void afterPropertiesSet() {
		if (!isEnabled()) {
			return;
		}

		if (!_initialized) {
			 // initSystemProperties();

			try {
				// initBindAddress();
			}
			catch (Exception e) {
				if (_log.isWarnEnabled()) {
					_log.warn("Failed to initialize outgoing IP address", e);
				}
			}

			_initialized = true;
		}

		try {
			initChannels();
		}
		catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error("Unable to initialize channels", e);
			}

			throw new IllegalStateException(e);
		}
	}

	public abstract void destroy();

	public boolean isEnabled() {
		return PropsValues.CLUSTER_LINK_ENABLED;
	}

	protected void sendJGroupsMessage(
			JChannel jChannel, org.jgroups.Address destAddress,
			Serializable serializable)
		throws Exception {

		Serializer serializer = new Serializer();

		serializer.writeObject(serializable);

		ByteBuffer byteBuffer = serializer.toByteBuffer();

		jChannel.send(
			destAddress, byteBuffer.array(), byteBuffer.position(),
			byteBuffer.remaining());

		if (_log.isDebugEnabled()) {
			_log.debug("Send message " + serializable);
		}
	}

	protected List<Address> getAddresses(JChannel channel) {
		BaseReceiver baseReceiver = (BaseReceiver)channel.getReceiver();

		View view = baseReceiver.getView();

		List<org.jgroups.Address> jGroupsAddresses = view.getMembers();

		if (jGroupsAddresses == null) {
			return Collections.emptyList();
		}

		List<Address> addresses = new ArrayList<Address>(
			jGroupsAddresses.size());

		for (org.jgroups.Address jgroupsAddress : jGroupsAddresses) {
			addresses.add(new AddressImpl(jgroupsAddress));
		}

		return addresses;
	}

	protected void initBindAddress() throws Exception {
		String autodetectAddress = PropsValues.CLUSTER_LINK_AUTODETECT_ADDRESS;

		if (Validator.isNull(autodetectAddress)) {
			bindInetAddress = InetAddressUtil.getLocalInetAddress();
			return;
		}

		String host = autodetectAddress;
		int port = 80;

		int index = autodetectAddress.indexOf(CharPool.COLON);

		if (index != -1) {
			host = autodetectAddress.substring(0, index);
			port = GetterUtil.getInteger(
				autodetectAddress.substring(index + 1), port);
		}

		if (_log.isInfoEnabled()) {
			_log.info(
				"Autodetecting JGroups outgoing IP address and interface for " +
					host + ":" + port);
		}

		SocketUtil.BindInfo bindInfo = SocketUtil.getBindInfo(host, port);

		bindInetAddress = bindInfo.getInetAddress();
		NetworkInterface networkInterface = bindInfo.getNetworkInterface();

		System.setProperty(
			"jgroups.bind_addr", bindInetAddress.getHostAddress());
		System.setProperty(
			"jgroups.bind_interface", networkInterface.getName());

		if (_log.isInfoEnabled()) {
			_log.info(
				"Setting JGroups outgoing IP address to " +
					bindInetAddress.getHostAddress() + " and interface to " +
						networkInterface.getName());
		}
	}

	protected abstract void initChannels() throws Exception;

	protected void initSystemProperties() {
		for (String systemProperty : PropsValues.CLUSTER_LINK_CHANNEL_SYSTEM_PROPERTIES) {

			int index = systemProperty.indexOf(CharPool.COLON);

			if (index == -1) {
				continue;
			}

			String key = systemProperty.substring(0, index);
			String value = systemProperty.substring(index + 1);

			System.setProperty(key, value);

			if (_log.isDebugEnabled()) {
				_log.debug(
					"Setting system property {key=" + key + ", value=" + value +
						"}");
			}
		}
	}

	protected static InetAddress bindInetAddress;

	private static final Logger _log = LoggerFactory.getLogger(ClusterBase.class);

	private static boolean _initialized;

	private Registration registration;

	private DiscoveryClient discoveryClient;

	@Value("${server.port}")
	private int serverPort;

	@Autowired
	public void setDiscoveryClient(DiscoveryClient discoveryClient) {
		this.discoveryClient = discoveryClient;
	}

	@Autowired
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
}