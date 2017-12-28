package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.UserGroupRole;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserGroupRole in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupRole
 * @generated
 */
public class UserGroupRoleCacheModel implements CacheModel<UserGroupRole>,
    Externalizable {
    public long userId;
    public long groupId;
    public long roleId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", roleId=");
        sb.append(roleId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserGroupRole toEntityModel() {
        UserGroupRoleImpl userGroupRoleImpl = new UserGroupRoleImpl();

        userGroupRoleImpl.setUserId(userId);
        userGroupRoleImpl.setGroupId(groupId);
        userGroupRoleImpl.setRoleId(roleId);

        userGroupRoleImpl.resetOriginalValues();

        return userGroupRoleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readLong();
        groupId = objectInput.readLong();
        roleId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(roleId);
    }
}
