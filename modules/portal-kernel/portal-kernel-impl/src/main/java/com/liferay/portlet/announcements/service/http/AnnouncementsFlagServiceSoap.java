package com.liferay.portlet.announcements.service.http;

import com.liferay.portlet.announcements.service.AnnouncementsFlagServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portlet.announcements.service.AnnouncementsFlagServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portlet.announcements.model.AnnouncementsFlagSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portlet.announcements.model.AnnouncementsFlag}, that is translated to a
 * {@link com.liferay.portlet.announcements.model.AnnouncementsFlagSoap}. Methods that SOAP cannot
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
 * @see AnnouncementsFlagServiceHttp
 * @see com.liferay.portlet.announcements.model.AnnouncementsFlagSoap
 * @see com.liferay.portlet.announcements.service.AnnouncementsFlagServiceUtil
 * @generated
 */
public class AnnouncementsFlagServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(AnnouncementsFlagServiceSoap.class);

    public static void addFlag(long entryId, int value)
        throws RemoteException {
        try {
            AnnouncementsFlagServiceUtil.addFlag(entryId, value);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteFlag(long flagId) throws RemoteException {
        try {
            AnnouncementsFlagServiceUtil.deleteFlag(flagId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.announcements.model.AnnouncementsFlagSoap getFlag(
        long entryId, int value) throws RemoteException {
        try {
            com.liferay.portlet.announcements.model.AnnouncementsFlag returnValue =
                AnnouncementsFlagServiceUtil.getFlag(entryId, value);

            return com.liferay.portlet.announcements.model.AnnouncementsFlagSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
