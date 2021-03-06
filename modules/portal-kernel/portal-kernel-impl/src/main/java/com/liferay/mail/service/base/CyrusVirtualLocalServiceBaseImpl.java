package com.liferay.mail.service.base;

import com.liferay.mail.model.CyrusVirtual;
import com.liferay.mail.service.CyrusVirtualLocalService;
import com.liferay.mail.service.persistence.CyrusUserPersistence;
import com.liferay.mail.service.persistence.CyrusVirtualPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.service.persistence.UserFinder;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the cyrus virtual local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.mail.service.impl.CyrusVirtualLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.mail.service.impl.CyrusVirtualLocalServiceImpl
 * @see com.liferay.mail.service.CyrusVirtualLocalServiceUtil
 * @generated
 */
public abstract class CyrusVirtualLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements CyrusVirtualLocalService,
        IdentifiableBean {
    @BeanReference(type = com.liferay.mail.service.CyrusService.class)
    protected com.liferay.mail.service.CyrusService cyrusService;
    @BeanReference(type = com.liferay.mail.service.CyrusUserService.class)
    protected com.liferay.mail.service.CyrusUserService cyrusUserService;
    @BeanReference(type = CyrusUserPersistence.class)
    protected CyrusUserPersistence cyrusUserPersistence;
    @BeanReference(type = com.liferay.mail.service.CyrusVirtualLocalService.class)
    protected com.liferay.mail.service.CyrusVirtualLocalService cyrusVirtualLocalService;
    @BeanReference(type = CyrusVirtualPersistence.class)
    protected CyrusVirtualPersistence cyrusVirtualPersistence;
    @BeanReference(type = com.liferay.mail.service.MailService.class)
    protected com.liferay.mail.service.MailService mailService;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    @BeanReference(type = UserFinder.class)
    protected UserFinder userFinder;
    @BeanReference(type = PersistedModelLocalServiceRegistry.class)
    protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
    private String _beanIdentifier;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.liferay.mail.service.CyrusVirtualLocalServiceUtil} to access the cyrus virtual local service.
     */

    /**
     * Adds the cyrus virtual to the database. Also notifies the appropriate model listeners.
     *
     * @param cyrusVirtual the cyrus virtual
     * @return the cyrus virtual that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public CyrusVirtual addCyrusVirtual(CyrusVirtual cyrusVirtual)
        throws SystemException {
        cyrusVirtual.setNew(true);

        return cyrusVirtualPersistence.update(cyrusVirtual);
    }

    /**
     * Creates a new cyrus virtual with the primary key. Does not add the cyrus virtual to the database.
     *
     * @param emailAddress the primary key for the new cyrus virtual
     * @return the new cyrus virtual
     */
    @Override
    public CyrusVirtual createCyrusVirtual(String emailAddress) {
        return cyrusVirtualPersistence.create(emailAddress);
    }

    /**
     * Deletes the cyrus virtual with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param emailAddress the primary key of the cyrus virtual
     * @return the cyrus virtual that was removed
     * @throws PortalException if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public CyrusVirtual deleteCyrusVirtual(String emailAddress)
        throws PortalException, SystemException {
        return cyrusVirtualPersistence.remove(emailAddress);
    }

    /**
     * Deletes the cyrus virtual from the database. Also notifies the appropriate model listeners.
     *
     * @param cyrusVirtual the cyrus virtual
     * @return the cyrus virtual that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public CyrusVirtual deleteCyrusVirtual(CyrusVirtual cyrusVirtual)
        throws SystemException {
        return cyrusVirtualPersistence.remove(cyrusVirtual);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(CyrusVirtual.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return cyrusVirtualPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return cyrusVirtualPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return cyrusVirtualPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return cyrusVirtualPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return cyrusVirtualPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public CyrusVirtual fetchCyrusVirtual(String emailAddress)
        throws SystemException {
        return cyrusVirtualPersistence.fetchByPrimaryKey(emailAddress);
    }

    /**
     * Returns the cyrus virtual with the primary key.
     *
     * @param emailAddress the primary key of the cyrus virtual
     * @return the cyrus virtual
     * @throws PortalException if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual getCyrusVirtual(String emailAddress)
        throws PortalException, SystemException {
        return cyrusVirtualPersistence.findByPrimaryKey(emailAddress);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return cyrusVirtualPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the cyrus virtuals.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of cyrus virtuals
     * @param end the upper bound of the range of cyrus virtuals (not inclusive)
     * @return the range of cyrus virtuals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusVirtual> getCyrusVirtuals(int start, int end)
        throws SystemException {
        return cyrusVirtualPersistence.findAll(start, end);
    }

    /**
     * Returns the number of cyrus virtuals.
     *
     * @return the number of cyrus virtuals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getCyrusVirtualsCount() throws SystemException {
        return cyrusVirtualPersistence.countAll();
    }

    /**
     * Updates the cyrus virtual in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param cyrusVirtual the cyrus virtual
     * @return the cyrus virtual that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public CyrusVirtual updateCyrusVirtual(CyrusVirtual cyrusVirtual)
        throws SystemException {
        return cyrusVirtualPersistence.update(cyrusVirtual);
    }

    /**
     * Returns the cyrus remote service.
     *
     * @return the cyrus remote service
     */
    public com.liferay.mail.service.CyrusService getCyrusService() {
        return cyrusService;
    }

    /**
     * Sets the cyrus remote service.
     *
     * @param cyrusService the cyrus remote service
     */
    public void setCyrusService(
        com.liferay.mail.service.CyrusService cyrusService) {
        this.cyrusService = cyrusService;
    }

    /**
     * Returns the cyrus user remote service.
     *
     * @return the cyrus user remote service
     */
    public com.liferay.mail.service.CyrusUserService getCyrusUserService() {
        return cyrusUserService;
    }

    /**
     * Sets the cyrus user remote service.
     *
     * @param cyrusUserService the cyrus user remote service
     */
    public void setCyrusUserService(
        com.liferay.mail.service.CyrusUserService cyrusUserService) {
        this.cyrusUserService = cyrusUserService;
    }

    /**
     * Returns the cyrus user persistence.
     *
     * @return the cyrus user persistence
     */
    public CyrusUserPersistence getCyrusUserPersistence() {
        return cyrusUserPersistence;
    }

    /**
     * Sets the cyrus user persistence.
     *
     * @param cyrusUserPersistence the cyrus user persistence
     */
    public void setCyrusUserPersistence(
        CyrusUserPersistence cyrusUserPersistence) {
        this.cyrusUserPersistence = cyrusUserPersistence;
    }

    /**
     * Returns the cyrus virtual local service.
     *
     * @return the cyrus virtual local service
     */
    public com.liferay.mail.service.CyrusVirtualLocalService getCyrusVirtualLocalService() {
        return cyrusVirtualLocalService;
    }

    /**
     * Sets the cyrus virtual local service.
     *
     * @param cyrusVirtualLocalService the cyrus virtual local service
     */
    public void setCyrusVirtualLocalService(
        com.liferay.mail.service.CyrusVirtualLocalService cyrusVirtualLocalService) {
        this.cyrusVirtualLocalService = cyrusVirtualLocalService;
    }

    /**
     * Returns the cyrus virtual persistence.
     *
     * @return the cyrus virtual persistence
     */
    public CyrusVirtualPersistence getCyrusVirtualPersistence() {
        return cyrusVirtualPersistence;
    }

    /**
     * Sets the cyrus virtual persistence.
     *
     * @param cyrusVirtualPersistence the cyrus virtual persistence
     */
    public void setCyrusVirtualPersistence(
        CyrusVirtualPersistence cyrusVirtualPersistence) {
        this.cyrusVirtualPersistence = cyrusVirtualPersistence;
    }

    /**
     * Returns the mail remote service.
     *
     * @return the mail remote service
     */
    public com.liferay.mail.service.MailService getMailService() {
        return mailService;
    }

    /**
     * Sets the mail remote service.
     *
     * @param mailService the mail remote service
     */
    public void setMailService(com.liferay.mail.service.MailService mailService) {
        this.mailService = mailService;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Returns the user finder.
     *
     * @return the user finder
     */
    public UserFinder getUserFinder() {
        return userFinder;
    }

    /**
     * Sets the user finder.
     *
     * @param userFinder the user finder
     */
    public void setUserFinder(UserFinder userFinder) {
        this.userFinder = userFinder;
    }

    public void afterPropertiesSet() {
        persistedModelLocalServiceRegistry.register("com.liferay.mail.model.CyrusVirtual",
            cyrusVirtualLocalService);
    }

    public void destroy() {
        persistedModelLocalServiceRegistry.unregister(
            "com.liferay.mail.model.CyrusVirtual");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    protected Class<?> getModelClass() {
        return CyrusVirtual.class;
    }

    protected String getModelClassName() {
        return CyrusVirtual.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = cyrusVirtualPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
