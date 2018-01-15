package com.liferay.portlet.ratings.service.persistence;

public interface RatingsStatsFinder {
    public java.util.List<com.liferay.portlet.ratings.model.RatingsStats> findByC_C(
        long classNameId, java.util.List<java.lang.Long> classPKs)
        throws com.liferay.portal.kernel.exception.SystemException;
}
