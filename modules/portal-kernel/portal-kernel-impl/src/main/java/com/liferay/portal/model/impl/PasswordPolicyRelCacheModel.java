package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.PasswordPolicyRel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PasswordPolicyRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PasswordPolicyRel
 * @generated
 */
public class PasswordPolicyRelCacheModel implements CacheModel<PasswordPolicyRel>,
    Externalizable {
    public long passwordPolicyRelId;
    public long passwordPolicyId;
    public long classNameId;
    public long classPK;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{passwordPolicyRelId=");
        sb.append(passwordPolicyRelId);
        sb.append(", passwordPolicyId=");
        sb.append(passwordPolicyId);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PasswordPolicyRel toEntityModel() {
        PasswordPolicyRelImpl passwordPolicyRelImpl = new PasswordPolicyRelImpl();

        passwordPolicyRelImpl.setPasswordPolicyRelId(passwordPolicyRelId);
        passwordPolicyRelImpl.setPasswordPolicyId(passwordPolicyId);
        passwordPolicyRelImpl.setClassNameId(classNameId);
        passwordPolicyRelImpl.setClassPK(classPK);

        passwordPolicyRelImpl.resetOriginalValues();

        return passwordPolicyRelImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        passwordPolicyRelId = objectInput.readLong();
        passwordPolicyId = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(passwordPolicyRelId);
        objectOutput.writeLong(passwordPolicyId);
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);
    }
}
