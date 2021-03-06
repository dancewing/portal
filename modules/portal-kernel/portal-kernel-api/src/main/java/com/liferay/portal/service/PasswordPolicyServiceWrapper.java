package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PasswordPolicyService}.
 *
 * @author Brian Wing Shun Chan
 * @see PasswordPolicyService
 * @generated
 */
public class PasswordPolicyServiceWrapper implements PasswordPolicyService,
    ServiceWrapper<PasswordPolicyService> {
    private PasswordPolicyService _passwordPolicyService;

    public PasswordPolicyServiceWrapper(
        PasswordPolicyService passwordPolicyService) {
        _passwordPolicyService = passwordPolicyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _passwordPolicyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _passwordPolicyService.setBeanIdentifier(beanIdentifier);
    }

    /**
    * @deprecated As of 6.2.0, replaced by {@link #addPasswordPolicy(String,
    String, boolean, boolean, long, boolean, boolean, int, int,
    int, int, int, int, String, boolean, int, boolean, long,
    long, int, boolean, int, long, long, long, ServiceContext)}
    */
    @Override
    public com.liferay.portal.model.PasswordPolicy addPasswordPolicy(
        java.lang.String name, java.lang.String description,
        boolean changeable, boolean changeRequired, long minAge,
        boolean checkSyntax, boolean allowDictionaryWords, int minAlphanumeric,
        int minLength, int minLowerCase, int minNumbers, int minSymbols,
        int minUpperCase, boolean history, int historyCount,
        boolean expireable, long maxAge, long warningTime, int graceLimit,
        boolean lockout, int maxFailure, long lockoutDuration,
        long resetFailureCount, long resetTicketMaxAge)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _passwordPolicyService.addPasswordPolicy(name, description,
            changeable, changeRequired, minAge, checkSyntax,
            allowDictionaryWords, minAlphanumeric, minLength, minLowerCase,
            minNumbers, minSymbols, minUpperCase, history, historyCount,
            expireable, maxAge, warningTime, graceLimit, lockout, maxFailure,
            lockoutDuration, resetFailureCount, resetTicketMaxAge);
    }

    @Override
    public com.liferay.portal.model.PasswordPolicy addPasswordPolicy(
        java.lang.String name, java.lang.String description,
        boolean changeable, boolean changeRequired, long minAge,
        boolean checkSyntax, boolean allowDictionaryWords, int minAlphanumeric,
        int minLength, int minLowerCase, int minNumbers, int minSymbols,
        int minUpperCase, java.lang.String regex, boolean history,
        int historyCount, boolean expireable, long maxAge, long warningTime,
        int graceLimit, boolean lockout, int maxFailure, long lockoutDuration,
        long resetFailureCount, long resetTicketMaxAge,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _passwordPolicyService.addPasswordPolicy(name, description,
            changeable, changeRequired, minAge, checkSyntax,
            allowDictionaryWords, minAlphanumeric, minLength, minLowerCase,
            minNumbers, minSymbols, minUpperCase, regex, history, historyCount,
            expireable, maxAge, warningTime, graceLimit, lockout, maxFailure,
            lockoutDuration, resetFailureCount, resetTicketMaxAge,
            serviceContext);
    }

    @Override
    public void deletePasswordPolicy(long passwordPolicyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _passwordPolicyService.deletePasswordPolicy(passwordPolicyId);
    }

    /**
    * @deprecated As of 6.2.0, replaced by {@link #updatePasswordPolicy(long,
    String, String, boolean, boolean, long, boolean, boolean,
    int, int, int, int, int, int, String, boolean, int, boolean,
    long, long, int, boolean, int, long, long, long,
    ServiceContext)}
    */
    @Override
    public com.liferay.portal.model.PasswordPolicy updatePasswordPolicy(
        long passwordPolicyId, java.lang.String name,
        java.lang.String description, boolean changeable,
        boolean changeRequired, long minAge, boolean checkSyntax,
        boolean allowDictionaryWords, int minAlphanumeric, int minLength,
        int minLowerCase, int minNumbers, int minSymbols, int minUpperCase,
        boolean history, int historyCount, boolean expireable, long maxAge,
        long warningTime, int graceLimit, boolean lockout, int maxFailure,
        long lockoutDuration, long resetFailureCount, long resetTicketMaxAge)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _passwordPolicyService.updatePasswordPolicy(passwordPolicyId,
            name, description, changeable, changeRequired, minAge, checkSyntax,
            allowDictionaryWords, minAlphanumeric, minLength, minLowerCase,
            minNumbers, minSymbols, minUpperCase, history, historyCount,
            expireable, maxAge, warningTime, graceLimit, lockout, maxFailure,
            lockoutDuration, resetFailureCount, resetTicketMaxAge);
    }

    @Override
    public com.liferay.portal.model.PasswordPolicy updatePasswordPolicy(
        long passwordPolicyId, java.lang.String name,
        java.lang.String description, boolean changeable,
        boolean changeRequired, long minAge, boolean checkSyntax,
        boolean allowDictionaryWords, int minAlphanumeric, int minLength,
        int minLowerCase, int minNumbers, int minSymbols, int minUpperCase,
        java.lang.String regex, boolean history, int historyCount,
        boolean expireable, long maxAge, long warningTime, int graceLimit,
        boolean lockout, int maxFailure, long lockoutDuration,
        long resetFailureCount, long resetTicketMaxAge,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _passwordPolicyService.updatePasswordPolicy(passwordPolicyId,
            name, description, changeable, changeRequired, minAge, checkSyntax,
            allowDictionaryWords, minAlphanumeric, minLength, minLowerCase,
            minNumbers, minSymbols, minUpperCase, regex, history, historyCount,
            expireable, maxAge, warningTime, graceLimit, lockout, maxFailure,
            lockoutDuration, resetFailureCount, resetTicketMaxAge,
            serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PasswordPolicyService getWrappedPasswordPolicyService() {
        return _passwordPolicyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPasswordPolicyService(
        PasswordPolicyService passwordPolicyService) {
        _passwordPolicyService = passwordPolicyService;
    }

    @Override
    public PasswordPolicyService getWrappedService() {
        return _passwordPolicyService;
    }

    @Override
    public void setWrappedService(PasswordPolicyService passwordPolicyService) {
        _passwordPolicyService = passwordPolicyService;
    }
}
