package com.liferay.portlet.documentlibrary.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

/**
 * The extended model base implementation for the DLFileEntry service. Represents a row in the &quot;DLFileEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DLFileEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLFileEntryImpl
 * @see com.liferay.portlet.documentlibrary.model.DLFileEntry
 * @generated
 */
public abstract class DLFileEntryBaseImpl extends DLFileEntryModelImpl
    implements DLFileEntry {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a document library file entry model instance should use the {@link DLFileEntry} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DLFileEntryLocalServiceUtil.addDLFileEntry(this);
        } else {
            DLFileEntryLocalServiceUtil.updateDLFileEntry(this);
        }
    }

    @Override
    public void updateTreePath(String treePath) throws SystemException {
        DLFileEntry dlFileEntry = this;

        dlFileEntry.setTreePath(treePath);

        DLFileEntryLocalServiceUtil.updateDLFileEntry(dlFileEntry);
    }
}
