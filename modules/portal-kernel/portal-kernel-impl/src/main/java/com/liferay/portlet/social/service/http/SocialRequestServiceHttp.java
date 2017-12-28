package com.liferay.portlet.social.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.social.service.SocialRequestServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portlet.social.service.SocialRequestServiceUtil} service utility. The
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
 * @see SocialRequestServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portlet.social.service.SocialRequestServiceUtil
 * @generated
 */
public class SocialRequestServiceHttp {
    private static Log _log = LogFactoryUtil.getLog(SocialRequestServiceHttp.class);
    private static final Class<?>[] _updateRequestParameterTypes0 = new Class[] {
            long.class, int.class, com.liferay.portal.theme.ThemeDisplay.class
        };

    public static com.liferay.portlet.social.model.SocialRequest updateRequest(
        HttpPrincipal httpPrincipal, long requestId, int status,
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(SocialRequestServiceUtil.class,
                    "updateRequest", _updateRequestParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    requestId, status, themeDisplay);

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

            return (com.liferay.portlet.social.model.SocialRequest) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se, se);

            throw se;
        }
    }
}
