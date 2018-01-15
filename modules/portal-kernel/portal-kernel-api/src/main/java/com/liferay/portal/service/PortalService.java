package com.liferay.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;

/**
 * Provides the remote service interface for Portal. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PortalServiceUtil
 * @see com.liferay.portal.service.base.PortalServiceBaseImpl
 * @see com.liferay.portal.service.impl.PortalServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface PortalService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PortalServiceUtil} to access the portal remote service. Add custom service methods to {@link com.liferay.portal.service.impl.PortalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

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

    @com.liferay.portal.kernel.jsonwebservice.JSONWebService
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getBuildNumber();

    public void testAddClassName_Rollback(java.lang.String classNameValue)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void testAddClassName_Success(java.lang.String classNameValue)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void testAddClassNameAndTestTransactionPortletBar_PortalRollback(
        java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void testAddClassNameAndTestTransactionPortletBar_PortletRollback(
        java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void testAddClassNameAndTestTransactionPortletBar_Success(
        java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.transaction.Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void testAutoSyncHibernateSessionStateOnTxCreation()
        throws com.liferay.portal.kernel.exception.SystemException;

    public void testDeleteClassName()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public int testGetBuildNumber();

    public void testGetUserId();

    public boolean testHasClassName()
        throws com.liferay.portal.kernel.exception.SystemException;
}
