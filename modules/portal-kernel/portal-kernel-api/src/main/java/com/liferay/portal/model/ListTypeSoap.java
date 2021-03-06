package com.liferay.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portal.service.http.ListTypeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.service.http.ListTypeServiceSoap
 * @generated
 */
public class ListTypeSoap implements Serializable {
    private int _listTypeId;
    private String _name;
    private String _type;

    public ListTypeSoap() {
    }

    public static ListTypeSoap toSoapModel(ListType model) {
        ListTypeSoap soapModel = new ListTypeSoap();

        soapModel.setListTypeId(model.getListTypeId());
        soapModel.setName(model.getName());
        soapModel.setType(model.getType());

        return soapModel;
    }

    public static ListTypeSoap[] toSoapModels(ListType[] models) {
        ListTypeSoap[] soapModels = new ListTypeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ListTypeSoap[][] toSoapModels(ListType[][] models) {
        ListTypeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ListTypeSoap[models.length][models[0].length];
        } else {
            soapModels = new ListTypeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ListTypeSoap[] toSoapModels(List<ListType> models) {
        List<ListTypeSoap> soapModels = new ArrayList<ListTypeSoap>(models.size());

        for (ListType model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ListTypeSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _listTypeId;
    }

    public void setPrimaryKey(int pk) {
        setListTypeId(pk);
    }

    public int getListTypeId() {
        return _listTypeId;
    }

    public void setListTypeId(int listTypeId) {
        _listTypeId = listTypeId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }
}
