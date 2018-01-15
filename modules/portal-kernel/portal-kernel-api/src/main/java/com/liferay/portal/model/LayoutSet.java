package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the LayoutSet service. Represents a row in the &quot;LayoutSet&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetModel
 * @see com.liferay.portal.model.impl.LayoutSetImpl
 * @see com.liferay.portal.model.impl.LayoutSetModelImpl
 * @generated
 */
public interface LayoutSet extends LayoutSetModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.LayoutSetImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.ColorScheme getColorScheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getCompanyFallbackVirtualHostname();

    public com.liferay.portal.model.Group getGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public long getLayoutSetPrototypeId()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public long getLiveLogoId();

    public com.liferay.portal.kernel.util.UnicodeProperties getSettingsProperties();

    public java.lang.String getSettingsProperty(java.lang.String key);

    public com.liferay.portal.model.Theme getTheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getThemeSetting(java.lang.String key,
        java.lang.String device)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getVirtualHostname();

    public com.liferay.portal.model.ColorScheme getWapColorScheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Theme getWapTheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isLayoutSetPrototypeLinkActive();

    public void setCompanyFallbackVirtualHostname(
        java.lang.String companyFallbackVirtualHostname);

    public void setSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties settingsProperties);

    public void setVirtualHostname(java.lang.String virtualHostname);
}
