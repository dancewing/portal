package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for UserGroupGroupRole. This utility wraps
 * {@link com.liferay.portal.service.impl.UserGroupGroupRoleServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupGroupRoleService
 * @see com.liferay.portal.service.base.UserGroupGroupRoleServiceBaseImpl
 * @see com.liferay.portal.service.impl.UserGroupGroupRoleServiceImpl
 * @generated
 */
@ProviderType
public class UserGroupGroupRoleServiceUtil {
    private static UserGroupGroupRoleService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.UserGroupGroupRoleServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static void addUserGroupGroupRoles(long userGroupId, long groupId,
        long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().addUserGroupGroupRoles(userGroupId, groupId, roleIds);
    }

    public static void addUserGroupGroupRoles(long[] userGroupIds,
        long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().addUserGroupGroupRoles(userGroupIds, groupId, roleId);
    }

    public static void deleteUserGroupGroupRoles(long userGroupId,
        long groupId, long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteUserGroupGroupRoles(userGroupId, groupId, roleIds);
    }

    public static void deleteUserGroupGroupRoles(long[] userGroupIds,
        long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteUserGroupGroupRoles(userGroupIds, groupId, roleId);
    }

    public static UserGroupGroupRoleService getService() {
        if (_service == null) {
            _service = (UserGroupGroupRoleService) PortalBeanLocatorUtil.locate(UserGroupGroupRoleService.class.getName());

            ReferenceRegistry.registerReference(UserGroupGroupRoleServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UserGroupGroupRoleService service) {
    }
}
