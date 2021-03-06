package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ClassName;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ClassName in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ClassName
 * @generated
 */
public class ClassNameCacheModel implements CacheModel<ClassName>,
    Externalizable {
    public long classNameId;
    public String value;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{classNameId=");
        sb.append(classNameId);
        sb.append(", value=");
        sb.append(value);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ClassName toEntityModel() {
        ClassNameImpl classNameImpl = new ClassNameImpl();

        classNameImpl.setClassNameId(classNameId);

        if (value == null) {
            classNameImpl.setValue(StringPool.BLANK);
        } else {
            classNameImpl.setValue(value);
        }

        classNameImpl.resetOriginalValues();

        return classNameImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        classNameId = objectInput.readLong();
        value = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(classNameId);

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }
    }
}
