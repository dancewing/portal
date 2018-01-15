package com.liferay.portlet.dynamicdatalists.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class DDLRecordFinderUtil {
    private static DDLRecordFinder _finder;

    public static int countByR_S(long recordSetId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByR_S(recordSetId, status);
    }

    public static int countByC_S_S(long companyId, int status, int scope)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByC_S_S(companyId, status, scope);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> findByR_S(
        long recordSetId, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByR_S(recordSetId, status, start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> findByC_S_S(
        long companyId, int status, int scope, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_S_S(companyId, status, scope, start, end,
            orderByComparator);
    }

    public static java.lang.Long[] findByC_S_S_MinAndMax(long companyId,
        int status, int scope)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByC_S_S_MinAndMax(companyId, status, scope);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> findByC_S_S_MinAndMax(
        long companyId, int status, int scope, long minRecordId,
        long maxRecordId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_S_S_MinAndMax(companyId, status, scope,
            minRecordId, maxRecordId);
    }

    public static DDLRecordFinder getFinder() {
        if (_finder == null) {
            _finder = (DDLRecordFinder) PortalBeanLocatorUtil.locate(DDLRecordFinder.class.getName());

            ReferenceRegistry.registerReference(DDLRecordFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(DDLRecordFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(DDLRecordFinderUtil.class, "_finder");
    }
}
