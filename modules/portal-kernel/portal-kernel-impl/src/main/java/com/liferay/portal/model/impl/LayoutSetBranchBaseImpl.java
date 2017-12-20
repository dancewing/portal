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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.LayoutSetBranch;
import com.liferay.portal.service.LayoutSetBranchLocalServiceUtil;

/**
 * The extended model base implementation for the LayoutSetBranch service. Represents a row in the &quot;LayoutSetBranch&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LayoutSetBranchImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetBranchImpl
 * @see com.liferay.portal.model.LayoutSetBranch
 * @generated
 */
public abstract class LayoutSetBranchBaseImpl extends LayoutSetBranchModelImpl
	implements LayoutSetBranch {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a layout set branch model instance should use the {@link LayoutSetBranch} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LayoutSetBranchLocalServiceUtil.addLayoutSetBranch(this);
		}
		else {
			LayoutSetBranchLocalServiceUtil.updateLayoutSetBranch(this);
		}
	}
}