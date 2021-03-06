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
public class BaseNavItemTag extends com.liferay.taglib.util.IncludeTag {

    protected static final String _ATTRIBUTE_NAMESPACE = "aui:nav-item:";
    private static final String _END_PAGE =
            "/html/taglib/aui/nav_item/end.jsp";
    private static final String _START_PAGE =
            "/html/taglib/aui/nav_item/start.jsp";
    private java.lang.String _anchorCssClass = null;
    private java.lang.Object _anchorData = null;
    private java.lang.String _anchorId = null;
    private java.lang.String _ariaLabel = null;
    private java.lang.String _ariaRole = null;
    private java.lang.String _cssClass = null;
    private java.lang.Object _data = null;
    private boolean _dropdown = false;
    private java.lang.Object _href = "javascript:void(0);";
    private java.lang.String _iconCssClass = null;
    private java.lang.String _id = null;
    private java.lang.String _label = null;
    private boolean _localizeLabel = true;
    private boolean _selected = false;
    private java.lang.String _state = null;
    private java.lang.String _title = null;
    private boolean _toggle = false;
    private boolean _useDialog = false;
    private boolean _wrapDropDownMenu = true;

    @Override
    public int doStartTag() throws JspException {
        setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

        return super.doStartTag();
    }

    public java.lang.String getAnchorCssClass() {
        return _anchorCssClass;
    }

    public void setAnchorCssClass(java.lang.String anchorCssClass) {
        _anchorCssClass = anchorCssClass;

        setScopedAttribute("anchorCssClass", anchorCssClass);
    }

    public java.lang.Object getAnchorData() {
        return _anchorData;
    }

    public void setAnchorData(java.lang.Object anchorData) {
        _anchorData = anchorData;

        setScopedAttribute("anchorData", anchorData);
    }

    public java.lang.String getAnchorId() {
        return _anchorId;
    }

    public void setAnchorId(java.lang.String anchorId) {
        _anchorId = anchorId;

        setScopedAttribute("anchorId", anchorId);
    }

    public java.lang.String getAriaLabel() {
        return _ariaLabel;
    }

    public void setAriaLabel(java.lang.String ariaLabel) {
        _ariaLabel = ariaLabel;

        setScopedAttribute("ariaLabel", ariaLabel);
    }

    public java.lang.String getAriaRole() {
        return _ariaRole;
    }

    public void setAriaRole(java.lang.String ariaRole) {
        _ariaRole = ariaRole;

        setScopedAttribute("ariaRole", ariaRole);
    }

    public java.lang.String getCssClass() {
        return _cssClass;
    }

    public void setCssClass(java.lang.String cssClass) {
        _cssClass = cssClass;

        setScopedAttribute("cssClass", cssClass);
    }

    public java.lang.Object getData() {
        return _data;
    }

    public void setData(java.lang.Object data) {
        _data = data;

        setScopedAttribute("data", data);
    }

    public boolean getDropdown() {
        return _dropdown;
    }

    public void setDropdown(boolean dropdown) {
        _dropdown = dropdown;

        setScopedAttribute("dropdown", dropdown);
    }

    public java.lang.Object getHref() {
        return _href;
    }

    public void setHref(java.lang.Object href) {
        _href = href;

        setScopedAttribute("href", href);
    }

    public java.lang.String getIconCssClass() {
        return _iconCssClass;
    }

    public void setIconCssClass(java.lang.String iconCssClass) {
        _iconCssClass = iconCssClass;

        setScopedAttribute("iconCssClass", iconCssClass);
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

    public boolean getLocalizeLabel() {
        return _localizeLabel;
    }

    public void setLocalizeLabel(boolean localizeLabel) {
        _localizeLabel = localizeLabel;

        setScopedAttribute("localizeLabel", localizeLabel);
    }

    public boolean getSelected() {
        return _selected;
    }

    public void setSelected(boolean selected) {
        _selected = selected;

        setScopedAttribute("selected", selected);
    }

    public java.lang.String getState() {
        return _state;
    }

    public void setState(java.lang.String state) {
        _state = state;

        setScopedAttribute("state", state);
    }

    public java.lang.String getTitle() {
        return _title;
    }

    public void setTitle(java.lang.String title) {
        _title = title;

        setScopedAttribute("title", title);
    }

    public boolean getToggle() {
        return _toggle;
    }

    public void setToggle(boolean toggle) {
        _toggle = toggle;

        setScopedAttribute("toggle", toggle);
    }

    public boolean getUseDialog() {
        return _useDialog;
    }

    public void setUseDialog(boolean useDialog) {
        _useDialog = useDialog;

        setScopedAttribute("useDialog", useDialog);
    }

    public boolean getWrapDropDownMenu() {
        return _wrapDropDownMenu;
    }

    public void setWrapDropDownMenu(boolean wrapDropDownMenu) {
        _wrapDropDownMenu = wrapDropDownMenu;

        setScopedAttribute("wrapDropDownMenu", wrapDropDownMenu);
    }

    @Override
    protected void cleanUp() {
        _anchorCssClass = null;
        _anchorData = null;
        _anchorId = null;
        _ariaLabel = null;
        _ariaRole = null;
        _cssClass = null;
        _data = null;
        _dropdown = false;
        _href = "javascript:void(0);";
        _iconCssClass = null;
        _id = null;
        _label = null;
        _localizeLabel = true;
        _selected = false;
        _state = null;
        _title = null;
        _toggle = false;
        _useDialog = false;
        _wrapDropDownMenu = true;
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
        setNamespacedAttribute(request, "anchorCssClass", _anchorCssClass);
        setNamespacedAttribute(request, "anchorData", _anchorData);
        setNamespacedAttribute(request, "anchorId", _anchorId);
        setNamespacedAttribute(request, "ariaLabel", _ariaLabel);
        setNamespacedAttribute(request, "ariaRole", _ariaRole);
        setNamespacedAttribute(request, "cssClass", _cssClass);
        setNamespacedAttribute(request, "data", _data);
        setNamespacedAttribute(request, "dropdown", _dropdown);
        setNamespacedAttribute(request, "href", _href);
        setNamespacedAttribute(request, "iconCssClass", _iconCssClass);
        setNamespacedAttribute(request, "id", _id);
        setNamespacedAttribute(request, "label", _label);
        setNamespacedAttribute(request, "localizeLabel", _localizeLabel);
        setNamespacedAttribute(request, "selected", _selected);
        setNamespacedAttribute(request, "state", _state);
        setNamespacedAttribute(request, "title", _title);
        setNamespacedAttribute(request, "toggle", _toggle);
        setNamespacedAttribute(request, "useDialog", _useDialog);
        setNamespacedAttribute(request, "wrapDropDownMenu", _wrapDropDownMenu);
    }

}