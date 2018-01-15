package com.liferay.portlet.calendar.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CalEvent service. Represents a row in the &quot;CalEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.calendar.model.impl.CalEventModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.calendar.model.impl.CalEventImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CalEvent
 * @see com.liferay.portlet.calendar.model.impl.CalEventImpl
 * @see com.liferay.portlet.calendar.model.impl.CalEventModelImpl
 * @generated
 */
public interface CalEventModel extends BaseModel<CalEvent>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a cal event model instance should use the {@link CalEvent} interface instead.
     */

    /**
     * Returns the primary key of this cal event.
     *
     * @return the primary key of this cal event
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this cal event.
     *
     * @param primaryKey the primary key of this cal event
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this cal event.
     *
     * @return the uuid of this cal event
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this cal event.
     *
     * @param uuid the uuid of this cal event
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the event ID of this cal event.
     *
     * @return the event ID of this cal event
     */
    public long getEventId();

    /**
     * Sets the event ID of this cal event.
     *
     * @param eventId the event ID of this cal event
     */
    public void setEventId(Long eventId);

    /**
     * Returns the group ID of this cal event.
     *
     * @return the group ID of this cal event
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this cal event.
     *
     * @param groupId the group ID of this cal event
     */
    @Override
    public void setGroupId(Long groupId);

    /**
     * Returns the company ID of this cal event.
     *
     * @return the company ID of this cal event
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this cal event.
     *
     * @param companyId the company ID of this cal event
     */
    @Override
    public void setCompanyId(Long companyId);

    /**
     * Returns the user ID of this cal event.
     *
     * @return the user ID of this cal event
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this cal event.
     *
     * @param userId the user ID of this cal event
     */
    @Override
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this cal event.
     *
     * @return the user uuid of this cal event
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this cal event.
     *
     * @param userUuid the user uuid of this cal event
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this cal event.
     *
     * @return the user name of this cal event
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this cal event.
     *
     * @param userName the user name of this cal event
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this cal event.
     *
     * @return the create date of this cal event
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this cal event.
     *
     * @param createDate the create date of this cal event
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this cal event.
     *
     * @return the modified date of this cal event
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this cal event.
     *
     * @param modifiedDate the modified date of this cal event
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the title of this cal event.
     *
     * @return the title of this cal event
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this cal event.
     *
     * @param title the title of this cal event
     */
    public void setTitle(String title);

    /**
     * Returns the description of this cal event.
     *
     * @return the description of this cal event
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this cal event.
     *
     * @param description the description of this cal event
     */
    public void setDescription(String description);

    /**
     * Returns the location of this cal event.
     *
     * @return the location of this cal event
     */
    @AutoEscape
    public String getLocation();

    /**
     * Sets the location of this cal event.
     *
     * @param location the location of this cal event
     */
    public void setLocation(String location);

    /**
     * Returns the start date of this cal event.
     *
     * @return the start date of this cal event
     */
    public Date getStartDate();

    /**
     * Sets the start date of this cal event.
     *
     * @param startDate the start date of this cal event
     */
    public void setStartDate(Date startDate);

    /**
     * Returns the end date of this cal event.
     *
     * @return the end date of this cal event
     */
    public Date getEndDate();

    /**
     * Sets the end date of this cal event.
     *
     * @param endDate the end date of this cal event
     */
    public void setEndDate(Date endDate);

    /**
     * Returns the duration hour of this cal event.
     *
     * @return the duration hour of this cal event
     */
    public int getDurationHour();

    /**
     * Sets the duration hour of this cal event.
     *
     * @param durationHour the duration hour of this cal event
     */
    public void setDurationHour(Integer durationHour);

    /**
     * Returns the duration minute of this cal event.
     *
     * @return the duration minute of this cal event
     */
    public int getDurationMinute();

    /**
     * Sets the duration minute of this cal event.
     *
     * @param durationMinute the duration minute of this cal event
     */
    public void setDurationMinute(Integer durationMinute);

    /**
     * Returns the all day of this cal event.
     *
     * @return the all day of this cal event
     */
    public boolean getAllDay();

    /**
     * Returns <code>true</code> if this cal event is all day.
     *
     * @return <code>true</code> if this cal event is all day; <code>false</code> otherwise
     */
    public boolean isAllDay();

    /**
     * Sets whether this cal event is all day.
     *
     * @param allDay the all day of this cal event
     */
    public void setAllDay(boolean allDay);

    /**
     * Returns the time zone sensitive of this cal event.
     *
     * @return the time zone sensitive of this cal event
     */
    public boolean getTimeZoneSensitive();

    /**
     * Returns <code>true</code> if this cal event is time zone sensitive.
     *
     * @return <code>true</code> if this cal event is time zone sensitive; <code>false</code> otherwise
     */
    public boolean isTimeZoneSensitive();

    /**
     * Sets whether this cal event is time zone sensitive.
     *
     * @param timeZoneSensitive the time zone sensitive of this cal event
     */
    public void setTimeZoneSensitive(boolean timeZoneSensitive);

    /**
     * Returns the type of this cal event.
     *
     * @return the type of this cal event
     */
    @AutoEscape
    public String getType();

    /**
     * Sets the type of this cal event.
     *
     * @param type the type of this cal event
     */
    public void setType(String type);

    /**
     * Returns the repeating of this cal event.
     *
     * @return the repeating of this cal event
     */
    public boolean getRepeating();

    /**
     * Returns <code>true</code> if this cal event is repeating.
     *
     * @return <code>true</code> if this cal event is repeating; <code>false</code> otherwise
     */
    public boolean isRepeating();

    /**
     * Sets whether this cal event is repeating.
     *
     * @param repeating the repeating of this cal event
     */
    public void setRepeating(boolean repeating);

    /**
     * Returns the recurrence of this cal event.
     *
     * @return the recurrence of this cal event
     */
    public String getRecurrence();

    /**
     * Sets the recurrence of this cal event.
     *
     * @param recurrence the recurrence of this cal event
     */
    public void setRecurrence(String recurrence);

    /**
     * Returns the remind by of this cal event.
     *
     * @return the remind by of this cal event
     */
    public int getRemindBy();

    /**
     * Sets the remind by of this cal event.
     *
     * @param remindBy the remind by of this cal event
     */
    public void setRemindBy(Integer remindBy);

    /**
     * Returns the first reminder of this cal event.
     *
     * @return the first reminder of this cal event
     */
    public int getFirstReminder();

    /**
     * Sets the first reminder of this cal event.
     *
     * @param firstReminder the first reminder of this cal event
     */
    public void setFirstReminder(Integer firstReminder);

    /**
     * Returns the second reminder of this cal event.
     *
     * @return the second reminder of this cal event
     */
    public int getSecondReminder();

    /**
     * Sets the second reminder of this cal event.
     *
     * @param secondReminder the second reminder of this cal event
     */
    public void setSecondReminder(Integer secondReminder);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.liferay.portlet.calendar.model.CalEvent calEvent);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portlet.calendar.model.CalEvent> toCacheModel();

    @Override
    public com.liferay.portlet.calendar.model.CalEvent toEscapedModel();

    @Override
    public com.liferay.portlet.calendar.model.CalEvent toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
