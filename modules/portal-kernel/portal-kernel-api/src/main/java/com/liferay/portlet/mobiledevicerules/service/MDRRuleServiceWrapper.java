package com.liferay.portlet.mobiledevicerules.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MDRRuleService}.
 *
 * @author Edward C. Han
 * @see MDRRuleService
 * @generated
 */
public class MDRRuleServiceWrapper implements MDRRuleService,
    ServiceWrapper<MDRRuleService> {
    private MDRRuleService _mdrRuleService;

    public MDRRuleServiceWrapper(MDRRuleService mdrRuleService) {
        _mdrRuleService = mdrRuleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _mdrRuleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _mdrRuleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRule addRule(
        long ruleGroupId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type, java.lang.String typeSettings,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _mdrRuleService.addRule(ruleGroupId, nameMap, descriptionMap,
            type, typeSettings, serviceContext);
    }

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRule addRule(
        long ruleGroupId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type,
        com.liferay.portal.kernel.util.UnicodeProperties typeSettings,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _mdrRuleService.addRule(ruleGroupId, nameMap, descriptionMap,
            type, typeSettings, serviceContext);
    }

    @Override
    public void deleteRule(long ruleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _mdrRuleService.deleteRule(ruleId);
    }

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRule fetchRule(
        long ruleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _mdrRuleService.fetchRule(ruleId);
    }

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRule getRule(
        long ruleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _mdrRuleService.getRule(ruleId);
    }

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRule updateRule(
        long ruleId, java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type, java.lang.String typeSettings,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _mdrRuleService.updateRule(ruleId, nameMap, descriptionMap,
            type, typeSettings, serviceContext);
    }

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRule updateRule(
        long ruleId, java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.lang.String type,
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _mdrRuleService.updateRule(ruleId, nameMap, descriptionMap,
            type, typeSettingsProperties, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MDRRuleService getWrappedMDRRuleService() {
        return _mdrRuleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMDRRuleService(MDRRuleService mdrRuleService) {
        _mdrRuleService = mdrRuleService;
    }

    @Override
    public MDRRuleService getWrappedService() {
        return _mdrRuleService;
    }

    @Override
    public void setWrappedService(MDRRuleService mdrRuleService) {
        _mdrRuleService = mdrRuleService;
    }
}
