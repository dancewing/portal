package com.liferay.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TicketSoap implements Serializable {
    private long _ticketId;
    private long _companyId;
    private Date _createDate;
    private long _classNameId;
    private long _classPK;
    private String _key;
    private int _type;
    private String _extraInfo;
    private Date _expirationDate;

    public TicketSoap() {
    }

    public static TicketSoap toSoapModel(Ticket model) {
        TicketSoap soapModel = new TicketSoap();

        soapModel.setTicketId(model.getTicketId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setClassNameId(model.getClassNameId());
        soapModel.setClassPK(model.getClassPK());
        soapModel.setKey(model.getKey());
        soapModel.setType(model.getType());
        soapModel.setExtraInfo(model.getExtraInfo());
        soapModel.setExpirationDate(model.getExpirationDate());

        return soapModel;
    }

    public static TicketSoap[] toSoapModels(Ticket[] models) {
        TicketSoap[] soapModels = new TicketSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TicketSoap[][] toSoapModels(Ticket[][] models) {
        TicketSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TicketSoap[models.length][models[0].length];
        } else {
            soapModels = new TicketSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TicketSoap[] toSoapModels(List<Ticket> models) {
        List<TicketSoap> soapModels = new ArrayList<TicketSoap>(models.size());

        for (Ticket model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TicketSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _ticketId;
    }

    public void setPrimaryKey(long pk) {
        setTicketId(pk);
    }

    public long getTicketId() {
        return _ticketId;
    }

    public void setTicketId(long ticketId) {
        _ticketId = ticketId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
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

    public String getKey() {
        return _key;
    }

    public void setKey(String key) {
        _key = key;
    }

    public int getType() {
        return _type;
    }

    public void setType(int type) {
        _type = type;
    }

    public String getExtraInfo() {
        return _extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        _extraInfo = extraInfo;
    }

    public Date getExpirationDate() {
        return _expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        _expirationDate = expirationDate;
    }
}
