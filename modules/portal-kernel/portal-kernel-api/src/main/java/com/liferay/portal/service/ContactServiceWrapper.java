package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContactService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactService
 * @generated
 */
public class ContactServiceWrapper implements ContactService,
    ServiceWrapper<ContactService> {
    private ContactService _contactService;

    public ContactServiceWrapper(ContactService contactService) {
        _contactService = contactService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _contactService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _contactService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.Contact getContact(long contactId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _contactService.getContact(contactId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Contact> getContacts(
        long classNameId, long classPK, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _contactService.getContacts(classNameId, classPK, start, end,
            orderByComparator);
    }

    @Override
    public int getContactsCount(long classNameId, long classPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _contactService.getContactsCount(classNameId, classPK);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ContactService getWrappedContactService() {
        return _contactService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedContactService(ContactService contactService) {
        _contactService = contactService;
    }

    @Override
    public ContactService getWrappedService() {
        return _contactService;
    }

    @Override
    public void setWrappedService(ContactService contactService) {
        _contactService = contactService;
    }
}
