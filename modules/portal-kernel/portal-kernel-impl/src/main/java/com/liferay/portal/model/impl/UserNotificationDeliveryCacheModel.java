package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.UserNotificationDelivery;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserNotificationDelivery in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UserNotificationDelivery
 * @generated
 */
public class UserNotificationDeliveryCacheModel implements CacheModel<UserNotificationDelivery>,
    Externalizable {
    public long userNotificationDeliveryId;
    public long companyId;
    public long userId;
    public String portletId;
    public long classNameId;
    public int notificationType;
    public int deliveryType;
    public boolean deliver;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{userNotificationDeliveryId=");
        sb.append(userNotificationDeliveryId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", portletId=");
        sb.append(portletId);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", notificationType=");
        sb.append(notificationType);
        sb.append(", deliveryType=");
        sb.append(deliveryType);
        sb.append(", deliver=");
        sb.append(deliver);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserNotificationDelivery toEntityModel() {
        UserNotificationDeliveryImpl userNotificationDeliveryImpl = new UserNotificationDeliveryImpl();

        userNotificationDeliveryImpl.setUserNotificationDeliveryId(userNotificationDeliveryId);
        userNotificationDeliveryImpl.setCompanyId(companyId);
        userNotificationDeliveryImpl.setUserId(userId);

        if (portletId == null) {
            userNotificationDeliveryImpl.setPortletId(StringPool.BLANK);
        } else {
            userNotificationDeliveryImpl.setPortletId(portletId);
        }

        userNotificationDeliveryImpl.setClassNameId(classNameId);
        userNotificationDeliveryImpl.setNotificationType(notificationType);
        userNotificationDeliveryImpl.setDeliveryType(deliveryType);
        userNotificationDeliveryImpl.setDeliver(deliver);

        userNotificationDeliveryImpl.resetOriginalValues();

        return userNotificationDeliveryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userNotificationDeliveryId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        portletId = objectInput.readUTF();
        classNameId = objectInput.readLong();
        notificationType = objectInput.readInt();
        deliveryType = objectInput.readInt();
        deliver = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userNotificationDeliveryId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (portletId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(portletId);
        }

        objectOutput.writeLong(classNameId);
        objectOutput.writeInt(notificationType);
        objectOutput.writeInt(deliveryType);
        objectOutput.writeBoolean(deliver);
    }
}
