package com.liferay.portal.service.http;

import com.liferay.portal.service.RegionServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.RegionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.RegionSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.Region}, that is translated to a
 * {@link com.liferay.portal.model.RegionSoap}. Methods that SOAP cannot
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
 * @see RegionServiceHttp
 * @see com.liferay.portal.model.RegionSoap
 * @see com.liferay.portal.service.RegionServiceUtil
 * @generated
 */
public class RegionServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(RegionServiceSoap.class);

    public static com.liferay.portal.model.RegionSoap addRegion(
        long countryId, java.lang.String regionCode, java.lang.String name,
        boolean active) throws RemoteException {
        try {
            com.liferay.portal.model.Region returnValue = RegionServiceUtil.addRegion(countryId,
                    regionCode, name, active);

            return com.liferay.portal.model.RegionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap fetchRegion(
        long countryId, java.lang.String regionCode) throws RemoteException {
        try {
            com.liferay.portal.model.Region returnValue = RegionServiceUtil.fetchRegion(countryId,
                    regionCode);

            return com.liferay.portal.model.RegionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap getRegion(long regionId)
        throws RemoteException {
        try {
            com.liferay.portal.model.Region returnValue = RegionServiceUtil.getRegion(regionId);

            return com.liferay.portal.model.RegionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap getRegion(
        long countryId, java.lang.String regionCode) throws RemoteException {
        try {
            com.liferay.portal.model.Region returnValue = RegionServiceUtil.getRegion(countryId,
                    regionCode);

            return com.liferay.portal.model.RegionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap[] getRegions()
        throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Region> returnValue = RegionServiceUtil.getRegions();

            return com.liferay.portal.model.RegionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap[] getRegions(
        boolean active) throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Region> returnValue = RegionServiceUtil.getRegions(active);

            return com.liferay.portal.model.RegionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap[] getRegions(
        long countryId) throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Region> returnValue = RegionServiceUtil.getRegions(countryId);

            return com.liferay.portal.model.RegionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.RegionSoap[] getRegions(
        long countryId, boolean active) throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Region> returnValue = RegionServiceUtil.getRegions(countryId,
                    active);

            return com.liferay.portal.model.RegionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
