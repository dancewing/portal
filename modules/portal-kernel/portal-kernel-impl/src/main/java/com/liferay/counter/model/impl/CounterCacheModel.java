package com.liferay.counter.model.impl;

import com.liferay.counter.model.Counter;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Counter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Counter
 * @generated
 */
public class CounterCacheModel implements CacheModel<Counter>, Externalizable {
    public String name;
    public long currentId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{name=");
        sb.append(name);
        sb.append(", currentId=");
        sb.append(currentId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Counter toEntityModel() {
        CounterImpl counterImpl = new CounterImpl();

        if (name == null) {
            counterImpl.setName(StringPool.BLANK);
        } else {
            counterImpl.setName(name);
        }

        counterImpl.setCurrentId(currentId);

        counterImpl.resetOriginalValues();

        return counterImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        name = objectInput.readUTF();
        currentId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(currentId);
    }
}
