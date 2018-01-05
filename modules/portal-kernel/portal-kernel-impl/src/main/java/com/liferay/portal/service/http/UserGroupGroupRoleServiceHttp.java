package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.UserGroupGroupRoleServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.UserGroupGroupRoleServiceUtil} service utility. The
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
 * @see UserGroupGroupRoleServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.UserGroupGroupRoleServiceUtil
 * @generated
 */
public class UserGroupGroupRoleServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(UserGroupGroupRoleServiceHttp.class);
    private static final Class<?>[] _addUserGroupGroupRolesParameterTypes0 = new Class[] {
            long.class, long.class, long[].class
        };
    private static final Class<?>[] _addUserGroupGroupRolesParameterTypes1 = new Class[] {
            long[].class, long.class, long.class
        };
    private static final Class<?>[] _deleteUserGroupGroupRolesParameterTypes2 = new Class[] {
            long.class, long.class, long[].class
        };
    private static final Class<?>[] _deleteUserGroupGroupRolesParameterTypes3 = new Class[] {
            long[].class, long.class, long.class
        };

    public static void addUserGroupGroupRoles(HttpPrincipal httpPrincipal,
        long userGroupId, long groupId, long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(UserGroupGroupRoleServiceUtil.class,
                    "addUserGroupGroupRoles",
                    _addUserGroupGroupRolesParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    userGroupId, groupId, roleIds);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void addUserGroupGroupRoles(HttpPrincipal httpPrincipal,
        long[] userGroupIds, long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(UserGroupGroupRoleServiceUtil.class,
                    "addUserGroupGroupRoles",
                    _addUserGroupGroupRolesParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    userGroupIds, groupId, roleId);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void deleteUserGroupGroupRoles(HttpPrincipal httpPrincipal,
        long userGroupId, long groupId, long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(UserGroupGroupRoleServiceUtil.class,
                    "deleteUserGroupGroupRoles",
                    _deleteUserGroupGroupRolesParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    userGroupId, groupId, roleIds);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void deleteUserGroupGroupRoles(HttpPrincipal httpPrincipal,
        long[] userGroupIds, long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(UserGroupGroupRoleServiceUtil.class,
                    "deleteUserGroupGroupRoles",
                    _deleteUserGroupGroupRolesParameterTypes3);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    userGroupIds, groupId, roleId);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
