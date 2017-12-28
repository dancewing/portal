package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the LayoutSetBranch service. Represents a row in the &quot;LayoutSetBranch&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetBranchModel
 * @see com.liferay.portal.model.impl.LayoutSetBranchImpl
 * @see com.liferay.portal.model.impl.LayoutSetBranchModelImpl
 * @generated
 */
@ProviderType
public interface LayoutSetBranch extends LayoutSetBranchModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.LayoutSetBranchImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.ColorScheme getColorScheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Group getGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.LayoutSet getLayoutSet();

    public long getLiveLogoId();

    public com.liferay.portal.kernel.util.UnicodeProperties getSettingsProperties();

    public java.lang.String getSettingsProperty(java.lang.String key);

    public com.liferay.portal.model.Theme getTheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getThemeSetting(java.lang.String key,
        java.lang.String device)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.ColorScheme getWapColorScheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Theme getWapTheme()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isLayoutSetPrototypeLinkActive();

    public void setSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties settingsProperties);
}
