package com.liferay.portlet.expando.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.expando.service.http.ExpandoValueServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.expando.service.http.ExpandoValueServiceSoap
 * @generated
 */
public class ExpandoValueSoap implements Serializable {
    private long _valueId;
    private long _companyId;
    private long _tableId;
    private long _columnId;
    private long _rowId;
    private long _classNameId;
    private long _classPK;
    private String _data;

    public ExpandoValueSoap() {
    }

    public static ExpandoValueSoap toSoapModel(ExpandoValue model) {
        ExpandoValueSoap soapModel = new ExpandoValueSoap();

        soapModel.setValueId(model.getValueId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setTableId(model.getTableId());
        soapModel.setColumnId(model.getColumnId());
        soapModel.setRowId(model.getRowId());
        soapModel.setClassNameId(model.getClassNameId());
        soapModel.setClassPK(model.getClassPK());
        soapModel.setData(model.getData());

        return soapModel;
    }

    public static ExpandoValueSoap[] toSoapModels(ExpandoValue[] models) {
        ExpandoValueSoap[] soapModels = new ExpandoValueSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ExpandoValueSoap[][] toSoapModels(ExpandoValue[][] models) {
        ExpandoValueSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ExpandoValueSoap[models.length][models[0].length];
        } else {
            soapModels = new ExpandoValueSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ExpandoValueSoap[] toSoapModels(List<ExpandoValue> models) {
        List<ExpandoValueSoap> soapModels = new ArrayList<ExpandoValueSoap>(models.size());

        for (ExpandoValue model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ExpandoValueSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _valueId;
    }

    public void setPrimaryKey(long pk) {
        setValueId(pk);
    }

    public long getValueId() {
        return _valueId;
    }

    public void setValueId(long valueId) {
        _valueId = valueId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getTableId() {
        return _tableId;
    }

    public void setTableId(long tableId) {
        _tableId = tableId;
    }

    public long getColumnId() {
        return _columnId;
    }

    public void setColumnId(long columnId) {
        _columnId = columnId;
    }

    public long getRowId() {
        return _rowId;
    }

    public void setRowId(long rowId) {
        _rowId = rowId;
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

    public String getData() {
        return _data;
    }

    public void setData(String data) {
        _data = data;
    }
}
