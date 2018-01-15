package com.liferay.portlet.dynamicdatalists.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DDLRecordService}.
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordService
 * @generated
 */
public class DDLRecordServiceWrapper implements DDLRecordService,
    ServiceWrapper<DDLRecordService> {
    private DDLRecordService _ddlRecordService;

    public DDLRecordServiceWrapper(DDLRecordService ddlRecordService) {
        _ddlRecordService = ddlRecordService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ddlRecordService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ddlRecordService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord addRecord(
        long groupId, long recordSetId, int displayIndex,
        com.liferay.portlet.dynamicdatamapping.storage.Fields fields,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ddlRecordService.addRecord(groupId, recordSetId, displayIndex,
            fields, serviceContext);
    }

    @Override
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord addRecord(
        long groupId, long recordSetId, int displayIndex,
        java.util.Map<java.lang.String, java.io.Serializable> fieldsMap,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ddlRecordService.addRecord(groupId, recordSetId, displayIndex,
            fieldsMap, serviceContext);
    }

    @Override
    public void deleteRecord(long recordId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ddlRecordService.deleteRecord(recordId);
    }

    @Override
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord deleteRecordLocale(
        long recordId, java.util.Locale locale,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ddlRecordService.deleteRecordLocale(recordId, locale,
            serviceContext);
    }

    @Override
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord getRecord(
        long recordId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ddlRecordService.getRecord(recordId);
    }

    @Override
    public void revertRecordVersion(long recordId, java.lang.String version,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ddlRecordService.revertRecordVersion(recordId, version, serviceContext);
    }

    @Override
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord updateRecord(
        long recordId, boolean majorVersion, int displayIndex,
        com.liferay.portlet.dynamicdatamapping.storage.Fields fields,
        boolean mergeFields,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ddlRecordService.updateRecord(recordId, majorVersion,
            displayIndex, fields, mergeFields, serviceContext);
    }

    @Override
    public com.liferay.portlet.dynamicdatalists.model.DDLRecord updateRecord(
        long recordId, int displayIndex,
        java.util.Map<java.lang.String, java.io.Serializable> fieldsMap,
        boolean mergeFields,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ddlRecordService.updateRecord(recordId, displayIndex,
            fieldsMap, mergeFields, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DDLRecordService getWrappedDDLRecordService() {
        return _ddlRecordService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDDLRecordService(DDLRecordService ddlRecordService) {
        _ddlRecordService = ddlRecordService;
    }

    @Override
    public DDLRecordService getWrappedService() {
        return _ddlRecordService;
    }

    @Override
    public void setWrappedService(DDLRecordService ddlRecordService) {
        _ddlRecordService = ddlRecordService;
    }
}
