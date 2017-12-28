package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ImageService}.
 *
 * @author Brian Wing Shun Chan
 * @see ImageService
 * @generated
 */
@ProviderType
public class ImageServiceWrapper implements ImageService,
    ServiceWrapper<ImageService> {
    private ImageService _imageService;

    public ImageServiceWrapper(ImageService imageService) {
        _imageService = imageService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _imageService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _imageService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.Image getImage(long imageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _imageService.getImage(imageId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ImageService getWrappedImageService() {
        return _imageService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedImageService(ImageService imageService) {
        _imageService = imageService;
    }

    @Override
    public ImageService getWrappedService() {
        return _imageService;
    }

    @Override
    public void setWrappedService(ImageService imageService) {
        _imageService = imageService;
    }
}
