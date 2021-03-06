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

import com.liferay.portal.kernel.servlet.PortalIncludeUtil;
import com.liferay.portal.kernel.util.Validator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Sergio González
 */
public class AppViewToolbarTag extends TagSupport {

    private static final String _END_PAGE =
            "/html/taglib/ui/app_view_toolbar/end.jsp";
    private static final String _START_PAGE =
            "/html/taglib/ui/app_view_toolbar/start.jsp";
    private String _endPage;
    private boolean _includeDisplayStyle = false;
    private boolean _includeSelectAll = false;
    private String _searchJsp;
    private String _startPage;

    @Override
    public int doEndTag() throws JspException {
        try {
            HttpServletRequest request =
                    (HttpServletRequest) pageContext.getRequest();

            request.setAttribute(
                    "liferay-ui:app_view_toolbar:includeDisplayStyle",
                    _includeDisplayStyle);

            PortalIncludeUtil.include(pageContext, getEndPage());

            return EVAL_PAGE;
        } catch (Exception e) {
            throw new JspException(e);
        }
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            HttpServletRequest request =
                    (HttpServletRequest) pageContext.getRequest();

            request.setAttribute(
                    "liferay-ui:app_view_toolbar:includeSelectAll",
                    _includeSelectAll);
            request.setAttribute(
                    "liferay-ui:app_view_toolbar:searchJsp", _searchJsp);

            PortalIncludeUtil.include(pageContext, getStartPage());

            return EVAL_BODY_INCLUDE;
        } catch (Exception e) {
            throw new JspException(e);
        }
    }

    public void setIncludeDisplayStyle(boolean includeDisplayStyle) {
        _includeDisplayStyle = includeDisplayStyle;
    }

    public void setIncludeSelectAll(boolean includeSelectAll) {
        _includeSelectAll = includeSelectAll;
    }

    public void setSearchJsp(String searchJsp) {
        _searchJsp = searchJsp;
    }

    protected String getEndPage() {
        if (Validator.isNull(_endPage)) {
            return _END_PAGE;
        } else {
            return _endPage;
        }
    }

    public void setEndPage(String endPage) {
        _endPage = endPage;
    }

    protected String getStartPage() {
        if (Validator.isNull(_startPage)) {
            return _START_PAGE;
        } else {
            return _startPage;
        }
    }

    public void setStartPage(String startPage) {
        _startPage = startPage;
    }

}