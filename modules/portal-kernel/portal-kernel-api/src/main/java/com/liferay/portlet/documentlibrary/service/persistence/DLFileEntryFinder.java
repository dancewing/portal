package com.liferay.portlet.documentlibrary.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface DLFileEntryFinder {
    public int countByExtraSettings()
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_F(long groupId,
        java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_M_R(long groupId,
        com.liferay.portal.kernel.util.DateRange dateRange, long repositoryId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_U_F_M(long groupId, long userId,
        java.util.List<java.lang.Long> folderIds, java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_U_R_F_M(long groupId, long userId,
        java.util.List<java.lang.Long> repositoryIds,
        java.util.List<java.lang.Long> folderIds, java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_U_F_M(long groupId, long userId,
        java.util.List<java.lang.Long> folderIds, java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFileEntry fetchByAnyImageId(
        long imageId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_F(long groupId,
        java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_U_R_F_M(long groupId, long userId,
        java.util.List<java.lang.Long> repositoryIds,
        java.util.List<java.lang.Long> folderIds, java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> filterFindByG_F(
        long groupId, java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> filterFindByG_U_F_M(
        long groupId, long userId, java.util.List<java.lang.Long> folderIds,
        java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> filterFindByG_U_R_F_M(
        long groupId, long userId,
        java.util.List<java.lang.Long> repositoryIds,
        java.util.List<java.lang.Long> folderIds, java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFileEntry findByAnyImageId(
        long imageId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.documentlibrary.NoSuchFileEntryException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByCompanyId(
        long companyId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByDDMStructureIds(
        long[] ddmStructureIds, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByDDMStructureIds(
        long groupId, long[] ddmStructureIds, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByExtraSettings(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByMisversioned()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByOrphanedFileEntries()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_F(
        long groupId, java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_R_F(
        long groupId, java.util.List<java.lang.Long> repositoryIds,
        java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_U_F(
        long groupId, long userId, java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_U_R_F(
        long groupId, long userId,
        java.util.List<java.lang.Long> repositoryIds,
        java.util.List<java.lang.Long> folderIds,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_U_R_F_M(
        long groupId, long userId,
        java.util.List<java.lang.Long> repositoryIds,
        java.util.List<java.lang.Long> folderIds, java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_U_F_M(
        long groupId, long userId, java.util.List<java.lang.Long> folderIds,
        java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;
}
