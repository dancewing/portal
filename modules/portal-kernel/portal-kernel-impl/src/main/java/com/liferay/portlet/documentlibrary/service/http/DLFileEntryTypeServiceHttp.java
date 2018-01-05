package com.liferay.portlet.documentlibrary.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.documentlibrary.service.DLFileEntryTypeServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portlet.documentlibrary.service.DLFileEntryTypeServiceUtil} service utility. The
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
 * @see DLFileEntryTypeServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portlet.documentlibrary.service.DLFileEntryTypeServiceUtil
 * @generated
 */
public class DLFileEntryTypeServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(DLFileEntryTypeServiceHttp.class);
    private static final Class<?>[] _addFileEntryTypeParameterTypes0 = new Class[] {
            long.class, java.lang.String.class, java.util.Map.class,
            java.util.Map.class, long[].class,
            com.liferay.portal.service.ServiceContext.class
        };
    private static final Class<?>[] _addFileEntryTypeParameterTypes1 = new Class[] {
            long.class, java.lang.String.class, java.lang.String.class,
            long[].class, com.liferay.portal.service.ServiceContext.class
        };
    private static final Class<?>[] _deleteFileEntryTypeParameterTypes2 = new Class[] {
            long.class
        };
    private static final Class<?>[] _getFileEntryTypeParameterTypes3 = new Class[] {
            long.class
        };
    private static final Class<?>[] _getFileEntryTypesParameterTypes4 = new Class[] {
            long[].class
        };
    private static final Class<?>[] _getFileEntryTypesParameterTypes5 = new Class[] {
            long[].class, int.class, int.class
        };
    private static final Class<?>[] _getFileEntryTypesCountParameterTypes6 = new Class[] {
            long[].class
        };
    private static final Class<?>[] _getFolderFileEntryTypesParameterTypes7 = new Class[] {
            long[].class, long.class, boolean.class
        };
    private static final Class<?>[] _searchParameterTypes8 = new Class[] {
            long.class, long[].class, java.lang.String.class, boolean.class,
            int.class, int.class,
            com.liferay.portal.kernel.util.OrderByComparator.class
        };
    private static final Class<?>[] _searchCountParameterTypes9 = new Class[] {
            long.class, long[].class, java.lang.String.class, boolean.class
        };
    private static final Class<?>[] _updateFileEntryTypeParameterTypes10 = new Class[] {
            long.class, java.util.Map.class, java.util.Map.class, long[].class,
            com.liferay.portal.service.ServiceContext.class
        };
    private static final Class<?>[] _updateFileEntryTypeParameterTypes11 = new Class[] {
            long.class, java.lang.String.class, java.lang.String.class,
            long[].class, com.liferay.portal.service.ServiceContext.class
        };

    public static com.liferay.portlet.documentlibrary.model.DLFileEntryType addFileEntryType(
        HttpPrincipal httpPrincipal, long groupId,
        java.lang.String fileEntryTypeKey,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        long[] ddmStructureIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "addFileEntryType", _addFileEntryTypeParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
                    fileEntryTypeKey, nameMap, descriptionMap, ddmStructureIds,
                    serviceContext);

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

            return (com.liferay.portlet.documentlibrary.model.DLFileEntryType) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileEntryType addFileEntryType(
        HttpPrincipal httpPrincipal, long groupId, java.lang.String name,
        java.lang.String description, long[] ddmStructureIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "addFileEntryType", _addFileEntryTypeParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
                    name, description, ddmStructureIds, serviceContext);

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

            return (com.liferay.portlet.documentlibrary.model.DLFileEntryType) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void deleteFileEntryType(HttpPrincipal httpPrincipal,
        long fileEntryTypeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "deleteFileEntryType", _deleteFileEntryTypeParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileEntryTypeId);

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

    public static com.liferay.portlet.documentlibrary.model.DLFileEntryType getFileEntryType(
        HttpPrincipal httpPrincipal, long fileEntryTypeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "getFileEntryType", _getFileEntryTypeParameterTypes3);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileEntryTypeId);

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

            return (com.liferay.portlet.documentlibrary.model.DLFileEntryType) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> getFileEntryTypes(
        HttpPrincipal httpPrincipal, long[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "getFileEntryTypes", _getFileEntryTypesParameterTypes4);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupIds);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType>) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> getFileEntryTypes(
        HttpPrincipal httpPrincipal, long[] groupIds, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "getFileEntryTypes", _getFileEntryTypesParameterTypes5);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    groupIds, start, end);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType>) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static int getFileEntryTypesCount(HttpPrincipal httpPrincipal,
        long[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "getFileEntryTypesCount",
                    _getFileEntryTypesCountParameterTypes6);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupIds);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Integer) returnObj).intValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> getFolderFileEntryTypes(
        HttpPrincipal httpPrincipal, long[] groupIds, long folderId,
        boolean inherited)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "getFolderFileEntryTypes",
                    _getFolderFileEntryTypesParameterTypes7);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    groupIds, folderId, inherited);

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

            return (java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType>) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> search(
        HttpPrincipal httpPrincipal, long companyId, long[] groupIds,
        java.lang.String keywords, boolean includeBasicFileEntryType,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "search", _searchParameterTypes8);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    companyId, groupIds, keywords, includeBasicFileEntryType,
                    start, end, orderByComparator);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType>) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static int searchCount(HttpPrincipal httpPrincipal, long companyId,
        long[] groupIds, java.lang.String keywords,
        boolean includeBasicFileEntryType)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "searchCount", _searchCountParameterTypes9);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    companyId, groupIds, keywords, includeBasicFileEntryType);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Integer) returnObj).intValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void updateFileEntryType(HttpPrincipal httpPrincipal,
        long fileEntryTypeId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        long[] ddmStructureIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "updateFileEntryType", _updateFileEntryTypeParameterTypes10);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileEntryTypeId, nameMap, descriptionMap, ddmStructureIds,
                    serviceContext);

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

    public static void updateFileEntryType(HttpPrincipal httpPrincipal,
        long fileEntryTypeId, java.lang.String name,
        java.lang.String description, long[] ddmStructureIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(DLFileEntryTypeServiceUtil.class,
                    "updateFileEntryType", _updateFileEntryTypeParameterTypes11);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    fileEntryTypeId, name, description, ddmStructureIds,
                    serviceContext);

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
