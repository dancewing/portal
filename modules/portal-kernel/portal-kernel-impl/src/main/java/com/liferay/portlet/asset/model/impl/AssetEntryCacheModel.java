package com.liferay.portlet.asset.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.asset.model.AssetEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntry
 * @generated
 */
public class AssetEntryCacheModel implements CacheModel<AssetEntry>,
    Externalizable {
    public long entryId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long classNameId;
    public long classPK;
    public String classUuid;
    public long classTypeId;
    public boolean visible;
    public long startDate;
    public long endDate;
    public long publishDate;
    public long expirationDate;
    public String mimeType;
    public String title;
    public String description;
    public String summary;
    public String url;
    public String layoutUuid;
    public int height;
    public int width;
    public double priority;
    public int viewCount;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(53);

        sb.append("{entryId=");
        sb.append(entryId);
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
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append(", classUuid=");
        sb.append(classUuid);
        sb.append(", classTypeId=");
        sb.append(classTypeId);
        sb.append(", visible=");
        sb.append(visible);
        sb.append(", startDate=");
        sb.append(startDate);
        sb.append(", endDate=");
        sb.append(endDate);
        sb.append(", publishDate=");
        sb.append(publishDate);
        sb.append(", expirationDate=");
        sb.append(expirationDate);
        sb.append(", mimeType=");
        sb.append(mimeType);
        sb.append(", title=");
        sb.append(title);
        sb.append(", description=");
        sb.append(description);
        sb.append(", summary=");
        sb.append(summary);
        sb.append(", url=");
        sb.append(url);
        sb.append(", layoutUuid=");
        sb.append(layoutUuid);
        sb.append(", height=");
        sb.append(height);
        sb.append(", width=");
        sb.append(width);
        sb.append(", priority=");
        sb.append(priority);
        sb.append(", viewCount=");
        sb.append(viewCount);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AssetEntry toEntityModel() {
        AssetEntryImpl assetEntryImpl = new AssetEntryImpl();

        assetEntryImpl.setEntryId(entryId);
        assetEntryImpl.setGroupId(groupId);
        assetEntryImpl.setCompanyId(companyId);
        assetEntryImpl.setUserId(userId);

        if (userName == null) {
            assetEntryImpl.setUserName(StringPool.BLANK);
        } else {
            assetEntryImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            assetEntryImpl.setCreateDate(null);
        } else {
            assetEntryImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            assetEntryImpl.setModifiedDate(null);
        } else {
            assetEntryImpl.setModifiedDate(new Date(modifiedDate));
        }

        assetEntryImpl.setClassNameId(classNameId);
        assetEntryImpl.setClassPK(classPK);

        if (classUuid == null) {
            assetEntryImpl.setClassUuid(StringPool.BLANK);
        } else {
            assetEntryImpl.setClassUuid(classUuid);
        }

        assetEntryImpl.setClassTypeId(classTypeId);
        assetEntryImpl.setVisible(visible);

        if (startDate == Long.MIN_VALUE) {
            assetEntryImpl.setStartDate(null);
        } else {
            assetEntryImpl.setStartDate(new Date(startDate));
        }

        if (endDate == Long.MIN_VALUE) {
            assetEntryImpl.setEndDate(null);
        } else {
            assetEntryImpl.setEndDate(new Date(endDate));
        }

        if (publishDate == Long.MIN_VALUE) {
            assetEntryImpl.setPublishDate(null);
        } else {
            assetEntryImpl.setPublishDate(new Date(publishDate));
        }

        if (expirationDate == Long.MIN_VALUE) {
            assetEntryImpl.setExpirationDate(null);
        } else {
            assetEntryImpl.setExpirationDate(new Date(expirationDate));
        }

        if (mimeType == null) {
            assetEntryImpl.setMimeType(StringPool.BLANK);
        } else {
            assetEntryImpl.setMimeType(mimeType);
        }

        if (title == null) {
            assetEntryImpl.setTitle(StringPool.BLANK);
        } else {
            assetEntryImpl.setTitle(title);
        }

        if (description == null) {
            assetEntryImpl.setDescription(StringPool.BLANK);
        } else {
            assetEntryImpl.setDescription(description);
        }

        if (summary == null) {
            assetEntryImpl.setSummary(StringPool.BLANK);
        } else {
            assetEntryImpl.setSummary(summary);
        }

        if (url == null) {
            assetEntryImpl.setUrl(StringPool.BLANK);
        } else {
            assetEntryImpl.setUrl(url);
        }

        if (layoutUuid == null) {
            assetEntryImpl.setLayoutUuid(StringPool.BLANK);
        } else {
            assetEntryImpl.setLayoutUuid(layoutUuid);
        }

        assetEntryImpl.setHeight(height);
        assetEntryImpl.setWidth(width);
        assetEntryImpl.setPriority(priority);
        assetEntryImpl.setViewCount(viewCount);

        assetEntryImpl.resetOriginalValues();

        return assetEntryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        entryId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        classUuid = objectInput.readUTF();
        classTypeId = objectInput.readLong();
        visible = objectInput.readBoolean();
        startDate = objectInput.readLong();
        endDate = objectInput.readLong();
        publishDate = objectInput.readLong();
        expirationDate = objectInput.readLong();
        mimeType = objectInput.readUTF();
        title = objectInput.readUTF();
        description = objectInput.readUTF();
        summary = objectInput.readUTF();
        url = objectInput.readUTF();
        layoutUuid = objectInput.readUTF();
        height = objectInput.readInt();
        width = objectInput.readInt();
        priority = objectInput.readDouble();
        viewCount = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(entryId);
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
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);

        if (classUuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(classUuid);
        }

        objectOutput.writeLong(classTypeId);
        objectOutput.writeBoolean(visible);
        objectOutput.writeLong(startDate);
        objectOutput.writeLong(endDate);
        objectOutput.writeLong(publishDate);
        objectOutput.writeLong(expirationDate);

        if (mimeType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mimeType);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (summary == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(summary);
        }

        if (url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(url);
        }

        if (layoutUuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(layoutUuid);
        }

        objectOutput.writeInt(height);
        objectOutput.writeInt(width);
        objectOutput.writeDouble(priority);
        objectOutput.writeInt(viewCount);
    }
}
