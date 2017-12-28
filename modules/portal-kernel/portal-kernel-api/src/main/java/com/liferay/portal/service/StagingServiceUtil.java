package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for Staging. This utility wraps
 * {@link com.liferay.portal.service.impl.StagingServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see StagingService
 * @see com.liferay.portal.service.base.StagingServiceBaseImpl
 * @see com.liferay.portal.service.impl.StagingServiceImpl
 * @generated
 */
@ProviderType
public class StagingServiceUtil {
    private static StagingService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.StagingServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static void cleanUpStagingRequest(long stagingRequestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().cleanUpStagingRequest(stagingRequestId);
    }

    public static long createStagingRequest(long groupId,
        java.lang.String checksum)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().createStagingRequest(groupId, checksum);
    }

    public static void publishStagingRequest(long stagingRequestId,
        boolean privateLayout,
        java.util.Map<java.lang.String, java.lang.String[]> parameterMap)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService()
            .publishStagingRequest(stagingRequestId, privateLayout, parameterMap);
    }

    public static void updateStagingRequest(long stagingRequestId,
        java.lang.String fileName, byte[] bytes)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().updateStagingRequest(stagingRequestId, fileName, bytes);
    }

    public static com.liferay.portal.kernel.lar.MissingReferences validateStagingRequest(
        long stagingRequestId, boolean privateLayout,
        java.util.Map<java.lang.String, java.lang.String[]> parameterMap)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .validateStagingRequest(stagingRequestId, privateLayout,
            parameterMap);
    }

    public static StagingService getService() {
        if (_service == null) {
            _service = (StagingService) PortalBeanLocatorUtil.locate(StagingService.class.getName());

            ReferenceRegistry.registerReference(StagingServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(StagingService service) {
    }
}
