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

package com.liferay.portal.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.model.LayoutSetPrototype;
import com.liferay.portal.service.LayoutSetPrototypeLocalServiceUtil;
import com.liferay.portal.service.persistence.LayoutSetPrototypeUtil;

import java.util.Date;

/**
 * @author Raymond Augé
 */
public class LayoutSetPrototypeLayoutSetListener
	extends BaseModelListener<LayoutSet> {

	@Override
	public void onAfterCreate(LayoutSet layoutSet) {
		updateLayoutSetPrototype(layoutSet, layoutSet.getModifiedDate());
	}

	@Override
	public void onAfterRemove(LayoutSet layoutSet) {
		updateLayoutSetPrototype(layoutSet, new Date());
	}

	@Override
	public void onAfterUpdate(LayoutSet layoutSet) {
		updateLayoutSetPrototype(layoutSet, layoutSet.getModifiedDate());
	}

	protected void updateLayoutSetPrototype(
		LayoutSet layoutSet, Date modifiedDate) {

		try {
			Group group = layoutSet.getGroup();

			if (!group.isLayoutSetPrototype()) {
				return;
			}

			LayoutSetPrototype layoutSetPrototype =
				LayoutSetPrototypeLocalServiceUtil.getLayoutSetPrototype(
					group.getClassPK());

			layoutSetPrototype.setModifiedDate(modifiedDate);

			UnicodeProperties settingsProperties =
				layoutSet.getSettingsProperties();

			settingsProperties.remove("merge-fail-count");

			LayoutSetPrototypeUtil.update(layoutSetPrototype);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		LayoutSetPrototypeLayoutSetListener.class);

}