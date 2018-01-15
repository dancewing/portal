package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for Quartz. This utility wraps
 * {@link com.liferay.portal.service.impl.QuartzLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuartzLocalService
 * @see com.liferay.portal.service.base.QuartzLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.QuartzLocalServiceImpl
 * @generated
 */
public class QuartzLocalServiceUtil {
    private static QuartzLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.QuartzLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static void checkQuartzTables()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().checkQuartzTables();
    }

    public static QuartzLocalService getService() {
        if (_service == null) {
            _service = (QuartzLocalService) PortalBeanLocatorUtil.locate(QuartzLocalService.class.getName());

            ReferenceRegistry.registerReference(QuartzLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(QuartzLocalService service) {
    }
}
