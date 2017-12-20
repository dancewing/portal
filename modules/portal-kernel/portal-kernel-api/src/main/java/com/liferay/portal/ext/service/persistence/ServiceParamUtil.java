/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.ext.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.ext.model.ServiceParam;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the service param service. This utility wraps {@link ServiceParamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceParamPersistence
 * @see ServiceParamPersistenceImpl
 * @generated
 */
@ProviderType
public class ServiceParamUtil {
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
	public static void clearCache(ServiceParam serviceParam) {
		getPersistence().clearCache(serviceParam);
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
	public static List<ServiceParam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServiceParam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServiceParam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ServiceParam update(ServiceParam serviceParam)
		throws SystemException {
		return getPersistence().update(serviceParam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ServiceParam update(ServiceParam serviceParam,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(serviceParam, serviceContext);
	}

	/**
	* Returns all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @return the matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C_P(classNameId, classPK, paramType);
	}

	/**
	* Returns a range of all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_P(classNameId, classPK, paramType, start, end);
	}

	/**
	* Returns an ordered range of all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_P(classNameId, classPK, paramType, start, end,
			orderByComparator);
	}

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam findByC_C_P_First(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_P_First(classNameId, classPK, paramType,
			orderByComparator);
	}

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam fetchByC_C_P_First(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_P_First(classNameId, classPK, paramType,
			orderByComparator);
	}

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam findByC_C_P_Last(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_P_Last(classNameId, classPK, paramType,
			orderByComparator);
	}

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam fetchByC_C_P_Last(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_P_Last(classNameId, classPK, paramType,
			orderByComparator);
	}

	/**
	* Returns the service params before and after the current service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param paramId the primary key of the current service param
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam[] findByC_C_P_PrevAndNext(
		long paramId, long classNameId, long classPK,
		java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_P_PrevAndNext(paramId, classNameId, classPK,
			paramType, orderByComparator);
	}

	/**
	* Removes all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_C_P(long classNameId, long classPK,
		java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_C_P(classNameId, classPK, paramType);
	}

	/**
	* Returns the number of service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @return the number of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C_P(long classNameId, long classPK,
		java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C_P(classNameId, classPK, paramType);
	}

	/**
	* Returns all the service params where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C(classNameId, classPK);
	}

	/**
	* Returns a range of all the service params where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C(classNameId, classPK, start, end);
	}

	/**
	* Returns an ordered range of all the service params where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C(classNameId, classPK, start, end,
			orderByComparator);
	}

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam findByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_First(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam fetchByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_First(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam findByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_Last(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam fetchByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_Last(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the service params before and after the current service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param paramId the primary key of the current service param
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam[] findByC_C_PrevAndNext(
		long paramId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_PrevAndNext(paramId, classNameId, classPK,
			orderByComparator);
	}

	/**
	* Removes all the service params where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_C(classNameId, classPK);
	}

	/**
	* Returns the number of service params where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the number of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C(classNameId, classPK);
	}

	/**
	* Caches the service param in the entity cache if it is enabled.
	*
	* @param serviceParam the service param
	*/
	public static void cacheResult(
		com.liferay.portal.ext.model.ServiceParam serviceParam) {
		getPersistence().cacheResult(serviceParam);
	}

	/**
	* Caches the service params in the entity cache if it is enabled.
	*
	* @param serviceParams the service params
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceParam> serviceParams) {
		getPersistence().cacheResult(serviceParams);
	}

	/**
	* Creates a new service param with the primary key. Does not add the service param to the database.
	*
	* @param paramId the primary key for the new service param
	* @return the new service param
	*/
	public static com.liferay.portal.ext.model.ServiceParam create(long paramId) {
		return getPersistence().create(paramId);
	}

	/**
	* Removes the service param with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paramId the primary key of the service param
	* @return the service param that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam remove(long paramId)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(paramId);
	}

	public static com.liferay.portal.ext.model.ServiceParam updateImpl(
		com.liferay.portal.ext.model.ServiceParam serviceParam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(serviceParam);
	}

	/**
	* Returns the service param with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceParamException} if it could not be found.
	*
	* @param paramId the primary key of the service param
	* @return the service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam findByPrimaryKey(
		long paramId)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(paramId);
	}

	/**
	* Returns the service param with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paramId the primary key of the service param
	* @return the service param, or <code>null</code> if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceParam fetchByPrimaryKey(
		long paramId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(paramId);
	}

	/**
	* Returns all the service params.
	*
	* @return the service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the service params.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the service params.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service params
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceParam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service params from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service params.
	*
	* @return the number of service params
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServiceParamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServiceParamPersistence)PortalBeanLocatorUtil.locate(ServiceParamPersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceParamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServiceParamPersistence persistence) {
	}

	private static ServiceParamPersistence _persistence;
}