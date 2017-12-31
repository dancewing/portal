package com.liferay.portlet.trash.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TrashVersion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrashVersion
 * @generated
 */
@ProviderType
public class TrashVersionWrapper implements TrashVersion,
    ModelWrapper<TrashVersion> {
    private TrashVersion _trashVersion;

    public TrashVersionWrapper(TrashVersion trashVersion) {
        _trashVersion = trashVersion;
    }

    @Override
    public Class<?> getModelClass() {
        return TrashVersion.class;
    }

    @Override
    public String getModelClassName() {
        return TrashVersion.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("versionId", getVersionId());
        attributes.put("entryId", getEntryId());
        attributes.put("classNameId", getClassNameId());
        attributes.put("classPK", getClassPK());
        attributes.put("typeSettings", getTypeSettings());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long versionId = (Long) attributes.get("versionId");

        if (versionId != null) {
            setVersionId(versionId);
        }

        Long entryId = (Long) attributes.get("entryId");

        if (entryId != null) {
            setEntryId(entryId);
        }

        Long classNameId = (Long) attributes.get("classNameId");

        if (classNameId != null) {
            setClassNameId(classNameId);
        }

        Long classPK = (Long) attributes.get("classPK");

        if (classPK != null) {
            setClassPK(classPK);
        }

        String typeSettings = (String) attributes.get("typeSettings");

        if (typeSettings != null) {
            setTypeSettings(typeSettings);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    /**
    * Returns the primary key of this trash version.
    *
    * @return the primary key of this trash version
    */
    @Override
    public long getPrimaryKey() {
        return _trashVersion.getPrimaryKey();
    }

    /**
    * Sets the primary key of this trash version.
    *
    * @param primaryKey the primary key of this trash version
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _trashVersion.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the version ID of this trash version.
    *
    * @return the version ID of this trash version
    */
    @Override
    public long getVersionId() {
        return _trashVersion.getVersionId();
    }

    /**
    * Sets the version ID of this trash version.
    *
    * @param versionId the version ID of this trash version
    */
    @Override
    public void setVersionId(java.lang.Long versionId) {
        _trashVersion.setVersionId(versionId);
    }

    /**
    * Returns the entry ID of this trash version.
    *
    * @return the entry ID of this trash version
    */
    @Override
    public long getEntryId() {
        return _trashVersion.getEntryId();
    }

    /**
    * Sets the entry ID of this trash version.
    *
    * @param entryId the entry ID of this trash version
    */
    @Override
    public void setEntryId(java.lang.Long entryId) {
        _trashVersion.setEntryId(entryId);
    }

    /**
    * Returns the fully qualified class name of this trash version.
    *
    * @return the fully qualified class name of this trash version
    */
    @Override
    public java.lang.String getClassName() {
        return _trashVersion.getClassName();
    }

    @Override
    public void setClassName(java.lang.String className) {
        _trashVersion.setClassName(className);
    }

    /**
    * Returns the class name ID of this trash version.
    *
    * @return the class name ID of this trash version
    */
    @Override
    public long getClassNameId() {
        return _trashVersion.getClassNameId();
    }

    /**
    * Sets the class name ID of this trash version.
    *
    * @param classNameId the class name ID of this trash version
    */
    @Override
    public void setClassNameId(java.lang.Long classNameId) {
        _trashVersion.setClassNameId(classNameId);
    }

    /**
    * Returns the class p k of this trash version.
    *
    * @return the class p k of this trash version
    */
    @Override
    public long getClassPK() {
        return _trashVersion.getClassPK();
    }

    /**
    * Sets the class p k of this trash version.
    *
    * @param classPK the class p k of this trash version
    */
    @Override
    public void setClassPK(java.lang.Long classPK) {
        _trashVersion.setClassPK(classPK);
    }

    /**
    * Returns the type settings of this trash version.
    *
    * @return the type settings of this trash version
    */
    @Override
    public java.lang.String getTypeSettings() {
        return _trashVersion.getTypeSettings();
    }

    /**
    * Sets the type settings of this trash version.
    *
    * @param typeSettings the type settings of this trash version
    */
    @Override
    public void setTypeSettings(java.lang.String typeSettings) {
        _trashVersion.setTypeSettings(typeSettings);
    }

    /**
    * Returns the status of this trash version.
    *
    * @return the status of this trash version
    */
    @Override
    public int getStatus() {
        return _trashVersion.getStatus();
    }

    /**
    * Sets the status of this trash version.
    *
    * @param status the status of this trash version
    */
    @Override
    public void setStatus(java.lang.Integer status) {
        _trashVersion.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _trashVersion.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _trashVersion.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _trashVersion.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _trashVersion.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _trashVersion.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _trashVersion.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _trashVersion.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _trashVersion.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _trashVersion.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _trashVersion.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _trashVersion.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TrashVersionWrapper((TrashVersion) _trashVersion.clone());
    }

    @Override
    public int compareTo(
        com.liferay.portlet.trash.model.TrashVersion trashVersion) {
        return _trashVersion.compareTo(trashVersion);
    }

    @Override
    public int hashCode() {
        return _trashVersion.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.portlet.trash.model.TrashVersion> toCacheModel() {
        return _trashVersion.toCacheModel();
    }

    @Override
    public com.liferay.portlet.trash.model.TrashVersion toEscapedModel() {
        return new TrashVersionWrapper(_trashVersion.toEscapedModel());
    }

    @Override
    public com.liferay.portlet.trash.model.TrashVersion toUnescapedModel() {
        return new TrashVersionWrapper(_trashVersion.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _trashVersion.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _trashVersion.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _trashVersion.persist();
    }

    @Override
    public com.liferay.portal.kernel.util.UnicodeProperties getTypeSettingsProperties() {
        return _trashVersion.getTypeSettingsProperties();
    }

    @Override
    public java.lang.String getTypeSettingsProperty(java.lang.String key) {
        return _trashVersion.getTypeSettingsProperty(key);
    }

    @Override
    public java.lang.String getTypeSettingsProperty(java.lang.String key,
        java.lang.String defaultValue) {
        return _trashVersion.getTypeSettingsProperty(key, defaultValue);
    }

    @Override
    public void setTypeSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties) {
        _trashVersion.setTypeSettingsProperties(typeSettingsProperties);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TrashVersionWrapper)) {
            return false;
        }

        TrashVersionWrapper trashVersionWrapper = (TrashVersionWrapper) obj;

        if (Validator.equals(_trashVersion, trashVersionWrapper._trashVersion)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TrashVersion getWrappedTrashVersion() {
        return _trashVersion;
    }

    @Override
    public TrashVersion getWrappedModel() {
        return _trashVersion;
    }

    @Override
    public void resetOriginalValues() {
        _trashVersion.resetOriginalValues();
    }
}
