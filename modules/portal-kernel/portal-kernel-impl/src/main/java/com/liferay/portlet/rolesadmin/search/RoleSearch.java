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

package com.liferay.portlet.rolesadmin.search;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Role;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portal.util.PropsValues;
import com.liferay.portlet.PortalPreferences;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portlet.usersadmin.util.UsersAdminUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

/**
 * @author Brian Wing Shun Chan
 */
public class RoleSearch extends SearchContainer<Role> {

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("title");
		headerNames.add("type");

		if ((PropsValues.ROLES_ORGANIZATION_SUBTYPES.length > 0) ||
			(PropsValues.ROLES_REGULAR_SUBTYPES.length > 0) ||
			(PropsValues.ROLES_SITE_SUBTYPES.length > 0)) {

			headerNames.add("subtype");
		}

		headerNames.add("description");

		orderableHeaders.put("title", "title");
		orderableHeaders.put("type", "type");
		orderableHeaders.put("description", "description");
	}

	public static final String EMPTY_RESULTS_MESSAGE = "no-roles-were-found";

	public RoleSearch(PortletRequest portletRequest, PortletURL iteratorURL) {
		super(
			portletRequest, new RoleDisplayTerms(portletRequest),
			new RoleSearchTerms(portletRequest), DEFAULT_CUR_PARAM,
			DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		RoleDisplayTerms displayTerms = (RoleDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(
			RoleDisplayTerms.DESCRIPTION, displayTerms.getDescription());
		iteratorURL.setParameter(RoleDisplayTerms.NAME, displayTerms.getName());
		iteratorURL.setParameter(
			RoleDisplayTerms.TYPE, String.valueOf(displayTerms.getType()));

		try {
			PortalPreferences preferences =
				PortletPreferencesFactoryUtil.getPortalPreferences(
					portletRequest);

			String orderByCol = ParamUtil.getString(
				portletRequest, "orderByCol");
			String orderByType = ParamUtil.getString(
				portletRequest, "orderByType");

			if (Validator.isNotNull(orderByCol) &&
				Validator.isNotNull(orderByType)) {

				preferences.setValue(
					PortletKeys.ROLES_ADMIN, "roles-order-by-col", orderByCol);
				preferences.setValue(
					PortletKeys.ROLES_ADMIN, "roles-order-by-type",
					orderByType);
			}
			else {
				orderByCol = preferences.getValue(
					PortletKeys.ROLES_ADMIN, "roles-order-by-col", "title");
				orderByType = preferences.getValue(
					PortletKeys.ROLES_ADMIN, "roles-order-by-type", "asc");
			}

			OrderByComparator orderByComparator =
				UsersAdminUtil.getRoleOrderByComparator(
					orderByCol, orderByType);

			setOrderableHeaders(orderableHeaders);
			setOrderByCol(orderByCol);
			setOrderByType(orderByType);
			setOrderByComparator(orderByComparator);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(RoleSearch.class);

}