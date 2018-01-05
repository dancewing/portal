package com.liferay.portal.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ContactServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.ContactServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.ContactSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.Contact}, that is translated to a
 * {@link com.liferay.portal.model.ContactSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactServiceHttp
 * @see com.liferay.portal.model.ContactSoap
 * @see com.liferay.portal.service.ContactServiceUtil
 * @generated
 */
@ProviderType
public class ContactServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(ContactServiceSoap.class);

    public static com.liferay.portal.model.ContactSoap getContact(
        long contactId) throws RemoteException {
        try {
            com.liferay.portal.model.Contact returnValue = ContactServiceUtil.getContact(contactId);

            return com.liferay.portal.model.ContactSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.ContactSoap[] getContacts(
        long classNameId, long classPK, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Contact> returnValue = ContactServiceUtil.getContacts(classNameId,
                    classPK, start, end, orderByComparator);

            return com.liferay.portal.model.ContactSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int getContactsCount(long classNameId, long classPK)
        throws RemoteException {
        try {
            int returnValue = ContactServiceUtil.getContactsCount(classNameId,
                    classPK);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
