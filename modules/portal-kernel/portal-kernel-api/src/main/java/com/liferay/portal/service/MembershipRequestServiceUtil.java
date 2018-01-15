package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for MembershipRequest. This utility wraps
 * {@link com.liferay.portal.service.impl.MembershipRequestServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MembershipRequestService
 * @see com.liferay.portal.service.base.MembershipRequestServiceBaseImpl
 * @see com.liferay.portal.service.impl.MembershipRequestServiceImpl
 * @generated
 */
public class MembershipRequestServiceUtil {
    private static MembershipRequestService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.MembershipRequestServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portal.model.MembershipRequest addMembershipRequest(
        long groupId, java.lang.String comments,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addMembershipRequest(groupId, comments, serviceContext);
    }

    public static void deleteMembershipRequests(long groupId, int statusId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteMembershipRequests(groupId, statusId);
    }

    public static com.liferay.portal.model.MembershipRequest getMembershipRequest(
        long membershipRequestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMembershipRequest(membershipRequestId);
    }

    public static void updateStatus(long membershipRequestId,
        java.lang.String reviewComments, int statusId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService()
            .updateStatus(membershipRequestId, reviewComments, statusId,
            serviceContext);
    }

    public static MembershipRequestService getService() {
        if (_service == null) {
            _service = (MembershipRequestService) PortalBeanLocatorUtil.locate(MembershipRequestService.class.getName());

            ReferenceRegistry.registerReference(MembershipRequestServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MembershipRequestService service) {
    }
}
