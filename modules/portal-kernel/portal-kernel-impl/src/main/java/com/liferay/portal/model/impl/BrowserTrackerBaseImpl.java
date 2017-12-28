package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BrowserTracker;
import com.liferay.portal.service.BrowserTrackerLocalServiceUtil;

/**
 * The extended model base implementation for the BrowserTracker service. Represents a row in the &quot;BrowserTracker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BrowserTrackerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrowserTrackerImpl
 * @see com.liferay.portal.model.BrowserTracker
 * @generated
 */
public abstract class BrowserTrackerBaseImpl extends BrowserTrackerModelImpl
    implements BrowserTracker {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a browser tracker model instance should use the {@link BrowserTracker} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BrowserTrackerLocalServiceUtil.addBrowserTracker(this);
        } else {
            BrowserTrackerLocalServiceUtil.updateBrowserTracker(this);
        }
    }
}
