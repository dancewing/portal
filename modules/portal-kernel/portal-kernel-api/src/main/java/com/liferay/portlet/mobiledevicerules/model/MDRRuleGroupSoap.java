package com.liferay.portlet.mobiledevicerules.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.mobiledevicerules.service.http.MDRRuleGroupServiceSoap}.
 *
 * @author Edward C. Han
 * @see com.liferay.portlet.mobiledevicerules.service.http.MDRRuleGroupServiceSoap
 * @generated
 */
public class MDRRuleGroupSoap implements Serializable {
    private String _uuid;
    private long _ruleGroupId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _description;

    public MDRRuleGroupSoap() {
    }

    public static MDRRuleGroupSoap toSoapModel(MDRRuleGroup model) {
        MDRRuleGroupSoap soapModel = new MDRRuleGroupSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setRuleGroupId(model.getRuleGroupId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static MDRRuleGroupSoap[] toSoapModels(MDRRuleGroup[] models) {
        MDRRuleGroupSoap[] soapModels = new MDRRuleGroupSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MDRRuleGroupSoap[][] toSoapModels(MDRRuleGroup[][] models) {
        MDRRuleGroupSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MDRRuleGroupSoap[models.length][models[0].length];
        } else {
            soapModels = new MDRRuleGroupSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MDRRuleGroupSoap[] toSoapModels(List<MDRRuleGroup> models) {
        List<MDRRuleGroupSoap> soapModels = new ArrayList<MDRRuleGroupSoap>(models.size());

        for (MDRRuleGroup model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MDRRuleGroupSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _ruleGroupId;
    }

    public void setPrimaryKey(long pk) {
        setRuleGroupId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getRuleGroupId() {
        return _ruleGroupId;
    }

    public void setRuleGroupId(long ruleGroupId) {
        _ruleGroupId = ruleGroupId;
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

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}
