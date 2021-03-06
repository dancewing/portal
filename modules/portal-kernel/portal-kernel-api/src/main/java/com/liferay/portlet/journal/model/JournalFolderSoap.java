package com.liferay.portlet.journal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.portlet.journal.service.http.JournalFolderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.journal.service.http.JournalFolderServiceSoap
 * @generated
 */
public class JournalFolderSoap implements Serializable {
    private String _uuid;
    private long _folderId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _parentFolderId;
    private String _treePath;
    private String _name;
    private String _description;
    private int _status;
    private long _statusByUserId;
    private String _statusByUserName;
    private Date _statusDate;

    public JournalFolderSoap() {
    }

    public static JournalFolderSoap toSoapModel(JournalFolder model) {
        JournalFolderSoap soapModel = new JournalFolderSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setFolderId(model.getFolderId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setParentFolderId(model.getParentFolderId());
        soapModel.setTreePath(model.getTreePath());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());
        soapModel.setStatus(model.getStatus());
        soapModel.setStatusByUserId(model.getStatusByUserId());
        soapModel.setStatusByUserName(model.getStatusByUserName());
        soapModel.setStatusDate(model.getStatusDate());

        return soapModel;
    }

    public static JournalFolderSoap[] toSoapModels(JournalFolder[] models) {
        JournalFolderSoap[] soapModels = new JournalFolderSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static JournalFolderSoap[][] toSoapModels(JournalFolder[][] models) {
        JournalFolderSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new JournalFolderSoap[models.length][models[0].length];
        } else {
            soapModels = new JournalFolderSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static JournalFolderSoap[] toSoapModels(List<JournalFolder> models) {
        List<JournalFolderSoap> soapModels = new ArrayList<JournalFolderSoap>(models.size());

        for (JournalFolder model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new JournalFolderSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _folderId;
    }

    public void setPrimaryKey(long pk) {
        setFolderId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getFolderId() {
        return _folderId;
    }

    public void setFolderId(long folderId) {
        _folderId = folderId;
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

    public long getParentFolderId() {
        return _parentFolderId;
    }

    public void setParentFolderId(long parentFolderId) {
        _parentFolderId = parentFolderId;
    }

    public String getTreePath() {
        return _treePath;
    }

    public void setTreePath(String treePath) {
        _treePath = treePath;
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

    public int getStatus() {
        return _status;
    }

    public void setStatus(int status) {
        _status = status;
    }

    public long getStatusByUserId() {
        return _statusByUserId;
    }

    public void setStatusByUserId(long statusByUserId) {
        _statusByUserId = statusByUserId;
    }

    public String getStatusByUserName() {
        return _statusByUserName;
    }

    public void setStatusByUserName(String statusByUserName) {
        _statusByUserName = statusByUserName;
    }

    public Date getStatusDate() {
        return _statusDate;
    }

    public void setStatusDate(Date statusDate) {
        _statusDate = statusDate;
    }
}
