package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.OrgGroupRole;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OrgGroupRole in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OrgGroupRole
 * @generated
 */
public class OrgGroupRoleCacheModel implements CacheModel<OrgGroupRole>,
    Externalizable {
    public long organizationId;
    public long groupId;
    public long roleId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{organizationId=");
        sb.append(organizationId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", roleId=");
        sb.append(roleId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public OrgGroupRole toEntityModel() {
        OrgGroupRoleImpl orgGroupRoleImpl = new OrgGroupRoleImpl();

        orgGroupRoleImpl.setOrganizationId(organizationId);
        orgGroupRoleImpl.setGroupId(groupId);
        orgGroupRoleImpl.setRoleId(roleId);

        orgGroupRoleImpl.resetOriginalValues();

        return orgGroupRoleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        organizationId = objectInput.readLong();
        groupId = objectInput.readLong();
        roleId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(organizationId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(roleId);
    }
}
