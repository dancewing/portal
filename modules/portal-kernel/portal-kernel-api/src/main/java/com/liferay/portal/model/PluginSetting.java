package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the PluginSetting service. Represents a row in the &quot;PluginSetting&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PluginSettingModel
 * @see com.liferay.portal.model.impl.PluginSettingImpl
 * @see com.liferay.portal.model.impl.PluginSettingModelImpl
 * @generated
 */
@ProviderType
public interface PluginSetting extends PluginSettingModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.PluginSettingImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds a role to the list of roles.
    */
    public void addRole(java.lang.String role);

    /**
    * Returns an array of required roles of the plugin.
    *
    * @return an array of required roles of the plugin
    */
    public java.lang.String[] getRolesArray();

    /**
    * Returns <code>true</code> if the user has permission to use this plugin
    *
    * @param userId the primary key of the user
    * @return <code>true</code> if the user has permission to use this plugin
    */
    public boolean hasPermission(long userId);

    /**
    * Returns <code>true</code> if the plugin has a role with the specified
    * name.
    *
    * @param roleName the role name
    * @return <code>true</code> if the plugin has a role with the specified
    name
    */
    public boolean hasRoleWithName(java.lang.String roleName);

    /**
    * Sets an array of required roles of the plugin.
    */
    public void setRolesArray(java.lang.String[] rolesArray);
}
