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

package com.liferay.taglib.aui;

import com.liferay.portal.kernel.servlet.taglib.aui.ValidatorTag;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.taglib.aui.base.BaseFormTag;

import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Julio Camarero
 * @author Jorge Ferrer
 * @author Brian Wing Shun Chan
 */
public class FormTag extends BaseFormTag {

    private static final boolean _CLEAN_UP_SET_ATTRIBUTES = true;
    private Map<String, List<ValidatorTag>> _validatorTagsMap =
            new HashMap<String, List<ValidatorTag>>();

    @Override
    public String getAction() {
        return super.getAction();
    }

    public void setAction(PortletURL portletURL) {
        if (portletURL != null) {
            setAction(portletURL.toString());
        }
    }

    @Override
    protected void cleanUp() {
        super.cleanUp();

        if (_validatorTagsMap != null) {
            for (List<ValidatorTag> validatorTags :
                    _validatorTagsMap.values()) {

                for (ValidatorTag validatorTag : validatorTags) {
                    validatorTag.cleanUp();
                }
            }

            _validatorTagsMap.clear();
        }
    }

    @Override
    protected boolean isCleanUpSetAttributes() {
        return _CLEAN_UP_SET_ATTRIBUTES;
    }

    @Override
    protected void setAttributes(HttpServletRequest request) {
        super.setAttributes(request);

        if (getEscapeXml()) {
            String action = getAction();

            super.setAction(HtmlUtil.escape(action));
        }

        request.setAttribute("aui:form:validatorTagsMap", _validatorTagsMap);
    }

}