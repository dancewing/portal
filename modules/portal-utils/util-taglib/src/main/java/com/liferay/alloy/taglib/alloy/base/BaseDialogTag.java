package com.liferay.alloy.taglib.alloy.base;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;


public abstract class BaseDialogTag
        extends IncludeTag {
    protected static final String _ATTRIBUTE_NAMESPACE = "alloy:dialog:";
    private static final String _PAGE = "/html/taglib/alloy/dialog/page.jsp";
    private Object _align = null;
    private Object _alignOn = null;
    private String _dialogBodyContent = null;
    private String _boundingBox = null;
    private Object _buttons = null;
    private Object _centered = null;
    private boolean _close = true;
    private boolean _collapsed = false;
    private boolean _collapsible = false;
    private Object _constrain = null;
    private Object _constrain2view = null;
    private String _contentBox = null;
    private boolean _destroyOnClose = false;
    private boolean _destroyed = false;
    private boolean _disabled = false;
    private Object _dragConfig = null;
    private Object _dragInstance = null;
    private boolean _draggable = true;
    private Object _fillHeight = null;
    private boolean _focused = false;
    private Object _footerContent = null;
    private Object _headerContent = null;
    private Object _height = null;
    private Object _icons = null;
    private String _dialogId = null;
    private boolean _initialized = false;
    private boolean _modal = false;
    private boolean _preventOverlap = false;
    private Object _render = null;
    private boolean _rendered = false;
    private boolean _resizable = true;
    private Object _resizableConfig = null;
    private Object _resizableInstance = null;
    private boolean _shim = false;
    private String _srcNode = null;
    private boolean _stack = true;
    private Object _strings = null;
    private Object _tabIndex = Integer.valueOf(0);
    private Object _title = null;
    private boolean _useARIA = true;
    private boolean _visible = true;
    private Object _width = null;
    private Object _x = Integer.valueOf(0);
    private Object _xy = null;
    private Object _y = Integer.valueOf(0);
    private Object _zIndex = Integer.valueOf(0);
    private Object _afterAlignChange = null;
    private Object _afterAlignOnChange = null;
    private Object _afterBodyContentChange = null;
    private Object _afterBoundingBoxChange = null;
    private Object _afterButtonsChange = null;
    private Object _afterCenteredChange = null;
    private Object _afterCloseChange = null;
    private Object _afterCollapsedChange = null;
    private Object _afterCollapsibleChange = null;
    private Object _afterConstrain2viewChange = null;
    private Object _afterConstrainChange = null;
    private Object _afterContentBoxChange = null;
    private Object _afterDestroy = null;
    private Object _afterDestroyOnCloseChange = null;
    private Object _afterDestroyedChange = null;
    private Object _afterDisabledChange = null;
    private Object _afterDragConfigChange = null;
    private Object _afterDragInstanceChange = null;
    private Object _afterDraggableChange = null;
    private Object _afterFillHeightChange = null;
    private Object _afterFocusedChange = null;
    private Object _afterFooterContentChange = null;
    private Object _afterHeaderContentChange = null;
    private Object _afterHeightChange = null;
    private Object _afterIconsChange = null;
    private Object _afterIdChange = null;
    private Object _afterInit = null;
    private Object _afterInitializedChange = null;
    private Object _afterModalChange = null;
    private Object _afterPreventOverlapChange = null;
    private Object _afterRenderChange = null;
    private Object _afterRenderedChange = null;
    private Object _afterResizableChange = null;
    private Object _afterResizableConfigChange = null;
    private Object _afterResizableInstanceChange = null;
    private Object _afterShimChange = null;
    private Object _afterSrcNodeChange = null;
    private Object _afterStackChange = null;
    private Object _afterStringsChange = null;
    private Object _afterTabIndexChange = null;
    private Object _afterTitleChange = null;
    private Object _afterUseARIAChange = null;
    private Object _afterVisibleChange = null;
    private Object _afterContentUpdate = null;
    private Object _afterRender = null;
    private Object _afterWidthChange = null;
    private Object _afterXChange = null;
    private Object _afterXyChange = null;
    private Object _afterYChange = null;
    private Object _afterZIndexChange = null;
    private Object _onAlignChange = null;
    private Object _onAlignOnChange = null;
    private Object _onBodyContentChange = null;
    private Object _onBoundingBoxChange = null;
    private Object _onButtonsChange = null;
    private Object _onCenteredChange = null;
    private Object _onCloseChange = null;
    private Object _onCollapsedChange = null;
    private Object _onCollapsibleChange = null;
    private Object _onConstrain2viewChange = null;
    private Object _onConstrainChange = null;
    private Object _onContentBoxChange = null;
    private Object _onDestroy = null;
    private Object _onDestroyOnCloseChange = null;
    private Object _onDestroyedChange = null;
    private Object _onDisabledChange = null;
    private Object _onDragConfigChange = null;
    private Object _onDragInstanceChange = null;
    private Object _onDraggableChange = null;
    private Object _onFillHeightChange = null;
    private Object _onFocusedChange = null;
    private Object _onFooterContentChange = null;
    private Object _onHeaderContentChange = null;
    private Object _onHeightChange = null;
    private Object _onIconsChange = null;
    private Object _onIdChange = null;
    private Object _onInit = null;
    private Object _onInitializedChange = null;
    private Object _onModalChange = null;
    private Object _onPreventOverlapChange = null;
    private Object _onRenderChange = null;
    private Object _onRenderedChange = null;
    private Object _onResizableChange = null;
    private Object _onResizableConfigChange = null;
    private Object _onResizableInstanceChange = null;
    private Object _onShimChange = null;
    private Object _onSrcNodeChange = null;
    private Object _onStackChange = null;
    private Object _onStringsChange = null;
    private Object _onTabIndexChange = null;
    private Object _onTitleChange = null;
    private Object _onUseARIAChange = null;
    private Object _onVisibleChange = null;
    private Object _onContentUpdate = null;
    private Object _onRender = null;
    private Object _onWidthChange = null;
    private Object _onXChange = null;
    private Object _onXyChange = null;
    private Object _onYChange = null;
    private Object _onZIndexChange = null;

    public int doStartTag()
            throws JspException {
        setAttributeNamespace("alloy:dialog:");

        return super.doStartTag();
    }

    public Object getAlign() {
        return this._align;
    }

    public void setAlign(Object align) {
        this._align = align;

        setScopedAttribute("align", align);
    }

    public Object getAlignOn() {
        return this._alignOn;
    }

    public void setAlignOn(Object alignOn) {
        this._alignOn = alignOn;

        setScopedAttribute("alignOn", alignOn);
    }

    public String getDialogBodyContent() {
        return this._dialogBodyContent;
    }

    public void setDialogBodyContent(String dialogBodyContent) {
        this._dialogBodyContent = dialogBodyContent;

        setScopedAttribute("dialogBodyContent", dialogBodyContent);
    }

    public String getBoundingBox() {
        return this._boundingBox;
    }

    public void setBoundingBox(String boundingBox) {
        this._boundingBox = boundingBox;

        setScopedAttribute("boundingBox", boundingBox);
    }

    public Object getButtons() {
        return this._buttons;
    }

    public void setButtons(Object buttons) {
        this._buttons = buttons;

        setScopedAttribute("buttons", buttons);
    }

    public Object getCentered() {
        return this._centered;
    }

    public void setCentered(Object centered) {
        this._centered = centered;

        setScopedAttribute("centered", centered);
    }

    public boolean getClose() {
        return this._close;
    }

    public void setClose(boolean close) {
        this._close = close;

        setScopedAttribute("close", Boolean.valueOf(close));
    }

    public boolean getCollapsed() {
        return this._collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        this._collapsed = collapsed;

        setScopedAttribute("collapsed", Boolean.valueOf(collapsed));
    }

    public boolean getCollapsible() {
        return this._collapsible;
    }

    public void setCollapsible(boolean collapsible) {
        this._collapsible = collapsible;

        setScopedAttribute("collapsible", Boolean.valueOf(collapsible));
    }

    public Object getConstrain() {
        return this._constrain;
    }

    public void setConstrain(Object constrain) {
        this._constrain = constrain;

        setScopedAttribute("constrain", constrain);
    }

    public Object getConstrain2view() {
        return this._constrain2view;
    }

    public void setConstrain2view(Object constrain2view) {
        this._constrain2view = constrain2view;

        setScopedAttribute("constrain2view", constrain2view);
    }

    public String getContentBox() {
        return this._contentBox;
    }

    public void setContentBox(String contentBox) {
        this._contentBox = contentBox;

        setScopedAttribute("contentBox", contentBox);
    }

    public boolean getDestroyOnClose() {
        return this._destroyOnClose;
    }

    public void setDestroyOnClose(boolean destroyOnClose) {
        this._destroyOnClose = destroyOnClose;

        setScopedAttribute("destroyOnClose", Boolean.valueOf(destroyOnClose));
    }

    public boolean getDestroyed() {
        return this._destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this._destroyed = destroyed;

        setScopedAttribute("destroyed", Boolean.valueOf(destroyed));
    }

    public boolean getDisabled() {
        return this._disabled;
    }

    public void setDisabled(boolean disabled) {
        this._disabled = disabled;

        setScopedAttribute("disabled", Boolean.valueOf(disabled));
    }

    public Object getDragConfig() {
        return this._dragConfig;
    }

    public void setDragConfig(Object dragConfig) {
        this._dragConfig = dragConfig;

        setScopedAttribute("dragConfig", dragConfig);
    }

    public Object getDragInstance() {
        return this._dragInstance;
    }

    public void setDragInstance(Object dragInstance) {
        this._dragInstance = dragInstance;

        setScopedAttribute("dragInstance", dragInstance);
    }

    public boolean getDraggable() {
        return this._draggable;
    }

    public void setDraggable(boolean draggable) {
        this._draggable = draggable;

        setScopedAttribute("draggable", Boolean.valueOf(draggable));
    }

    public Object getFillHeight() {
        return this._fillHeight;
    }

    public void setFillHeight(Object fillHeight) {
        this._fillHeight = fillHeight;

        setScopedAttribute("fillHeight", fillHeight);
    }

    public boolean getFocused() {
        return this._focused;
    }

    public void setFocused(boolean focused) {
        this._focused = focused;

        setScopedAttribute("focused", Boolean.valueOf(focused));
    }

    public Object getFooterContent() {
        return this._footerContent;
    }

    public void setFooterContent(Object footerContent) {
        this._footerContent = footerContent;

        setScopedAttribute("footerContent", footerContent);
    }

    public Object getHeaderContent() {
        return this._headerContent;
    }

    public void setHeaderContent(Object headerContent) {
        this._headerContent = headerContent;

        setScopedAttribute("headerContent", headerContent);
    }

    public Object getHeight() {
        return this._height;
    }

    public void setHeight(Object height) {
        this._height = height;

        setScopedAttribute("height", height);
    }

    public Object getIcons() {
        return this._icons;
    }

    public void setIcons(Object icons) {
        this._icons = icons;

        setScopedAttribute("icons", icons);
    }

    public String getDialogId() {
        return this._dialogId;
    }

    public void setDialogId(String dialogId) {
        this._dialogId = dialogId;

        setScopedAttribute("dialogId", dialogId);
    }

    public boolean getInitialized() {
        return this._initialized;
    }

    public void setInitialized(boolean initialized) {
        this._initialized = initialized;

        setScopedAttribute("initialized", Boolean.valueOf(initialized));
    }

    public boolean getModal() {
        return this._modal;
    }

    public void setModal(boolean modal) {
        this._modal = modal;

        setScopedAttribute("modal", Boolean.valueOf(modal));
    }

    public boolean getPreventOverlap() {
        return this._preventOverlap;
    }

    public void setPreventOverlap(boolean preventOverlap) {
        this._preventOverlap = preventOverlap;

        setScopedAttribute("preventOverlap", Boolean.valueOf(preventOverlap));
    }

    public Object getRender() {
        return this._render;
    }

    public void setRender(Object render) {
        this._render = render;

        setScopedAttribute("render", render);
    }

    public boolean getRendered() {
        return this._rendered;
    }

    public void setRendered(boolean rendered) {
        this._rendered = rendered;

        setScopedAttribute("rendered", Boolean.valueOf(rendered));
    }

    public boolean getResizable() {
        return this._resizable;
    }

    public void setResizable(boolean resizable) {
        this._resizable = resizable;

        setScopedAttribute("resizable", Boolean.valueOf(resizable));
    }

    public Object getResizableConfig() {
        return this._resizableConfig;
    }

    public void setResizableConfig(Object resizableConfig) {
        this._resizableConfig = resizableConfig;

        setScopedAttribute("resizableConfig", resizableConfig);
    }

    public Object getResizableInstance() {
        return this._resizableInstance;
    }

    public void setResizableInstance(Object resizableInstance) {
        this._resizableInstance = resizableInstance;

        setScopedAttribute("resizableInstance", resizableInstance);
    }

    public boolean getShim() {
        return this._shim;
    }

    public void setShim(boolean shim) {
        this._shim = shim;

        setScopedAttribute("shim", Boolean.valueOf(shim));
    }

    public String getSrcNode() {
        return this._srcNode;
    }

    public void setSrcNode(String srcNode) {
        this._srcNode = srcNode;

        setScopedAttribute("srcNode", srcNode);
    }

    public boolean getStack() {
        return this._stack;
    }

    public void setStack(boolean stack) {
        this._stack = stack;

        setScopedAttribute("stack", Boolean.valueOf(stack));
    }

    public Object getStrings() {
        return this._strings;
    }

    public void setStrings(Object strings) {
        this._strings = strings;

        setScopedAttribute("strings", strings);
    }

    public Object getTabIndex() {
        return this._tabIndex;
    }

    public void setTabIndex(Object tabIndex) {
        this._tabIndex = tabIndex;

        setScopedAttribute("tabIndex", tabIndex);
    }

    public Object getTitle() {
        return this._title;
    }

    public void setTitle(Object title) {
        this._title = title;

        setScopedAttribute("title", title);
    }

    public boolean getUseARIA() {
        return this._useARIA;
    }

    public void setUseARIA(boolean useARIA) {
        this._useARIA = useARIA;

        setScopedAttribute("useARIA", Boolean.valueOf(useARIA));
    }

    public boolean getVisible() {
        return this._visible;
    }

    public void setVisible(boolean visible) {
        this._visible = visible;

        setScopedAttribute("visible", Boolean.valueOf(visible));
    }

    public Object getWidth() {
        return this._width;
    }

    public void setWidth(Object width) {
        this._width = width;

        setScopedAttribute("width", width);
    }

    public Object getX() {
        return this._x;
    }

    public void setX(Object x) {
        this._x = x;

        setScopedAttribute("x", x);
    }

    public Object getXy() {
        return this._xy;
    }

    public void setXy(Object xy) {
        this._xy = xy;

        setScopedAttribute("xy", xy);
    }

    public Object getY() {
        return this._y;
    }

    public void setY(Object y) {
        this._y = y;

        setScopedAttribute("y", y);
    }

    public Object getZIndex() {
        return this._zIndex;
    }

    public void setZIndex(Object zIndex) {
        this._zIndex = zIndex;

        setScopedAttribute("zIndex", zIndex);
    }

    public Object getAfterAlignChange() {
        return this._afterAlignChange;
    }

    public void setAfterAlignChange(Object afterAlignChange) {
        this._afterAlignChange = afterAlignChange;

        setScopedAttribute("afterAlignChange", afterAlignChange);
    }

    public Object getAfterAlignOnChange() {
        return this._afterAlignOnChange;
    }

    public void setAfterAlignOnChange(Object afterAlignOnChange) {
        this._afterAlignOnChange = afterAlignOnChange;

        setScopedAttribute("afterAlignOnChange", afterAlignOnChange);
    }

    public Object getAfterBodyContentChange() {
        return this._afterBodyContentChange;
    }

    public void setAfterBodyContentChange(Object afterBodyContentChange) {
        this._afterBodyContentChange = afterBodyContentChange;

        setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
    }

    public Object getAfterBoundingBoxChange() {
        return this._afterBoundingBoxChange;
    }

    public void setAfterBoundingBoxChange(Object afterBoundingBoxChange) {
        this._afterBoundingBoxChange = afterBoundingBoxChange;

        setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
    }

    public Object getAfterButtonsChange() {
        return this._afterButtonsChange;
    }

    public void setAfterButtonsChange(Object afterButtonsChange) {
        this._afterButtonsChange = afterButtonsChange;

        setScopedAttribute("afterButtonsChange", afterButtonsChange);
    }

    public Object getAfterCenteredChange() {
        return this._afterCenteredChange;
    }

    public void setAfterCenteredChange(Object afterCenteredChange) {
        this._afterCenteredChange = afterCenteredChange;

        setScopedAttribute("afterCenteredChange", afterCenteredChange);
    }

    public Object getAfterCloseChange() {
        return this._afterCloseChange;
    }

    public void setAfterCloseChange(Object afterCloseChange) {
        this._afterCloseChange = afterCloseChange;

        setScopedAttribute("afterCloseChange", afterCloseChange);
    }

    public Object getAfterCollapsedChange() {
        return this._afterCollapsedChange;
    }

    public void setAfterCollapsedChange(Object afterCollapsedChange) {
        this._afterCollapsedChange = afterCollapsedChange;

        setScopedAttribute("afterCollapsedChange", afterCollapsedChange);
    }

    public Object getAfterCollapsibleChange() {
        return this._afterCollapsibleChange;
    }

    public void setAfterCollapsibleChange(Object afterCollapsibleChange) {
        this._afterCollapsibleChange = afterCollapsibleChange;

        setScopedAttribute("afterCollapsibleChange", afterCollapsibleChange);
    }

    public Object getAfterConstrain2viewChange() {
        return this._afterConstrain2viewChange;
    }

    public void setAfterConstrain2viewChange(Object afterConstrain2viewChange) {
        this._afterConstrain2viewChange = afterConstrain2viewChange;

        setScopedAttribute("afterConstrain2viewChange", afterConstrain2viewChange);
    }

    public Object getAfterConstrainChange() {
        return this._afterConstrainChange;
    }

    public void setAfterConstrainChange(Object afterConstrainChange) {
        this._afterConstrainChange = afterConstrainChange;

        setScopedAttribute("afterConstrainChange", afterConstrainChange);
    }

    public Object getAfterContentBoxChange() {
        return this._afterContentBoxChange;
    }

    public void setAfterContentBoxChange(Object afterContentBoxChange) {
        this._afterContentBoxChange = afterContentBoxChange;

        setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
    }

    public Object getAfterDestroy() {
        return this._afterDestroy;
    }

    public void setAfterDestroy(Object afterDestroy) {
        this._afterDestroy = afterDestroy;

        setScopedAttribute("afterDestroy", afterDestroy);
    }

    public Object getAfterDestroyOnCloseChange() {
        return this._afterDestroyOnCloseChange;
    }

    public void setAfterDestroyOnCloseChange(Object afterDestroyOnCloseChange) {
        this._afterDestroyOnCloseChange = afterDestroyOnCloseChange;

        setScopedAttribute("afterDestroyOnCloseChange", afterDestroyOnCloseChange);
    }

    public Object getAfterDestroyedChange() {
        return this._afterDestroyedChange;
    }

    public void setAfterDestroyedChange(Object afterDestroyedChange) {
        this._afterDestroyedChange = afterDestroyedChange;

        setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
    }

    public Object getAfterDisabledChange() {
        return this._afterDisabledChange;
    }

    public void setAfterDisabledChange(Object afterDisabledChange) {
        this._afterDisabledChange = afterDisabledChange;

        setScopedAttribute("afterDisabledChange", afterDisabledChange);
    }

    public Object getAfterDragConfigChange() {
        return this._afterDragConfigChange;
    }

    public void setAfterDragConfigChange(Object afterDragConfigChange) {
        this._afterDragConfigChange = afterDragConfigChange;

        setScopedAttribute("afterDragConfigChange", afterDragConfigChange);
    }

    public Object getAfterDragInstanceChange() {
        return this._afterDragInstanceChange;
    }

    public void setAfterDragInstanceChange(Object afterDragInstanceChange) {
        this._afterDragInstanceChange = afterDragInstanceChange;

        setScopedAttribute("afterDragInstanceChange", afterDragInstanceChange);
    }

    public Object getAfterDraggableChange() {
        return this._afterDraggableChange;
    }

    public void setAfterDraggableChange(Object afterDraggableChange) {
        this._afterDraggableChange = afterDraggableChange;

        setScopedAttribute("afterDraggableChange", afterDraggableChange);
    }

    public Object getAfterFillHeightChange() {
        return this._afterFillHeightChange;
    }

    public void setAfterFillHeightChange(Object afterFillHeightChange) {
        this._afterFillHeightChange = afterFillHeightChange;

        setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
    }

    public Object getAfterFocusedChange() {
        return this._afterFocusedChange;
    }

    public void setAfterFocusedChange(Object afterFocusedChange) {
        this._afterFocusedChange = afterFocusedChange;

        setScopedAttribute("afterFocusedChange", afterFocusedChange);
    }

    public Object getAfterFooterContentChange() {
        return this._afterFooterContentChange;
    }

    public void setAfterFooterContentChange(Object afterFooterContentChange) {
        this._afterFooterContentChange = afterFooterContentChange;

        setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
    }

    public Object getAfterHeaderContentChange() {
        return this._afterHeaderContentChange;
    }

    public void setAfterHeaderContentChange(Object afterHeaderContentChange) {
        this._afterHeaderContentChange = afterHeaderContentChange;

        setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
    }

    public Object getAfterHeightChange() {
        return this._afterHeightChange;
    }

    public void setAfterHeightChange(Object afterHeightChange) {
        this._afterHeightChange = afterHeightChange;

        setScopedAttribute("afterHeightChange", afterHeightChange);
    }

    public Object getAfterIconsChange() {
        return this._afterIconsChange;
    }

    public void setAfterIconsChange(Object afterIconsChange) {
        this._afterIconsChange = afterIconsChange;

        setScopedAttribute("afterIconsChange", afterIconsChange);
    }

    public Object getAfterIdChange() {
        return this._afterIdChange;
    }

    public void setAfterIdChange(Object afterIdChange) {
        this._afterIdChange = afterIdChange;

        setScopedAttribute("afterIdChange", afterIdChange);
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

    public Object getAfterModalChange() {
        return this._afterModalChange;
    }

    public void setAfterModalChange(Object afterModalChange) {
        this._afterModalChange = afterModalChange;

        setScopedAttribute("afterModalChange", afterModalChange);
    }

    public Object getAfterPreventOverlapChange() {
        return this._afterPreventOverlapChange;
    }

    public void setAfterPreventOverlapChange(Object afterPreventOverlapChange) {
        this._afterPreventOverlapChange = afterPreventOverlapChange;

        setScopedAttribute("afterPreventOverlapChange", afterPreventOverlapChange);
    }

    public Object getAfterRenderChange() {
        return this._afterRenderChange;
    }

    public void setAfterRenderChange(Object afterRenderChange) {
        this._afterRenderChange = afterRenderChange;

        setScopedAttribute("afterRenderChange", afterRenderChange);
    }

    public Object getAfterRenderedChange() {
        return this._afterRenderedChange;
    }

    public void setAfterRenderedChange(Object afterRenderedChange) {
        this._afterRenderedChange = afterRenderedChange;

        setScopedAttribute("afterRenderedChange", afterRenderedChange);
    }

    public Object getAfterResizableChange() {
        return this._afterResizableChange;
    }

    public void setAfterResizableChange(Object afterResizableChange) {
        this._afterResizableChange = afterResizableChange;

        setScopedAttribute("afterResizableChange", afterResizableChange);
    }

    public Object getAfterResizableConfigChange() {
        return this._afterResizableConfigChange;
    }

    public void setAfterResizableConfigChange(Object afterResizableConfigChange) {
        this._afterResizableConfigChange = afterResizableConfigChange;

        setScopedAttribute("afterResizableConfigChange", afterResizableConfigChange);
    }

    public Object getAfterResizableInstanceChange() {
        return this._afterResizableInstanceChange;
    }

    public void setAfterResizableInstanceChange(Object afterResizableInstanceChange) {
        this._afterResizableInstanceChange = afterResizableInstanceChange;

        setScopedAttribute("afterResizableInstanceChange", afterResizableInstanceChange);
    }

    public Object getAfterShimChange() {
        return this._afterShimChange;
    }

    public void setAfterShimChange(Object afterShimChange) {
        this._afterShimChange = afterShimChange;

        setScopedAttribute("afterShimChange", afterShimChange);
    }

    public Object getAfterSrcNodeChange() {
        return this._afterSrcNodeChange;
    }

    public void setAfterSrcNodeChange(Object afterSrcNodeChange) {
        this._afterSrcNodeChange = afterSrcNodeChange;

        setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
    }

    public Object getAfterStackChange() {
        return this._afterStackChange;
    }

    public void setAfterStackChange(Object afterStackChange) {
        this._afterStackChange = afterStackChange;

        setScopedAttribute("afterStackChange", afterStackChange);
    }

    public Object getAfterStringsChange() {
        return this._afterStringsChange;
    }

    public void setAfterStringsChange(Object afterStringsChange) {
        this._afterStringsChange = afterStringsChange;

        setScopedAttribute("afterStringsChange", afterStringsChange);
    }

    public Object getAfterTabIndexChange() {
        return this._afterTabIndexChange;
    }

    public void setAfterTabIndexChange(Object afterTabIndexChange) {
        this._afterTabIndexChange = afterTabIndexChange;

        setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
    }

    public Object getAfterTitleChange() {
        return this._afterTitleChange;
    }

    public void setAfterTitleChange(Object afterTitleChange) {
        this._afterTitleChange = afterTitleChange;

        setScopedAttribute("afterTitleChange", afterTitleChange);
    }

    public Object getAfterUseARIAChange() {
        return this._afterUseARIAChange;
    }

    public void setAfterUseARIAChange(Object afterUseARIAChange) {
        this._afterUseARIAChange = afterUseARIAChange;

        setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
    }

    public Object getAfterVisibleChange() {
        return this._afterVisibleChange;
    }

    public void setAfterVisibleChange(Object afterVisibleChange) {
        this._afterVisibleChange = afterVisibleChange;

        setScopedAttribute("afterVisibleChange", afterVisibleChange);
    }

    public Object getAfterContentUpdate() {
        return this._afterContentUpdate;
    }

    public void setAfterContentUpdate(Object afterContentUpdate) {
        this._afterContentUpdate = afterContentUpdate;

        setScopedAttribute("afterContentUpdate", afterContentUpdate);
    }

    public Object getAfterRender() {
        return this._afterRender;
    }

    public void setAfterRender(Object afterRender) {
        this._afterRender = afterRender;

        setScopedAttribute("afterRender", afterRender);
    }

    public Object getAfterWidthChange() {
        return this._afterWidthChange;
    }

    public void setAfterWidthChange(Object afterWidthChange) {
        this._afterWidthChange = afterWidthChange;

        setScopedAttribute("afterWidthChange", afterWidthChange);
    }

    public Object getAfterXChange() {
        return this._afterXChange;
    }

    public void setAfterXChange(Object afterXChange) {
        this._afterXChange = afterXChange;

        setScopedAttribute("afterXChange", afterXChange);
    }

    public Object getAfterXyChange() {
        return this._afterXyChange;
    }

    public void setAfterXyChange(Object afterXyChange) {
        this._afterXyChange = afterXyChange;

        setScopedAttribute("afterXyChange", afterXyChange);
    }

    public Object getAfterYChange() {
        return this._afterYChange;
    }

    public void setAfterYChange(Object afterYChange) {
        this._afterYChange = afterYChange;

        setScopedAttribute("afterYChange", afterYChange);
    }

    public Object getAfterZIndexChange() {
        return this._afterZIndexChange;
    }

    public void setAfterZIndexChange(Object afterZIndexChange) {
        this._afterZIndexChange = afterZIndexChange;

        setScopedAttribute("afterZIndexChange", afterZIndexChange);
    }

    public Object getOnAlignChange() {
        return this._onAlignChange;
    }

    public void setOnAlignChange(Object onAlignChange) {
        this._onAlignChange = onAlignChange;

        setScopedAttribute("onAlignChange", onAlignChange);
    }

    public Object getOnAlignOnChange() {
        return this._onAlignOnChange;
    }

    public void setOnAlignOnChange(Object onAlignOnChange) {
        this._onAlignOnChange = onAlignOnChange;

        setScopedAttribute("onAlignOnChange", onAlignOnChange);
    }

    public Object getOnBodyContentChange() {
        return this._onBodyContentChange;
    }

    public void setOnBodyContentChange(Object onBodyContentChange) {
        this._onBodyContentChange = onBodyContentChange;

        setScopedAttribute("onBodyContentChange", onBodyContentChange);
    }

    public Object getOnBoundingBoxChange() {
        return this._onBoundingBoxChange;
    }

    public void setOnBoundingBoxChange(Object onBoundingBoxChange) {
        this._onBoundingBoxChange = onBoundingBoxChange;

        setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
    }

    public Object getOnButtonsChange() {
        return this._onButtonsChange;
    }

    public void setOnButtonsChange(Object onButtonsChange) {
        this._onButtonsChange = onButtonsChange;

        setScopedAttribute("onButtonsChange", onButtonsChange);
    }

    public Object getOnCenteredChange() {
        return this._onCenteredChange;
    }

    public void setOnCenteredChange(Object onCenteredChange) {
        this._onCenteredChange = onCenteredChange;

        setScopedAttribute("onCenteredChange", onCenteredChange);
    }

    public Object getOnCloseChange() {
        return this._onCloseChange;
    }

    public void setOnCloseChange(Object onCloseChange) {
        this._onCloseChange = onCloseChange;

        setScopedAttribute("onCloseChange", onCloseChange);
    }

    public Object getOnCollapsedChange() {
        return this._onCollapsedChange;
    }

    public void setOnCollapsedChange(Object onCollapsedChange) {
        this._onCollapsedChange = onCollapsedChange;

        setScopedAttribute("onCollapsedChange", onCollapsedChange);
    }

    public Object getOnCollapsibleChange() {
        return this._onCollapsibleChange;
    }

    public void setOnCollapsibleChange(Object onCollapsibleChange) {
        this._onCollapsibleChange = onCollapsibleChange;

        setScopedAttribute("onCollapsibleChange", onCollapsibleChange);
    }

    public Object getOnConstrain2viewChange() {
        return this._onConstrain2viewChange;
    }

    public void setOnConstrain2viewChange(Object onConstrain2viewChange) {
        this._onConstrain2viewChange = onConstrain2viewChange;

        setScopedAttribute("onConstrain2viewChange", onConstrain2viewChange);
    }

    public Object getOnConstrainChange() {
        return this._onConstrainChange;
    }

    public void setOnConstrainChange(Object onConstrainChange) {
        this._onConstrainChange = onConstrainChange;

        setScopedAttribute("onConstrainChange", onConstrainChange);
    }

    public Object getOnContentBoxChange() {
        return this._onContentBoxChange;
    }

    public void setOnContentBoxChange(Object onContentBoxChange) {
        this._onContentBoxChange = onContentBoxChange;

        setScopedAttribute("onContentBoxChange", onContentBoxChange);
    }

    public Object getOnDestroy() {
        return this._onDestroy;
    }

    public void setOnDestroy(Object onDestroy) {
        this._onDestroy = onDestroy;

        setScopedAttribute("onDestroy", onDestroy);
    }

    public Object getOnDestroyOnCloseChange() {
        return this._onDestroyOnCloseChange;
    }

    public void setOnDestroyOnCloseChange(Object onDestroyOnCloseChange) {
        this._onDestroyOnCloseChange = onDestroyOnCloseChange;

        setScopedAttribute("onDestroyOnCloseChange", onDestroyOnCloseChange);
    }

    public Object getOnDestroyedChange() {
        return this._onDestroyedChange;
    }

    public void setOnDestroyedChange(Object onDestroyedChange) {
        this._onDestroyedChange = onDestroyedChange;

        setScopedAttribute("onDestroyedChange", onDestroyedChange);
    }

    public Object getOnDisabledChange() {
        return this._onDisabledChange;
    }

    public void setOnDisabledChange(Object onDisabledChange) {
        this._onDisabledChange = onDisabledChange;

        setScopedAttribute("onDisabledChange", onDisabledChange);
    }

    public Object getOnDragConfigChange() {
        return this._onDragConfigChange;
    }

    public void setOnDragConfigChange(Object onDragConfigChange) {
        this._onDragConfigChange = onDragConfigChange;

        setScopedAttribute("onDragConfigChange", onDragConfigChange);
    }

    public Object getOnDragInstanceChange() {
        return this._onDragInstanceChange;
    }

    public void setOnDragInstanceChange(Object onDragInstanceChange) {
        this._onDragInstanceChange = onDragInstanceChange;

        setScopedAttribute("onDragInstanceChange", onDragInstanceChange);
    }

    public Object getOnDraggableChange() {
        return this._onDraggableChange;
    }

    public void setOnDraggableChange(Object onDraggableChange) {
        this._onDraggableChange = onDraggableChange;

        setScopedAttribute("onDraggableChange", onDraggableChange);
    }

    public Object getOnFillHeightChange() {
        return this._onFillHeightChange;
    }

    public void setOnFillHeightChange(Object onFillHeightChange) {
        this._onFillHeightChange = onFillHeightChange;

        setScopedAttribute("onFillHeightChange", onFillHeightChange);
    }

    public Object getOnFocusedChange() {
        return this._onFocusedChange;
    }

    public void setOnFocusedChange(Object onFocusedChange) {
        this._onFocusedChange = onFocusedChange;

        setScopedAttribute("onFocusedChange", onFocusedChange);
    }

    public Object getOnFooterContentChange() {
        return this._onFooterContentChange;
    }

    public void setOnFooterContentChange(Object onFooterContentChange) {
        this._onFooterContentChange = onFooterContentChange;

        setScopedAttribute("onFooterContentChange", onFooterContentChange);
    }

    public Object getOnHeaderContentChange() {
        return this._onHeaderContentChange;
    }

    public void setOnHeaderContentChange(Object onHeaderContentChange) {
        this._onHeaderContentChange = onHeaderContentChange;

        setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
    }

    public Object getOnHeightChange() {
        return this._onHeightChange;
    }

    public void setOnHeightChange(Object onHeightChange) {
        this._onHeightChange = onHeightChange;

        setScopedAttribute("onHeightChange", onHeightChange);
    }

    public Object getOnIconsChange() {
        return this._onIconsChange;
    }

    public void setOnIconsChange(Object onIconsChange) {
        this._onIconsChange = onIconsChange;

        setScopedAttribute("onIconsChange", onIconsChange);
    }

    public Object getOnIdChange() {
        return this._onIdChange;
    }

    public void setOnIdChange(Object onIdChange) {
        this._onIdChange = onIdChange;

        setScopedAttribute("onIdChange", onIdChange);
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

    public Object getOnModalChange() {
        return this._onModalChange;
    }

    public void setOnModalChange(Object onModalChange) {
        this._onModalChange = onModalChange;

        setScopedAttribute("onModalChange", onModalChange);
    }

    public Object getOnPreventOverlapChange() {
        return this._onPreventOverlapChange;
    }

    public void setOnPreventOverlapChange(Object onPreventOverlapChange) {
        this._onPreventOverlapChange = onPreventOverlapChange;

        setScopedAttribute("onPreventOverlapChange", onPreventOverlapChange);
    }

    public Object getOnRenderChange() {
        return this._onRenderChange;
    }

    public void setOnRenderChange(Object onRenderChange) {
        this._onRenderChange = onRenderChange;

        setScopedAttribute("onRenderChange", onRenderChange);
    }

    public Object getOnRenderedChange() {
        return this._onRenderedChange;
    }

    public void setOnRenderedChange(Object onRenderedChange) {
        this._onRenderedChange = onRenderedChange;

        setScopedAttribute("onRenderedChange", onRenderedChange);
    }

    public Object getOnResizableChange() {
        return this._onResizableChange;
    }

    public void setOnResizableChange(Object onResizableChange) {
        this._onResizableChange = onResizableChange;

        setScopedAttribute("onResizableChange", onResizableChange);
    }

    public Object getOnResizableConfigChange() {
        return this._onResizableConfigChange;
    }

    public void setOnResizableConfigChange(Object onResizableConfigChange) {
        this._onResizableConfigChange = onResizableConfigChange;

        setScopedAttribute("onResizableConfigChange", onResizableConfigChange);
    }

    public Object getOnResizableInstanceChange() {
        return this._onResizableInstanceChange;
    }

    public void setOnResizableInstanceChange(Object onResizableInstanceChange) {
        this._onResizableInstanceChange = onResizableInstanceChange;

        setScopedAttribute("onResizableInstanceChange", onResizableInstanceChange);
    }

    public Object getOnShimChange() {
        return this._onShimChange;
    }

    public void setOnShimChange(Object onShimChange) {
        this._onShimChange = onShimChange;

        setScopedAttribute("onShimChange", onShimChange);
    }

    public Object getOnSrcNodeChange() {
        return this._onSrcNodeChange;
    }

    public void setOnSrcNodeChange(Object onSrcNodeChange) {
        this._onSrcNodeChange = onSrcNodeChange;

        setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
    }

    public Object getOnStackChange() {
        return this._onStackChange;
    }

    public void setOnStackChange(Object onStackChange) {
        this._onStackChange = onStackChange;

        setScopedAttribute("onStackChange", onStackChange);
    }

    public Object getOnStringsChange() {
        return this._onStringsChange;
    }

    public void setOnStringsChange(Object onStringsChange) {
        this._onStringsChange = onStringsChange;

        setScopedAttribute("onStringsChange", onStringsChange);
    }

    public Object getOnTabIndexChange() {
        return this._onTabIndexChange;
    }

    public void setOnTabIndexChange(Object onTabIndexChange) {
        this._onTabIndexChange = onTabIndexChange;

        setScopedAttribute("onTabIndexChange", onTabIndexChange);
    }

    public Object getOnTitleChange() {
        return this._onTitleChange;
    }

    public void setOnTitleChange(Object onTitleChange) {
        this._onTitleChange = onTitleChange;

        setScopedAttribute("onTitleChange", onTitleChange);
    }

    public Object getOnUseARIAChange() {
        return this._onUseARIAChange;
    }

    public void setOnUseARIAChange(Object onUseARIAChange) {
        this._onUseARIAChange = onUseARIAChange;

        setScopedAttribute("onUseARIAChange", onUseARIAChange);
    }

    public Object getOnVisibleChange() {
        return this._onVisibleChange;
    }

    public void setOnVisibleChange(Object onVisibleChange) {
        this._onVisibleChange = onVisibleChange;

        setScopedAttribute("onVisibleChange", onVisibleChange);
    }

    public Object getOnContentUpdate() {
        return this._onContentUpdate;
    }

    public void setOnContentUpdate(Object onContentUpdate) {
        this._onContentUpdate = onContentUpdate;

        setScopedAttribute("onContentUpdate", onContentUpdate);
    }

    public Object getOnRender() {
        return this._onRender;
    }

    public void setOnRender(Object onRender) {
        this._onRender = onRender;

        setScopedAttribute("onRender", onRender);
    }

    public Object getOnWidthChange() {
        return this._onWidthChange;
    }

    public void setOnWidthChange(Object onWidthChange) {
        this._onWidthChange = onWidthChange;

        setScopedAttribute("onWidthChange", onWidthChange);
    }

    public Object getOnXChange() {
        return this._onXChange;
    }

    public void setOnXChange(Object onXChange) {
        this._onXChange = onXChange;

        setScopedAttribute("onXChange", onXChange);
    }

    public Object getOnXyChange() {
        return this._onXyChange;
    }

    public void setOnXyChange(Object onXyChange) {
        this._onXyChange = onXyChange;

        setScopedAttribute("onXyChange", onXyChange);
    }

    public Object getOnYChange() {
        return this._onYChange;
    }

    public void setOnYChange(Object onYChange) {
        this._onYChange = onYChange;

        setScopedAttribute("onYChange", onYChange);
    }

    public Object getOnZIndexChange() {
        return this._onZIndexChange;
    }

    public void setOnZIndexChange(Object onZIndexChange) {
        this._onZIndexChange = onZIndexChange;

        setScopedAttribute("onZIndexChange", onZIndexChange);
    }

    protected void cleanUp() {
        super.cleanUp();

        this._align = null;
        this._alignOn = null;
        this._dialogBodyContent = null;
        this._boundingBox = null;
        this._buttons = null;
        this._centered = null;
        this._close = true;
        this._collapsed = false;
        this._collapsible = false;
        this._constrain = null;
        this._constrain2view = null;
        this._contentBox = null;
        this._destroyOnClose = false;
        this._destroyed = false;
        this._disabled = false;
        this._dragConfig = null;
        this._dragInstance = null;
        this._draggable = true;
        this._fillHeight = null;
        this._focused = false;
        this._footerContent = null;
        this._headerContent = null;
        this._height = null;
        this._icons = null;
        this._dialogId = null;
        this._initialized = false;
        this._modal = false;
        this._preventOverlap = false;
        this._render = null;
        this._rendered = false;
        this._resizable = true;
        this._resizableConfig = null;
        this._resizableInstance = null;
        this._shim = false;
        this._srcNode = null;
        this._stack = true;
        this._strings = null;
        this._tabIndex = Integer.valueOf(0);
        this._title = null;
        this._useARIA = true;
        this._visible = true;
        this._width = null;
        this._x = Integer.valueOf(0);
        this._xy = null;
        this._y = Integer.valueOf(0);
        this._zIndex = Integer.valueOf(0);
        this._afterAlignChange = null;
        this._afterAlignOnChange = null;
        this._afterBodyContentChange = null;
        this._afterBoundingBoxChange = null;
        this._afterButtonsChange = null;
        this._afterCenteredChange = null;
        this._afterCloseChange = null;
        this._afterCollapsedChange = null;
        this._afterCollapsibleChange = null;
        this._afterConstrain2viewChange = null;
        this._afterConstrainChange = null;
        this._afterContentBoxChange = null;
        this._afterDestroy = null;
        this._afterDestroyOnCloseChange = null;
        this._afterDestroyedChange = null;
        this._afterDisabledChange = null;
        this._afterDragConfigChange = null;
        this._afterDragInstanceChange = null;
        this._afterDraggableChange = null;
        this._afterFillHeightChange = null;
        this._afterFocusedChange = null;
        this._afterFooterContentChange = null;
        this._afterHeaderContentChange = null;
        this._afterHeightChange = null;
        this._afterIconsChange = null;
        this._afterIdChange = null;
        this._afterInit = null;
        this._afterInitializedChange = null;
        this._afterModalChange = null;
        this._afterPreventOverlapChange = null;
        this._afterRenderChange = null;
        this._afterRenderedChange = null;
        this._afterResizableChange = null;
        this._afterResizableConfigChange = null;
        this._afterResizableInstanceChange = null;
        this._afterShimChange = null;
        this._afterSrcNodeChange = null;
        this._afterStackChange = null;
        this._afterStringsChange = null;
        this._afterTabIndexChange = null;
        this._afterTitleChange = null;
        this._afterUseARIAChange = null;
        this._afterVisibleChange = null;
        this._afterContentUpdate = null;
        this._afterRender = null;
        this._afterWidthChange = null;
        this._afterXChange = null;
        this._afterXyChange = null;
        this._afterYChange = null;
        this._afterZIndexChange = null;
        this._onAlignChange = null;
        this._onAlignOnChange = null;
        this._onBodyContentChange = null;
        this._onBoundingBoxChange = null;
        this._onButtonsChange = null;
        this._onCenteredChange = null;
        this._onCloseChange = null;
        this._onCollapsedChange = null;
        this._onCollapsibleChange = null;
        this._onConstrain2viewChange = null;
        this._onConstrainChange = null;
        this._onContentBoxChange = null;
        this._onDestroy = null;
        this._onDestroyOnCloseChange = null;
        this._onDestroyedChange = null;
        this._onDisabledChange = null;
        this._onDragConfigChange = null;
        this._onDragInstanceChange = null;
        this._onDraggableChange = null;
        this._onFillHeightChange = null;
        this._onFocusedChange = null;
        this._onFooterContentChange = null;
        this._onHeaderContentChange = null;
        this._onHeightChange = null;
        this._onIconsChange = null;
        this._onIdChange = null;
        this._onInit = null;
        this._onInitializedChange = null;
        this._onModalChange = null;
        this._onPreventOverlapChange = null;
        this._onRenderChange = null;
        this._onRenderedChange = null;
        this._onResizableChange = null;
        this._onResizableConfigChange = null;
        this._onResizableInstanceChange = null;
        this._onShimChange = null;
        this._onSrcNodeChange = null;
        this._onStackChange = null;
        this._onStringsChange = null;
        this._onTabIndexChange = null;
        this._onTitleChange = null;
        this._onUseARIAChange = null;
        this._onVisibleChange = null;
        this._onContentUpdate = null;
        this._onRender = null;
        this._onWidthChange = null;
        this._onXChange = null;
        this._onXyChange = null;
        this._onYChange = null;
        this._onZIndexChange = null;
    }

    protected String getPage() {
        return "/html/taglib/alloy/dialog/page.jsp";
    }

    protected void setAttributes(HttpServletRequest request) {
        setNamespacedAttribute(request, "align", this._align);
        setNamespacedAttribute(request, "alignOn", this._alignOn);
        setNamespacedAttribute(request, "dialogBodyContent", this._dialogBodyContent);
        setNamespacedAttribute(request, "boundingBox", this._boundingBox);
        setNamespacedAttribute(request, "buttons", this._buttons);
        setNamespacedAttribute(request, "centered", this._centered);
        setNamespacedAttribute(request, "close", Boolean.valueOf(this._close));
        setNamespacedAttribute(request, "collapsed", Boolean.valueOf(this._collapsed));
        setNamespacedAttribute(request, "collapsible", Boolean.valueOf(this._collapsible));
        setNamespacedAttribute(request, "constrain", this._constrain);
        setNamespacedAttribute(request, "constrain2view", this._constrain2view);
        setNamespacedAttribute(request, "contentBox", this._contentBox);
        setNamespacedAttribute(request, "destroyOnClose", Boolean.valueOf(this._destroyOnClose));
        setNamespacedAttribute(request, "destroyed", Boolean.valueOf(this._destroyed));
        setNamespacedAttribute(request, "disabled", Boolean.valueOf(this._disabled));
        setNamespacedAttribute(request, "dragConfig", this._dragConfig);
        setNamespacedAttribute(request, "dragInstance", this._dragInstance);
        setNamespacedAttribute(request, "draggable", Boolean.valueOf(this._draggable));
        setNamespacedAttribute(request, "fillHeight", this._fillHeight);
        setNamespacedAttribute(request, "focused", Boolean.valueOf(this._focused));
        setNamespacedAttribute(request, "footerContent", this._footerContent);
        setNamespacedAttribute(request, "headerContent", this._headerContent);
        setNamespacedAttribute(request, "height", this._height);
        setNamespacedAttribute(request, "icons", this._icons);
        setNamespacedAttribute(request, "dialogId", this._dialogId);
        setNamespacedAttribute(request, "initialized", Boolean.valueOf(this._initialized));
        setNamespacedAttribute(request, "modal", Boolean.valueOf(this._modal));
        setNamespacedAttribute(request, "preventOverlap", Boolean.valueOf(this._preventOverlap));
        setNamespacedAttribute(request, "render", this._render);
        setNamespacedAttribute(request, "rendered", Boolean.valueOf(this._rendered));
        setNamespacedAttribute(request, "resizable", Boolean.valueOf(this._resizable));
        setNamespacedAttribute(request, "resizableConfig", this._resizableConfig);
        setNamespacedAttribute(request, "resizableInstance", this._resizableInstance);
        setNamespacedAttribute(request, "shim", Boolean.valueOf(this._shim));
        setNamespacedAttribute(request, "srcNode", this._srcNode);
        setNamespacedAttribute(request, "stack", Boolean.valueOf(this._stack));
        setNamespacedAttribute(request, "strings", this._strings);
        setNamespacedAttribute(request, "tabIndex", this._tabIndex);
        setNamespacedAttribute(request, "title", this._title);
        setNamespacedAttribute(request, "useARIA", Boolean.valueOf(this._useARIA));
        setNamespacedAttribute(request, "visible", Boolean.valueOf(this._visible));
        setNamespacedAttribute(request, "width", this._width);
        setNamespacedAttribute(request, "x", this._x);
        setNamespacedAttribute(request, "xy", this._xy);
        setNamespacedAttribute(request, "y", this._y);
        setNamespacedAttribute(request, "zIndex", this._zIndex);
        setNamespacedAttribute(request, "afterAlignChange", this._afterAlignChange);
        setNamespacedAttribute(request, "afterAlignOnChange", this._afterAlignOnChange);
        setNamespacedAttribute(request, "afterBodyContentChange", this._afterBodyContentChange);
        setNamespacedAttribute(request, "afterBoundingBoxChange", this._afterBoundingBoxChange);
        setNamespacedAttribute(request, "afterButtonsChange", this._afterButtonsChange);
        setNamespacedAttribute(request, "afterCenteredChange", this._afterCenteredChange);
        setNamespacedAttribute(request, "afterCloseChange", this._afterCloseChange);
        setNamespacedAttribute(request, "afterCollapsedChange", this._afterCollapsedChange);
        setNamespacedAttribute(request, "afterCollapsibleChange", this._afterCollapsibleChange);
        setNamespacedAttribute(request, "afterConstrain2viewChange", this._afterConstrain2viewChange);
        setNamespacedAttribute(request, "afterConstrainChange", this._afterConstrainChange);
        setNamespacedAttribute(request, "afterContentBoxChange", this._afterContentBoxChange);
        setNamespacedAttribute(request, "afterDestroy", this._afterDestroy);
        setNamespacedAttribute(request, "afterDestroyOnCloseChange", this._afterDestroyOnCloseChange);
        setNamespacedAttribute(request, "afterDestroyedChange", this._afterDestroyedChange);
        setNamespacedAttribute(request, "afterDisabledChange", this._afterDisabledChange);
        setNamespacedAttribute(request, "afterDragConfigChange", this._afterDragConfigChange);
        setNamespacedAttribute(request, "afterDragInstanceChange", this._afterDragInstanceChange);
        setNamespacedAttribute(request, "afterDraggableChange", this._afterDraggableChange);
        setNamespacedAttribute(request, "afterFillHeightChange", this._afterFillHeightChange);
        setNamespacedAttribute(request, "afterFocusedChange", this._afterFocusedChange);
        setNamespacedAttribute(request, "afterFooterContentChange", this._afterFooterContentChange);
        setNamespacedAttribute(request, "afterHeaderContentChange", this._afterHeaderContentChange);
        setNamespacedAttribute(request, "afterHeightChange", this._afterHeightChange);
        setNamespacedAttribute(request, "afterIconsChange", this._afterIconsChange);
        setNamespacedAttribute(request, "afterIdChange", this._afterIdChange);
        setNamespacedAttribute(request, "afterInit", this._afterInit);
        setNamespacedAttribute(request, "afterInitializedChange", this._afterInitializedChange);
        setNamespacedAttribute(request, "afterModalChange", this._afterModalChange);
        setNamespacedAttribute(request, "afterPreventOverlapChange", this._afterPreventOverlapChange);
        setNamespacedAttribute(request, "afterRenderChange", this._afterRenderChange);
        setNamespacedAttribute(request, "afterRenderedChange", this._afterRenderedChange);
        setNamespacedAttribute(request, "afterResizableChange", this._afterResizableChange);
        setNamespacedAttribute(request, "afterResizableConfigChange", this._afterResizableConfigChange);
        setNamespacedAttribute(request, "afterResizableInstanceChange", this._afterResizableInstanceChange);
        setNamespacedAttribute(request, "afterShimChange", this._afterShimChange);
        setNamespacedAttribute(request, "afterSrcNodeChange", this._afterSrcNodeChange);
        setNamespacedAttribute(request, "afterStackChange", this._afterStackChange);
        setNamespacedAttribute(request, "afterStringsChange", this._afterStringsChange);
        setNamespacedAttribute(request, "afterTabIndexChange", this._afterTabIndexChange);
        setNamespacedAttribute(request, "afterTitleChange", this._afterTitleChange);
        setNamespacedAttribute(request, "afterUseARIAChange", this._afterUseARIAChange);
        setNamespacedAttribute(request, "afterVisibleChange", this._afterVisibleChange);
        setNamespacedAttribute(request, "afterContentUpdate", this._afterContentUpdate);
        setNamespacedAttribute(request, "afterRender", this._afterRender);
        setNamespacedAttribute(request, "afterWidthChange", this._afterWidthChange);
        setNamespacedAttribute(request, "afterXChange", this._afterXChange);
        setNamespacedAttribute(request, "afterXyChange", this._afterXyChange);
        setNamespacedAttribute(request, "afterYChange", this._afterYChange);
        setNamespacedAttribute(request, "afterZIndexChange", this._afterZIndexChange);
        setNamespacedAttribute(request, "onAlignChange", this._onAlignChange);
        setNamespacedAttribute(request, "onAlignOnChange", this._onAlignOnChange);
        setNamespacedAttribute(request, "onBodyContentChange", this._onBodyContentChange);
        setNamespacedAttribute(request, "onBoundingBoxChange", this._onBoundingBoxChange);
        setNamespacedAttribute(request, "onButtonsChange", this._onButtonsChange);
        setNamespacedAttribute(request, "onCenteredChange", this._onCenteredChange);
        setNamespacedAttribute(request, "onCloseChange", this._onCloseChange);
        setNamespacedAttribute(request, "onCollapsedChange", this._onCollapsedChange);
        setNamespacedAttribute(request, "onCollapsibleChange", this._onCollapsibleChange);
        setNamespacedAttribute(request, "onConstrain2viewChange", this._onConstrain2viewChange);
        setNamespacedAttribute(request, "onConstrainChange", this._onConstrainChange);
        setNamespacedAttribute(request, "onContentBoxChange", this._onContentBoxChange);
        setNamespacedAttribute(request, "onDestroy", this._onDestroy);
        setNamespacedAttribute(request, "onDestroyOnCloseChange", this._onDestroyOnCloseChange);
        setNamespacedAttribute(request, "onDestroyedChange", this._onDestroyedChange);
        setNamespacedAttribute(request, "onDisabledChange", this._onDisabledChange);
        setNamespacedAttribute(request, "onDragConfigChange", this._onDragConfigChange);
        setNamespacedAttribute(request, "onDragInstanceChange", this._onDragInstanceChange);
        setNamespacedAttribute(request, "onDraggableChange", this._onDraggableChange);
        setNamespacedAttribute(request, "onFillHeightChange", this._onFillHeightChange);
        setNamespacedAttribute(request, "onFocusedChange", this._onFocusedChange);
        setNamespacedAttribute(request, "onFooterContentChange", this._onFooterContentChange);
        setNamespacedAttribute(request, "onHeaderContentChange", this._onHeaderContentChange);
        setNamespacedAttribute(request, "onHeightChange", this._onHeightChange);
        setNamespacedAttribute(request, "onIconsChange", this._onIconsChange);
        setNamespacedAttribute(request, "onIdChange", this._onIdChange);
        setNamespacedAttribute(request, "onInit", this._onInit);
        setNamespacedAttribute(request, "onInitializedChange", this._onInitializedChange);
        setNamespacedAttribute(request, "onModalChange", this._onModalChange);
        setNamespacedAttribute(request, "onPreventOverlapChange", this._onPreventOverlapChange);
        setNamespacedAttribute(request, "onRenderChange", this._onRenderChange);
        setNamespacedAttribute(request, "onRenderedChange", this._onRenderedChange);
        setNamespacedAttribute(request, "onResizableChange", this._onResizableChange);
        setNamespacedAttribute(request, "onResizableConfigChange", this._onResizableConfigChange);
        setNamespacedAttribute(request, "onResizableInstanceChange", this._onResizableInstanceChange);
        setNamespacedAttribute(request, "onShimChange", this._onShimChange);
        setNamespacedAttribute(request, "onSrcNodeChange", this._onSrcNodeChange);
        setNamespacedAttribute(request, "onStackChange", this._onStackChange);
        setNamespacedAttribute(request, "onStringsChange", this._onStringsChange);
        setNamespacedAttribute(request, "onTabIndexChange", this._onTabIndexChange);
        setNamespacedAttribute(request, "onTitleChange", this._onTitleChange);
        setNamespacedAttribute(request, "onUseARIAChange", this._onUseARIAChange);
        setNamespacedAttribute(request, "onVisibleChange", this._onVisibleChange);
        setNamespacedAttribute(request, "onContentUpdate", this._onContentUpdate);
        setNamespacedAttribute(request, "onRender", this._onRender);
        setNamespacedAttribute(request, "onWidthChange", this._onWidthChange);
        setNamespacedAttribute(request, "onXChange", this._onXChange);
        setNamespacedAttribute(request, "onXyChange", this._onXyChange);
        setNamespacedAttribute(request, "onYChange", this._onYChange);
        setNamespacedAttribute(request, "onZIndexChange", this._onZIndexChange);
    }
}
