package com.liferay.portlet.asset.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.asset.model.AssetTagStats;
import com.liferay.portlet.asset.service.AssetTagStatsLocalServiceUtil;

/**
 * The extended model base implementation for the AssetTagStats service. Represents a row in the &quot;AssetTagStats&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetTagStatsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetTagStatsImpl
 * @see com.liferay.portlet.asset.model.AssetTagStats
 * @generated
 */
public abstract class AssetTagStatsBaseImpl extends AssetTagStatsModelImpl
    implements AssetTagStats {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a asset tag stats model instance should use the {@link AssetTagStats} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AssetTagStatsLocalServiceUtil.addAssetTagStats(this);
        } else {
            AssetTagStatsLocalServiceUtil.updateAssetTagStats(this);
        }
    }
}
