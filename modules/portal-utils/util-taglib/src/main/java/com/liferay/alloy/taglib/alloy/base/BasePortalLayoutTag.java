package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BasePortalLayoutTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:portal-layout:";
    private static final String _PAGE = "/html/taglib/alloy/portal_layout/page.jsp";
    private boolean _destroyed = false;
    private boolean _initialized = false;
    private Object _afterDestroy = null;
    private Object _afterDestroyedChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyedChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:portal-layout:");

        return super.doStartTag();
    }

    public boolean getDestroyed() {
        return this._destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this._destroyed = destroyed;

        setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public Object getAfterDestroy() {
        return this._afterDestroy;
    }

    public void setAfterDestroy(Object afterDestroy) {
        this._afterDestroy = afterDestroy;

        setScopedAttribute("afterDestroy", afterDestroy);
    }

    public Object getAfterDestroyedChange() {
        return this._afterDestroyedChange;
    }

    public void setAfterDestroyedChange(Object afterDestroyedChange) {
        this._afterDestroyedChange = afterDestroyedChange;

        setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
    }

    public Object getAfterInit() {
        return this._afterInit;
    }

    public void setAfterInit(Object afterInit) {
        this._afterInit = afterInit;

        setScopedAttribute("afterInit", afterInit);
    }

    public Object getAfterInitializedChange() {
        return this._afterInitializedChange;
    }

    public void setAfterInitializedChange(Object afterInitializedChange) {
        this._afterInitializedChange = afterInitializedChange;

        setScopedAttribute("afterInitializedChange", afterInitializedChange);
    }

    public Object getOnDestroy() {
        return this._onDestroy;
    }

    public void setOnDestroy(Object onDestroy) {
        this._onDestroy = onDestroy;

        setScopedAttribute("onDestroy", onDestroy);
    }

    public Object getOnDestroyedChange() {
        return this._onDestroyedChange;
    }

    public void setOnDestroyedChange(Object onDestroyedChange) {
        this._onDestroyedChange = onDestroyedChange;

        setScopedAttribute("onDestroyedChange", onDestroyedChange);
    }

    public Object getOnInit() {
        return this._onInit;
    }

    public void setOnInit(Object onInit) {
        this._onInit = onInit;

        setScopedAttribute("onInit", onInit);
    }

    public Object getOnInitializedChange() {
        return this._onInitializedChange;
    }

    public void setOnInitializedChange(Object onInitializedChange) {
        this._onInitializedChange = onInitializedChange;

        setScopedAttribute("onInitializedChange", onInitializedChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._destroyed = false;
        this._initialized = false;
        this._afterDestroy = null;
        this._afterDestroyedChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._onDestroy = null;
        this._onDestroyedChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/portal_layout/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
    }
}
