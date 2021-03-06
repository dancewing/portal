package com.liferay.portlet.announcements.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.announcements.service.AnnouncementsDeliveryServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portlet.announcements.service.AnnouncementsDeliveryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link com.liferay.portal.security.auth.HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnouncementsDeliveryServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portlet.announcements.service.AnnouncementsDeliveryServiceUtil
 * @generated
 */
public class AnnouncementsDeliveryServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(AnnouncementsDeliveryServiceHttp.class);
    private static final Class<?>[] _updateDeliveryParameterTypes0 = new Class[] {
            long.class, java.lang.String.class, boolean.class, boolean.class,
            boolean.class
        };

    public static com.liferay.portlet.announcements.model.AnnouncementsDelivery updateDelivery(
        HttpPrincipal httpPrincipal, long userId, java.lang.String type,
        boolean email, boolean sms, boolean website)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(AnnouncementsDeliveryServiceUtil.class,
                    "updateDelivery", _updateDeliveryParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, userId,
                    type, email, sms, website);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (com.liferay.portlet.announcements.model.AnnouncementsDelivery) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
