package com.liferay.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for BackgroundTask. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see BackgroundTaskLocalServiceUtil
 * @see com.liferay.portal.service.base.BackgroundTaskLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.BackgroundTaskLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface BackgroundTaskLocalService extends BaseLocalService,
    PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BackgroundTaskLocalServiceUtil} to access the background task local service. Add custom service methods to {@link com.liferay.portal.service.impl.BackgroundTaskLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the background task to the database. Also notifies the appropriate model listeners.
    *
    * @param backgroundTask the background task
    * @return the background task that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.liferay.portal.model.BackgroundTask addBackgroundTask(
        com.liferay.portal.model.BackgroundTask backgroundTask)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new background task with the primary key. Does not add the background task to the database.
    *
    * @param backgroundTaskId the primary key for the new background task
    * @return the new background task
    */
    public com.liferay.portal.model.BackgroundTask createBackgroundTask(
        long backgroundTaskId);

    /**
    * Deletes the background task with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param backgroundTaskId the primary key of the background task
    * @return the background task that was removed
    * @throws PortalException if a background task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.liferay.portal.model.BackgroundTask deleteBackgroundTask(
        long backgroundTaskId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the background task from the database. Also notifies the appropriate model listeners.
    *
    * @param backgroundTask the background task
    * @return the background task that was removed
    * @throws PortalException
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.liferay.portal.model.BackgroundTask deleteBackgroundTask(
        com.liferay.portal.model.BackgroundTask backgroundTask)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.BackgroundTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.BackgroundTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.BackgroundTask fetchBackgroundTask(
        long backgroundTaskId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the background task with the primary key.
    *
    * @param backgroundTaskId the primary key of the background task
    * @return the background task
    * @throws PortalException if a background task with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.BackgroundTask getBackgroundTask(
        long backgroundTaskId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the background tasks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.BackgroundTaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of background tasks
    * @param end the upper bound of the range of background tasks (not inclusive)
    * @return the range of background tasks
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of background tasks.
    *
    * @return the number of background tasks
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the background task in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param backgroundTask the background task
    * @return the background task that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.liferay.portal.model.BackgroundTask updateBackgroundTask(
        com.liferay.portal.model.BackgroundTask backgroundTask)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public com.liferay.portal.model.BackgroundTask addBackgroundTask(
        long userId, long groupId, java.lang.String name,
        java.lang.String[] servletContextNames,
        java.lang.Class<?> taskExecutorClass,
        java.util.Map<java.lang.String, java.io.Serializable> taskContextMap,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addBackgroundTaskAttachment(long userId, long backgroundTaskId,
        java.lang.String fileName, java.io.File file)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addBackgroundTaskAttachment(long userId, long backgroundTaskId,
        java.lang.String fileName, java.io.InputStream inputStream)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.BackgroundTask amendBackgroundTask(
        long backgroundTaskId,
        java.util.Map<java.lang.String, java.io.Serializable> taskContextMap,
        int status, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.BackgroundTask amendBackgroundTask(
        long backgroundTaskId,
        java.util.Map<java.lang.String, java.io.Serializable> taskContextMap,
        int status, java.lang.String statusMessage,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.cluster.Clusterable(onMaster = true)
    public void cleanUpBackgroundTask(
        com.liferay.portal.model.BackgroundTask backgroundTask, int status);

    @com.liferay.portal.kernel.cluster.Clusterable(onMaster = true)
    public void cleanUpBackgroundTasks()
        throws com.liferay.portal.kernel.exception.SystemException;

    public void deleteCompanyBackgroundTasks(long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void deleteGroupBackgroundTasks(long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.BackgroundTask fetchFirstBackgroundTask(
        long groupId, java.lang.String taskExecutorClassName,
        boolean completed,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.BackgroundTask fetchFirstBackgroundTask(
        java.lang.String taskExecutorClassName, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.BackgroundTask fetchFirstBackgroundTask(
        java.lang.String taskExecutorClassName, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String taskExecutorClassName)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String taskExecutorClassName, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String taskExecutorClassName, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String name,
        java.lang.String taskExecutorClassName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String[] taskExecutorClassNames)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String[] taskExecutorClassNames, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        long groupId, java.lang.String[] taskExecutorClassNames, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        java.lang.String taskExecutorClassName, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        java.lang.String taskExecutorClassName, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        java.lang.String[] taskExecutorClassNames, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.model.BackgroundTask> getBackgroundTasks(
        java.lang.String[] taskExecutorClassNames, int status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount(long groupId,
        java.lang.String taskExecutorClassName)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount(long groupId,
        java.lang.String taskExecutorClassName, boolean completed)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount(long groupId, java.lang.String name,
        java.lang.String taskExecutorClassName)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount(long groupId, java.lang.String name,
        java.lang.String taskExecutorClassName, boolean completed)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount(long groupId,
        java.lang.String[] taskExecutorClassNames)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBackgroundTasksCount(long groupId,
        java.lang.String[] taskExecutorClassNames, boolean completed)
        throws com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.cluster.Clusterable(onMaster = true)
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String getBackgroundTaskStatusJSON(long backgroundTaskId);

    @com.liferay.portal.kernel.cluster.Clusterable(onMaster = true)
    public void resumeBackgroundTask(long backgroundTaskId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.cluster.Clusterable(onMaster = true)
    public void triggerBackgroundTask(long backgroundTaskId);
}
