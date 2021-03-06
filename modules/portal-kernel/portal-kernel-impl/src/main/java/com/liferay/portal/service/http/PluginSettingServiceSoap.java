package com.liferay.portal.service.http;

import com.liferay.portal.service.PluginSettingServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.PluginSettingServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.PluginSettingSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.PluginSetting}, that is translated to a
 * {@link com.liferay.portal.model.PluginSettingSoap}. Methods that SOAP cannot
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
 * @see PluginSettingServiceHttp
 * @see com.liferay.portal.model.PluginSettingSoap
 * @see com.liferay.portal.service.PluginSettingServiceUtil
 * @generated
 */
public class PluginSettingServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(PluginSettingServiceSoap.class);

    public static com.liferay.portal.model.PluginSettingSoap updatePluginSetting(
        long companyId, java.lang.String pluginId, java.lang.String pluginType,
        java.lang.String roles, boolean active) throws RemoteException {
        try {
            com.liferay.portal.model.PluginSetting returnValue = PluginSettingServiceUtil.updatePluginSetting(companyId,
                    pluginId, pluginType, roles, active);

            return com.liferay.portal.model.PluginSettingSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
