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

package com.liferay.taglib.aui.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @author Julio Camarero
 * @generated
 */
public class BasePanelTag extends com.liferay.taglib.util.IncludeTag {

    protected static final String _ATTRIBUTE_NAMESPACE = "aui:panel:";
    private static final String _END_PAGE =
            "/html/taglib/aui/panel/end.jsp";
    private static final String _START_PAGE =
            "/html/taglib/aui/panel/start.jsp";
    private boolean _collapsed = false;
    private boolean _collapsible = false;
    private java.lang.String _id = null;
    private java.lang.String _label = null;

    @Override
    public int doStartTag() throws JspException {
        setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

        return super.doStartTag();
    }

    public boolean getCollapsed() {
        return _collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        _collapsed = collapsed;

        setScopedAttribute("collapsed", collapsed);
    }

    public boolean getCollapsible() {
        return _collapsible;
    }

    public void setCollapsible(boolean collapsible) {
        _collapsible = collapsible;

        setScopedAttribute("collapsible", collapsible);
    }

    public java.lang.String getId() {
        return _id;
    }

    public void setId(java.lang.String id) {
        _id = id;

        setScopedAttribute("id", id);
    }

    public java.lang.String getLabel() {
        return _label;
    }

    public void setLabel(java.lang.String label) {
        _label = label;

        setScopedAttribute("label", label);
    }

    @Override
    protected void cleanUp() {
        _collapsed = false;
        _collapsible = false;
        _id = null;
        _label = null;
    }

    @Override
    protected String getEndPage() {
        return _END_PAGE;
    }

    @Override
    protected String getStartPage() {
        return _START_PAGE;
    }

    @Override
    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "collapsed", _collapsed);
        setNamespacedAttribute(request, "collapsible", _collapsible);
        setNamespacedAttribute(request, "id", _id);
        setNamespacedAttribute(request, "label", _label);
    }

}