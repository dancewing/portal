package com.liferay.portlet.calendar.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.calendar.model.CalEvent;
import com.liferay.portlet.calendar.service.CalEventLocalServiceUtil;

/**
 * The extended model base implementation for the CalEvent service. Represents a row in the &quot;CalEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CalEventImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CalEventImpl
 * @see com.liferay.portlet.calendar.model.CalEvent
 * @generated
 */
public abstract class CalEventBaseImpl extends CalEventModelImpl
    implements CalEvent {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a cal event model instance should use the {@link CalEvent} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CalEventLocalServiceUtil.addCalEvent(this);
        } else {
            CalEventLocalServiceUtil.updateCalEvent(this);
        }
    }
}
