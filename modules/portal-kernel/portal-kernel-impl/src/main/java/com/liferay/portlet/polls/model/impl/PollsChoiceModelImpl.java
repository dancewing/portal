package com.liferay.portlet.polls.model.impl;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.polls.model.PollsChoice;
import com.liferay.portlet.polls.model.PollsChoiceModel;
import com.liferay.portlet.polls.model.PollsChoiceSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * The base model implementation for the PollsChoice service. Represents a row in the &quot;PollsChoice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.polls.model.PollsChoiceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PollsChoiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoiceImpl
 * @see com.liferay.portlet.polls.model.PollsChoice
 * @see com.liferay.portlet.polls.model.PollsChoiceModel
 * @generated
 */
@JSON(strict = true)
public class PollsChoiceModelImpl extends BaseModelImpl<PollsChoice>
    implements PollsChoiceModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a polls choice model instance should use the {@link com.liferay.portlet.polls.model.PollsChoice} interface instead.
     */
    public static final String TABLE_NAME = "PollsChoice";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "choiceId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "questionId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "description", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table PollsChoice (uuid_ VARCHAR(75) null,choiceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,questionId LONG,name VARCHAR(75) null,description STRING null)";
    public static final String TABLE_SQL_DROP = "drop table PollsChoice";
    public static final String ORDER_BY_JPQL = " ORDER BY pollsChoice.questionId ASC, pollsChoice.name ASC";
    public static final String ORDER_BY_SQL = " ORDER BY PollsChoice.questionId ASC, PollsChoice.name ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.entity.cache.enabled.com.liferay.portlet.polls.model.PollsChoice"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.finder.cache.enabled.com.liferay.portlet.polls.model.PollsChoice"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
                "value.object.column.bitmask.enabled.com.liferay.portlet.polls.model.PollsChoice"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long NAME_COLUMN_BITMASK = 4L;
    public static long QUESTIONID_COLUMN_BITMASK = 8L;
    public static long UUID_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
                "lock.expiration.time.com.liferay.portlet.polls.model.PollsChoice"));
    private static ClassLoader _classLoader = PollsChoice.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PollsChoice.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _choiceId;
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
    private long _questionId;
    private long _originalQuestionId;
    private boolean _setOriginalQuestionId;
    private String _name;
    private String _originalName;
    private String _description;
    private String _descriptionCurrentLanguageId;
    private long _columnBitmask;
    private PollsChoice _escapedModel;

    public PollsChoiceModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PollsChoice toModel(PollsChoiceSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        PollsChoice model = new PollsChoiceImpl();

        model.setUuid(soapModel.getUuid());
        model.setChoiceId(soapModel.getChoiceId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setQuestionId(soapModel.getQuestionId());
        model.setName(soapModel.getName());
        model.setDescription(soapModel.getDescription());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PollsChoice> toModels(PollsChoiceSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<PollsChoice> models = new ArrayList<PollsChoice>(soapModels.length);

        for (PollsChoiceSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _choiceId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setChoiceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _choiceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return PollsChoice.class;
    }

    @Override
    public String getModelClassName() {
        return PollsChoice.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("choiceId", getChoiceId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("questionId", getQuestionId());
        attributes.put("name", getName());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long choiceId = (Long) attributes.get("choiceId");

        if (choiceId != null) {
            setChoiceId(choiceId);
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

        Long questionId = (Long) attributes.get("questionId");

        if (questionId != null) {
            setQuestionId(questionId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    @JSON
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

    @JSON
    @Override
    public long getChoiceId() {
        return _choiceId;
    }

    @Override
    public void setChoiceId(Long choiceId) {
        if (choiceId == null) {
            choiceId = new Long(0);
        }

        _choiceId = choiceId;
    }

    @JSON
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

    @JSON
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

    @JSON
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

    @JSON
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

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public long getQuestionId() {
        return _questionId;
    }

    @Override
    public void setQuestionId(Long questionId) {
        _columnBitmask = -1L;

        if (!_setOriginalQuestionId) {
            _setOriginalQuestionId = true;

            _originalQuestionId = _questionId;
        }

        if (questionId == null) {
            questionId = new Long(0);
        }

        _questionId = questionId;
    }

    public long getOriginalQuestionId() {
        return _originalQuestionId;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _columnBitmask = -1L;

        if (_originalName == null) {
            _originalName = _name;
        }

        _name = name;
    }

    public String getOriginalName() {
        return GetterUtil.getString(_originalName);
    }

    @JSON
    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public String getDescription(Locale locale) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getDescription(languageId);
    }

    @Override
    public String getDescription(Locale locale, boolean useDefault) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getDescription(languageId, useDefault);
    }

    @Override
    public String getDescription(String languageId) {
        return LocalizationUtil.getLocalization(getDescription(), languageId);
    }

    @Override
    public String getDescription(String languageId, boolean useDefault) {
        return LocalizationUtil.getLocalization(getDescription(), languageId,
            useDefault);
    }

    @Override
    public String getDescriptionCurrentLanguageId() {
        return _descriptionCurrentLanguageId;
    }

    @JSON
    @Override
    public String getDescriptionCurrentValue() {
        Locale locale = getLocale(_descriptionCurrentLanguageId);

        return getDescription(locale);
    }

    @Override
    public Map<Locale, String> getDescriptionMap() {
        return LocalizationUtil.getLocalizationMap(getDescription());
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public void setDescription(String description, Locale locale) {
        setDescription(description, locale, LocaleUtil.getSiteDefault());
    }

    @Override
    public void setDescription(String description, Locale locale,
        Locale defaultLocale) {
        String languageId = LocaleUtil.toLanguageId(locale);
        String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

        if (Validator.isNotNull(description)) {
            setDescription(LocalizationUtil.updateLocalization(
                    getDescription(), "Description", description, languageId,
                    defaultLanguageId));
        } else {
            setDescription(LocalizationUtil.removeLocalization(
                    getDescription(), "Description", languageId));
        }
    }

    @Override
    public void setDescriptionCurrentLanguageId(String languageId) {
        _descriptionCurrentLanguageId = languageId;
    }

    @Override
    public void setDescriptionMap(Map<Locale, String> descriptionMap) {
        setDescriptionMap(descriptionMap, LocaleUtil.getSiteDefault());
    }

    @Override
    public void setDescriptionMap(Map<Locale, String> descriptionMap,
        Locale defaultLocale) {
        if (descriptionMap == null) {
            return;
        }

        setDescription(LocalizationUtil.updateLocalization(descriptionMap,
                getDescription(), "Description",
                LocaleUtil.toLanguageId(defaultLocale)));
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                PollsChoice.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            PollsChoice.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public String[] getAvailableLanguageIds() {
        Set<String> availableLanguageIds = new TreeSet<String>();

        Map<Locale, String> descriptionMap = getDescriptionMap();

        for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
            Locale locale = entry.getKey();
            String value = entry.getValue();

            if (Validator.isNotNull(value)) {
                availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
            }
        }

        return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
    }

    @Override
    public String getDefaultLanguageId() {
        String xml = getDescription();

        if (xml == null) {
            return StringPool.BLANK;
        }

        Locale defaultLocale = LocaleUtil.getSiteDefault();

        return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
    }

    @Override
    public void prepareLocalizedFieldsForImport() throws LocaleException {
        prepareLocalizedFieldsForImport(null);
    }

    @Override
    @SuppressWarnings("unused")
    public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
        throws LocaleException {
        Locale defaultLocale = LocaleUtil.getSiteDefault();

        String modelDefaultLanguageId = getDefaultLanguageId();

        String description = getDescription(defaultLocale);

        if (Validator.isNull(description)) {
            setDescription(getDescription(modelDefaultLanguageId), defaultLocale);
        } else {
            setDescription(getDescription(defaultLocale), defaultLocale,
                defaultLocale);
        }
    }

    @Override
    public PollsChoice toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PollsChoice) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PollsChoiceImpl pollsChoiceImpl = new PollsChoiceImpl();

        pollsChoiceImpl.setUuid(getUuid());
        pollsChoiceImpl.setChoiceId(getChoiceId());
        pollsChoiceImpl.setGroupId(getGroupId());
        pollsChoiceImpl.setCompanyId(getCompanyId());
        pollsChoiceImpl.setUserId(getUserId());
        pollsChoiceImpl.setUserName(getUserName());
        pollsChoiceImpl.setCreateDate(getCreateDate());
        pollsChoiceImpl.setModifiedDate(getModifiedDate());
        pollsChoiceImpl.setQuestionId(getQuestionId());
        pollsChoiceImpl.setName(getName());
        pollsChoiceImpl.setDescription(getDescription());

        pollsChoiceImpl.resetOriginalValues();

        return pollsChoiceImpl;
    }

    @Override
    public int compareTo(PollsChoice pollsChoice) {
        int value = 0;

        if (getQuestionId() < pollsChoice.getQuestionId()) {
            value = -1;
        } else if (getQuestionId() > pollsChoice.getQuestionId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = getName().compareTo(pollsChoice.getName());

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

        if (!(obj instanceof PollsChoice)) {
            return false;
        }

        PollsChoice pollsChoice = (PollsChoice) obj;

        long primaryKey = pollsChoice.getPrimaryKey();

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
        PollsChoiceModelImpl pollsChoiceModelImpl = this;

        pollsChoiceModelImpl._originalUuid = pollsChoiceModelImpl._uuid;

        pollsChoiceModelImpl._originalGroupId = pollsChoiceModelImpl._groupId;

        pollsChoiceModelImpl._setOriginalGroupId = false;

        pollsChoiceModelImpl._originalCompanyId = pollsChoiceModelImpl._companyId;

        pollsChoiceModelImpl._setOriginalCompanyId = false;

        pollsChoiceModelImpl._originalQuestionId = pollsChoiceModelImpl._questionId;

        pollsChoiceModelImpl._setOriginalQuestionId = false;

        pollsChoiceModelImpl._originalName = pollsChoiceModelImpl._name;

        pollsChoiceModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PollsChoice> toCacheModel() {
        PollsChoiceCacheModel pollsChoiceCacheModel = new PollsChoiceCacheModel();

        pollsChoiceCacheModel.uuid = getUuid();

        String uuid = pollsChoiceCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            pollsChoiceCacheModel.uuid = null;
        }

        pollsChoiceCacheModel.choiceId = getChoiceId();

        pollsChoiceCacheModel.groupId = getGroupId();

        pollsChoiceCacheModel.companyId = getCompanyId();

        pollsChoiceCacheModel.userId = getUserId();

        pollsChoiceCacheModel.userName = getUserName();

        String userName = pollsChoiceCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            pollsChoiceCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            pollsChoiceCacheModel.createDate = createDate.getTime();
        } else {
            pollsChoiceCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            pollsChoiceCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            pollsChoiceCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        pollsChoiceCacheModel.questionId = getQuestionId();

        pollsChoiceCacheModel.name = getName();

        String name = pollsChoiceCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            pollsChoiceCacheModel.name = null;
        }

        pollsChoiceCacheModel.description = getDescription();

        String description = pollsChoiceCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            pollsChoiceCacheModel.description = null;
        }

        return pollsChoiceCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", choiceId=");
        sb.append(getChoiceId());
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
        sb.append(", questionId=");
        sb.append(getQuestionId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.liferay.portlet.polls.model.PollsChoice");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>choiceId</column-name><column-value><![CDATA[");
        sb.append(getChoiceId());
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
            "<column><column-name>questionId</column-name><column-value><![CDATA[");
        sb.append(getQuestionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
