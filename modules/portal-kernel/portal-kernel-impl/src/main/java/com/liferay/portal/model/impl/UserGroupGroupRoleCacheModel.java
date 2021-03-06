package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.UserGroupGroupRole;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserGroupGroupRole in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupGroupRole
 * @generated
 */
public class UserGroupGroupRoleCacheModel implements CacheModel<UserGroupGroupRole>,
    Externalizable {
    public long userGroupId;
    public long groupId;
    public long roleId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{userGroupId=");
        sb.append(userGroupId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", roleId=");
        sb.append(roleId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserGroupGroupRole toEntityModel() {
        UserGroupGroupRoleImpl userGroupGroupRoleImpl = new UserGroupGroupRoleImpl();

        userGroupGroupRoleImpl.setUserGroupId(userGroupId);
        userGroupGroupRoleImpl.setGroupId(groupId);
        userGroupGroupRoleImpl.setRoleId(roleId);

        userGroupGroupRoleImpl.resetOriginalValues();

        return userGroupGroupRoleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userGroupId = objectInput.readLong();
        groupId = objectInput.readLong();
        roleId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userGroupId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(roleId);
    }
}
