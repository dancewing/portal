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

package com.liferay.portal.language;

import com.liferay.portal.kernel.bean.Util;
import com.liferay.portal.kernel.language.LanguageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PropertiesUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import org.apache.commons.lang.NotImplementedException;

import java.io.InputStream;

import java.net.URL;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Shuyang Zhou
 */
@Util
public class LanguageResources {

	public static final String AUTOMATIC_COPY = " (Automatic Copy)";

	public static final String AUTOMATIC_TRANSLATION = " (Automatic Translation)";


	public static String fixValue(String value) {
		if (value.endsWith(AUTOMATIC_COPY)) {
			value = value.substring(
				0, value.length() - AUTOMATIC_COPY.length());
		}

		if (value.endsWith(AUTOMATIC_TRANSLATION)) {
			value = value.substring(
				0, value.length() - AUTOMATIC_TRANSLATION.length());
		}

		return value;
	}

	public static void fixValues(
		Map<String, String> languageMap, Properties properties) {

		for (Map.Entry<Object, Object> entry : properties.entrySet()) {
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();

			value = fixValue(value);

			languageMap.put(key, value);
		}
	}

	public static String getMessage(Locale locale, String key) {
		if (locale == null) {
			return null;
		}

		Map<String, String> languageMap = _languageMaps.get(locale);

		if (languageMap == null) {
			languageMap = _loadLocale(locale);
		}

		String value = languageMap.get(key);

		if (value == null) {
			return getMessage(getSuperLocale(locale), key);
		}
		else {
			return value;
		}
	}

	public static Locale getSuperLocale(Locale locale) {
		String variant = locale.getVariant();

		if (variant.length() > 0) {
			return new Locale(locale.getLanguage(), locale.getCountry());
		}

		String country = locale.getCountry();

		if (country.length() > 0) {
			Locale priorityLocale = LanguageUtil.getLocale(
				locale.getLanguage());

			if ((priorityLocale != null) && !locale.equals(priorityLocale)) {
				return new Locale(
					priorityLocale.getLanguage(), priorityLocale.getCountry());
			}

			return LocaleUtil.fromLanguageId(locale.getLanguage(), false, true);
		}

		String language = locale.getLanguage();

		if (language.length() > 0) {
			return _blankLocale;
		}

		return null;
	}

	public static Map<String, String> putLanguageMap(
		Locale locale, Map<String, String> languageMap) {

		Map<String, String> oldLanguageMap = _languageMaps.get(locale);

		if (oldLanguageMap == null) {
			_loadLocale(locale);
			oldLanguageMap = _languageMaps.get(locale);
		}

		Map<String, String> newLanguageMap = new HashMap<String, String>();

		if (oldLanguageMap != null) {
			newLanguageMap.putAll(oldLanguageMap);
		}

		newLanguageMap.putAll(languageMap);

		_languageMaps.put(locale, newLanguageMap);

		return oldLanguageMap;
	}

	public void setConfig(String config) {
		_configNames = StringUtil.split(
			config.replace(CharPool.PERIOD, CharPool.SLASH));
	}

	private static Map<String, String> _loadLocale(Locale locale) {
		Map<String, String> languageMap = null;

		if (_configNames.length > 0) {
			String localeName = locale.toString();

			languageMap = new HashMap<String, String>();

			for (String name : _configNames) {
				StringBundler sb = new StringBundler(4);

				sb.append(name);

				if (localeName.length() > 0) {
					sb.append(StringPool.UNDERLINE);
					sb.append(localeName);
				}

				sb.append(".properties");

				Properties properties = _loadProperties(sb.toString());

				fixValues(languageMap, properties);
			}
		}
		else {
			languageMap = Collections.emptyMap();
		}

		_languageMaps.put(locale, languageMap);

		return languageMap;
	}

	private static Properties _loadProperties(String name) {
		Properties properties = new Properties();

		try {
			ClassLoader classLoader = LanguageResources.class.getClassLoader();

			Enumeration<URL> enu = classLoader.getResources(name);

			if (_log.isDebugEnabled() && !enu.hasMoreElements()) {
				_log.debug("No resources found for " + name);
			}

			while (enu.hasMoreElements()) {
				URL url = enu.nextElement();

				if (_log.isInfoEnabled()) {
					_log.info("Loading " + name + " from " + url);
				}

				InputStream inputStream = url.openStream();

				try {
					Properties inputStreamProperties = PropertiesUtil.load(
						inputStream, StringPool.UTF8);

					properties.putAll(inputStreamProperties);

					if (_log.isInfoEnabled()) {
						_log.info(
							"Loading " + url + " with " +
								inputStreamProperties.size() + " values");
					}
				}
				finally {
					inputStream.close();
				}
			}
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn(e.getMessage(), e);
			}
		}

		return properties;
	}

	private static final Logger _log = LoggerFactory.getLogger(LanguageResources.class);

	private static Locale _blankLocale = new Locale(StringPool.BLANK);
	private static String[] _configNames;
	private static Map<Locale, Map<String, String>> _languageMaps =
		new ConcurrentHashMap<Locale, Map<String, String>>(64);

}