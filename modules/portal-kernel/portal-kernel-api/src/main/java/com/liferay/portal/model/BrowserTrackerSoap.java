package com.liferay.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BrowserTrackerSoap implements Serializable {
    private long _browserTrackerId;
    private long _userId;
    private long _browserKey;

    public BrowserTrackerSoap() {
    }

    public static BrowserTrackerSoap toSoapModel(BrowserTracker model) {
        BrowserTrackerSoap soapModel = new BrowserTrackerSoap();

        soapModel.setBrowserTrackerId(model.getBrowserTrackerId());
        soapModel.setUserId(model.getUserId());
        soapModel.setBrowserKey(model.getBrowserKey());

        return soapModel;
    }

    public static BrowserTrackerSoap[] toSoapModels(BrowserTracker[] models) {
        BrowserTrackerSoap[] soapModels = new BrowserTrackerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BrowserTrackerSoap[][] toSoapModels(BrowserTracker[][] models) {
        BrowserTrackerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BrowserTrackerSoap[models.length][models[0].length];
        } else {
            soapModels = new BrowserTrackerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BrowserTrackerSoap[] toSoapModels(List<BrowserTracker> models) {
        List<BrowserTrackerSoap> soapModels = new ArrayList<BrowserTrackerSoap>(models.size());

        for (BrowserTracker model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BrowserTrackerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _browserTrackerId;
    }

    public void setPrimaryKey(long pk) {
        setBrowserTrackerId(pk);
    }

    public long getBrowserTrackerId() {
        return _browserTrackerId;
    }

    public void setBrowserTrackerId(long browserTrackerId) {
        _browserTrackerId = browserTrackerId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getBrowserKey() {
        return _browserKey;
    }

    public void setBrowserKey(long browserKey) {
        _browserKey = browserKey;
    }
}
