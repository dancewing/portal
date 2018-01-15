package com.liferay.portlet.mobiledevicerules.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MDRRuleGroupInstance service. Represents a row in the &quot;MDRRuleGroupInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceImpl}.
 * </p>
 *
 * @author Edward C. Han
 * @see MDRRuleGroupInstance
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceImpl
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleGroupInstanceModelImpl
 * @generated
 */
public interface MDRRuleGroupInstanceModel extends AttachedModel,
    BaseModel<MDRRuleGroupInstance>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a m d r rule group instance model instance should use the {@link MDRRuleGroupInstance} interface instead.
     */

    /**
     * Returns the primary key of this m d r rule group instance.
     *
     * @return the primary key of this m d r rule group instance
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this m d r rule group instance.
     *
     * @param primaryKey the primary key of this m d r rule group instance
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this m d r rule group instance.
     *
     * @return the uuid of this m d r rule group instance
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this m d r rule group instance.
     *
     * @param uuid the uuid of this m d r rule group instance
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the rule group instance ID of this m d r rule group instance.
     *
     * @return the rule group instance ID of this m d r rule group instance
     */
    public long getRuleGroupInstanceId();

    /**
     * Sets the rule group instance ID of this m d r rule group instance.
     *
     * @param ruleGroupInstanceId the rule group instance ID of this m d r rule group instance
     */
    public void setRuleGroupInstanceId(Long ruleGroupInstanceId);

    /**
     * Returns the group ID of this m d r rule group instance.
     *
     * @return the group ID of this m d r rule group instance
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this m d r rule group instance.
     *
     * @param groupId the group ID of this m d r rule group instance
     */
    @Override
    public void setGroupId(Long groupId);

    /**
     * Returns the company ID of this m d r rule group instance.
     *
     * @return the company ID of this m d r rule group instance
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this m d r rule group instance.
     *
     * @param companyId the company ID of this m d r rule group instance
     */
    @Override
    public void setCompanyId(Long companyId);

    /**
     * Returns the user ID of this m d r rule group instance.
     *
     * @return the user ID of this m d r rule group instance
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this m d r rule group instance.
     *
     * @param userId the user ID of this m d r rule group instance
     */
    @Override
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this m d r rule group instance.
     *
     * @return the user uuid of this m d r rule group instance
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this m d r rule group instance.
     *
     * @param userUuid the user uuid of this m d r rule group instance
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this m d r rule group instance.
     *
     * @return the user name of this m d r rule group instance
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this m d r rule group instance.
     *
     * @param userName the user name of this m d r rule group instance
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this m d r rule group instance.
     *
     * @return the create date of this m d r rule group instance
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this m d r rule group instance.
     *
     * @param createDate the create date of this m d r rule group instance
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this m d r rule group instance.
     *
     * @return the modified date of this m d r rule group instance
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this m d r rule group instance.
     *
     * @param modifiedDate the modified date of this m d r rule group instance
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the fully qualified class name of this m d r rule group instance.
     *
     * @return the fully qualified class name of this m d r rule group instance
     */
    @Override
    public String getClassName();

    public void setClassName(String className);

    /**
     * Returns the class name ID of this m d r rule group instance.
     *
     * @return the class name ID of this m d r rule group instance
     */
    @Override
    public long getClassNameId();

    /**
     * Sets the class name ID of this m d r rule group instance.
     *
     * @param classNameId the class name ID of this m d r rule group instance
     */
    @Override
    public void setClassNameId(Long classNameId);

    /**
     * Returns the class p k of this m d r rule group instance.
     *
     * @return the class p k of this m d r rule group instance
     */
    @Override
    public long getClassPK();

    /**
     * Sets the class p k of this m d r rule group instance.
     *
     * @param classPK the class p k of this m d r rule group instance
     */
    @Override
    public void setClassPK(Long classPK);

    /**
     * Returns the rule group ID of this m d r rule group instance.
     *
     * @return the rule group ID of this m d r rule group instance
     */
    public long getRuleGroupId();

    /**
     * Sets the rule group ID of this m d r rule group instance.
     *
     * @param ruleGroupId the rule group ID of this m d r rule group instance
     */
    public void setRuleGroupId(Long ruleGroupId);

    /**
     * Returns the priority of this m d r rule group instance.
     *
     * @return the priority of this m d r rule group instance
     */
    public int getPriority();

    /**
     * Sets the priority of this m d r rule group instance.
     *
     * @param priority the priority of this m d r rule group instance
     */
    public void setPriority(Integer priority);

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
        com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance mdrRuleGroupInstance);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance> toCacheModel();

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance toEscapedModel();

    @Override
    public com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
