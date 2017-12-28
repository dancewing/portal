package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserGroupRolePK implements Comparable<UserGroupRolePK>,
    Serializable {
    public long userId;
    public long groupId;
    public long roleId;

    public UserGroupRolePK() {
    }

    public UserGroupRolePK(long userId, long groupId, long roleId) {
        this.userId = userId;
        this.groupId = groupId;
        this.roleId = roleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Override
    public int compareTo(UserGroupRolePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (userId < pk.userId) {
            value = -1;
        } else if (userId > pk.userId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (groupId < pk.groupId) {
            value = -1;
        } else if (groupId > pk.groupId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (roleId < pk.roleId) {
            value = -1;
        } else if (roleId > pk.roleId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserGroupRolePK)) {
            return false;
        }

        UserGroupRolePK pk = (UserGroupRolePK) obj;

        if ((userId == pk.userId) && (groupId == pk.groupId) &&
                (roleId == pk.roleId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(userId) + String.valueOf(groupId) +
        String.valueOf(roleId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("userId");
        sb.append(StringPool.EQUAL);
        sb.append(userId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("groupId");
        sb.append(StringPool.EQUAL);
        sb.append(groupId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("roleId");
        sb.append(StringPool.EQUAL);
        sb.append(roleId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
