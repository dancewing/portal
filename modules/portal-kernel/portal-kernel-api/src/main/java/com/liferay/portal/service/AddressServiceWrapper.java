package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddressService
 * @generated
 */
public class AddressServiceWrapper implements AddressService,
    ServiceWrapper<AddressService> {
    private AddressService _addressService;

    public AddressServiceWrapper(AddressService addressService) {
        _addressService = addressService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _addressService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _addressService.setBeanIdentifier(beanIdentifier);
    }

    /**
    * @deprecated As of 6.2.0, replaced by {@link #addAddress( String, long,
    String, String, String, String, String, long, long, int,
    boolean, boolean, ServiceContext)}
    */
    @Override
    public com.liferay.portal.model.Address addAddress(
        java.lang.String className, long classPK, java.lang.String street1,
        java.lang.String street2, java.lang.String street3,
        java.lang.String city, java.lang.String zip, long regionId,
        long countryId, int typeId, boolean mailing, boolean primary)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressService.addAddress(className, classPK, street1, street2,
            street3, city, zip, regionId, countryId, typeId, mailing, primary);
    }

    @Override
    public com.liferay.portal.model.Address addAddress(
        java.lang.String className, long classPK, java.lang.String street1,
        java.lang.String street2, java.lang.String street3,
        java.lang.String city, java.lang.String zip, long regionId,
        long countryId, int typeId, boolean mailing, boolean primary,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressService.addAddress(className, classPK, street1, street2,
            street3, city, zip, regionId, countryId, typeId, mailing, primary,
            serviceContext);
    }

    @Override
    public void deleteAddress(long addressId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _addressService.deleteAddress(addressId);
    }

    @Override
    public com.liferay.portal.model.Address getAddress(long addressId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressService.getAddress(addressId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Address> getAddresses(
        java.lang.String className, long classPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressService.getAddresses(className, classPK);
    }

    @Override
    public com.liferay.portal.model.Address updateAddress(long addressId,
        java.lang.String street1, java.lang.String street2,
        java.lang.String street3, java.lang.String city, java.lang.String zip,
        long regionId, long countryId, int typeId, boolean mailing,
        boolean primary)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressService.updateAddress(addressId, street1, street2,
            street3, city, zip, regionId, countryId, typeId, mailing, primary);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AddressService getWrappedAddressService() {
        return _addressService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAddressService(AddressService addressService) {
        _addressService = addressService;
    }

    @Override
    public AddressService getWrappedService() {
        return _addressService;
    }

    @Override
    public void setWrappedService(AddressService addressService) {
        _addressService = addressService;
    }
}
