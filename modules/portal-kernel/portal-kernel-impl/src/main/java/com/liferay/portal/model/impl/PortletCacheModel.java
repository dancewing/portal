package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Portlet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Portlet in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Portlet
 * @generated
 */
public class PortletCacheModel implements CacheModel<Portlet>, Externalizable {
    public long id;
    public long companyId;
    public String portletId;
    public String roles;
    public boolean active;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(id);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", portletId=");
        sb.append(portletId);
        sb.append(", roles=");
        sb.append(roles);
        sb.append(", active=");
        sb.append(active);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Portlet toEntityModel() {
        PortletImpl portletImpl = new PortletImpl();

        portletImpl.setId(id);
        portletImpl.setCompanyId(companyId);

        if (portletId == null) {
            portletImpl.setPortletId(StringPool.BLANK);
        } else {
            portletImpl.setPortletId(portletId);
        }

        if (roles == null) {
            portletImpl.setRoles(StringPool.BLANK);
        } else {
            portletImpl.setRoles(roles);
        }

        portletImpl.setActive(active);

        portletImpl.resetOriginalValues();

        return portletImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        companyId = objectInput.readLong();
        portletId = objectInput.readUTF();
        roles = objectInput.readUTF();
        active = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(companyId);

        if (portletId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(portletId);
        }

        if (roles == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(roles);
        }

        objectOutput.writeBoolean(active);
    }
}
