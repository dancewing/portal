package com.liferay.portal.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.UserGroupGroupRolePK;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the UserGroupGroupRole service. Represents a row in the &quot;UserGroupGroupRole&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.UserGroupGroupRoleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.UserGroupGroupRoleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupGroupRole
 * @see com.liferay.portal.model.impl.UserGroupGroupRoleImpl
 * @see com.liferay.portal.model.impl.UserGroupGroupRoleModelImpl
 * @generated
 */
public interface UserGroupGroupRoleModel extends BaseModel<UserGroupGroupRole> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a user group group role model instance should use the {@link UserGroupGroupRole} interface instead.
     */

    /**
     * Returns the primary key of this user group group role.
     *
     * @return the primary key of this user group group role
     */
    public UserGroupGroupRolePK getPrimaryKey();

    /**
     * Sets the primary key of this user group group role.
     *
     * @param primaryKey the primary key of this user group group role
     */
    public void setPrimaryKey(UserGroupGroupRolePK primaryKey);

    /**
     * Returns the user group ID of this user group group role.
     *
     * @return the user group ID of this user group group role
     */
    public long getUserGroupId();

    /**
     * Sets the user group ID of this user group group role.
     *
     * @param userGroupId the user group ID of this user group group role
     */
    public void setUserGroupId(Long userGroupId);

    /**
     * Returns the group ID of this user group group role.
     *
     * @return the group ID of this user group group role
     */
    public long getGroupId();

    /**
     * Sets the group ID of this user group group role.
     *
     * @param groupId the group ID of this user group group role
     */
    public void setGroupId(Long groupId);

    /**
     * Returns the role ID of this user group group role.
     *
     * @return the role ID of this user group group role
     */
    public long getRoleId();

    /**
     * Sets the role ID of this user group group role.
     *
     * @param roleId the role ID of this user group group role
     */
    public void setRoleId(Long roleId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.liferay.portal.model.UserGroupGroupRole userGroupGroupRole);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.UserGroupGroupRole> toCacheModel();

    @Override
    public com.liferay.portal.model.UserGroupGroupRole toEscapedModel();

    @Override
    public com.liferay.portal.model.UserGroupGroupRole toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
