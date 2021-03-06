package com.liferay.portlet.social.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.social.model.SocialActivitySet;
import com.liferay.portlet.social.service.SocialActivitySetLocalServiceUtil;

/**
 * The extended model base implementation for the SocialActivitySet service. Represents a row in the &quot;SocialActivitySet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SocialActivitySetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivitySetImpl
 * @see com.liferay.portlet.social.model.SocialActivitySet
 * @generated
 */
public abstract class SocialActivitySetBaseImpl
    extends SocialActivitySetModelImpl implements SocialActivitySet {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a social activity set model instance should use the {@link SocialActivitySet} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SocialActivitySetLocalServiceUtil.addSocialActivitySet(this);
        } else {
            SocialActivitySetLocalServiceUtil.updateSocialActivitySet(this);
        }
    }
}
