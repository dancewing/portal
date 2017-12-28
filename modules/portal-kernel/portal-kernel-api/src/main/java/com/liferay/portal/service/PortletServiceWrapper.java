package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PortletService}.
 *
 * @author Brian Wing Shun Chan
 * @see PortletService
 * @generated
 */
@ProviderType
public class PortletServiceWrapper implements PortletService,
    ServiceWrapper<PortletService> {
    private PortletService _portletService;

    public PortletServiceWrapper(PortletService portletService) {
        _portletService = portletService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _portletService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _portletService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONArray getWARPortlets() {
        return _portletService.getWARPortlets();
    }

    @Override
    public com.liferay.portal.model.Portlet updatePortlet(long companyId,
        java.lang.String portletId, java.lang.String roles, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _portletService.updatePortlet(companyId, portletId, roles, active);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PortletService getWrappedPortletService() {
        return _portletService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPortletService(PortletService portletService) {
        _portletService = portletService;
    }

    @Override
    public PortletService getWrappedService() {
        return _portletService;
    }

    @Override
    public void setWrappedService(PortletService portletService) {
        _portletService = portletService;
    }
}
