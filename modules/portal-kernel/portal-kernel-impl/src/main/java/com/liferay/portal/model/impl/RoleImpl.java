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

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.Team;
import com.liferay.portal.service.TeamLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

/**
 * @author Brian Wing Shun Chan
 * @author Jorge Ferrer
 */
public class RoleImpl extends RoleBaseImpl {

	public RoleImpl() {
	}

	@Override
	public String getDescriptiveName() throws PortalException, SystemException {
		String name = getName();

		if (isTeam()) {
			Team team = TeamLocalServiceUtil.getTeam(getClassPK());

			name = team.getName();
		}

		return name;
	}

	@Override
	public String getTitle(String languageId) {
		String value = super.getTitle(languageId);

		if (Validator.isNull(value)) {
			try {
				value = getDescriptiveName();
			}
			catch (Exception e) {
				_log.error(e.getMessage(), e);
			}
		}

		return value;
	}

	@Override
	public String getTitle(String languageId, boolean useDefault) {
		String value = super.getTitle(languageId, useDefault);

		if (Validator.isNull(value)) {
			try {
				value = getDescriptiveName();
			}
			catch (Exception e) {
				_log.error(e.getMessage(), e);
			}
		}

		return value;
	}

	@Override
	public String getTypeLabel() {
		return RoleConstants.getTypeLabel(getType());
	}

	@Override
	public boolean isTeam() {
		return hasClassName(Team.class);
	}

	protected boolean hasClassName(Class<?> clazz) {
		long classNameId = getClassNameId();

		if (classNameId == PortalUtil.getClassNameId(clazz)) {
			return true;
		}
		else {
			return false;
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(RoleImpl.class);

}