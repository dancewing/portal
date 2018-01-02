package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.LayoutFriendlyURL;
import com.liferay.portal.model.LayoutFriendlyURLModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LayoutFriendlyURL service. Represents a row in the &quot;LayoutFriendlyURL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.model.LayoutFriendlyURLModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LayoutFriendlyURLImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutFriendlyURLImpl
 * @see com.liferay.portal.model.LayoutFriendlyURL
 * @see com.liferay.portal.model.LayoutFriendlyURLModel
 * @generated
 */
public class LayoutFriendlyURLModelImpl extends BaseModelImpl<LayoutFriendlyURL>
    implements LayoutFriendlyURLModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a layout friendly u r l model instance should use the {@link com.liferay.portal.model.LayoutFriendlyURL} interface instead.
     */
    public static final String TABLE_NAME = "LayoutFriendlyURL";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "layoutFriendlyURLId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "plid", Types.BIGINT },
            { "privateLayout", Types.BOOLEAN },
            { "friendlyURL", Types.VARCHAR },
            { "languageId", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table LayoutFriendlyURL (uuid_ VARCHAR(75) null,layoutFriendlyURLId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,plid LONG,privateLayout BOOLEAN,friendlyURL VARCHAR(255) null,languageId VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table LayoutFriendlyURL";
    public static final String ORDER_BY_JPQL = " ORDER BY layoutFriendlyURL.layoutFriendlyURLId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY LayoutFriendlyURL.layoutFriendlyURLId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portal.model.LayoutFriendlyURL"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portal.model.LayoutFriendlyURL"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portal.model.LayoutFriendlyURL"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long FRIENDLYURL_COLUMN_BITMASK = 2L;
    public static long GROUPID_COLUMN_BITMASK = 4L;
    public static long LANGUAGEID_COLUMN_BITMASK = 8L;
    public static long PLID_COLUMN_BITMASK = 16L;
    public static long PRIVATELAYOUT_COLUMN_BITMASK = 32L;
    public static long UUID_COLUMN_BITMASK = 64L;
    public static long LAYOUTFRIENDLYURLID_COLUMN_BITMASK = 128L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portal.model.LayoutFriendlyURL"));
    private static ClassLoader _classLoader = LayoutFriendlyURL.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LayoutFriendlyURL.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _layoutFriendlyURLId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _plid;
    private long _originalPlid;
    private boolean _setOriginalPlid;
    private boolean _privateLayout;
    private boolean _originalPrivateLayout;
    private boolean _setOriginalPrivateLayout;
    private String _friendlyURL;
    private String _originalFriendlyURL;
    private String _languageId;
    private String _originalLanguageId;
    private long _columnBitmask;
    private LayoutFriendlyURL _escapedModel;

    public LayoutFriendlyURLModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _layoutFriendlyURLId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLayoutFriendlyURLId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _layoutFriendlyURLId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LayoutFriendlyURL.class;
    }

    @Override
    public String getModelClassName() {
        return LayoutFriendlyURL.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("layoutFriendlyURLId", getLayoutFriendlyURLId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("plid", getPlid());
        attributes.put("privateLayout", getPrivateLayout());
        attributes.put("friendlyURL", getFriendlyURL());
        attributes.put("languageId", getLanguageId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long layoutFriendlyURLId = (Long) attributes.get("layoutFriendlyURLId");

        if (layoutFriendlyURLId != null) {
            setLayoutFriendlyURLId(layoutFriendlyURLId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long plid = (Long) attributes.get("plid");

        if (plid != null) {
            setPlid(plid);
        }

        Boolean privateLayout = (Boolean) attributes.get("privateLayout");

        if (privateLayout != null) {
            setPrivateLayout(privateLayout);
        }

        String friendlyURL = (String) attributes.get("friendlyURL");

        if (friendlyURL != null) {
            setFriendlyURL(friendlyURL);
        }

        String languageId = (String) attributes.get("languageId");

        if (languageId != null) {
            setLanguageId(languageId);
        }
    }

    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @Override
    public long getLayoutFriendlyURLId() {
        return _layoutFriendlyURLId;
    }

    @Override
    public void setLayoutFriendlyURLId(Long layoutFriendlyURLId) {
        if (layoutFriendlyURLId == null) {
            layoutFriendlyURLId = new Long(0);
        }

        _layoutFriendlyURLId = layoutFriendlyURLId;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(Long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        if (groupId == null) {
            groupId = new Long(0);
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(Long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        if (companyId == null) {
            companyId = new Long(0);
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(Long userId) {
        if (userId == null) {
            userId = new Long(0);
        }

        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @Override
    public long getPlid() {
        return _plid;
    }

    @Override
    public void setPlid(Long plid) {
        _columnBitmask |= PLID_COLUMN_BITMASK;

        if (!_setOriginalPlid) {
            _setOriginalPlid = true;

            _originalPlid = _plid;
        }

        if (plid == null) {
            plid = new Long(0);
        }

        _plid = plid;
    }

    public long getOriginalPlid() {
        return _originalPlid;
    }

    @Override
    public boolean getPrivateLayout() {
        return _privateLayout;
    }

    @Override
    public boolean isPrivateLayout() {
        return _privateLayout;
    }

    @Override
    public void setPrivateLayout(boolean privateLayout) {
        _columnBitmask |= PRIVATELAYOUT_COLUMN_BITMASK;

        if (!_setOriginalPrivateLayout) {
            _setOriginalPrivateLayout = true;

            _originalPrivateLayout = _privateLayout;
        }

        _privateLayout = privateLayout;
    }

    public boolean getOriginalPrivateLayout() {
        return _originalPrivateLayout;
    }

    @Override
    public String getFriendlyURL() {
        if (_friendlyURL == null) {
            return StringPool.BLANK;
        } else {
            return _friendlyURL;
        }
    }

    @Override
    public void setFriendlyURL(String friendlyURL) {
        _columnBitmask |= FRIENDLYURL_COLUMN_BITMASK;

        if (_originalFriendlyURL == null) {
            _originalFriendlyURL = _friendlyURL;
        }

        _friendlyURL = friendlyURL;
    }

    public String getOriginalFriendlyURL() {
        return GetterUtil.getString(_originalFriendlyURL);
    }

    @Override
    public String getLanguageId() {
        if (_languageId == null) {
            return StringPool.BLANK;
        } else {
            return _languageId;
        }
    }

    @Override
    public void setLanguageId(String languageId) {
        _columnBitmask |= LANGUAGEID_COLUMN_BITMASK;

        if (_originalLanguageId == null) {
            _originalLanguageId = _languageId;
        }

        _languageId = languageId;
    }

    public String getOriginalLanguageId() {
        return GetterUtil.getString(_originalLanguageId);
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                LayoutFriendlyURL.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            LayoutFriendlyURL.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LayoutFriendlyURL toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LayoutFriendlyURL) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LayoutFriendlyURLImpl layoutFriendlyURLImpl = new LayoutFriendlyURLImpl();

        layoutFriendlyURLImpl.setUuid(getUuid());
        layoutFriendlyURLImpl.setLayoutFriendlyURLId(getLayoutFriendlyURLId());
        layoutFriendlyURLImpl.setGroupId(getGroupId());
        layoutFriendlyURLImpl.setCompanyId(getCompanyId());
        layoutFriendlyURLImpl.setUserId(getUserId());
        layoutFriendlyURLImpl.setUserName(getUserName());
        layoutFriendlyURLImpl.setCreateDate(getCreateDate());
        layoutFriendlyURLImpl.setModifiedDate(getModifiedDate());
        layoutFriendlyURLImpl.setPlid(getPlid());
        layoutFriendlyURLImpl.setPrivateLayout(getPrivateLayout());
        layoutFriendlyURLImpl.setFriendlyURL(getFriendlyURL());
        layoutFriendlyURLImpl.setLanguageId(getLanguageId());

        layoutFriendlyURLImpl.resetOriginalValues();

        return layoutFriendlyURLImpl;
    }

    @Override
    public int compareTo(LayoutFriendlyURL layoutFriendlyURL) {
        long primaryKey = layoutFriendlyURL.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LayoutFriendlyURL)) {
            return false;
        }

        LayoutFriendlyURL layoutFriendlyURL = (LayoutFriendlyURL) obj;

        long primaryKey = layoutFriendlyURL.getPrimaryKey();

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
        LayoutFriendlyURLModelImpl layoutFriendlyURLModelImpl = this;

        layoutFriendlyURLModelImpl._originalUuid = layoutFriendlyURLModelImpl._uuid;

        layoutFriendlyURLModelImpl._originalGroupId = layoutFriendlyURLModelImpl._groupId;

        layoutFriendlyURLModelImpl._setOriginalGroupId = false;

        layoutFriendlyURLModelImpl._originalCompanyId = layoutFriendlyURLModelImpl._companyId;

        layoutFriendlyURLModelImpl._setOriginalCompanyId = false;

        layoutFriendlyURLModelImpl._originalPlid = layoutFriendlyURLModelImpl._plid;

        layoutFriendlyURLModelImpl._setOriginalPlid = false;

        layoutFriendlyURLModelImpl._originalPrivateLayout = layoutFriendlyURLModelImpl._privateLayout;

        layoutFriendlyURLModelImpl._setOriginalPrivateLayout = false;

        layoutFriendlyURLModelImpl._originalFriendlyURL = layoutFriendlyURLModelImpl._friendlyURL;

        layoutFriendlyURLModelImpl._originalLanguageId = layoutFriendlyURLModelImpl._languageId;

        layoutFriendlyURLModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LayoutFriendlyURL> toCacheModel() {
        LayoutFriendlyURLCacheModel layoutFriendlyURLCacheModel = new LayoutFriendlyURLCacheModel();

        layoutFriendlyURLCacheModel.uuid = getUuid();

        String uuid = layoutFriendlyURLCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            layoutFriendlyURLCacheModel.uuid = null;
        }

        layoutFriendlyURLCacheModel.layoutFriendlyURLId = getLayoutFriendlyURLId();

        layoutFriendlyURLCacheModel.groupId = getGroupId();

        layoutFriendlyURLCacheModel.companyId = getCompanyId();

        layoutFriendlyURLCacheModel.userId = getUserId();

        layoutFriendlyURLCacheModel.userName = getUserName();

        String userName = layoutFriendlyURLCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            layoutFriendlyURLCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            layoutFriendlyURLCacheModel.createDate = createDate.getTime();
        } else {
            layoutFriendlyURLCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            layoutFriendlyURLCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            layoutFriendlyURLCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        layoutFriendlyURLCacheModel.plid = getPlid();

        layoutFriendlyURLCacheModel.privateLayout = getPrivateLayout();

        layoutFriendlyURLCacheModel.friendlyURL = getFriendlyURL();

        String friendlyURL = layoutFriendlyURLCacheModel.friendlyURL;

        if ((friendlyURL != null) && (friendlyURL.length() == 0)) {
            layoutFriendlyURLCacheModel.friendlyURL = null;
        }

        layoutFriendlyURLCacheModel.languageId = getLanguageId();

        String languageId = layoutFriendlyURLCacheModel.languageId;

        if ((languageId != null) && (languageId.length() == 0)) {
            layoutFriendlyURLCacheModel.languageId = null;
        }

        return layoutFriendlyURLCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", layoutFriendlyURLId=");
        sb.append(getLayoutFriendlyURLId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", plid=");
        sb.append(getPlid());
        sb.append(", privateLayout=");
        sb.append(getPrivateLayout());
        sb.append(", friendlyURL=");
        sb.append(getFriendlyURL());
        sb.append(", languageId=");
        sb.append(getLanguageId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portal.model.LayoutFriendlyURL");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layoutFriendlyURLId</column-name><column-value><![CDATA[");
        sb.append(getLayoutFriendlyURLId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>plid</column-name><column-value><![CDATA[");
        sb.append(getPlid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>privateLayout</column-name><column-value><![CDATA[");
        sb.append(getPrivateLayout());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>friendlyURL</column-name><column-value><![CDATA[");
        sb.append(getFriendlyURL());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>languageId</column-name><column-value><![CDATA[");
        sb.append(getLanguageId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
