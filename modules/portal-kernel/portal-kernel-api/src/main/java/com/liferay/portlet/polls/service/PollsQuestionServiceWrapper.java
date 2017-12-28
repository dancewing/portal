package com.liferay.portlet.polls.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PollsQuestionService}.
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionService
 * @generated
 */
@ProviderType
public class PollsQuestionServiceWrapper implements PollsQuestionService,
    ServiceWrapper<PollsQuestionService> {
    private PollsQuestionService _pollsQuestionService;

    public PollsQuestionServiceWrapper(
        PollsQuestionService pollsQuestionService) {
        _pollsQuestionService = pollsQuestionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pollsQuestionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pollsQuestionService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.polls.model.PollsQuestion addQuestion(
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean neverExpire,
        java.util.List<com.liferay.portlet.polls.model.PollsChoice> choices,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pollsQuestionService.addQuestion(titleMap, descriptionMap,
            expirationDateMonth, expirationDateDay, expirationDateYear,
            expirationDateHour, expirationDateMinute, neverExpire, choices,
            serviceContext);
    }

    @Override
    public void deleteQuestion(long questionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _pollsQuestionService.deleteQuestion(questionId);
    }

    @Override
    public com.liferay.portlet.polls.model.PollsQuestion getQuestion(
        long questionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pollsQuestionService.getQuestion(questionId);
    }

    @Override
    public com.liferay.portlet.polls.model.PollsQuestion updateQuestion(
        long questionId,
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean neverExpire,
        java.util.List<com.liferay.portlet.polls.model.PollsChoice> choices,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pollsQuestionService.updateQuestion(questionId, titleMap,
            descriptionMap, expirationDateMonth, expirationDateDay,
            expirationDateYear, expirationDateHour, expirationDateMinute,
            neverExpire, choices, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PollsQuestionService getWrappedPollsQuestionService() {
        return _pollsQuestionService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPollsQuestionService(
        PollsQuestionService pollsQuestionService) {
        _pollsQuestionService = pollsQuestionService;
    }

    @Override
    public PollsQuestionService getWrappedService() {
        return _pollsQuestionService;
    }

    @Override
    public void setWrappedService(PollsQuestionService pollsQuestionService) {
        _pollsQuestionService = pollsQuestionService;
    }
}
