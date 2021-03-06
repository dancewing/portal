package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink;

import java.util.List;

/**
 * The persistence utility for the d d m storage link service. This utility wraps {@link DDMStorageLinkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStorageLinkPersistence
 * @see DDMStorageLinkPersistenceImpl
 * @generated
 */
public class DDMStorageLinkUtil {
    private static DDMStorageLinkPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(DDMStorageLink ddmStorageLink) {
        getPersistence().clearCache(ddmStorageLink);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<DDMStorageLink> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DDMStorageLink> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DDMStorageLink> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DDMStorageLink update(DDMStorageLink ddmStorageLink)
        throws SystemException {
        return getPersistence().update(ddmStorageLink);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DDMStorageLink update(DDMStorageLink ddmStorageLink,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(ddmStorageLink, serviceContext);
    }

    /**
    * Returns all the d d m storage links where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the d d m storage links where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of d d m storage links
    * @param end the upper bound of the range of d d m storage links (not inclusive)
    * @return the range of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the d d m storage links where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of d d m storage links
    * @param end the upper bound of the range of d d m storage links (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first d d m storage link in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first d d m storage link in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching d d m storage link, or <code>null</code> if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last d d m storage link in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last d d m storage link in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching d d m storage link, or <code>null</code> if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the d d m storage links before and after the current d d m storage link in the ordered set where uuid = &#63;.
    *
    * @param storageLinkId the primary key of the current d d m storage link
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a d d m storage link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink[] findByUuid_PrevAndNext(
        long storageLinkId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence()
                   .findByUuid_PrevAndNext(storageLinkId, uuid,
            orderByComparator);
    }

    /**
    * Removes all the d d m storage links where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of d d m storage links where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the d d m storage link where classPK = &#63; or throws a {@link com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException} if it could not be found.
    *
    * @param classPK the class p k
    * @return the matching d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink findByClassPK(
        long classPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence().findByClassPK(classPK);
    }

    /**
    * Returns the d d m storage link where classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param classPK the class p k
    * @return the matching d d m storage link, or <code>null</code> if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByClassPK(
        long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByClassPK(classPK);
    }

    /**
    * Returns the d d m storage link where classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param classPK the class p k
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching d d m storage link, or <code>null</code> if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByClassPK(
        long classPK, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByClassPK(classPK, retrieveFromCache);
    }

    /**
    * Removes the d d m storage link where classPK = &#63; from the database.
    *
    * @param classPK the class p k
    * @return the d d m storage link that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink removeByClassPK(
        long classPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence().removeByClassPK(classPK);
    }

    /**
    * Returns the number of d d m storage links where classPK = &#63;.
    *
    * @param classPK the class p k
    * @return the number of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassPK(long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByClassPK(classPK);
    }

    /**
    * Returns all the d d m storage links where structureId = &#63;.
    *
    * @param structureId the structure ID
    * @return the matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findByStructureId(
        long structureId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStructureId(structureId);
    }

    /**
    * Returns a range of all the d d m storage links where structureId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param structureId the structure ID
    * @param start the lower bound of the range of d d m storage links
    * @param end the upper bound of the range of d d m storage links (not inclusive)
    * @return the range of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findByStructureId(
        long structureId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStructureId(structureId, start, end);
    }

    /**
    * Returns an ordered range of all the d d m storage links where structureId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param structureId the structure ID
    * @param start the lower bound of the range of d d m storage links
    * @param end the upper bound of the range of d d m storage links (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findByStructureId(
        long structureId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStructureId(structureId, start, end, orderByComparator);
    }

    /**
    * Returns the first d d m storage link in the ordered set where structureId = &#63;.
    *
    * @param structureId the structure ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink findByStructureId_First(
        long structureId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence()
                   .findByStructureId_First(structureId, orderByComparator);
    }

    /**
    * Returns the first d d m storage link in the ordered set where structureId = &#63;.
    *
    * @param structureId the structure ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching d d m storage link, or <code>null</code> if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByStructureId_First(
        long structureId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStructureId_First(structureId, orderByComparator);
    }

    /**
    * Returns the last d d m storage link in the ordered set where structureId = &#63;.
    *
    * @param structureId the structure ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink findByStructureId_Last(
        long structureId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence()
                   .findByStructureId_Last(structureId, orderByComparator);
    }

    /**
    * Returns the last d d m storage link in the ordered set where structureId = &#63;.
    *
    * @param structureId the structure ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching d d m storage link, or <code>null</code> if a matching d d m storage link could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByStructureId_Last(
        long structureId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStructureId_Last(structureId, orderByComparator);
    }

    /**
    * Returns the d d m storage links before and after the current d d m storage link in the ordered set where structureId = &#63;.
    *
    * @param storageLinkId the primary key of the current d d m storage link
    * @param structureId the structure ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a d d m storage link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink[] findByStructureId_PrevAndNext(
        long storageLinkId, long structureId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence()
                   .findByStructureId_PrevAndNext(storageLinkId, structureId,
            orderByComparator);
    }

    /**
    * Removes all the d d m storage links where structureId = &#63; from the database.
    *
    * @param structureId the structure ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStructureId(long structureId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStructureId(structureId);
    }

    /**
    * Returns the number of d d m storage links where structureId = &#63;.
    *
    * @param structureId the structure ID
    * @return the number of matching d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static int countByStructureId(long structureId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStructureId(structureId);
    }

    /**
    * Caches the d d m storage link in the entity cache if it is enabled.
    *
    * @param ddmStorageLink the d d m storage link
    */
    public static void cacheResult(
        com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink ddmStorageLink) {
        getPersistence().cacheResult(ddmStorageLink);
    }

    /**
    * Caches the d d m storage links in the entity cache if it is enabled.
    *
    * @param ddmStorageLinks the d d m storage links
    */
    public static void cacheResult(
        java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> ddmStorageLinks) {
        getPersistence().cacheResult(ddmStorageLinks);
    }

    /**
    * Creates a new d d m storage link with the primary key. Does not add the d d m storage link to the database.
    *
    * @param storageLinkId the primary key for the new d d m storage link
    * @return the new d d m storage link
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink create(
        long storageLinkId) {
        return getPersistence().create(storageLinkId);
    }

    /**
    * Removes the d d m storage link with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param storageLinkId the primary key of the d d m storage link
    * @return the d d m storage link that was removed
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a d d m storage link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink remove(
        long storageLinkId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence().remove(storageLinkId);
    }

    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink updateImpl(
        com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink ddmStorageLink)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ddmStorageLink);
    }

    /**
    * Returns the d d m storage link with the primary key or throws a {@link com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException} if it could not be found.
    *
    * @param storageLinkId the primary key of the d d m storage link
    * @return the d d m storage link
    * @throws com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException if a d d m storage link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink findByPrimaryKey(
        long storageLinkId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.dynamicdatamapping.NoSuchStorageLinkException {
        return getPersistence().findByPrimaryKey(storageLinkId);
    }

    /**
    * Returns the d d m storage link with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param storageLinkId the primary key of the d d m storage link
    * @return the d d m storage link, or <code>null</code> if a d d m storage link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchByPrimaryKey(
        long storageLinkId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(storageLinkId);
    }

    /**
    * Returns all the d d m storage links.
    *
    * @return the d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the d d m storage links.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of d d m storage links
    * @param end the upper bound of the range of d d m storage links (not inclusive)
    * @return the range of d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the d d m storage links.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of d d m storage links
    * @param end the upper bound of the range of d d m storage links (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the d d m storage links from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of d d m storage links.
    *
    * @return the number of d d m storage links
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DDMStorageLinkPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DDMStorageLinkPersistence) PortalBeanLocatorUtil.locate(DDMStorageLinkPersistence.class.getName());

            ReferenceRegistry.registerReference(DDMStorageLinkUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DDMStorageLinkPersistence persistence) {
    }
}
