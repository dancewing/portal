package com.liferay.portlet.polls.model;

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
 * The base model interface for the PollsVote service. Represents a row in the &quot;PollsVote&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.polls.model.impl.PollsVoteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.polls.model.impl.PollsVoteImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PollsVote
 * @see com.liferay.portlet.polls.model.impl.PollsVoteImpl
 * @see com.liferay.portlet.polls.model.impl.PollsVoteModelImpl
 * @generated
 */
public interface PollsVoteModel extends BaseModel<PollsVote>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a polls vote model instance should use the {@link PollsVote} interface instead.
     */

    /**
     * Returns the primary key of this polls vote.
     *
     * @return the primary key of this polls vote
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this polls vote.
     *
     * @param primaryKey the primary key of this polls vote
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this polls vote.
     *
     * @return the uuid of this polls vote
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this polls vote.
     *
     * @param uuid the uuid of this polls vote
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the vote ID of this polls vote.
     *
     * @return the vote ID of this polls vote
     */
    public long getVoteId();

    /**
     * Sets the vote ID of this polls vote.
     *
     * @param voteId the vote ID of this polls vote
     */
    public void setVoteId(Long voteId);

    /**
     * Returns the group ID of this polls vote.
     *
     * @return the group ID of this polls vote
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this polls vote.
     *
     * @param groupId the group ID of this polls vote
     */
    @Override
    public void setGroupId(Long groupId);

    /**
     * Returns the company ID of this polls vote.
     *
     * @return the company ID of this polls vote
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this polls vote.
     *
     * @param companyId the company ID of this polls vote
     */
    @Override
    public void setCompanyId(Long companyId);

    /**
     * Returns the user ID of this polls vote.
     *
     * @return the user ID of this polls vote
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this polls vote.
     *
     * @param userId the user ID of this polls vote
     */
    @Override
    public void setUserId(Long userId);

    /**
     * Returns the user uuid of this polls vote.
     *
     * @return the user uuid of this polls vote
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this polls vote.
     *
     * @param userUuid the user uuid of this polls vote
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this polls vote.
     *
     * @return the user name of this polls vote
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this polls vote.
     *
     * @param userName the user name of this polls vote
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this polls vote.
     *
     * @return the create date of this polls vote
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this polls vote.
     *
     * @param createDate the create date of this polls vote
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this polls vote.
     *
     * @return the modified date of this polls vote
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this polls vote.
     *
     * @param modifiedDate the modified date of this polls vote
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the question ID of this polls vote.
     *
     * @return the question ID of this polls vote
     */
    public long getQuestionId();

    /**
     * Sets the question ID of this polls vote.
     *
     * @param questionId the question ID of this polls vote
     */
    public void setQuestionId(Long questionId);

    /**
     * Returns the choice ID of this polls vote.
     *
     * @return the choice ID of this polls vote
     */
    public long getChoiceId();

    /**
     * Sets the choice ID of this polls vote.
     *
     * @param choiceId the choice ID of this polls vote
     */
    public void setChoiceId(Long choiceId);

    /**
     * Returns the vote date of this polls vote.
     *
     * @return the vote date of this polls vote
     */
    public Date getVoteDate();

    /**
     * Sets the vote date of this polls vote.
     *
     * @param voteDate the vote date of this polls vote
     */
    public void setVoteDate(Date voteDate);

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
    public int compareTo(com.liferay.portlet.polls.model.PollsVote pollsVote);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portlet.polls.model.PollsVote> toCacheModel();

    @Override
    public com.liferay.portlet.polls.model.PollsVote toEscapedModel();

    @Override
    public com.liferay.portlet.polls.model.PollsVote toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
