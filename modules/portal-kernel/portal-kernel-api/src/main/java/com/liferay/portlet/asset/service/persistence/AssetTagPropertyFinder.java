package com.liferay.portlet.asset.service.persistence;

public interface AssetTagPropertyFinder {
    public int countByG_K(long groupId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTagProperty> findByG_K(
        long groupId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTagProperty> findByG_K(
        long groupId, java.lang.String key, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
