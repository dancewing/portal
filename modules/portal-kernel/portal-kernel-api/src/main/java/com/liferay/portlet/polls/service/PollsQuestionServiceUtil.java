package com.liferay.portlet.polls.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for PollsQuestion. This utility wraps
 * {@link com.liferay.portlet.polls.service.impl.PollsQuestionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionService
 * @see com.liferay.portlet.polls.service.base.PollsQuestionServiceBaseImpl
 * @see com.liferay.portlet.polls.service.impl.PollsQuestionServiceImpl
 * @generated
 */
public class PollsQuestionServiceUtil {
    private static PollsQuestionService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.polls.service.impl.PollsQuestionServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portlet.polls.model.PollsQuestion addQuestion(
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean neverExpire,
        java.util.List<com.liferay.portlet.polls.model.PollsChoice> choices,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addQuestion(titleMap, descriptionMap, expirationDateMonth,
            expirationDateDay, expirationDateYear, expirationDateHour,
            expirationDateMinute, neverExpire, choices, serviceContext);
    }

    public static void deleteQuestion(long questionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteQuestion(questionId);
    }

    public static com.liferay.portlet.polls.model.PollsQuestion getQuestion(
        long questionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getQuestion(questionId);
    }

    public static com.liferay.portlet.polls.model.PollsQuestion updateQuestion(
        long questionId,
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean neverExpire,
        java.util.List<com.liferay.portlet.polls.model.PollsChoice> choices,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateQuestion(questionId, titleMap, descriptionMap,
            expirationDateMonth, expirationDateDay, expirationDateYear,
            expirationDateHour, expirationDateMinute, neverExpire, choices,
            serviceContext);
    }

    public static PollsQuestionService getService() {
        if (_service == null) {
            _service = (PollsQuestionService) PortalBeanLocatorUtil.locate(PollsQuestionService.class.getName());

            ReferenceRegistry.registerReference(PollsQuestionServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PollsQuestionService service) {
    }
}
