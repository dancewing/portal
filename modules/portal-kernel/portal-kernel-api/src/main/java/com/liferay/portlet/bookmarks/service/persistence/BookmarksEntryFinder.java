package com.liferay.portlet.bookmarks.service.persistence;

public interface BookmarksEntryFinder {
    public java.util.List<com.liferay.portlet.bookmarks.model.BookmarksEntry> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;
}
