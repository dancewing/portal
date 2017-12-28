package com.liferay.portlet.dynamicdatamapping.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DDMStorageLink in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DDMStorageLink
 * @generated
 */
public class DDMStorageLinkCacheModel implements CacheModel<DDMStorageLink>,
    Externalizable {
    public String uuid;
    public long storageLinkId;
    public long classNameId;
    public long classPK;
    public long structureId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", storageLinkId=");
        sb.append(storageLinkId);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append(", structureId=");
        sb.append(structureId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DDMStorageLink toEntityModel() {
        DDMStorageLinkImpl ddmStorageLinkImpl = new DDMStorageLinkImpl();

        if (uuid == null) {
            ddmStorageLinkImpl.setUuid(StringPool.BLANK);
        } else {
            ddmStorageLinkImpl.setUuid(uuid);
        }

        ddmStorageLinkImpl.setStorageLinkId(storageLinkId);
        ddmStorageLinkImpl.setClassNameId(classNameId);
        ddmStorageLinkImpl.setClassPK(classPK);
        ddmStorageLinkImpl.setStructureId(structureId);

        ddmStorageLinkImpl.resetOriginalValues();

        return ddmStorageLinkImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        storageLinkId = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        structureId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(storageLinkId);
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);
        objectOutput.writeLong(structureId);
    }
}
