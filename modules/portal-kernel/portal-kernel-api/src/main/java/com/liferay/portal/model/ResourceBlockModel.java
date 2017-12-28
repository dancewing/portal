package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ResourceBlock service. Represents a row in the &quot;ResourceBlock&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ResourceBlockModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ResourceBlockImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourceBlock
 * @see com.liferay.portal.model.impl.ResourceBlockImpl
 * @see com.liferay.portal.model.impl.ResourceBlockModelImpl
 * @generated
 */
@ProviderType
public interface ResourceBlockModel extends BaseModel<ResourceBlock> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a resource block model instance should use the {@link ResourceBlock} interface instead.
     */

    /**
     * Returns the primary key of this resource block.
     *
     * @return the primary key of this resource block
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this resource block.
     *
     * @param primaryKey the primary key of this resource block
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the resource block ID of this resource block.
     *
     * @return the resource block ID of this resource block
     */
    public long getResourceBlockId();

    /**
     * Sets the resource block ID of this resource block.
     *
     * @param resourceBlockId the resource block ID of this resource block
     */
    public void setResourceBlockId(long resourceBlockId);

    /**
     * Returns the company ID of this resource block.
     *
     * @return the company ID of this resource block
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this resource block.
     *
     * @param companyId the company ID of this resource block
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this resource block.
     *
     * @return the group ID of this resource block
     */
    public long getGroupId();

    /**
     * Sets the group ID of this resource block.
     *
     * @param groupId the group ID of this resource block
     */
    public void setGroupId(long groupId);

    /**
     * Returns the name of this resource block.
     *
     * @return the name of this resource block
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this resource block.
     *
     * @param name the name of this resource block
     */
    public void setName(String name);

    /**
     * Returns the permissions hash of this resource block.
     *
     * @return the permissions hash of this resource block
     */
    @AutoEscape
    public String getPermissionsHash();

    /**
     * Sets the permissions hash of this resource block.
     *
     * @param permissionsHash the permissions hash of this resource block
     */
    public void setPermissionsHash(String permissionsHash);

    /**
     * Returns the reference count of this resource block.
     *
     * @return the reference count of this resource block
     */
    public long getReferenceCount();

    /**
     * Sets the reference count of this resource block.
     *
     * @param referenceCount the reference count of this resource block
     */
    public void setReferenceCount(long referenceCount);

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
    public int compareTo(com.liferay.portal.model.ResourceBlock resourceBlock);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.ResourceBlock> toCacheModel();

    @Override
    public com.liferay.portal.model.ResourceBlock toEscapedModel();

    @Override
    public com.liferay.portal.model.ResourceBlock toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
