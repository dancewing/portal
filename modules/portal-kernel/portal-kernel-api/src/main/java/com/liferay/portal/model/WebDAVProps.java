package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the WebDAVProps service. Represents a row in the &quot;WebDAVProps&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WebDAVPropsModel
 * @see com.liferay.portal.model.impl.WebDAVPropsImpl
 * @see com.liferay.portal.model.impl.WebDAVPropsModelImpl
 * @generated
 */
public interface WebDAVProps extends WebDAVPropsModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.WebDAVPropsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public void addProp(java.lang.String name, java.lang.String prefix,
        java.lang.String uri) throws java.lang.Exception;

    public void addProp(java.lang.String name, java.lang.String prefix,
        java.lang.String uri, java.lang.String text) throws java.lang.Exception;

    public java.util.Set<com.liferay.portal.kernel.xml.QName> getPropsSet()
        throws java.lang.Exception;

    public java.lang.String getText(java.lang.String name,
        java.lang.String prefix, java.lang.String uri)
        throws java.lang.Exception;

    public void removeProp(java.lang.String name, java.lang.String prefix,
        java.lang.String uri) throws java.lang.Exception;

    public void store() throws java.lang.Exception;
}
