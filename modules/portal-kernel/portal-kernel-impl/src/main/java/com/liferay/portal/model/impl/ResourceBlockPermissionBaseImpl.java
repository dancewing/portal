package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceBlockPermission;
import com.liferay.portal.service.ResourceBlockPermissionLocalServiceUtil;

/**
 * The extended model base implementation for the ResourceBlockPermission service. Represents a row in the &quot;ResourceBlockPermission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResourceBlockPermissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourceBlockPermissionImpl
 * @see com.liferay.portal.model.ResourceBlockPermission
 * @generated
 */
public abstract class ResourceBlockPermissionBaseImpl
    extends ResourceBlockPermissionModelImpl implements ResourceBlockPermission {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a resource block permission model instance should use the {@link ResourceBlockPermission} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ResourceBlockPermissionLocalServiceUtil.addResourceBlockPermission(this);
        } else {
            ResourceBlockPermissionLocalServiceUtil.updateResourceBlockPermission(this);
        }
    }
}
