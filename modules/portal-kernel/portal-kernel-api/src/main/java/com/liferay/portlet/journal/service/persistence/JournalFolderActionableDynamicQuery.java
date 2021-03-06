package com.liferay.portlet.journal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.journal.model.JournalFolder;
import com.liferay.portlet.journal.service.JournalFolderLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JournalFolderActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JournalFolderActionableDynamicQuery() throws SystemException {
        setBaseLocalService(JournalFolderLocalServiceUtil.getService());
        setClass(JournalFolder.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("folderId");
    }
}
