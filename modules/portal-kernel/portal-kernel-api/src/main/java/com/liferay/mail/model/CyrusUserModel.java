package com.liferay.mail.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CyrusUser service. Represents a row in the &quot;Mail_CyrusUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.mail.model.impl.CyrusUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.mail.model.impl.CyrusUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUser
 * @see com.liferay.mail.model.impl.CyrusUserImpl
 * @see com.liferay.mail.model.impl.CyrusUserModelImpl
 * @generated
 */
@ProviderType
public interface CyrusUserModel extends BaseModel<CyrusUser> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a cyrus user model instance should use the {@link CyrusUser} interface instead.
     */

    /**
     * Returns the primary key of this cyrus user.
     *
     * @return the primary key of this cyrus user
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this cyrus user.
     *
     * @param primaryKey the primary key of this cyrus user
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the user ID of this cyrus user.
     *
     * @return the user ID of this cyrus user
     */
    @AutoEscape
    public String getUserId();

    /**
     * Sets the user ID of this cyrus user.
     *
     * @param userId the user ID of this cyrus user
     */
    public void setUserId(String userId);

    /**
     * Returns the password of this cyrus user.
     *
     * @return the password of this cyrus user
     */
    @AutoEscape
    public String getPassword();

    /**
     * Sets the password of this cyrus user.
     *
     * @param password the password of this cyrus user
     */
    public void setPassword(String password);

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
    public int compareTo(com.liferay.mail.model.CyrusUser cyrusUser);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.mail.model.CyrusUser> toCacheModel();

    @Override
    public com.liferay.mail.model.CyrusUser toEscapedModel();

    @Override
    public com.liferay.mail.model.CyrusUser toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}