package com.liferay.portlet.expando.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.model.ExpandoValueModel;
import com.liferay.portlet.expando.model.ExpandoValueSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ExpandoValue service. Represents a row in the &quot;ExpandoValue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.expando.model.ExpandoValueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExpandoValueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExpandoValueImpl
 * @see com.liferay.portlet.expando.model.ExpandoValue
 * @see com.liferay.portlet.expando.model.ExpandoValueModel
 * @generated
 */
@JSON(strict = true)
public class ExpandoValueModelImpl extends BaseModelImpl<ExpandoValue>
    implements ExpandoValueModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a expando value model instance should use the {@link com.liferay.portlet.expando.model.ExpandoValue} interface instead.
     */
    public static final String TABLE_NAME = "ExpandoValue";
    public static final Object[][] TABLE_COLUMNS = {
            { "valueId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "tableId", Types.BIGINT },
            { "columnId", Types.BIGINT },
            { "rowId_", Types.BIGINT },
            { "classNameId", Types.BIGINT },
            { "classPK", Types.BIGINT },
            { "data_", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table ExpandoValue (valueId LONG not null primary key,companyId LONG,tableId LONG,columnId LONG,rowId_ LONG,classNameId LONG,classPK LONG,data_ STRING null)";
    public static final String TABLE_SQL_DROP = "drop table ExpandoValue";
    public static final String ORDER_BY_JPQL = " ORDER BY expandoValue.tableId ASC, expandoValue.rowId ASC, expandoValue.columnId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY ExpandoValue.tableId ASC, ExpandoValue.rowId_ ASC, ExpandoValue.columnId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portlet.expando.model.ExpandoValue"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portlet.expando.model.ExpandoValue"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portlet.expando.model.ExpandoValue"),
            true);
    public static long CLASSNAMEID_COLUMN_BITMASK = 1L;
    public static long CLASSPK_COLUMN_BITMASK = 2L;
    public static long COLUMNID_COLUMN_BITMASK = 4L;
    public static long DATA_COLUMN_BITMASK = 8L;
    public static long ROWID_COLUMN_BITMASK = 16L;
    public static long TABLEID_COLUMN_BITMASK = 32L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portlet.expando.model.ExpandoValue"));
    private static ClassLoader _classLoader = ExpandoValue.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            ExpandoValue.class
        };
    private long _valueId;
    private long _companyId;
    private long _tableId;
    private long _originalTableId;
    private boolean _setOriginalTableId;
    private long _columnId;
    private long _originalColumnId;
    private boolean _setOriginalColumnId;
    private long _rowId;
    private long _originalRowId;
    private boolean _setOriginalRowId;
    private long _classNameId;
    private long _originalClassNameId;
    private boolean _setOriginalClassNameId;
    private long _classPK;
    private long _originalClassPK;
    private boolean _setOriginalClassPK;
    private String _data;
    private String _originalData;
    private long _columnBitmask;
    private ExpandoValue _escapedModel;

    public ExpandoValueModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static ExpandoValue toModel(ExpandoValueSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        ExpandoValue model = new ExpandoValueImpl();

        model.setValueId(soapModel.getValueId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setTableId(soapModel.getTableId());
        model.setColumnId(soapModel.getColumnId());
        model.setRowId(soapModel.getRowId());
        model.setClassNameId(soapModel.getClassNameId());
        model.setClassPK(soapModel.getClassPK());
        model.setData(soapModel.getData());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<ExpandoValue> toModels(ExpandoValueSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<ExpandoValue> models = new ArrayList<ExpandoValue>(soapModels.length);

        for (ExpandoValueSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _valueId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setValueId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _valueId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return ExpandoValue.class;
    }

    @Override
    public String getModelClassName() {
        return ExpandoValue.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("valueId", getValueId());
        attributes.put("companyId", getCompanyId());
        attributes.put("tableId", getTableId());
        attributes.put("columnId", getColumnId());
        attributes.put("rowId", getRowId());
        attributes.put("classNameId", getClassNameId());
        attributes.put("classPK", getClassPK());
        attributes.put("data", getData());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long valueId = (Long) attributes.get("valueId");

        if (valueId != null) {
            setValueId(valueId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long tableId = (Long) attributes.get("tableId");

        if (tableId != null) {
            setTableId(tableId);
        }

        Long columnId = (Long) attributes.get("columnId");

        if (columnId != null) {
            setColumnId(columnId);
        }

        Long rowId = (Long) attributes.get("rowId");

        if (rowId != null) {
            setRowId(rowId);
        }

        Long classNameId = (Long) attributes.get("classNameId");

        if (classNameId != null) {
            setClassNameId(classNameId);
        }

        Long classPK = (Long) attributes.get("classPK");

        if (classPK != null) {
            setClassPK(classPK);
        }

        String data = (String) attributes.get("data");

        if (data != null) {
            setData(data);
        }
    }

    @JSON
    @Override
    public long getValueId() {
        return _valueId;
    }

    @Override
    public void setValueId(long valueId) {
        _valueId = valueId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getTableId() {
        return _tableId;
    }

    @Override
    public void setTableId(long tableId) {
        _columnBitmask = -1L;

        if (!_setOriginalTableId) {
            _setOriginalTableId = true;

            _originalTableId = _tableId;
        }

        _tableId = tableId;
    }

    public long getOriginalTableId() {
        return _originalTableId;
    }

    @JSON
    @Override
    public long getColumnId() {
        return _columnId;
    }

    @Override
    public void setColumnId(long columnId) {
        _columnBitmask = -1L;

        if (!_setOriginalColumnId) {
            _setOriginalColumnId = true;

            _originalColumnId = _columnId;
        }

        _columnId = columnId;
    }

    public long getOriginalColumnId() {
        return _originalColumnId;
    }

    @JSON
    @Override
    public long getRowId() {
        return _rowId;
    }

    @Override
    public void setRowId(long rowId) {
        _columnBitmask = -1L;

        if (!_setOriginalRowId) {
            _setOriginalRowId = true;

            _originalRowId = _rowId;
        }

        _rowId = rowId;
    }

    public long getOriginalRowId() {
        return _originalRowId;
    }

    @Override
    public String getClassName() {
        if (getClassNameId() <= 0) {
            return StringPool.BLANK;
        }

        return PortalUtil.getClassName(getClassNameId());
    }

    @Override
    public void setClassName(String className) {
        long classNameId = 0;

        if (Validator.isNotNull(className)) {
            classNameId = PortalUtil.getClassNameId(className);
        }

        setClassNameId(classNameId);
    }

    @JSON
    @Override
    public long getClassNameId() {
        return _classNameId;
    }

    @Override
    public void setClassNameId(long classNameId) {
        _columnBitmask |= CLASSNAMEID_COLUMN_BITMASK;

        if (!_setOriginalClassNameId) {
            _setOriginalClassNameId = true;

            _originalClassNameId = _classNameId;
        }

        _classNameId = classNameId;
    }

    public long getOriginalClassNameId() {
        return _originalClassNameId;
    }

    @JSON
    @Override
    public long getClassPK() {
        return _classPK;
    }

    @Override
    public void setClassPK(long classPK) {
        _columnBitmask |= CLASSPK_COLUMN_BITMASK;

        if (!_setOriginalClassPK) {
            _setOriginalClassPK = true;

            _originalClassPK = _classPK;
        }

        _classPK = classPK;
    }

    public long getOriginalClassPK() {
        return _originalClassPK;
    }

    @JSON
    @Override
    public String getData() {
        if (_data == null) {
            return StringPool.BLANK;
        } else {
            return _data;
        }
    }

    @Override
    public void setData(String data) {
        _columnBitmask |= DATA_COLUMN_BITMASK;

        if (_originalData == null) {
            _originalData = _data;
        }

        _data = data;
    }

    public String getOriginalData() {
        return GetterUtil.getString(_originalData);
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoValue toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (ExpandoValue) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        ExpandoValueImpl expandoValueImpl = new ExpandoValueImpl();

        expandoValueImpl.setValueId(getValueId());
        expandoValueImpl.setCompanyId(getCompanyId());
        expandoValueImpl.setTableId(getTableId());
        expandoValueImpl.setColumnId(getColumnId());
        expandoValueImpl.setRowId(getRowId());
        expandoValueImpl.setClassNameId(getClassNameId());
        expandoValueImpl.setClassPK(getClassPK());
        expandoValueImpl.setData(getData());

        expandoValueImpl.resetOriginalValues();

        return expandoValueImpl;
    }

    @Override
    public int compareTo(ExpandoValue expandoValue) {
        int value = 0;

        if (getTableId() < expandoValue.getTableId()) {
            value = -1;
        } else if (getTableId() > expandoValue.getTableId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (getRowId() < expandoValue.getRowId()) {
            value = -1;
        } else if (getRowId() > expandoValue.getRowId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (getColumnId() < expandoValue.getColumnId()) {
            value = -1;
        } else if (getColumnId() > expandoValue.getColumnId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ExpandoValue)) {
            return false;
        }

        ExpandoValue expandoValue = (ExpandoValue) obj;

        long primaryKey = expandoValue.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        ExpandoValueModelImpl expandoValueModelImpl = this;

        expandoValueModelImpl._originalTableId = expandoValueModelImpl._tableId;

        expandoValueModelImpl._setOriginalTableId = false;

        expandoValueModelImpl._originalColumnId = expandoValueModelImpl._columnId;

        expandoValueModelImpl._setOriginalColumnId = false;

        expandoValueModelImpl._originalRowId = expandoValueModelImpl._rowId;

        expandoValueModelImpl._setOriginalRowId = false;

        expandoValueModelImpl._originalClassNameId = expandoValueModelImpl._classNameId;

        expandoValueModelImpl._setOriginalClassNameId = false;

        expandoValueModelImpl._originalClassPK = expandoValueModelImpl._classPK;

        expandoValueModelImpl._setOriginalClassPK = false;

        expandoValueModelImpl._originalData = expandoValueModelImpl._data;

        expandoValueModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<ExpandoValue> toCacheModel() {
        ExpandoValueCacheModel expandoValueCacheModel = new ExpandoValueCacheModel();

        expandoValueCacheModel.valueId = getValueId();

        expandoValueCacheModel.companyId = getCompanyId();

        expandoValueCacheModel.tableId = getTableId();

        expandoValueCacheModel.columnId = getColumnId();

        expandoValueCacheModel.rowId = getRowId();

        expandoValueCacheModel.classNameId = getClassNameId();

        expandoValueCacheModel.classPK = getClassPK();

        expandoValueCacheModel.data = getData();

        String data = expandoValueCacheModel.data;

        if ((data != null) && (data.length() == 0)) {
            expandoValueCacheModel.data = null;
        }

        return expandoValueCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{valueId=");
        sb.append(getValueId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", tableId=");
        sb.append(getTableId());
        sb.append(", columnId=");
        sb.append(getColumnId());
        sb.append(", rowId=");
        sb.append(getRowId());
        sb.append(", classNameId=");
        sb.append(getClassNameId());
        sb.append(", classPK=");
        sb.append(getClassPK());
        sb.append(", data=");
        sb.append(getData());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portlet.expando.model.ExpandoValue");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>valueId</column-name><column-value><![CDATA[");
        sb.append(getValueId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tableId</column-name><column-value><![CDATA[");
        sb.append(getTableId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>columnId</column-name><column-value><![CDATA[");
        sb.append(getColumnId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rowId</column-name><column-value><![CDATA[");
        sb.append(getRowId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>classNameId</column-name><column-value><![CDATA[");
        sb.append(getClassNameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>classPK</column-name><column-value><![CDATA[");
        sb.append(getClassPK());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>data</column-name><column-value><![CDATA[");
        sb.append(getData());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
