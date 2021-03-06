package com.liferay.mail.model.impl;

import com.liferay.mail.model.CyrusUser;
import com.liferay.mail.model.CyrusUserModel;
import com.liferay.mail.model.CyrusUserSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CyrusUser service. Represents a row in the &quot;CyrusUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.mail.model.CyrusUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CyrusUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUserImpl
 * @see com.liferay.mail.model.CyrusUser
 * @see com.liferay.mail.model.CyrusUserModel
 * @generated
 */
@JSON(strict = true)
public class CyrusUserModelImpl extends BaseModelImpl<CyrusUser>
    implements CyrusUserModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a cyrus user model instance should use the {@link com.liferay.mail.model.CyrusUser} interface instead.
     */
    public static final String TABLE_NAME = "CyrusUser";
    public static final Object[][] TABLE_COLUMNS = {
            { "userId", Types.VARCHAR },
            { "password_", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table CyrusUser (userId VARCHAR(75) not null primary key,password_ VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table CyrusUser";
    public static final String ORDER_BY_JPQL = " ORDER BY cyrusUser.userId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY CyrusUser.userId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.mail.model.CyrusUser"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.mail.model.CyrusUser"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.mail.model.CyrusUser"));
    private static ClassLoader _classLoader = CyrusUser.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            CyrusUser.class
        };
    private String _userId;
    private String _password;
    private CyrusUser _escapedModel;

    public CyrusUserModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static CyrusUser toModel(CyrusUserSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        CyrusUser model = new CyrusUserImpl();

        model.setUserId(soapModel.getUserId());
        model.setPassword(soapModel.getPassword());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<CyrusUser> toModels(CyrusUserSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<CyrusUser> models = new ArrayList<CyrusUser>(soapModels.length);

        for (CyrusUserSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _userId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setUserId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _userId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return CyrusUser.class;
    }

    @Override
    public String getModelClassName() {
        return CyrusUser.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("password", getPassword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String userId = (String) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String password = (String) attributes.get("password");

        if (password != null) {
            setPassword(password);
        }
    }

    @JSON
    @Override
    public String getUserId() {
        if (_userId == null) {
            return StringPool.BLANK;
        } else {
            return _userId;
        }
    }

    @Override
    public void setUserId(String userId) {
        _userId = userId;
    }

    @JSON
    @Override
    public String getPassword() {
        if (_password == null) {
            return StringPool.BLANK;
        } else {
            return _password;
        }
    }

    @Override
    public void setPassword(String password) {
        _password = password;
    }

    @Override
    public CyrusUser toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (CyrusUser) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        CyrusUserImpl cyrusUserImpl = new CyrusUserImpl();

        cyrusUserImpl.setUserId(getUserId());
        cyrusUserImpl.setPassword(getPassword());

        cyrusUserImpl.resetOriginalValues();

        return cyrusUserImpl;
    }

    @Override
    public int compareTo(CyrusUser cyrusUser) {
        String primaryKey = cyrusUser.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CyrusUser)) {
            return false;
        }

        CyrusUser cyrusUser = (CyrusUser) obj;

        String primaryKey = cyrusUser.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<CyrusUser> toCacheModel() {
        CyrusUserCacheModel cyrusUserCacheModel = new CyrusUserCacheModel();

        cyrusUserCacheModel.userId = getUserId();

        String userId = cyrusUserCacheModel.userId;

        if ((userId != null) && (userId.length() == 0)) {
            cyrusUserCacheModel.userId = null;
        }

        cyrusUserCacheModel.password = getPassword();

        String password = cyrusUserCacheModel.password;

        if ((password != null) && (password.length() == 0)) {
            cyrusUserCacheModel.password = null;
        }

        return cyrusUserCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{userId=");
        sb.append(getUserId());
        sb.append(", password=");
        sb.append(getPassword());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.liferay.mail.model.CyrusUser");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>password</column-name><column-value><![CDATA[");
        sb.append(getPassword());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
