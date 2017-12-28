package com.liferay.portlet.social.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for SocialRequest. This utility wraps
 * {@link com.liferay.portlet.social.service.impl.SocialRequestServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SocialRequestService
 * @see com.liferay.portlet.social.service.base.SocialRequestServiceBaseImpl
 * @see com.liferay.portlet.social.service.impl.SocialRequestServiceImpl
 * @generated
 */
@ProviderType
public class SocialRequestServiceUtil {
    private static SocialRequestService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.social.service.impl.SocialRequestServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static com.liferay.portlet.social.model.SocialRequest updateRequest(
        long requestId, int status,
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRequest(requestId, status, themeDisplay);
    }

    public static SocialRequestService getService() {
        if (_service == null) {
            _service = (SocialRequestService) PortalBeanLocatorUtil.locate(SocialRequestService.class.getName());

            ReferenceRegistry.registerReference(SocialRequestServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(SocialRequestService service) {
    }
}
