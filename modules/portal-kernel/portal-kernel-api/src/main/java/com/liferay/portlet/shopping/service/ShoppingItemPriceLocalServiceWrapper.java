package com.liferay.portlet.shopping.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShoppingItemPriceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingItemPriceLocalService
 * @generated
 */
@ProviderType
public class ShoppingItemPriceLocalServiceWrapper
    implements ShoppingItemPriceLocalService,
        ServiceWrapper<ShoppingItemPriceLocalService> {
    private ShoppingItemPriceLocalService _shoppingItemPriceLocalService;

    public ShoppingItemPriceLocalServiceWrapper(
        ShoppingItemPriceLocalService shoppingItemPriceLocalService) {
        _shoppingItemPriceLocalService = shoppingItemPriceLocalService;
    }

    /**
    * Adds the shopping item price to the database. Also notifies the appropriate model listeners.
    *
    * @param shoppingItemPrice the shopping item price
    * @return the shopping item price that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice addShoppingItemPrice(
        com.liferay.portlet.shopping.model.ShoppingItemPrice shoppingItemPrice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.addShoppingItemPrice(shoppingItemPrice);
    }

    /**
    * Creates a new shopping item price with the primary key. Does not add the shopping item price to the database.
    *
    * @param itemPriceId the primary key for the new shopping item price
    * @return the new shopping item price
    */
    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice createShoppingItemPrice(
        long itemPriceId) {
        return _shoppingItemPriceLocalService.createShoppingItemPrice(itemPriceId);
    }

    /**
    * Deletes the shopping item price with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param itemPriceId the primary key of the shopping item price
    * @return the shopping item price that was removed
    * @throws PortalException if a shopping item price with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice deleteShoppingItemPrice(
        long itemPriceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.deleteShoppingItemPrice(itemPriceId);
    }

    /**
    * Deletes the shopping item price from the database. Also notifies the appropriate model listeners.
    *
    * @param shoppingItemPrice the shopping item price
    * @return the shopping item price that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice deleteShoppingItemPrice(
        com.liferay.portlet.shopping.model.ShoppingItemPrice shoppingItemPrice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.deleteShoppingItemPrice(shoppingItemPrice);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _shoppingItemPriceLocalService.dynamicQuery();
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
        return _shoppingItemPriceLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.shopping.model.impl.ShoppingItemPriceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _shoppingItemPriceLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.shopping.model.impl.ShoppingItemPriceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _shoppingItemPriceLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _shoppingItemPriceLocalService.dynamicQueryCount(dynamicQuery);
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
        return _shoppingItemPriceLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice fetchShoppingItemPrice(
        long itemPriceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.fetchShoppingItemPrice(itemPriceId);
    }

    /**
    * Returns the shopping item price with the primary key.
    *
    * @param itemPriceId the primary key of the shopping item price
    * @return the shopping item price
    * @throws PortalException if a shopping item price with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice getShoppingItemPrice(
        long itemPriceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.getShoppingItemPrice(itemPriceId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the shopping item prices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.shopping.model.impl.ShoppingItemPriceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of shopping item prices
    * @param end the upper bound of the range of shopping item prices (not inclusive)
    * @return the range of shopping item prices
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> getShoppingItemPrices(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.getShoppingItemPrices(start, end);
    }

    /**
    * Returns the number of shopping item prices.
    *
    * @return the number of shopping item prices
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getShoppingItemPricesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.getShoppingItemPricesCount();
    }

    /**
    * Updates the shopping item price in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param shoppingItemPrice the shopping item price
    * @return the shopping item price that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.shopping.model.ShoppingItemPrice updateShoppingItemPrice(
        com.liferay.portlet.shopping.model.ShoppingItemPrice shoppingItemPrice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.updateShoppingItemPrice(shoppingItemPrice);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _shoppingItemPriceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _shoppingItemPriceLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> getItemPrices(
        long itemId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _shoppingItemPriceLocalService.getItemPrices(itemId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ShoppingItemPriceLocalService getWrappedShoppingItemPriceLocalService() {
        return _shoppingItemPriceLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedShoppingItemPriceLocalService(
        ShoppingItemPriceLocalService shoppingItemPriceLocalService) {
        _shoppingItemPriceLocalService = shoppingItemPriceLocalService;
    }

    @Override
    public ShoppingItemPriceLocalService getWrappedService() {
        return _shoppingItemPriceLocalService;
    }

    @Override
    public void setWrappedService(
        ShoppingItemPriceLocalService shoppingItemPriceLocalService) {
        _shoppingItemPriceLocalService = shoppingItemPriceLocalService;
    }
}
