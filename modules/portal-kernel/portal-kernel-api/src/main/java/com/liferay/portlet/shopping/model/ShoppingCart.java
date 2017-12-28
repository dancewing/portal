package com.liferay.portlet.shopping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ShoppingCart service. Represents a row in the &quot;ShoppingCart&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCartModel
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCartImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingCartModelImpl
 * @generated
 */
@ProviderType
public interface ShoppingCart extends ShoppingCartModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.shopping.model.impl.ShoppingCartImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public void addItemId(long itemId, java.lang.String fields);

    public com.liferay.portlet.shopping.model.ShoppingCoupon getCoupon()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.Map<com.liferay.portlet.shopping.model.ShoppingCartItem, java.lang.Integer> getItems()
        throws com.liferay.portal.kernel.exception.SystemException;

    public int getItemsSize();
}
