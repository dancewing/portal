package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for PasswordTracker. This utility wraps
 * {@link com.liferay.portal.service.impl.PasswordTrackerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PasswordTrackerLocalService
 * @see com.liferay.portal.service.base.PasswordTrackerLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.PasswordTrackerLocalServiceImpl
 * @generated
 */
public class PasswordTrackerLocalServiceUtil {
    private static PasswordTrackerLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.PasswordTrackerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the password tracker to the database. Also notifies the appropriate model listeners.
    *
    * @param passwordTracker the password tracker
    * @return the password tracker that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.model.PasswordTracker addPasswordTracker(
        com.liferay.portal.model.PasswordTracker passwordTracker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPasswordTracker(passwordTracker);
    }

    /**
    * Creates a new password tracker with the primary key. Does not add the password tracker to the database.
    *
    * @param passwordTrackerId the primary key for the new password tracker
    * @return the new password tracker
    */
    public static com.liferay.portal.model.PasswordTracker createPasswordTracker(
        long passwordTrackerId) {
        return getService().createPasswordTracker(passwordTrackerId);
    }

    /**
    * Deletes the password tracker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param passwordTrackerId the primary key of the password tracker
    * @return the password tracker that was removed
    * @throws PortalException if a password tracker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.model.PasswordTracker deletePasswordTracker(
        long passwordTrackerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePasswordTracker(passwordTrackerId);
    }

    /**
    * Deletes the password tracker from the database. Also notifies the appropriate model listeners.
    *
    * @param passwordTracker the password tracker
    * @return the password tracker that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.model.PasswordTracker deletePasswordTracker(
        com.liferay.portal.model.PasswordTracker passwordTracker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePasswordTracker(passwordTracker);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.PasswordTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.PasswordTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.liferay.portal.model.PasswordTracker fetchPasswordTracker(
        long passwordTrackerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPasswordTracker(passwordTrackerId);
    }

    /**
    * Returns the password tracker with the primary key.
    *
    * @param passwordTrackerId the primary key of the password tracker
    * @return the password tracker
    * @throws PortalException if a password tracker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.model.PasswordTracker getPasswordTracker(
        long passwordTrackerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPasswordTracker(passwordTrackerId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the password trackers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.PasswordTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of password trackers
    * @param end the upper bound of the range of password trackers (not inclusive)
    * @return the range of password trackers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portal.model.PasswordTracker> getPasswordTrackers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPasswordTrackers(start, end);
    }

    /**
    * Returns the number of password trackers.
    *
    * @return the number of password trackers
    * @throws SystemException if a system exception occurred
    */
    public static int getPasswordTrackersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPasswordTrackersCount();
    }

    /**
    * Updates the password tracker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param passwordTracker the password tracker
    * @return the password tracker that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.model.PasswordTracker updatePasswordTracker(
        com.liferay.portal.model.PasswordTracker passwordTracker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePasswordTracker(passwordTracker);
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

    public static void deletePasswordTrackers(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deletePasswordTrackers(userId);
    }

    public static boolean isSameAsCurrentPassword(long userId,
        java.lang.String newClearTextPwd)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().isSameAsCurrentPassword(userId, newClearTextPwd);
    }

    public static boolean isValidPassword(long userId,
        java.lang.String newClearTextPwd)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().isValidPassword(userId, newClearTextPwd);
    }

    public static void trackPassword(long userId, java.lang.String encPassword)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().trackPassword(userId, encPassword);
    }

    public static PasswordTrackerLocalService getService() {
        if (_service == null) {
            _service = (PasswordTrackerLocalService) PortalBeanLocatorUtil.locate(PasswordTrackerLocalService.class.getName());

            ReferenceRegistry.registerReference(PasswordTrackerLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PasswordTrackerLocalService service) {
    }
}
