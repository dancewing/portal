package com.liferay.portlet.polls.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.polls.service.PollsQuestionServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portlet.polls.service.PollsQuestionServiceUtil} service utility. The
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
 * @see PollsQuestionServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portlet.polls.service.PollsQuestionServiceUtil
 * @generated
 */
public class PollsQuestionServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(PollsQuestionServiceHttp.class);
    private static final Class<?>[] _addQuestionParameterTypes0 = new Class[] {
            java.util.Map.class, java.util.Map.class, int.class, int.class,
            int.class, int.class, int.class, boolean.class, java.util.List.class,
            com.liferay.portal.service.ServiceContext.class
        };
    private static final Class<?>[] _deleteQuestionParameterTypes1 = new Class[] {
            long.class
        };
    private static final Class<?>[] _getQuestionParameterTypes2 = new Class[] {
            long.class
        };
    private static final Class<?>[] _updateQuestionParameterTypes3 = new Class[] {
            long.class, java.util.Map.class, java.util.Map.class, int.class,
            int.class, int.class, int.class, int.class, boolean.class,
            java.util.List.class,
            com.liferay.portal.service.ServiceContext.class
        };

    public static com.liferay.portlet.polls.model.PollsQuestion addQuestion(
        HttpPrincipal httpPrincipal,
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean neverExpire,
        java.util.List<com.liferay.portlet.polls.model.PollsChoice> choices,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PollsQuestionServiceUtil.class,
                    "addQuestion", _addQuestionParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    titleMap, descriptionMap, expirationDateMonth,
                    expirationDateDay, expirationDateYear, expirationDateHour,
                    expirationDateMinute, neverExpire, choices, serviceContext);

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

            return (com.liferay.portlet.polls.model.PollsQuestion) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void deleteQuestion(HttpPrincipal httpPrincipal,
        long questionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PollsQuestionServiceUtil.class,
                    "deleteQuestion", _deleteQuestionParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    questionId);

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

    public static com.liferay.portlet.polls.model.PollsQuestion getQuestion(
        HttpPrincipal httpPrincipal, long questionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PollsQuestionServiceUtil.class,
                    "getQuestion", _getQuestionParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    questionId);

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

            return (com.liferay.portlet.polls.model.PollsQuestion) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static com.liferay.portlet.polls.model.PollsQuestion updateQuestion(
        HttpPrincipal httpPrincipal, long questionId,
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean neverExpire,
        java.util.List<com.liferay.portlet.polls.model.PollsChoice> choices,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PollsQuestionServiceUtil.class,
                    "updateQuestion", _updateQuestionParameterTypes3);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    questionId, titleMap, descriptionMap, expirationDateMonth,
                    expirationDateDay, expirationDateYear, expirationDateHour,
                    expirationDateMinute, neverExpire, choices, serviceContext);

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

            return (com.liferay.portlet.polls.model.PollsQuestion) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
