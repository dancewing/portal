package com.liferay.portlet.bookmarks.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.bookmarks.model.BookmarksEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BookmarksEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarksEntry
 * @generated
 */
public class BookmarksEntryCacheModel implements CacheModel<BookmarksEntry>,
    Externalizable {
    public String uuid;
    public long entryId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long resourceBlockId;
    public long folderId;
    public String treePath;
    public String name;
    public String url;
    public String description;
    public int visits;
    public int priority;
    public int status;
    public long statusByUserId;
    public String statusByUserName;
    public long statusDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(41);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", entryId=");
        sb.append(entryId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", resourceBlockId=");
        sb.append(resourceBlockId);
        sb.append(", folderId=");
        sb.append(folderId);
        sb.append(", treePath=");
        sb.append(treePath);
        sb.append(", name=");
        sb.append(name);
        sb.append(", url=");
        sb.append(url);
        sb.append(", description=");
        sb.append(description);
        sb.append(", visits=");
        sb.append(visits);
        sb.append(", priority=");
        sb.append(priority);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusByUserId=");
        sb.append(statusByUserId);
        sb.append(", statusByUserName=");
        sb.append(statusByUserName);
        sb.append(", statusDate=");
        sb.append(statusDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BookmarksEntry toEntityModel() {
        BookmarksEntryImpl bookmarksEntryImpl = new BookmarksEntryImpl();

        if (uuid == null) {
            bookmarksEntryImpl.setUuid(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setUuid(uuid);
        }

        bookmarksEntryImpl.setEntryId(entryId);
        bookmarksEntryImpl.setGroupId(groupId);
        bookmarksEntryImpl.setCompanyId(companyId);
        bookmarksEntryImpl.setUserId(userId);

        if (userName == null) {
            bookmarksEntryImpl.setUserName(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            bookmarksEntryImpl.setCreateDate(null);
        } else {
            bookmarksEntryImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            bookmarksEntryImpl.setModifiedDate(null);
        } else {
            bookmarksEntryImpl.setModifiedDate(new Date(modifiedDate));
        }

        bookmarksEntryImpl.setResourceBlockId(resourceBlockId);
        bookmarksEntryImpl.setFolderId(folderId);

        if (treePath == null) {
            bookmarksEntryImpl.setTreePath(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setTreePath(treePath);
        }

        if (name == null) {
            bookmarksEntryImpl.setName(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setName(name);
        }

        if (url == null) {
            bookmarksEntryImpl.setUrl(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setUrl(url);
        }

        if (description == null) {
            bookmarksEntryImpl.setDescription(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setDescription(description);
        }

        bookmarksEntryImpl.setVisits(visits);
        bookmarksEntryImpl.setPriority(priority);
        bookmarksEntryImpl.setStatus(status);
        bookmarksEntryImpl.setStatusByUserId(statusByUserId);

        if (statusByUserName == null) {
            bookmarksEntryImpl.setStatusByUserName(StringPool.BLANK);
        } else {
            bookmarksEntryImpl.setStatusByUserName(statusByUserName);
        }

        if (statusDate == Long.MIN_VALUE) {
            bookmarksEntryImpl.setStatusDate(null);
        } else {
            bookmarksEntryImpl.setStatusDate(new Date(statusDate));
        }

        bookmarksEntryImpl.resetOriginalValues();

        return bookmarksEntryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        entryId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        resourceBlockId = objectInput.readLong();
        folderId = objectInput.readLong();
        treePath = objectInput.readUTF();
        name = objectInput.readUTF();
        url = objectInput.readUTF();
        description = objectInput.readUTF();
        visits = objectInput.readInt();
        priority = objectInput.readInt();
        status = objectInput.readInt();
        statusByUserId = objectInput.readLong();
        statusByUserName = objectInput.readUTF();
        statusDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(entryId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(resourceBlockId);
        objectOutput.writeLong(folderId);

        if (treePath == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(treePath);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(url);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeInt(visits);
        objectOutput.writeInt(priority);
        objectOutput.writeInt(status);
        objectOutput.writeLong(statusByUserId);

        if (statusByUserName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(statusByUserName);
        }

        objectOutput.writeLong(statusDate);
    }
}
