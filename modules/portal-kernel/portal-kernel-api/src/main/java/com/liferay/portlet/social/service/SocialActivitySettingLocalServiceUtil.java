package com.liferay.portlet.social.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for SocialActivitySetting. This utility wraps
 * {@link com.liferay.portlet.social.service.impl.SocialActivitySettingLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivitySettingLocalService
 * @see com.liferay.portlet.social.service.base.SocialActivitySettingLocalServiceBaseImpl
 * @see com.liferay.portlet.social.service.impl.SocialActivitySettingLocalServiceImpl
 * @generated
 */
public class SocialActivitySettingLocalServiceUtil {
    private static SocialActivitySettingLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.social.service.impl.SocialActivitySettingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the social activity setting to the database. Also notifies the appropriate model listeners.
    *
    * @param socialActivitySetting the social activity setting
    * @return the social activity setting that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.social.model.SocialActivitySetting addSocialActivitySetting(
        com.liferay.portlet.social.model.SocialActivitySetting socialActivitySetting)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addSocialActivitySetting(socialActivitySetting);
    }

    /**
    * Creates a new social activity setting with the primary key. Does not add the social activity setting to the database.
    *
    * @param activitySettingId the primary key for the new social activity setting
    * @return the new social activity setting
    */
    public static com.liferay.portlet.social.model.SocialActivitySetting createSocialActivitySetting(
        long activitySettingId) {
        return getService().createSocialActivitySetting(activitySettingId);
    }

    /**
    * Deletes the social activity setting with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param activitySettingId the primary key of the social activity setting
    * @return the social activity setting that was removed
    * @throws PortalException if a social activity setting with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.social.model.SocialActivitySetting deleteSocialActivitySetting(
        long activitySettingId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSocialActivitySetting(activitySettingId);
    }

    /**
    * Deletes the social activity setting from the database. Also notifies the appropriate model listeners.
    *
    * @param socialActivitySetting the social activity setting
    * @return the social activity setting that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.social.model.SocialActivitySetting deleteSocialActivitySetting(
        com.liferay.portlet.social.model.SocialActivitySetting socialActivitySetting)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSocialActivitySetting(socialActivitySetting);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivitySettingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivitySettingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.portlet.social.model.SocialActivitySetting fetchSocialActivitySetting(
        long activitySettingId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSocialActivitySetting(activitySettingId);
    }

    /**
    * Returns the social activity setting with the primary key.
    *
    * @param activitySettingId the primary key of the social activity setting
    * @return the social activity setting
    * @throws PortalException if a social activity setting with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.social.model.SocialActivitySetting getSocialActivitySetting(
        long activitySettingId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSocialActivitySetting(activitySettingId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the social activity settings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivitySettingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of social activity settings
    * @param end the upper bound of the range of social activity settings (not inclusive)
    * @return the range of social activity settings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.social.model.SocialActivitySetting> getSocialActivitySettings(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSocialActivitySettings(start, end);
    }

    /**
    * Returns the number of social activity settings.
    *
    * @return the number of social activity settings
    * @throws SystemException if a system exception occurred
    */
    public static int getSocialActivitySettingsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSocialActivitySettingsCount();
    }

    /**
    * Updates the social activity setting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param socialActivitySetting the social activity setting
    * @return the social activity setting that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.social.model.SocialActivitySetting updateSocialActivitySetting(
        com.liferay.portlet.social.model.SocialActivitySetting socialActivitySetting)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateSocialActivitySetting(socialActivitySetting);
    }

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

    public static void deleteActivitySetting(long groupId,
        java.lang.String className, long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteActivitySetting(groupId, className, classPK);
    }

    public static void deleteActivitySettings(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteActivitySettings(groupId);
    }

    public static com.liferay.portlet.social.model.SocialActivityDefinition getActivityDefinition(
        long groupId, java.lang.String className, int activityType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getActivityDefinition(groupId, className, activityType);
    }

    public static java.util.List<com.liferay.portlet.social.model.SocialActivityDefinition> getActivityDefinitions(
        long groupId, java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getActivityDefinitions(groupId, className);
    }

    public static java.util.List<com.liferay.portlet.social.model.SocialActivitySetting> getActivitySettings(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getActivitySettings(groupId);
    }

    public static boolean isEnabled(long groupId, long classNameId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isEnabled(groupId, classNameId);
    }

    public static boolean isEnabled(long groupId, long classNameId, long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isEnabled(groupId, classNameId, classPK);
    }

    public static void updateActivitySetting(long groupId,
        java.lang.String className, boolean enabled)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().updateActivitySetting(groupId, className, enabled);
    }

    public static void updateActivitySetting(long groupId,
        java.lang.String className, int activityType,
        com.liferay.portlet.social.model.SocialActivityCounterDefinition activityCounterDefinition)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService()
            .updateActivitySetting(groupId, className, activityType,
            activityCounterDefinition);
    }

    public static void updateActivitySetting(long groupId,
        java.lang.String className, long classPK, boolean enabled)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().updateActivitySetting(groupId, className, classPK, enabled);
    }

    public static void updateActivitySettings(long groupId,
        java.lang.String className, int activityType,
        java.util.List<com.liferay.portlet.social.model.SocialActivityCounterDefinition> activityCounterDefinitions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService()
            .updateActivitySettings(groupId, className, activityType,
            activityCounterDefinitions);
    }

    public static SocialActivitySettingLocalService getService() {
        if (_service == null) {
            _service = (SocialActivitySettingLocalService) PortalBeanLocatorUtil.locate(SocialActivitySettingLocalService.class.getName());

            ReferenceRegistry.registerReference(SocialActivitySettingLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(SocialActivitySettingLocalService service) {
    }
}
