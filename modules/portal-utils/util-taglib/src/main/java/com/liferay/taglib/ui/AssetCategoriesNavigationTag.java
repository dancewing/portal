/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.taglib.ui;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alvaro del Castillo
 * @author Eduardo Lundgren
 * @author Jorge Ferrer
 */
public class AssetCategoriesNavigationTag extends IncludeTag {

    private static final String _PAGE =
            "/html/taglib/ui/asset_categories_navigation/page.jsp";
    private boolean _hidePortletWhenEmpty;
    private long[] _vocabularyIds;

    public void setHidePortletWhenEmpty(boolean hidePortletWhenEmpty) {
        _hidePortletWhenEmpty = hidePortletWhenEmpty;
    }

    public void setVocabularyIds(long[] vocabularyIds) {
        _vocabularyIds = vocabularyIds;
    }

    @Override
    protected void cleanUp() {
        _hidePortletWhenEmpty = false;
        _vocabularyIds = null;
    }

    @Override
    protected String getPage() {
        return _PAGE;
    }

    @Override
    protected void setAttributes(HttpServletRequest request) {
        request.setAttribute(
                "liferay-ui:asset-tags-navigation:hidePortletWhenEmpty",
                String.valueOf(_hidePortletWhenEmpty));
        request.setAttribute(
                "liferay-ui:asset-tags-navigation:vocabularyIds", _vocabularyIds);
    }

}