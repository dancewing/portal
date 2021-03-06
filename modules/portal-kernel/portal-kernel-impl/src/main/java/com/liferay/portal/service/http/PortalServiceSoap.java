package com.liferay.portal.service.http;

import com.liferay.portal.service.PortalServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.PortalServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
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
 * @see PortalServiceHttp
 * @see com.liferay.portal.service.PortalServiceUtil
 * @generated
 */
public class PortalServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(PortalServiceSoap.class);

    public static int getBuildNumber() throws RemoteException {
        try {
            int returnValue = PortalServiceUtil.getBuildNumber();

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testAddClassName_Rollback(
        java.lang.String classNameValue) throws RemoteException {
        try {
            PortalServiceUtil.testAddClassName_Rollback(classNameValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testAddClassName_Success(java.lang.String classNameValue)
        throws RemoteException {
        try {
            PortalServiceUtil.testAddClassName_Success(classNameValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testAddClassNameAndTestTransactionPortletBar_PortalRollback(
        java.lang.String transactionPortletBarText) throws RemoteException {
        try {
            PortalServiceUtil.testAddClassNameAndTestTransactionPortletBar_PortalRollback(transactionPortletBarText);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testAddClassNameAndTestTransactionPortletBar_PortletRollback(
        java.lang.String transactionPortletBarText) throws RemoteException {
        try {
            PortalServiceUtil.testAddClassNameAndTestTransactionPortletBar_PortletRollback(transactionPortletBarText);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testAddClassNameAndTestTransactionPortletBar_Success(
        java.lang.String transactionPortletBarText) throws RemoteException {
        try {
            PortalServiceUtil.testAddClassNameAndTestTransactionPortletBar_Success(transactionPortletBarText);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testAutoSyncHibernateSessionStateOnTxCreation()
        throws RemoteException {
        try {
            PortalServiceUtil.testAutoSyncHibernateSessionStateOnTxCreation();
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testDeleteClassName() throws RemoteException {
        try {
            PortalServiceUtil.testDeleteClassName();
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int testGetBuildNumber() throws RemoteException {
        try {
            int returnValue = PortalServiceUtil.testGetBuildNumber();

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void testGetUserId() throws RemoteException {
        try {
            PortalServiceUtil.testGetUserId();
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static boolean testHasClassName() throws RemoteException {
        try {
            boolean returnValue = PortalServiceUtil.testHasClassName();

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
