package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class DDMStructureFinderUtil {
    private static DDMStructureFinder _finder;

    public static int countByKeywords(long companyId, long[] groupIds,
        long[] classNameIds, java.lang.String keywords)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByKeywords(companyId, groupIds, classNameIds, keywords);
    }

    public static int countByC_G_C_N_D_S_T(long companyId, long[] groupIds,
        long[] classNameIds, java.lang.String name,
        java.lang.String description, java.lang.String storageType, int type,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByC_G_C_N_D_S_T(companyId, groupIds, classNameIds,
            name, description, storageType, type, andOperator);
    }

    public static int countByC_G_C_N_D_S_T(long companyId, long[] groupIds,
        long[] classNameIds, java.lang.String[] names,
        java.lang.String[] descriptions, java.lang.String[] storageTypes,
        int type, boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByC_G_C_N_D_S_T(companyId, groupIds, classNameIds,
            names, descriptions, storageTypes, type, andOperator);
    }

    public static int filterCountByKeywords(long companyId, long[] groupIds,
        long[] classNameIds, java.lang.String keywords)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountByKeywords(companyId, groupIds, classNameIds,
            keywords);
    }

    public static int filterCountByC_G_C_N_D_S_T(long companyId,
        long[] groupIds, long[] classNameIds, java.lang.String name,
        java.lang.String description, java.lang.String storageType, int type,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountByC_G_C_N_D_S_T(companyId, groupIds,
            classNameIds, name, description, storageType, type, andOperator);
    }

    public static int filterCountByC_G_C_N_D_S_T(long companyId,
        long[] groupIds, long[] classNameIds, java.lang.String[] names,
        java.lang.String[] descriptions, java.lang.String[] storageTypes,
        int type, boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountByC_G_C_N_D_S_T(companyId, groupIds,
            classNameIds, names, descriptions, storageTypes, type, andOperator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> filterFindByKeywords(
        long companyId, long[] groupIds, long[] classNameIds,
        java.lang.String keywords, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindByKeywords(companyId, groupIds, classNameIds,
            keywords, start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> filterFindByC_G_C_N_D_S_T(
        long companyId, long[] groupIds, long[] classNameIds,
        java.lang.String name, java.lang.String description,
        java.lang.String storageType, int type, boolean andOperator, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindByC_G_C_N_D_S_T(companyId, groupIds,
            classNameIds, name, description, storageType, type, andOperator,
            start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> filterFindByC_G_C_N_D_S_T(
        long companyId, long[] groupIds, long[] classNameIds,
        java.lang.String[] names, java.lang.String[] descriptions,
        java.lang.String[] storageTypes, int type, boolean andOperator,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindByC_G_C_N_D_S_T(companyId, groupIds,
            classNameIds, names, descriptions, storageTypes, type, andOperator,
            start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> findByKeywords(
        long companyId, long[] groupIds, long[] classNameIds,
        java.lang.String keywords, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByKeywords(companyId, groupIds, classNameIds, keywords,
            start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> findByC_G_C_N_D_S_T(
        long companyId, long[] groupIds, long[] classNameIds,
        java.lang.String name, java.lang.String description,
        java.lang.String storageType, int type, boolean andOperator, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_G_C_N_D_S_T(companyId, groupIds, classNameIds,
            name, description, storageType, type, andOperator, start, end,
            orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> findByC_G_C_N_D_S_T(
        long companyId, long[] groupIds, long[] classNameIds,
        java.lang.String[] names, java.lang.String[] descriptions,
        java.lang.String[] storageTypes, int type, boolean andOperator,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_G_C_N_D_S_T(companyId, groupIds, classNameIds,
            names, descriptions, storageTypes, type, andOperator, start, end,
            orderByComparator);
    }

    public static DDMStructureFinder getFinder() {
        if (_finder == null) {
            _finder = (DDMStructureFinder) PortalBeanLocatorUtil.locate(DDMStructureFinder.class.getName());

            ReferenceRegistry.registerReference(DDMStructureFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(DDMStructureFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(DDMStructureFinderUtil.class,
            "_finder");
    }
}
