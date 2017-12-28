package com.liferay.portlet.asset.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.asset.model.AssetTag;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetTag in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AssetTag
 * @generated
 */
public class AssetTagCacheModel implements CacheModel<AssetTag>, Externalizable {
    public long tagId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public int assetCount;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{tagId=");
        sb.append(tagId);
        sb.append(", groupId=");
        sb.append(groupId);
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
        sb.append(", name=");
        sb.append(name);
        sb.append(", assetCount=");
        sb.append(assetCount);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AssetTag toEntityModel() {
        AssetTagImpl assetTagImpl = new AssetTagImpl();

        assetTagImpl.setTagId(tagId);
        assetTagImpl.setGroupId(groupId);
        assetTagImpl.setCompanyId(companyId);
        assetTagImpl.setUserId(userId);

        if (userName == null) {
            assetTagImpl.setUserName(StringPool.BLANK);
        } else {
            assetTagImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            assetTagImpl.setCreateDate(null);
        } else {
            assetTagImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            assetTagImpl.setModifiedDate(null);
        } else {
            assetTagImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            assetTagImpl.setName(StringPool.BLANK);
        } else {
            assetTagImpl.setName(name);
        }

        assetTagImpl.setAssetCount(assetCount);

        assetTagImpl.resetOriginalValues();

        return assetTagImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        tagId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        assetCount = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(tagId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeInt(assetCount);
    }
}
