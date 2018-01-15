package com.liferay.portlet.asset.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetTagProperty service. Represents a row in the &quot;AssetTagProperty&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.asset.model.impl.AssetTagPropertyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.asset.model.impl.AssetTagPropertyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetTagProperty
 * @see com.liferay.portlet.asset.model.impl.AssetTagPropertyImpl
 * @see com.liferay.portlet.asset.model.impl.AssetTagPropertyModelImpl
 * @generated
 */
public interface AssetTagPropertyModel extends AuditedModel,
    BaseModel<AssetTagProperty> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a asset tag property model instance should use the {@link AssetTagProperty} interface instead.
     */

    /**
     * Returns the primary key of this asset tag property.
     *
     * @return the primary key of this asset tag property
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this asset tag property.
     *
     * @param primaryKey the primary key of this asset tag property
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the tag property ID of this asset tag property.
     *
     * @return the tag property ID of this asset tag property
     */
    public long getTagPropertyId();

    /**
     * Sets the tag property ID of this asset tag property.
     *
     * @param tagPropertyId the tag property ID of this asset tag property
     */
    public void setTagPropertyId(Long tagPropertyId);

    /**
     * Returns the company ID of this asset tag property.
     *
     * @return the company ID of this asset tag property
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this asset tag property.
     *
     * @param companyId the company ID of this asset tag property
     */
    @Override
    public void setCompanyId(Long companyId);

    /**
     * Returns the user ID of this asset tag property.
     *
     * @return the user ID of this asset tag property
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this asset tag property.
     *
     * @param userId the user ID of this asset tag property
     */
    @Override
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this asset tag property.
     *
     * @return the user uuid of this asset tag property
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this asset tag property.
     *
     * @param userUuid the user uuid of this asset tag property
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this asset tag property.
     *
     * @return the user name of this asset tag property
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this asset tag property.
     *
     * @param userName the user name of this asset tag property
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this asset tag property.
     *
     * @return the create date of this asset tag property
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this asset tag property.
     *
     * @param createDate the create date of this asset tag property
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this asset tag property.
     *
     * @return the modified date of this asset tag property
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this asset tag property.
     *
     * @param modifiedDate the modified date of this asset tag property
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the tag ID of this asset tag property.
     *
     * @return the tag ID of this asset tag property
     */
    public long getTagId();

    /**
     * Sets the tag ID of this asset tag property.
     *
     * @param tagId the tag ID of this asset tag property
     */
    public void setTagId(Long tagId);

    /**
     * Returns the key of this asset tag property.
     *
     * @return the key of this asset tag property
     */
    @AutoEscape
    public String getKey();

    /**
     * Sets the key of this asset tag property.
     *
     * @param key the key of this asset tag property
     */
    public void setKey(String key);

    /**
     * Returns the value of this asset tag property.
     *
     * @return the value of this asset tag property
     */
    @AutoEscape
    public String getValue();

    /**
     * Sets the value of this asset tag property.
     *
     * @param value the value of this asset tag property
     */
    public void setValue(String value);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.liferay.portlet.asset.model.AssetTagProperty assetTagProperty);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portlet.asset.model.AssetTagProperty> toCacheModel();

    @Override
    public com.liferay.portlet.asset.model.AssetTagProperty toEscapedModel();

    @Override
    public com.liferay.portlet.asset.model.AssetTagProperty toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
