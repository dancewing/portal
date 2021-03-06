package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for UserGroupRole. This utility wraps
 * {@link com.liferay.portal.service.impl.UserGroupRoleServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupRoleService
 * @see com.liferay.portal.service.base.UserGroupRoleServiceBaseImpl
 * @see com.liferay.portal.service.impl.UserGroupRoleServiceImpl
 * @generated
 */
public class UserGroupRoleServiceUtil {
    private static UserGroupRoleService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.UserGroupRoleServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static void addUserGroupRoles(long userId, long groupId,
        long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().addUserGroupRoles(userId, groupId, roleIds);
    }

    public static void addUserGroupRoles(long[] userIds, long groupId,
        long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().addUserGroupRoles(userIds, groupId, roleId);
    }

    public static void deleteUserGroupRoles(long userId, long groupId,
        long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteUserGroupRoles(userId, groupId, roleIds);
    }

    public static void deleteUserGroupRoles(long[] userIds, long groupId,
        long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteUserGroupRoles(userIds, groupId, roleId);
    }

    public static UserGroupRoleService getService() {
        if (_service == null) {
            _service = (UserGroupRoleService) PortalBeanLocatorUtil.locate(UserGroupRoleService.class.getName());

            ReferenceRegistry.registerReference(UserGroupRoleServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UserGroupRoleService service) {
    }
}
