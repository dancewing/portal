package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.VirtualHost;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VirtualHost in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VirtualHost
 * @generated
 */
public class VirtualHostCacheModel implements CacheModel<VirtualHost>,
    Externalizable {
    public long virtualHostId;
    public long companyId;
    public long layoutSetId;
    public String hostname;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{virtualHostId=");
        sb.append(virtualHostId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", layoutSetId=");
        sb.append(layoutSetId);
        sb.append(", hostname=");
        sb.append(hostname);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public VirtualHost toEntityModel() {
        VirtualHostImpl virtualHostImpl = new VirtualHostImpl();

        virtualHostImpl.setVirtualHostId(virtualHostId);
        virtualHostImpl.setCompanyId(companyId);
        virtualHostImpl.setLayoutSetId(layoutSetId);

        if (hostname == null) {
            virtualHostImpl.setHostname(StringPool.BLANK);
        } else {
            virtualHostImpl.setHostname(hostname);
        }

        virtualHostImpl.resetOriginalValues();

        return virtualHostImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        virtualHostId = objectInput.readLong();
        companyId = objectInput.readLong();
        layoutSetId = objectInput.readLong();
        hostname = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(virtualHostId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(layoutSetId);

        if (hostname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(hostname);
        }
    }
}
