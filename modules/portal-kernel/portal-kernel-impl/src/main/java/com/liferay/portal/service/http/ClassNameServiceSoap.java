package com.liferay.portal.service.http;

import com.liferay.portal.service.ClassNameServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.ClassNameServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.ClassNameSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.ClassName}, that is translated to a
 * {@link com.liferay.portal.model.ClassNameSoap}. Methods that SOAP cannot
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
 * @see ClassNameServiceHttp
 * @see com.liferay.portal.model.ClassNameSoap
 * @see com.liferay.portal.service.ClassNameServiceUtil
 * @generated
 */
public class ClassNameServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(ClassNameServiceSoap.class);

    public static com.liferay.portal.model.ClassNameSoap fetchClassName(
        java.lang.String value) throws RemoteException {
        try {
            com.liferay.portal.model.ClassName returnValue = ClassNameServiceUtil.fetchClassName(value);

            return com.liferay.portal.model.ClassNameSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static long fetchClassNameId(java.lang.Class<?> clazz)
        throws RemoteException {
        try {
            long returnValue = ClassNameServiceUtil.fetchClassNameId(clazz);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static long fetchClassNameId(java.lang.String value)
        throws RemoteException {
        try {
            long returnValue = ClassNameServiceUtil.fetchClassNameId(value);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
