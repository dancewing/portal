package com.liferay.portal.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.StagingServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.StagingServiceUtil} service utility. The
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
 * @see StagingServiceHttp
 * @see com.liferay.portal.service.StagingServiceUtil
 * @generated
 */
@ProviderType
public class StagingServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(StagingServiceSoap.class);

    public static void cleanUpStagingRequest(long stagingRequestId)
        throws RemoteException {
        try {
            StagingServiceUtil.cleanUpStagingRequest(stagingRequestId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static long createStagingRequest(long groupId,
        java.lang.String checksum) throws RemoteException {
        try {
            long returnValue = StagingServiceUtil.createStagingRequest(groupId,
                    checksum);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void updateStagingRequest(long stagingRequestId,
        java.lang.String fileName, byte[] bytes) throws RemoteException {
        try {
            StagingServiceUtil.updateStagingRequest(stagingRequestId, fileName,
                bytes);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
