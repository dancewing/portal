package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.PasswordTracker;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PasswordTracker in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PasswordTracker
 * @generated
 */
public class PasswordTrackerCacheModel implements CacheModel<PasswordTracker>,
    Externalizable {
    public long passwordTrackerId;
    public long userId;
    public long createDate;
    public String password;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{passwordTrackerId=");
        sb.append(passwordTrackerId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", password=");
        sb.append(password);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PasswordTracker toEntityModel() {
        PasswordTrackerImpl passwordTrackerImpl = new PasswordTrackerImpl();

        passwordTrackerImpl.setPasswordTrackerId(passwordTrackerId);
        passwordTrackerImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            passwordTrackerImpl.setCreateDate(null);
        } else {
            passwordTrackerImpl.setCreateDate(new Date(createDate));
        }

        if (password == null) {
            passwordTrackerImpl.setPassword(StringPool.BLANK);
        } else {
            passwordTrackerImpl.setPassword(password);
        }

        passwordTrackerImpl.resetOriginalValues();

        return passwordTrackerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        passwordTrackerId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        password = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(passwordTrackerId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);

        if (password == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(password);
        }
    }
}
