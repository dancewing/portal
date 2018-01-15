package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ThemeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ThemeLocalService
 * @generated
 */
public class ThemeLocalServiceWrapper implements ThemeLocalService,
    ServiceWrapper<ThemeLocalService> {
    private ThemeLocalService _themeLocalService;

    public ThemeLocalServiceWrapper(ThemeLocalService themeLocalService) {
        _themeLocalService = themeLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _themeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _themeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.ColorScheme fetchColorScheme(
        long companyId, java.lang.String themeId, java.lang.String colorSchemeId) {
        return _themeLocalService.fetchColorScheme(companyId, themeId,
            colorSchemeId);
    }

    @Override
    public com.liferay.portal.model.Theme fetchTheme(long companyId,
        java.lang.String themeId) {
        return _themeLocalService.fetchTheme(companyId, themeId);
    }

    @Override
    public com.liferay.portal.model.ColorScheme getColorScheme(long companyId,
        java.lang.String themeId, java.lang.String colorSchemeId,
        boolean wapTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _themeLocalService.getColorScheme(companyId, themeId,
            colorSchemeId, wapTheme);
    }

    @Override
    public com.liferay.portal.model.Theme getTheme(long companyId,
        java.lang.String themeId, boolean wapTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _themeLocalService.getTheme(companyId, themeId, wapTheme);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Theme> getThemes(
        long companyId) {
        return _themeLocalService.getThemes(companyId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Theme> getThemes(
        long companyId, long groupId, long userId, boolean wapTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _themeLocalService.getThemes(companyId, groupId, userId, wapTheme);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Theme> getWARThemes() {
        return _themeLocalService.getWARThemes();
    }

    @Override
    public java.util.List<com.liferay.portal.model.Theme> init(
        javax.servlet.ServletContext servletContext,
        java.lang.String themesPath, boolean loadFromServletContext,
        java.lang.String[] xmls,
        com.liferay.portal.kernel.plugin.PluginPackage pluginPackage) {
        return _themeLocalService.init(servletContext, themesPath,
            loadFromServletContext, xmls, pluginPackage);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Theme> init(
        java.lang.String servletContextName,
        javax.servlet.ServletContext servletContext,
        java.lang.String themesPath, boolean loadFromServletContext,
        java.lang.String[] xmls,
        com.liferay.portal.kernel.plugin.PluginPackage pluginPackage) {
        return _themeLocalService.init(servletContextName, servletContext,
            themesPath, loadFromServletContext, xmls, pluginPackage);
    }

    @Override
    public void uninstallThemes(
        java.util.List<com.liferay.portal.model.Theme> themes) {
        _themeLocalService.uninstallThemes(themes);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ThemeLocalService getWrappedThemeLocalService() {
        return _themeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedThemeLocalService(ThemeLocalService themeLocalService) {
        _themeLocalService = themeLocalService;
    }

    @Override
    public ThemeLocalService getWrappedService() {
        return _themeLocalService;
    }

    @Override
    public void setWrappedService(ThemeLocalService themeLocalService) {
        _themeLocalService = themeLocalService;
    }
}
