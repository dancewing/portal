package com.liferay.mail.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CyrusVirtual service. Represents a row in the &quot;CyrusVirtual&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.mail.model.impl.CyrusVirtualImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtual
 * @see com.liferay.mail.model.impl.CyrusVirtualImpl
 * @see com.liferay.mail.model.impl.CyrusVirtualModelImpl
 * @generated
 */
public interface CyrusVirtualModel extends BaseModel<CyrusVirtual> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a cyrus virtual model instance should use the {@link CyrusVirtual} interface instead.
     */

    /**
     * Returns the primary key of this cyrus virtual.
     *
     * @return the primary key of this cyrus virtual
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this cyrus virtual.
     *
     * @param primaryKey the primary key of this cyrus virtual
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the email address of this cyrus virtual.
     *
     * @return the email address of this cyrus virtual
     */
    @AutoEscape
    public String getEmailAddress();

    /**
     * Sets the email address of this cyrus virtual.
     *
     * @param emailAddress the email address of this cyrus virtual
     */
    public void setEmailAddress(String emailAddress);

    /**
     * Returns the user ID of this cyrus virtual.
     *
     * @return the user ID of this cyrus virtual
     */
    @AutoEscape
    public String getUserId();

    /**
     * Sets the user ID of this cyrus virtual.
     *
     * @param userId the user ID of this cyrus virtual
     */
    public void setUserId(String userId);

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
    public int compareTo(com.liferay.mail.model.CyrusVirtual cyrusVirtual);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.mail.model.CyrusVirtual> toCacheModel();

    @Override
    public com.liferay.mail.model.CyrusVirtual toEscapedModel();

    @Override
    public com.liferay.mail.model.CyrusVirtual toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
