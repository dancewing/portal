package com.liferay.portal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;

/**
 * Provides the remote service interface for PortletPreferences. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PortletPreferencesServiceUtil
 * @see com.liferay.portal.service.base.PortletPreferencesServiceBaseImpl
 * @see com.liferay.portal.service.impl.PortletPreferencesServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface PortletPreferencesService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PortletPreferencesServiceUtil} to access the portlet preferences remote service. Add custom service methods to {@link com.liferay.portal.service.impl.PortletPreferencesServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    public void deleteArchivedPreferences(long portletItemId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void restoreArchivedPreferences(long groupId,
        com.liferay.portal.model.Layout layout, java.lang.String portletId,
        long portletItemId, javax.portlet.PortletPreferences preferences)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void restoreArchivedPreferences(long groupId,
        com.liferay.portal.model.Layout layout, java.lang.String portletId,
        com.liferay.portal.model.PortletItem portletItem,
        javax.portlet.PortletPreferences preferences)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void restoreArchivedPreferences(long groupId, java.lang.String name,
        com.liferay.portal.model.Layout layout, java.lang.String portletId,
        javax.portlet.PortletPreferences preferences)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void updateArchivePreferences(long userId, long groupId,
        java.lang.String name, java.lang.String portletId,
        javax.portlet.PortletPreferences preferences)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
