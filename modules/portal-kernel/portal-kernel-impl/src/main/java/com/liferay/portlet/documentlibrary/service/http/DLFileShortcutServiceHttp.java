package com.liferay.portlet.documentlibrary.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil} service utility. The
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
 * @see DLFileShortcutServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil
 * @generated
 */
public class DLFileShortcutServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(DLFileShortcutServiceHttp.class);
    private static final Class<?>[] _addFileShortcutParameterTypes0 = new Class[] {
            long.class, long.class, long.class,
            com.liferay.portal.service.ServiceContext.class
        };
    private static final Class<?>[] _deleteFileShortcutParameterTypes1 = new Class[] {
            long.class
        };
    private static final Class<?>[] _getFileShortcutParameterTypes2 = new Class[] {
            long.class
        };
    private static final Class<?>[] _updateFileShortcutParameterTypes3 = new Class[] {
            long.class, long.class, long.class,
            com.liferay.portal.service.ServiceContext.class
        };

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcut addFileShortcut(
        HttpPrincipal httpPrincipal, long groupId, long folderId,
        long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileShortcutServiceUtil.class,
                    "addFileShortcut", _addFileShortcutParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
                    folderId, toFileEntryId, serviceContext);

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

            return (com.liferay.portlet.documentlibrary.model.DLFileShortcut) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void deleteFileShortcut(HttpPrincipal httpPrincipal,
        long fileShortcutId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileShortcutServiceUtil.class,
                    "deleteFileShortcut", _deleteFileShortcutParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileShortcutId);

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

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcut getFileShortcut(
        HttpPrincipal httpPrincipal, long fileShortcutId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileShortcutServiceUtil.class,
                    "getFileShortcut", _getFileShortcutParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileShortcutId);

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

            return (com.liferay.portlet.documentlibrary.model.DLFileShortcut) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcut updateFileShortcut(
        HttpPrincipal httpPrincipal, long fileShortcutId, long folderId,
        long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileShortcutServiceUtil.class,
                    "updateFileShortcut", _updateFileShortcutParameterTypes3);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileShortcutId, folderId, toFileEntryId, serviceContext);

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

            return (com.liferay.portlet.documentlibrary.model.DLFileShortcut) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
