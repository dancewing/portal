package com.liferay.portal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Company service. Represents a row in the &quot;Company&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.CompanyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.CompanyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Company
 * @see com.liferay.portal.model.impl.CompanyImpl
 * @see com.liferay.portal.model.impl.CompanyModelImpl
 * @generated
 */
public interface CompanyModel extends BaseModel<Company> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a company model instance should use the {@link Company} interface instead.
     */

    /**
     * Returns the primary key of this company.
     *
     * @return the primary key of this company
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this company.
     *
     * @param primaryKey the primary key of this company
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the company ID of this company.
     *
     * @return the company ID of this company
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this company.
     *
     * @param companyId the company ID of this company
     */
    public void setCompanyId(Long companyId);

    /**
     * Returns the account ID of this company.
     *
     * @return the account ID of this company
     */
    public long getAccountId();

    /**
     * Sets the account ID of this company.
     *
     * @param accountId the account ID of this company
     */
    public void setAccountId(Long accountId);

    /**
     * Returns the web ID of this company.
     *
     * @return the web ID of this company
     */
    @AutoEscape
    public String getWebId();

    /**
     * Sets the web ID of this company.
     *
     * @param webId the web ID of this company
     */
    public void setWebId(String webId);

    /**
     * Returns the key of this company.
     *
     * @return the key of this company
     */
    @AutoEscape
    public String getKey();

    /**
     * Sets the key of this company.
     *
     * @param key the key of this company
     */
    public void setKey(String key);

    /**
     * Returns the mx of this company.
     *
     * @return the mx of this company
     */
    @AutoEscape
    public String getMx();

    /**
     * Sets the mx of this company.
     *
     * @param mx the mx of this company
     */
    public void setMx(String mx);

    /**
     * Returns the home u r l of this company.
     *
     * @return the home u r l of this company
     */
    @AutoEscape
    public String getHomeURL();

    /**
     * Sets the home u r l of this company.
     *
     * @param homeURL the home u r l of this company
     */
    public void setHomeURL(String homeURL);

    /**
     * Returns the logo ID of this company.
     *
     * @return the logo ID of this company
     */
    public long getLogoId();

    /**
     * Sets the logo ID of this company.
     *
     * @param logoId the logo ID of this company
     */
    public void setLogoId(Long logoId);

    /**
     * Returns the system of this company.
     *
     * @return the system of this company
     */
    public boolean getSystem();

    /**
     * Returns <code>true</code> if this company is system.
     *
     * @return <code>true</code> if this company is system; <code>false</code> otherwise
     */
    public boolean isSystem();

    /**
     * Sets whether this company is system.
     *
     * @param system the system of this company
     */
    public void setSystem(boolean system);

    /**
     * Returns the max users of this company.
     *
     * @return the max users of this company
     */
    public int getMaxUsers();

    /**
     * Sets the max users of this company.
     *
     * @param maxUsers the max users of this company
     */
    public void setMaxUsers(Integer maxUsers);

    /**
     * Returns the active of this company.
     *
     * @return the active of this company
     */
    public boolean getActive();

    /**
     * Returns <code>true</code> if this company is active.
     *
     * @return <code>true</code> if this company is active; <code>false</code> otherwise
     */
    public boolean isActive();

    /**
     * Sets whether this company is active.
     *
     * @param active the active of this company
     */
    public void setActive(boolean active);

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
    public int compareTo(com.liferay.portal.model.Company company);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.Company> toCacheModel();

    @Override
    public com.liferay.portal.model.Company toEscapedModel();

    @Override
    public com.liferay.portal.model.Company toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
