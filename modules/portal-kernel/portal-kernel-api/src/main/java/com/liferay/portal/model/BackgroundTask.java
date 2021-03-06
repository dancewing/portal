package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the BackgroundTask service. Represents a row in the &quot;BackgroundTask&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BackgroundTaskModel
 * @see com.liferay.portal.model.impl.BackgroundTaskImpl
 * @see com.liferay.portal.model.impl.BackgroundTaskModelImpl
 * @generated
 */
public interface BackgroundTask extends BackgroundTaskModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.BackgroundTaskImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.repository.model.Folder addAttachmentsFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.kernel.repository.model.FileEntry> getAttachmentsFileEntries()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.kernel.repository.model.FileEntry> getAttachmentsFileEntries(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int getAttachmentsFileEntriesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    public long getAttachmentsFolderId()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getStatusLabel();

    public java.util.Map<java.lang.String, java.io.Serializable> getTaskContextMap();

    public boolean isInProgress();
}
