package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.PortletPreferences;
import com.liferay.portal.service.PortletPreferencesLocalServiceUtil;

/**
 * The extended model base implementation for the PortletPreferences service. Represents a row in the &quot;PortletPreferences&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PortletPreferencesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletPreferencesImpl
 * @see com.liferay.portal.model.PortletPreferences
 * @generated
 */
public abstract class PortletPreferencesBaseImpl
    extends PortletPreferencesModelImpl implements PortletPreferences {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a portlet preferences model instance should use the {@link PortletPreferences} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PortletPreferencesLocalServiceUtil.addPortletPreferences(this);
        } else {
            PortletPreferencesLocalServiceUtil.updatePortletPreferences(this);
        }
    }
}
