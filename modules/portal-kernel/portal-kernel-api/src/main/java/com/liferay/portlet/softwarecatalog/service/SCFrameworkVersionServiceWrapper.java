package com.liferay.portlet.softwarecatalog.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SCFrameworkVersionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SCFrameworkVersionService
 * @generated
 */
@ProviderType
public class SCFrameworkVersionServiceWrapper
    implements SCFrameworkVersionService,
        ServiceWrapper<SCFrameworkVersionService> {
    private SCFrameworkVersionService _scFrameworkVersionService;

    public SCFrameworkVersionServiceWrapper(
        SCFrameworkVersionService scFrameworkVersionService) {
        _scFrameworkVersionService = scFrameworkVersionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _scFrameworkVersionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _scFrameworkVersionService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion addFrameworkVersion(
        java.lang.String name, java.lang.String url, boolean active,
        int priority, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scFrameworkVersionService.addFrameworkVersion(name, url,
            active, priority, serviceContext);
    }

    @Override
    public void deleteFrameworkVersion(long frameworkVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _scFrameworkVersionService.deleteFrameworkVersion(frameworkVersionId);
    }

    @Override
    public com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion getFrameworkVersion(
        long frameworkVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scFrameworkVersionService.getFrameworkVersion(frameworkVersionId);
    }

    @Override
    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion> getFrameworkVersions(
        long groupId, boolean active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _scFrameworkVersionService.getFrameworkVersions(groupId, active);
    }

    @Override
    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion> getFrameworkVersions(
        long groupId, boolean active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _scFrameworkVersionService.getFrameworkVersions(groupId, active,
            start, end);
    }

    @Override
    public com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion updateFrameworkVersion(
        long frameworkVersionId, java.lang.String name, java.lang.String url,
        boolean active, int priority)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scFrameworkVersionService.updateFrameworkVersion(frameworkVersionId,
            name, url, active, priority);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SCFrameworkVersionService getWrappedSCFrameworkVersionService() {
        return _scFrameworkVersionService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSCFrameworkVersionService(
        SCFrameworkVersionService scFrameworkVersionService) {
        _scFrameworkVersionService = scFrameworkVersionService;
    }

    @Override
    public SCFrameworkVersionService getWrappedService() {
        return _scFrameworkVersionService;
    }

    @Override
    public void setWrappedService(
        SCFrameworkVersionService scFrameworkVersionService) {
        _scFrameworkVersionService = scFrameworkVersionService;
    }
}
