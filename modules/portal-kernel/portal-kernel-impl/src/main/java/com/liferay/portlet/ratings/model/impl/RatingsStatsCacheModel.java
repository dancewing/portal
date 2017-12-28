package com.liferay.portlet.ratings.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.ratings.model.RatingsStats;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RatingsStats in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RatingsStats
 * @generated
 */
public class RatingsStatsCacheModel implements CacheModel<RatingsStats>,
    Externalizable {
    public long statsId;
    public long classNameId;
    public long classPK;
    public int totalEntries;
    public double totalScore;
    public double averageScore;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{statsId=");
        sb.append(statsId);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", classPK=");
        sb.append(classPK);
        sb.append(", totalEntries=");
        sb.append(totalEntries);
        sb.append(", totalScore=");
        sb.append(totalScore);
        sb.append(", averageScore=");
        sb.append(averageScore);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RatingsStats toEntityModel() {
        RatingsStatsImpl ratingsStatsImpl = new RatingsStatsImpl();

        ratingsStatsImpl.setStatsId(statsId);
        ratingsStatsImpl.setClassNameId(classNameId);
        ratingsStatsImpl.setClassPK(classPK);
        ratingsStatsImpl.setTotalEntries(totalEntries);
        ratingsStatsImpl.setTotalScore(totalScore);
        ratingsStatsImpl.setAverageScore(averageScore);

        ratingsStatsImpl.resetOriginalValues();

        return ratingsStatsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        statsId = objectInput.readLong();
        classNameId = objectInput.readLong();
        classPK = objectInput.readLong();
        totalEntries = objectInput.readInt();
        totalScore = objectInput.readDouble();
        averageScore = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(statsId);
        objectOutput.writeLong(classNameId);
        objectOutput.writeLong(classPK);
        objectOutput.writeInt(totalEntries);
        objectOutput.writeDouble(totalScore);
        objectOutput.writeDouble(averageScore);
    }
}
