package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Phone;
import com.liferay.portal.service.PhoneLocalServiceUtil;

/**
 * The extended model base implementation for the Phone service. Represents a row in the &quot;Phone&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PhoneImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhoneImpl
 * @see com.liferay.portal.model.Phone
 * @generated
 */
public abstract class PhoneBaseImpl extends PhoneModelImpl implements Phone {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a phone model instance should use the {@link Phone} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PhoneLocalServiceUtil.addPhone(this);
        } else {
            PhoneLocalServiceUtil.updatePhone(this);
        }
    }
}
