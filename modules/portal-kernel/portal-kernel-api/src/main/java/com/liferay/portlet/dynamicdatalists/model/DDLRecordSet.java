package com.liferay.portlet.dynamicdatalists.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DDLRecordSet service. Represents a row in the &quot;DDLRecordSet&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordSetModel
 * @see com.liferay.portlet.dynamicdatalists.model.impl.DDLRecordSetImpl
 * @see com.liferay.portlet.dynamicdatalists.model.impl.DDLRecordSetModelImpl
 * @generated
 */
@ProviderType
public interface DDLRecordSet extends DDLRecordSetModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.dynamicdatalists.model.impl.DDLRecordSetImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.dynamicdatamapping.model.DDMStructure getDDMStructure()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.dynamicdatamapping.model.DDMStructure getDDMStructure(
        long formDDMTemplateId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> getRecords()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatamapping.storage.Fields> getRecordsFieldsList()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
