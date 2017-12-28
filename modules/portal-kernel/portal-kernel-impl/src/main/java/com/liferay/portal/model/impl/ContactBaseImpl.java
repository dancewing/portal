package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Contact;
import com.liferay.portal.service.ContactLocalServiceUtil;

/**
 * The extended model base implementation for the Contact service. Represents a row in the &quot;Contact_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactImpl
 * @see com.liferay.portal.model.Contact
 * @generated
 */
public abstract class ContactBaseImpl extends ContactModelImpl
    implements Contact {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a contact model instance should use the {@link Contact} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ContactLocalServiceUtil.addContact(this);
        } else {
            ContactLocalServiceUtil.updateContact(this);
        }
    }
}
