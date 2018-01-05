package com.liferay.portlet.shopping.service.persistence;

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

import com.liferay.portlet.shopping.NoSuchItemFieldException;
import com.liferay.portlet.shopping.model.ShoppingItemField;

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
public class ShoppingItemFieldPersistenceTest {
    private static final Logger _log = LoggerFactory.getLogger(ShoppingItemFieldPersistenceTest.class);
    private ShoppingItemFieldPersistence _persistence = (ShoppingItemFieldPersistence) PortalBeanLocatorUtil.locate(ShoppingItemFieldPersistence.class.getName());
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

        ShoppingItemField shoppingItemField = _persistence.create(pk);

        Assert.assertNotNull(shoppingItemField);

        Assert.assertEquals(shoppingItemField.getPrimaryKey(), pk);
    }

    @Test
    public void testRemove() throws Exception {
        ShoppingItemField newShoppingItemField = addShoppingItemField();

        _persistence.remove(newShoppingItemField);

        ShoppingItemField existingShoppingItemField = _persistence.fetchByPrimaryKey(newShoppingItemField.getPrimaryKey());

        Assert.assertNull(existingShoppingItemField);
    }

    @Test
    public void testUpdateNew() throws Exception {
        addShoppingItemField();
    }

    @Test
    public void testUpdateExisting() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        ShoppingItemField newShoppingItemField = _persistence.create(pk);

        newShoppingItemField.setItemId(ServiceTestUtil.nextLong());

        newShoppingItemField.setName(ServiceTestUtil.randomString());

        newShoppingItemField.setValues(ServiceTestUtil.randomString());

        newShoppingItemField.setDescription(ServiceTestUtil.randomString());

        _persistence.update(newShoppingItemField);

        ShoppingItemField existingShoppingItemField = _persistence.findByPrimaryKey(newShoppingItemField.getPrimaryKey());

        Assert.assertEquals(existingShoppingItemField.getItemFieldId(),
            newShoppingItemField.getItemFieldId());
        Assert.assertEquals(existingShoppingItemField.getItemId(),
            newShoppingItemField.getItemId());
        Assert.assertEquals(existingShoppingItemField.getName(),
            newShoppingItemField.getName());
        Assert.assertEquals(existingShoppingItemField.getValues(),
            newShoppingItemField.getValues());
        Assert.assertEquals(existingShoppingItemField.getDescription(),
            newShoppingItemField.getDescription());
    }

    @Test
    public void testFindByPrimaryKeyExisting() throws Exception {
        ShoppingItemField newShoppingItemField = addShoppingItemField();

        ShoppingItemField existingShoppingItemField = _persistence.findByPrimaryKey(newShoppingItemField.getPrimaryKey());

        Assert.assertEquals(existingShoppingItemField, newShoppingItemField);
    }

    @Test
    public void testFindByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        try {
            _persistence.findByPrimaryKey(pk);

            Assert.fail("Missing entity did not throw NoSuchItemFieldException");
        } catch (NoSuchItemFieldException nsee) {
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
        return OrderByComparatorFactoryUtil.create("ShoppingItemField",
            "itemFieldId", true, "itemId", true, "name", true, "values", true,
            "description", true);
    }

    @Test
    public void testFetchByPrimaryKeyExisting() throws Exception {
        ShoppingItemField newShoppingItemField = addShoppingItemField();

        ShoppingItemField existingShoppingItemField = _persistence.fetchByPrimaryKey(newShoppingItemField.getPrimaryKey());

        Assert.assertEquals(existingShoppingItemField, newShoppingItemField);
    }

    @Test
    public void testFetchByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        ShoppingItemField missingShoppingItemField = _persistence.fetchByPrimaryKey(pk);

        Assert.assertNull(missingShoppingItemField);
    }

    @Test
    public void testActionableDynamicQuery() throws Exception {
        final IntegerWrapper count = new IntegerWrapper();

        ActionableDynamicQuery actionableDynamicQuery = new ShoppingItemFieldActionableDynamicQuery() {
                @Override
                protected void performAction(Object object) {
                    ShoppingItemField shoppingItemField = (ShoppingItemField) object;

                    Assert.assertNotNull(shoppingItemField);

                    count.increment();
                }
            };

        actionableDynamicQuery.performActions();

        Assert.assertEquals(count.getValue(), _persistence.countAll());
    }

    @Test
    public void testDynamicQueryByPrimaryKeyExisting()
        throws Exception {
        ShoppingItemField newShoppingItemField = addShoppingItemField();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ShoppingItemField.class,
                ShoppingItemField.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("itemFieldId",
                newShoppingItemField.getItemFieldId()));

        List<ShoppingItemField> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        ShoppingItemField existingShoppingItemField = result.get(0);

        Assert.assertEquals(existingShoppingItemField, newShoppingItemField);
    }

    @Test
    public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ShoppingItemField.class,
                ShoppingItemField.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("itemFieldId",
                ServiceTestUtil.nextLong()));

        List<ShoppingItemField> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testDynamicQueryByProjectionExisting()
        throws Exception {
        ShoppingItemField newShoppingItemField = addShoppingItemField();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ShoppingItemField.class,
                ShoppingItemField.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property("itemFieldId"));

        Object newItemFieldId = newShoppingItemField.getItemFieldId();

        dynamicQuery.add(RestrictionsFactoryUtil.in("itemFieldId",
                new Object[] { newItemFieldId }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        Object existingItemFieldId = result.get(0);

        Assert.assertEquals(existingItemFieldId, newItemFieldId);
    }

    @Test
    public void testDynamicQueryByProjectionMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(ShoppingItemField.class,
                ShoppingItemField.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property("itemFieldId"));

        dynamicQuery.add(RestrictionsFactoryUtil.in("itemFieldId",
                new Object[] { ServiceTestUtil.nextLong() }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    protected ShoppingItemField addShoppingItemField()
        throws Exception {
        long pk = ServiceTestUtil.nextLong();

        ShoppingItemField shoppingItemField = _persistence.create(pk);

        shoppingItemField.setItemId(ServiceTestUtil.nextLong());

        shoppingItemField.setName(ServiceTestUtil.randomString());

        shoppingItemField.setValues(ServiceTestUtil.randomString());

        shoppingItemField.setDescription(ServiceTestUtil.randomString());

        _persistence.update(shoppingItemField);

        return shoppingItemField;
    }
}
