package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.test.ExecutionTestListeners;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.service.ServiceTestUtil;
import com.liferay.portal.service.persistence.BasePersistence;
import com.liferay.portal.service.persistence.PersistenceExecutionTestListener;
import com.liferay.portal.test.LiferayPersistenceIntegrationJUnitTestRunner;
import com.liferay.portal.test.persistence.TransactionalPersistenceAdvice;

import com.liferay.portlet.softwarecatalog.NoSuchLicenseException;
import com.liferay.portlet.softwarecatalog.model.SCLicense;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;


@ExecutionTestListeners(listeners =  {
    PersistenceExecutionTestListener.class}
)
@RunWith(LiferayPersistenceIntegrationJUnitTestRunner.class)
public class SCLicensePersistenceTest {
    private static final Logger _log = LoggerFactory.getLogger(SCLicensePersistenceTest.class);
    private SCLicensePersistence _persistence = (SCLicensePersistence) PortalBeanLocatorUtil.locate(SCLicensePersistence.class.getName());
    private TransactionalPersistenceAdvice _transactionalPersistenceAdvice = (TransactionalPersistenceAdvice) PortalBeanLocatorUtil.locate(TransactionalPersistenceAdvice.class.getName());

    @After
    public void tearDown() throws Exception {
        Map<Serializable, BasePersistence<?>> basePersistences = _transactionalPersistenceAdvice.getBasePersistences();

        Set<Serializable> primaryKeys = basePersistences.keySet();

        for (Serializable primaryKey : primaryKeys) {
            BasePersistence<?> basePersistence = basePersistences.get(primaryKey);

            try {
                basePersistence.remove(primaryKey);
            } catch (Exception e) {
                if (_log.isDebugEnabled()) {
                    _log.debug("The model with primary key " + primaryKey +
                        " was already deleted");
                }
            }
        }

        _transactionalPersistenceAdvice.reset();
    }

    @Test
    public void testCreate() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        SCLicense scLicense = _persistence.create(pk);

        Assert.assertNotNull(scLicense);

        Assert.assertEquals(scLicense.getPrimaryKey(), pk);
    }

    @Test
    public void testRemove() throws Exception {
        SCLicense newSCLicense = addSCLicense();

        _persistence.remove(newSCLicense);

        SCLicense existingSCLicense = _persistence.fetchByPrimaryKey(newSCLicense.getPrimaryKey());

        Assert.assertNull(existingSCLicense);
    }

    @Test
    public void testUpdateNew() throws Exception {
        addSCLicense();
    }

    @Test
    public void testUpdateExisting() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        SCLicense newSCLicense = _persistence.create(pk);

        newSCLicense.setName(ServiceTestUtil.randomString());

        newSCLicense.setUrl(ServiceTestUtil.randomString());

        newSCLicense.setOpenSource(ServiceTestUtil.randomBoolean());

        newSCLicense.setActive(ServiceTestUtil.randomBoolean());

        newSCLicense.setRecommended(ServiceTestUtil.randomBoolean());

        _persistence.update(newSCLicense);

        SCLicense existingSCLicense = _persistence.findByPrimaryKey(newSCLicense.getPrimaryKey());

        Assert.assertEquals(existingSCLicense.getLicenseId(),
            newSCLicense.getLicenseId());
        Assert.assertEquals(existingSCLicense.getName(), newSCLicense.getName());
        Assert.assertEquals(existingSCLicense.getUrl(), newSCLicense.getUrl());
        Assert.assertEquals(existingSCLicense.getOpenSource(),
            newSCLicense.getOpenSource());
        Assert.assertEquals(existingSCLicense.getActive(),
            newSCLicense.getActive());
        Assert.assertEquals(existingSCLicense.getRecommended(),
            newSCLicense.getRecommended());
    }

    @Test
    public void testFindByPrimaryKeyExisting() throws Exception {
        SCLicense newSCLicense = addSCLicense();

        SCLicense existingSCLicense = _persistence.findByPrimaryKey(newSCLicense.getPrimaryKey());

        Assert.assertEquals(existingSCLicense, newSCLicense);
    }

    @Test
    public void testFindByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        try {
            _persistence.findByPrimaryKey(pk);

            Assert.fail("Missing entity did not throw NoSuchLicenseException");
        } catch (NoSuchLicenseException nsee) {
        }
    }

    @Test
    public void testFindAll() throws Exception {
        try {
            _persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                getOrderByComparator());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    protected OrderByComparator getOrderByComparator() {
        return OrderByComparatorFactoryUtil.create("SCLicense", "licenseId",
            true, "name", true, "url", true, "openSource", true, "active",
            true, "recommended", true);
    }

    @Test
    public void testFetchByPrimaryKeyExisting() throws Exception {
        SCLicense newSCLicense = addSCLicense();

        SCLicense existingSCLicense = _persistence.fetchByPrimaryKey(newSCLicense.getPrimaryKey());

        Assert.assertEquals(existingSCLicense, newSCLicense);
    }

    @Test
    public void testFetchByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        SCLicense missingSCLicense = _persistence.fetchByPrimaryKey(pk);

        Assert.assertNull(missingSCLicense);
    }

    @Test
    public void testActionableDynamicQuery() throws Exception {
        final IntegerWrapper count = new IntegerWrapper();

        ActionableDynamicQuery actionableDynamicQuery = new SCLicenseActionableDynamicQuery() {
                @Override
                protected void performAction(Object object) {
                    SCLicense scLicense = (SCLicense) object;

                    Assert.assertNotNull(scLicense);

                    count.increment();
                }
            };

        actionableDynamicQuery.performActions();

        Assert.assertEquals(count.getValue(), _persistence.countAll());
    }

    @Test
    public void testDynamicQueryByPrimaryKeyExisting()
        throws Exception {
        SCLicense newSCLicense = addSCLicense();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(SCLicense.class,
                SCLicense.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("licenseId",
                newSCLicense.getLicenseId()));

        List<SCLicense> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        SCLicense existingSCLicense = result.get(0);

        Assert.assertEquals(existingSCLicense, newSCLicense);
    }

    @Test
    public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(SCLicense.class,
                SCLicense.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("licenseId",
                ServiceTestUtil.nextLong()));

        List<SCLicense> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testDynamicQueryByProjectionExisting()
        throws Exception {
        SCLicense newSCLicense = addSCLicense();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(SCLicense.class,
                SCLicense.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property("licenseId"));

        Object newLicenseId = newSCLicense.getLicenseId();

        dynamicQuery.add(RestrictionsFactoryUtil.in("licenseId",
                new Object[] { newLicenseId }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        Object existingLicenseId = result.get(0);

        Assert.assertEquals(existingLicenseId, newLicenseId);
    }

    @Test
    public void testDynamicQueryByProjectionMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(SCLicense.class,
                SCLicense.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property("licenseId"));

        dynamicQuery.add(RestrictionsFactoryUtil.in("licenseId",
                new Object[] { ServiceTestUtil.nextLong() }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    protected SCLicense addSCLicense() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        SCLicense scLicense = _persistence.create(pk);

        scLicense.setName(ServiceTestUtil.randomString());

        scLicense.setUrl(ServiceTestUtil.randomString());

        scLicense.setOpenSource(ServiceTestUtil.randomBoolean());

        scLicense.setActive(ServiceTestUtil.randomBoolean());

        scLicense.setRecommended(ServiceTestUtil.randomBoolean());

        _persistence.update(scLicense);

        return scLicense;
    }
}
