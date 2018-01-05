package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PortalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PortalService
 * @generated
 */
@ProviderType
public class PortalServiceWrapper implements PortalService,
    ServiceWrapper<PortalService> {
    private PortalService _portalService;

    public PortalServiceWrapper(PortalService portalService) {
        _portalService = portalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _portalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _portalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public int getBuildNumber() {
        return _portalService.getBuildNumber();
    }

    @Override
    public void testAddClassName_Rollback(java.lang.String classNameValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        _portalService.testAddClassName_Rollback(classNameValue);
    }

    @Override
    public void testAddClassName_Success(java.lang.String classNameValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        _portalService.testAddClassName_Success(classNameValue);
    }

    @Override
    public void testAddClassNameAndTestTransactionPortletBar_PortalRollback(
        java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException {
        _portalService.testAddClassNameAndTestTransactionPortletBar_PortalRollback(transactionPortletBarText);
    }

    @Override
    public void testAddClassNameAndTestTransactionPortletBar_PortletRollback(
        java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException {
        _portalService.testAddClassNameAndTestTransactionPortletBar_PortletRollback(transactionPortletBarText);
    }

    @Override
    public void testAddClassNameAndTestTransactionPortletBar_Success(
        java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException {
        _portalService.testAddClassNameAndTestTransactionPortletBar_Success(transactionPortletBarText);
    }

    @Override
    public void testAutoSyncHibernateSessionStateOnTxCreation()
        throws com.liferay.portal.kernel.exception.SystemException {
        _portalService.testAutoSyncHibernateSessionStateOnTxCreation();
    }

    @Override
    public void testDeleteClassName()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _portalService.testDeleteClassName();
    }

    @Override
    public int testGetBuildNumber() {
        return _portalService.testGetBuildNumber();
    }

    @Override
    public void testGetUserId() {
        _portalService.testGetUserId();
    }

    @Override
    public boolean testHasClassName()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _portalService.testHasClassName();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PortalService getWrappedPortalService() {
        return _portalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPortalService(PortalService portalService) {
        _portalService = portalService;
    }

    @Override
    public PortalService getWrappedService() {
        return _portalService;
    }

    @Override
    public void setWrappedService(PortalService portalService) {
        _portalService = portalService;
    }
}
