package com.liferay.portal.service.http;

import com.liferay.portal.service.LayoutRevisionServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.LayoutRevisionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.LayoutRevisionSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.LayoutRevision}, that is translated to a
 * {@link com.liferay.portal.model.LayoutRevisionSoap}. Methods that SOAP cannot
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
 * @see LayoutRevisionServiceHttp
 * @see com.liferay.portal.model.LayoutRevisionSoap
 * @see com.liferay.portal.service.LayoutRevisionServiceUtil
 * @generated
 */
public class LayoutRevisionServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(LayoutRevisionServiceSoap.class);

    public static com.liferay.portal.model.LayoutRevisionSoap addLayoutRevision(
        long userId, long layoutSetBranchId, long layoutBranchId,
        long parentLayoutRevisionId, boolean head, long plid,
        long portletPreferencesPlid, boolean privateLayout,
        java.lang.String name, java.lang.String title,
        java.lang.String description, java.lang.String keywords,
        java.lang.String robots, java.lang.String typeSettings,
        boolean iconImage, long iconImageId, java.lang.String themeId,
        java.lang.String colorSchemeId, java.lang.String wapThemeId,
        java.lang.String wapColorSchemeId, java.lang.String css,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.portal.model.LayoutRevision returnValue = LayoutRevisionServiceUtil.addLayoutRevision(userId,
                    layoutSetBranchId, layoutBranchId, parentLayoutRevisionId,
                    head, plid, portletPreferencesPlid, privateLayout, name,
                    title, description, keywords, robots, typeSettings,
                    iconImage, iconImageId, themeId, colorSchemeId, wapThemeId,
                    wapColorSchemeId, css, serviceContext);

            return com.liferay.portal.model.LayoutRevisionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
