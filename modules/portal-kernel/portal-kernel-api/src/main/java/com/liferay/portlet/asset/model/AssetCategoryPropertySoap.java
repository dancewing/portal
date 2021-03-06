package com.liferay.portlet.asset.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.asset.service.http.AssetCategoryPropertyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.asset.service.http.AssetCategoryPropertyServiceSoap
 * @generated
 */
public class AssetCategoryPropertySoap implements Serializable {
    private long _categoryPropertyId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _categoryId;
    private String _key;
    private String _value;

    public AssetCategoryPropertySoap() {
    }

    public static AssetCategoryPropertySoap toSoapModel(
        AssetCategoryProperty model) {
        AssetCategoryPropertySoap soapModel = new AssetCategoryPropertySoap();

        soapModel.setCategoryPropertyId(model.getCategoryPropertyId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setCategoryId(model.getCategoryId());
        soapModel.setKey(model.getKey());
        soapModel.setValue(model.getValue());

        return soapModel;
    }

    public static AssetCategoryPropertySoap[] toSoapModels(
        AssetCategoryProperty[] models) {
        AssetCategoryPropertySoap[] soapModels = new AssetCategoryPropertySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AssetCategoryPropertySoap[][] toSoapModels(
        AssetCategoryProperty[][] models) {
        AssetCategoryPropertySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AssetCategoryPropertySoap[models.length][models[0].length];
        } else {
            soapModels = new AssetCategoryPropertySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AssetCategoryPropertySoap[] toSoapModels(
        List<AssetCategoryProperty> models) {
        List<AssetCategoryPropertySoap> soapModels = new ArrayList<AssetCategoryPropertySoap>(models.size());

        for (AssetCategoryProperty model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AssetCategoryPropertySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _categoryPropertyId;
    }

    public void setPrimaryKey(long pk) {
        setCategoryPropertyId(pk);
    }

    public long getCategoryPropertyId() {
        return _categoryPropertyId;
    }

    public void setCategoryPropertyId(long categoryPropertyId) {
        _categoryPropertyId = categoryPropertyId;
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

    public long getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(long categoryId) {
        _categoryId = categoryId;
    }

    public String getKey() {
        return _key;
    }

    public void setKey(String key) {
        _key = key;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }
}
