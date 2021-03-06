package com.liferay.portlet.mobiledevicerules.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.mobiledevicerules.service.http.MDRRuleGroupInstanceServiceSoap}.
 *
 * @author Edward C. Han
 * @see com.liferay.portlet.mobiledevicerules.service.http.MDRRuleGroupInstanceServiceSoap
 * @generated
 */
public class MDRRuleGroupInstanceSoap implements Serializable {
    private String _uuid;
    private long _ruleGroupInstanceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _classNameId;
    private long _classPK;
    private long _ruleGroupId;
    private int _priority;

    public MDRRuleGroupInstanceSoap() {
    }

    public static MDRRuleGroupInstanceSoap toSoapModel(
        MDRRuleGroupInstance model) {
        MDRRuleGroupInstanceSoap soapModel = new MDRRuleGroupInstanceSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setRuleGroupInstanceId(model.getRuleGroupInstanceId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setClassNameId(model.getClassNameId());
        soapModel.setClassPK(model.getClassPK());
        soapModel.setRuleGroupId(model.getRuleGroupId());
        soapModel.setPriority(model.getPriority());

        return soapModel;
    }

    public static MDRRuleGroupInstanceSoap[] toSoapModels(
        MDRRuleGroupInstance[] models) {
        MDRRuleGroupInstanceSoap[] soapModels = new MDRRuleGroupInstanceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MDRRuleGroupInstanceSoap[][] toSoapModels(
        MDRRuleGroupInstance[][] models) {
        MDRRuleGroupInstanceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MDRRuleGroupInstanceSoap[models.length][models[0].length];
        } else {
            soapModels = new MDRRuleGroupInstanceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MDRRuleGroupInstanceSoap[] toSoapModels(
        List<MDRRuleGroupInstance> models) {
        List<MDRRuleGroupInstanceSoap> soapModels = new ArrayList<MDRRuleGroupInstanceSoap>(models.size());

        for (MDRRuleGroupInstance model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MDRRuleGroupInstanceSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _ruleGroupInstanceId;
    }

    public void setPrimaryKey(long pk) {
        setRuleGroupInstanceId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getRuleGroupInstanceId() {
        return _ruleGroupInstanceId;
    }

    public void setRuleGroupInstanceId(long ruleGroupInstanceId) {
        _ruleGroupInstanceId = ruleGroupInstanceId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public long getClassNameId() {
        return _classNameId;
    }

    public void setClassNameId(long classNameId) {
        _classNameId = classNameId;
    }

    public long getClassPK() {
        return _classPK;
    }

    public void setClassPK(long classPK) {
        _classPK = classPK;
    }

    public long getRuleGroupId() {
        return _ruleGroupId;
    }

    public void setRuleGroupId(long ruleGroupId) {
        _ruleGroupId = ruleGroupId;
    }

    public int getPriority() {
        return _priority;
    }

    public void setPriority(int priority) {
        _priority = priority;
    }
}
