package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccountLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccountLocalService
 * @generated
 */
public class AccountLocalServiceWrapper implements AccountLocalService,
    ServiceWrapper<AccountLocalService> {
    private AccountLocalService _accountLocalService;

    public AccountLocalServiceWrapper(AccountLocalService accountLocalService) {
        _accountLocalService = accountLocalService;
    }

    /**
    * Adds the account to the database. Also notifies the appropriate model listeners.
    *
    * @param account the account
    * @return the account that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portal.model.Account addAccount(
        com.liferay.portal.model.Account account)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.addAccount(account);
    }

    /**
    * Creates a new account with the primary key. Does not add the account to the database.
    *
    * @param accountId the primary key for the new account
    * @return the new account
    */
    @Override
    public com.liferay.portal.model.Account createAccount(long accountId) {
        return _accountLocalService.createAccount(accountId);
    }

    /**
    * Deletes the account with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param accountId the primary key of the account
    * @return the account that was removed
    * @throws PortalException if a account with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portal.model.Account deleteAccount(long accountId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.deleteAccount(accountId);
    }

    /**
    * Deletes the account from the database. Also notifies the appropriate model listeners.
    *
    * @param account the account
    * @return the account that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portal.model.Account deleteAccount(
        com.liferay.portal.model.Account account)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.deleteAccount(account);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _accountLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.AccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.AccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.liferay.portal.model.Account fetchAccount(long accountId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.fetchAccount(accountId);
    }

    /**
    * Returns the account with the primary key.
    *
    * @param accountId the primary key of the account
    * @return the account
    * @throws PortalException if a account with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portal.model.Account getAccount(long accountId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.getAccount(accountId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the accounts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.AccountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of accounts
    * @param end the upper bound of the range of accounts (not inclusive)
    * @return the range of accounts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.portal.model.Account> getAccounts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.getAccounts(start, end);
    }

    /**
    * Returns the number of accounts.
    *
    * @return the number of accounts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAccountsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.getAccountsCount();
    }

    /**
    * Updates the account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param account the account
    * @return the account that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portal.model.Account updateAccount(
        com.liferay.portal.model.Account account)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.updateAccount(account);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _accountLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _accountLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.Account getAccount(long companyId,
        long accountId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _accountLocalService.getAccount(companyId, accountId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AccountLocalService getWrappedAccountLocalService() {
        return _accountLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAccountLocalService(
        AccountLocalService accountLocalService) {
        _accountLocalService = accountLocalService;
    }

    @Override
    public AccountLocalService getWrappedService() {
        return _accountLocalService;
    }

    @Override
    public void setWrappedService(AccountLocalService accountLocalService) {
        _accountLocalService = accountLocalService;
    }
}
