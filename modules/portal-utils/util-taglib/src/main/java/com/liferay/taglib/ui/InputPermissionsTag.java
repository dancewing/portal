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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.security.permission.ResourceActionsUtil;
import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 * @author Wilson S. Man
 * @see    com.liferay.portal.servlet.taglib.ui.InputPermissionsTagUtil
 */
public class InputPermissionsTag extends IncludeTag {

    private static final String _PAGE =
            "/html/taglib/ui/input_permissions/page.jsp";
    private String _formName = "fm";
    private String _modelName;

    public static String doTag(
            String formName, String modelName, PageContext pageContext)
            throws Exception {

        return doTag(_PAGE, formName, modelName, pageContext);
    }

    public static String doTag(
            String page, String formName, String modelName,
            PageContext pageContext)
            throws Exception {

        HttpServletRequest request =
                (HttpServletRequest) pageContext.getRequest();

        request.setAttribute("liferay-ui:input-permissions:formName", formName);

        if (modelName != null) {
            List<String> supportedActions =
                    ResourceActionsUtil.getModelResourceActions(modelName);
            List<String> groupDefaultActions =
                    ResourceActionsUtil.getModelResourceGroupDefaultActions(
                            modelName);
            List<String> guestDefaultActions =
                    ResourceActionsUtil.getModelResourceGuestDefaultActions(
                            modelName);
            List<String> guestUnsupportedActions =
                    ResourceActionsUtil.getModelResourceGuestUnsupportedActions(
                            modelName);

            request.setAttribute(
                    "liferay-ui:input-permissions:modelName", modelName);
            request.setAttribute(
                    "liferay-ui:input-permissions:supportedActions",
                    supportedActions);
            request.setAttribute(
                    "liferay-ui:input-permissions:groupDefaultActions",
                    groupDefaultActions);
            request.setAttribute(
                    "liferay-ui:input-permissions:guestDefaultActions",
                    guestDefaultActions);
            request.setAttribute(
                    "liferay-ui:input-permissions:guestUnsupportedActions",
                    guestUnsupportedActions);
        }

        PortalIncludeUtil.include(pageContext, page);

        return StringPool.BLANK;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            doTag(getPage(), _formName, _modelName, pageContext);

            return EVAL_PAGE;
        } catch (Exception e) {
            throw new JspException(e);
        }
    }

    public void setFormName(String formName) {
        _formName = formName;
    }

    public void setModelName(String modelName) {
        _modelName = modelName;
    }

    @Override
    protected String getPage() {
        return _PAGE;
    }

}