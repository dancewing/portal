package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Subscription;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Subscription in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Subscription
 * @generated
 */
public class SubscriptionCacheModel implements CacheModel<Subscription>,
    Externalizable {
    public long subscriptionId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long classNameId;
    public long classPK;
    public String frequency;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{subscriptionId=");
        sb.append(subscriptionId);
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
        sb.append(", frequency=");
        sb.append(frequency);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Subscription toEntityModel() {
        SubscriptionImpl subscriptionImpl = new SubscriptionImpl();

        subscriptionImpl.setSubscriptionId(subscriptionId);
        subscriptionImpl.setCompanyId(companyId);
        subscriptionImpl.setUserId(userId);

        if (userName == null) {
            subscriptionImpl.setUserName(StringPool.BLANK);
        } else {
            subscriptionImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            subscriptionImpl.setCreateDate(null);
        } else {
            subscriptionImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            subscriptionImpl.setModifiedDate(null);
        } else {
            subscriptionImpl.setModifiedDate(new Date(modifiedDate));
        }

        subscriptionImpl.setClassNameId(classNameId);
        subscriptionImpl.setClassPK(classPK);

        if (frequency == null) {
            subscriptionImpl.setFrequency(StringPool.BLANK);
        } else {
            subscriptionImpl.setFrequency(frequency);
        }

        subscriptionImpl.resetOriginalValues();

        return subscriptionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        subscriptionId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        frequency = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(subscriptionId);
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

        if (frequency == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(frequency);
        }
    }
}
