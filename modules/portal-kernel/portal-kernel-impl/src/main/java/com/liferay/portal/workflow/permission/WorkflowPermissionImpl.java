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

package com.liferay.portal.workflow.permission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.security.pacl.DoPrivileged;
import com.liferay.portal.kernel.workflow.WorkflowException;
import com.liferay.portal.kernel.workflow.WorkflowInstance;
import com.liferay.portal.kernel.workflow.WorkflowInstanceManagerUtil;
import com.liferay.portal.kernel.workflow.WorkflowTaskManagerUtil;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import com.liferay.portal.model.WorkflowInstanceLink;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.service.WorkflowInstanceLinkLocalServiceUtil;

/**
 * @author Jorge Ferrer
 */
@DoPrivileged
public class WorkflowPermissionImpl implements WorkflowPermission {

	@Override
	public Boolean hasPermission(
		PermissionChecker permissionChecker, long groupId, String className,
		long classPK, String actionId) {

		try {
			return doHasPermission(
				permissionChecker, groupId, className, classPK, actionId);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return null;
	}

	protected Boolean doHasPermission(
			PermissionChecker permissionChecker, long groupId, String className,
			long classPK, String actionId)
		throws Exception {

		long companyId = permissionChecker.getCompanyId();

		if (permissionChecker.isCompanyAdmin() ||
			permissionChecker.isGroupAdmin(groupId)) {

			return Boolean.TRUE;
		}

		if (!WorkflowDefinitionLinkLocalServiceUtil.hasWorkflowDefinitionLink(
				companyId, groupId, className)) {

			return null;
		}

		if (WorkflowInstanceLinkLocalServiceUtil.hasWorkflowInstanceLink(
				companyId, groupId, className, classPK)) {

			WorkflowInstanceLink workflowInstanceLink =
				WorkflowInstanceLinkLocalServiceUtil.getWorkflowInstanceLink(
					companyId, groupId, className, classPK);

			WorkflowInstance workflowInstance =
				WorkflowInstanceManagerUtil.getWorkflowInstance(
					companyId, workflowInstanceLink.getWorkflowInstanceId());

			if (workflowInstance.isComplete()) {
				return null;
			}

			boolean hasPermission = hasImplicitPermission(
				permissionChecker, workflowInstance);

			if (!hasPermission && actionId.equals(ActionKeys.VIEW)) {
				return null;
			}
			else {
				return hasPermission;
			}
		}

		return null;
	}

	protected boolean hasImplicitPermission(
			PermissionChecker permissionChecker,
			WorkflowInstance workflowInstance)
		throws WorkflowException {

		if (WorkflowTaskManagerUtil.getWorkflowTaskCountByWorkflowInstance(
				permissionChecker.getCompanyId(), permissionChecker.getUserId(),
				workflowInstance.getWorkflowInstanceId(), Boolean.FALSE) > 0) {

			return true;
		}

		if (WorkflowTaskManagerUtil.getWorkflowTaskCountByUserRoles(
				permissionChecker.getCompanyId(), permissionChecker.getUserId(),
				Boolean.FALSE) > 0) {

			return true;
		}

		return false;
	}

	private static final Logger _log = LoggerFactory.getLogger(
		WorkflowPermissionImpl.class);

}