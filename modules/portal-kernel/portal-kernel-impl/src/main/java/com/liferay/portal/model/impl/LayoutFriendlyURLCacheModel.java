package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.LayoutFriendlyURL;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LayoutFriendlyURL in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutFriendlyURL
 * @generated
 */
public class LayoutFriendlyURLCacheModel implements CacheModel<LayoutFriendlyURL>,
    Externalizable {
    public String uuid;
    public long layoutFriendlyURLId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long plid;
    public boolean privateLayout;
    public String friendlyURL;
    public String languageId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", layoutFriendlyURLId=");
        sb.append(layoutFriendlyURLId);
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
        sb.append(", plid=");
        sb.append(plid);
        sb.append(", privateLayout=");
        sb.append(privateLayout);
        sb.append(", friendlyURL=");
        sb.append(friendlyURL);
        sb.append(", languageId=");
        sb.append(languageId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LayoutFriendlyURL toEntityModel() {
        LayoutFriendlyURLImpl layoutFriendlyURLImpl = new LayoutFriendlyURLImpl();

        if (uuid == null) {
            layoutFriendlyURLImpl.setUuid(StringPool.BLANK);
        } else {
            layoutFriendlyURLImpl.setUuid(uuid);
        }

        layoutFriendlyURLImpl.setLayoutFriendlyURLId(layoutFriendlyURLId);
        layoutFriendlyURLImpl.setGroupId(groupId);
        layoutFriendlyURLImpl.setCompanyId(companyId);
        layoutFriendlyURLImpl.setUserId(userId);

        if (userName == null) {
            layoutFriendlyURLImpl.setUserName(StringPool.BLANK);
        } else {
            layoutFriendlyURLImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            layoutFriendlyURLImpl.setCreateDate(null);
        } else {
            layoutFriendlyURLImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            layoutFriendlyURLImpl.setModifiedDate(null);
        } else {
            layoutFriendlyURLImpl.setModifiedDate(new Date(modifiedDate));
        }

        layoutFriendlyURLImpl.setPlid(plid);
        layoutFriendlyURLImpl.setPrivateLayout(privateLayout);

        if (friendlyURL == null) {
            layoutFriendlyURLImpl.setFriendlyURL(StringPool.BLANK);
        } else {
            layoutFriendlyURLImpl.setFriendlyURL(friendlyURL);
        }

        if (languageId == null) {
            layoutFriendlyURLImpl.setLanguageId(StringPool.BLANK);
        } else {
            layoutFriendlyURLImpl.setLanguageId(languageId);
        }

        layoutFriendlyURLImpl.resetOriginalValues();

        return layoutFriendlyURLImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        layoutFriendlyURLId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        plid = objectInput.readLong();
        privateLayout = objectInput.readBoolean();
        friendlyURL = objectInput.readUTF();
        languageId = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(layoutFriendlyURLId);
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
        objectOutput.writeLong(plid);
        objectOutput.writeBoolean(privateLayout);

        if (friendlyURL == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(friendlyURL);
        }

        if (languageId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(languageId);
        }
    }
}
