package com.liferay.portlet.documentlibrary.model;

import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the DLFileEntry service. Represents a row in the &quot;DLFileEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileEntryModel
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryModelImpl
 * @generated
 */
public interface DLFileEntry extends DLFileEntryModel, PersistedModel, TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.documentlibrary.model.impl.DLFileEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @Override
    public java.lang.String buildTreePath()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.io.InputStream getContentStream()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.io.InputStream getContentStream(java.lang.String version)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public long getDataRepositoryId();

    public com.liferay.portal.kernel.util.UnicodeProperties getExtraSettingsProperties();

    public java.util.Map<java.lang.String, com.liferay.portlet.dynamicdatamapping.storage.Fields> getFieldsMap(
        long fileVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion(
        java.lang.String version)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getFileVersions(
        int status) throws com.liferay.portal.kernel.exception.SystemException;

    public int getFileVersionsCount(int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFolder getFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getIcon();

    public com.liferay.portlet.documentlibrary.model.DLFileVersion getLatestFileVersion(
        boolean trusted)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Lock getLock();

    public java.lang.String getLuceneProperties();

    /**
    * @deprecated As of 6.2.0, replaced by {@link DLFileVersion#getUserId()}
    */
    public long getVersionUserId();

    /**
    * @deprecated As of 6.2.0, replaced by {@link DLFileVersion#getUserName()}
    */
    public java.lang.String getVersionUserName();

    /**
    * @deprecated As of 6.2.0, replaced by {@link DLFileVersion#getUserUuid()}
    */
    public java.lang.String getVersionUserUuid();

    public boolean hasLock();

    public boolean isCheckedOut();

    public boolean isInHiddenFolder();

    public boolean isInTrashExplicitly()
        throws com.liferay.portal.kernel.exception.SystemException;

    public void setExtraSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties extraSettingsProperties);
}
