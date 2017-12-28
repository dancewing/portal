package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.UserTracker;
import com.liferay.portal.service.UserTrackerLocalServiceUtil;

/**
 * The extended model base implementation for the UserTracker service. Represents a row in the &quot;UserTracker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserTrackerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserTrackerImpl
 * @see com.liferay.portal.model.UserTracker
 * @generated
 */
public abstract class UserTrackerBaseImpl extends UserTrackerModelImpl
    implements UserTracker {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user tracker model instance should use the {@link UserTracker} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserTrackerLocalServiceUtil.addUserTracker(this);
        } else {
            UserTrackerLocalServiceUtil.updateUserTracker(this);
        }
    }
}
