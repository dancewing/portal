package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Organization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Organization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Organization
 * @generated
 */
public class OrganizationCacheModel implements CacheModel<Organization>,
    Externalizable {
    public String uuid;
    public long organizationId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long parentOrganizationId;
    public String treePath;
    public String name;
    public String type;
    public boolean recursable;
    public long regionId;
    public long countryId;
    public int statusId;
    public String comments;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", organizationId=");
        sb.append(organizationId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", parentOrganizationId=");
        sb.append(parentOrganizationId);
        sb.append(", treePath=");
        sb.append(treePath);
        sb.append(", name=");
        sb.append(name);
        sb.append(", type=");
        sb.append(type);
        sb.append(", recursable=");
        sb.append(recursable);
        sb.append(", regionId=");
        sb.append(regionId);
        sb.append(", countryId=");
        sb.append(countryId);
        sb.append(", statusId=");
        sb.append(statusId);
        sb.append(", comments=");
        sb.append(comments);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Organization toEntityModel() {
        OrganizationImpl organizationImpl = new OrganizationImpl();

        if (uuid == null) {
            organizationImpl.setUuid(StringPool.BLANK);
        } else {
            organizationImpl.setUuid(uuid);
        }

        organizationImpl.setOrganizationId(organizationId);
        organizationImpl.setCompanyId(companyId);
        organizationImpl.setUserId(userId);

        if (userName == null) {
            organizationImpl.setUserName(StringPool.BLANK);
        } else {
            organizationImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            organizationImpl.setCreateDate(null);
        } else {
            organizationImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            organizationImpl.setModifiedDate(null);
        } else {
            organizationImpl.setModifiedDate(new Date(modifiedDate));
        }

        organizationImpl.setParentOrganizationId(parentOrganizationId);

        if (treePath == null) {
            organizationImpl.setTreePath(StringPool.BLANK);
        } else {
            organizationImpl.setTreePath(treePath);
        }

        if (name == null) {
            organizationImpl.setName(StringPool.BLANK);
        } else {
            organizationImpl.setName(name);
        }

        if (type == null) {
            organizationImpl.setType(StringPool.BLANK);
        } else {
            organizationImpl.setType(type);
        }

        organizationImpl.setRecursable(recursable);
        organizationImpl.setRegionId(regionId);
        organizationImpl.setCountryId(countryId);
        organizationImpl.setStatusId(statusId);

        if (comments == null) {
            organizationImpl.setComments(StringPool.BLANK);
        } else {
            organizationImpl.setComments(comments);
        }

        organizationImpl.resetOriginalValues();

        return organizationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        organizationId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        parentOrganizationId = objectInput.readLong();
        treePath = objectInput.readUTF();
        name = objectInput.readUTF();
        type = objectInput.readUTF();
        recursable = objectInput.readBoolean();
        regionId = objectInput.readLong();
        countryId = objectInput.readLong();
        statusId = objectInput.readInt();
        comments = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(organizationId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(parentOrganizationId);

        if (treePath == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(treePath);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }

        objectOutput.writeBoolean(recursable);
        objectOutput.writeLong(regionId);
        objectOutput.writeLong(countryId);
        objectOutput.writeInt(statusId);

        if (comments == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(comments);
        }
    }
}
