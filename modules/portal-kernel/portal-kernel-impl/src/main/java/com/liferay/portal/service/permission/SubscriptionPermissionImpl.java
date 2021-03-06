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

package com.liferay.portal.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowInstance;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortletKeys;
//import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portlet.bookmarks.model.BookmarksEntry;
import com.liferay.portlet.bookmarks.service.permission.BookmarksEntryPermission;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.permission.DLFileEntryPermission;
import com.liferay.portlet.documentlibrary.service.permission.DLFolderPermission;
import com.liferay.portlet.documentlibrary.service.persistence.DLFolderUtil;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.permission.JournalPermission;

/**
 * @author Mate Thurzo
 * @author Raymond Augé
 */
public class SubscriptionPermissionImpl implements SubscriptionPermission {

	/**
	 * @deprecated As of 6.2.0, replaced by {@link #check(PermissionChecker,
	 *             String, long, String, long)}
	 */
	@Override
	public void check(
			PermissionChecker permissionChecker, String className, long classPK)
		throws PortalException, SystemException {

		check(permissionChecker, className, classPK, null, 0);
	}

	@Override
	public void check(
			PermissionChecker permissionChecker, String subscriptionClassName,
			long subscriptionClassPK, String inferredClassName,
			long inferredClassPK)
		throws PortalException, SystemException {

		if (!contains(
				permissionChecker, subscriptionClassName, subscriptionClassPK,
				inferredClassName, inferredClassPK)) {

			throw new PrincipalException();
		}
	}

	/**
	 * @deprecated As of 6.2.0, replaced by {@link #contains(PermissionChecker,
	 *             String, long, String, long)}
	 */
	@Override
	public boolean contains(
			PermissionChecker permissionChecker, String className, long classPK)
		throws PortalException, SystemException {

		return contains(permissionChecker, className, classPK, null, 0);
	}

	@Override
	public boolean contains(
			PermissionChecker permissionChecker, String subscriptionClassName,
			long subscriptionClassPK, String inferredClassName,
			long inferredClassPK)
		throws PortalException, SystemException {

		if (subscriptionClassName == null) {
			return false;
		}

		if (Validator.isNotNull(inferredClassName)) {
			Boolean hasPermission = hasPermission(
				permissionChecker, inferredClassName, inferredClassPK,
				ActionKeys.VIEW);

			if ((hasPermission == null) || !hasPermission) {
				return false;
			}
		}

		Boolean hasPermission = hasPermission(
			permissionChecker, subscriptionClassName, subscriptionClassPK,
			ActionKeys.SUBSCRIBE);

		if (hasPermission != null) {
			return hasPermission;
		}

		if (Validator.equals(
				inferredClassName,
				"com.liferay.portlet.documentlibrary.model.DLFileEntry")) {

			DLFileEntry dlFileEntry =
				DLFileEntryLocalServiceUtil.getDLFileEntry(inferredClassPK);

			DLFolder dlFolder = DLFolderUtil.fetchByPrimaryKey(
				dlFileEntry.getFolderId());

			if (Validator.isNotNull(dlFolder)) {
				return DLFolderPermission.contains(
					permissionChecker, dlFolder, ActionKeys.VIEW);
			}
		}

		return true;
	}

	protected Boolean hasPermission(
			PermissionChecker permissionChecker, String className, long classPK,
			String actionId)
		throws PortalException, SystemException {


//		if (className.equals(BlogsEntry.class.getName())) {
//			return BlogsPermission.contains(
//				permissionChecker, classPK, actionId);
//		}
//		else 
		if (className.equals(BookmarksEntry.class.getName())) {
			return BookmarksEntryPermission.contains(
				permissionChecker, classPK, actionId);
		}
		else if (className.equals(DLFileEntry.class.getName())) {
			return DLFileEntryPermission.contains(
				permissionChecker, classPK, actionId);
		}
		else if (className.equals(JournalArticle.class.getName())) {
			return JournalPermission.contains(
				permissionChecker, classPK, actionId);
		}

		return null;
	}

}