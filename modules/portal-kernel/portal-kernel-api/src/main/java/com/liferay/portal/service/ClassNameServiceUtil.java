package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for ClassName. This utility wraps
 * {@link com.liferay.portal.service.impl.ClassNameServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ClassNameService
 * @see com.liferay.portal.service.base.ClassNameServiceBaseImpl
 * @see com.liferay.portal.service.impl.ClassNameServiceImpl
 * @generated
 */
public class ClassNameServiceUtil {
    private static ClassNameService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.ClassNameServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portal.model.ClassName fetchClassName(
        java.lang.String value)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchClassName(value);
    }

    public static long fetchClassNameId(java.lang.Class<?> clazz) {
        return getService().fetchClassNameId(clazz);
    }

    public static long fetchClassNameId(java.lang.String value) {
        return getService().fetchClassNameId(value);
    }

    public static ClassNameService getService() {
        if (_service == null) {
            _service = (ClassNameService) PortalBeanLocatorUtil.locate(ClassNameService.class.getName());

            ReferenceRegistry.registerReference(ClassNameServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ClassNameService service) {
    }
}
