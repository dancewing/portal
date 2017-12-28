package com.liferay.portlet.flags.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.GroupFinder;
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.LayoutFinder;
import com.liferay.portal.service.persistence.LayoutPersistence;
import com.liferay.portal.service.persistence.RoleFinder;
import com.liferay.portal.service.persistence.RolePersistence;
import com.liferay.portal.service.persistence.UserFinder;
import com.liferay.portal.service.persistence.UserGroupFinder;
import com.liferay.portal.service.persistence.UserGroupPersistence;
import com.liferay.portal.service.persistence.UserGroupRoleFinder;
import com.liferay.portal.service.persistence.UserGroupRolePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryFinder;
import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;
import com.liferay.portlet.flags.service.FlagsEntryService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the flags entry remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.portlet.flags.service.impl.FlagsEntryServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.flags.service.impl.FlagsEntryServiceImpl
 * @see com.liferay.portlet.flags.service.FlagsEntryServiceUtil
 * @generated
 */
public abstract class FlagsEntryServiceBaseImpl extends BaseServiceImpl
    implements FlagsEntryService, IdentifiableBean {
    @BeanReference(type = com.liferay.portlet.flags.service.FlagsEntryService.class)
    protected com.liferay.portlet.flags.service.FlagsEntryService flagsEntryService;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.mail.service.MailService.class)
    protected com.liferay.mail.service.MailService mailService;
    @BeanReference(type = com.liferay.portal.service.CompanyLocalService.class)
    protected com.liferay.portal.service.CompanyLocalService companyLocalService;
    @BeanReference(type = com.liferay.portal.service.CompanyService.class)
    protected com.liferay.portal.service.CompanyService companyService;
    @BeanReference(type = CompanyPersistence.class)
    protected CompanyPersistence companyPersistence;
    @BeanReference(type = com.liferay.portal.service.GroupLocalService.class)
    protected com.liferay.portal.service.GroupLocalService groupLocalService;
    @BeanReference(type = com.liferay.portal.service.GroupService.class)
    protected com.liferay.portal.service.GroupService groupService;
    @BeanReference(type = GroupPersistence.class)
    protected GroupPersistence groupPersistence;
    @BeanReference(type = GroupFinder.class)
    protected GroupFinder groupFinder;
    @BeanReference(type = com.liferay.portal.service.LayoutLocalService.class)
    protected com.liferay.portal.service.LayoutLocalService layoutLocalService;
    @BeanReference(type = com.liferay.portal.service.LayoutService.class)
    protected com.liferay.portal.service.LayoutService layoutService;
    @BeanReference(type = LayoutPersistence.class)
    protected LayoutPersistence layoutPersistence;
    @BeanReference(type = LayoutFinder.class)
    protected LayoutFinder layoutFinder;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.RoleLocalService.class)
    protected com.liferay.portal.service.RoleLocalService roleLocalService;
    @BeanReference(type = com.liferay.portal.service.RoleService.class)
    protected com.liferay.portal.service.RoleService roleService;
    @BeanReference(type = RolePersistence.class)
    protected RolePersistence rolePersistence;
    @BeanReference(type = RoleFinder.class)
    protected RoleFinder roleFinder;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    @BeanReference(type = UserFinder.class)
    protected UserFinder userFinder;
    @BeanReference(type = com.liferay.portal.service.UserGroupLocalService.class)
    protected com.liferay.portal.service.UserGroupLocalService userGroupLocalService;
    @BeanReference(type = com.liferay.portal.service.UserGroupService.class)
    protected com.liferay.portal.service.UserGroupService userGroupService;
    @BeanReference(type = UserGroupPersistence.class)
    protected UserGroupPersistence userGroupPersistence;
    @BeanReference(type = UserGroupFinder.class)
    protected UserGroupFinder userGroupFinder;
    @BeanReference(type = com.liferay.portal.service.UserGroupRoleLocalService.class)
    protected com.liferay.portal.service.UserGroupRoleLocalService userGroupRoleLocalService;
    @BeanReference(type = com.liferay.portal.service.UserGroupRoleService.class)
    protected com.liferay.portal.service.UserGroupRoleService userGroupRoleService;
    @BeanReference(type = UserGroupRolePersistence.class)
    protected UserGroupRolePersistence userGroupRolePersistence;
    @BeanReference(type = UserGroupRoleFinder.class)
    protected UserGroupRoleFinder userGroupRoleFinder;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
    protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
    protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
    @BeanReference(type = AssetEntryPersistence.class)
    protected AssetEntryPersistence assetEntryPersistence;
    @BeanReference(type = AssetEntryFinder.class)
    protected AssetEntryFinder assetEntryFinder;
    private String _beanIdentifier;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.liferay.portlet.flags.service.FlagsEntryServiceUtil} to access the flags entry remote service.
     */

    /**
     * Returns the flags entry remote service.
     *
     * @return the flags entry remote service
     */
    public com.liferay.portlet.flags.service.FlagsEntryService getFlagsEntryService() {
        return flagsEntryService;
    }

    /**
     * Sets the flags entry remote service.
     *
     * @param flagsEntryService the flags entry remote service
     */
    public void setFlagsEntryService(
        com.liferay.portlet.flags.service.FlagsEntryService flagsEntryService) {
        this.flagsEntryService = flagsEntryService;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the mail remote service.
     *
     * @return the mail remote service
     */
    public com.liferay.mail.service.MailService getMailService() {
        return mailService;
    }

    /**
     * Sets the mail remote service.
     *
     * @param mailService the mail remote service
     */
    public void setMailService(com.liferay.mail.service.MailService mailService) {
        this.mailService = mailService;
    }

    /**
     * Returns the company local service.
     *
     * @return the company local service
     */
    public com.liferay.portal.service.CompanyLocalService getCompanyLocalService() {
        return companyLocalService;
    }

    /**
     * Sets the company local service.
     *
     * @param companyLocalService the company local service
     */
    public void setCompanyLocalService(
        com.liferay.portal.service.CompanyLocalService companyLocalService) {
        this.companyLocalService = companyLocalService;
    }

    /**
     * Returns the company remote service.
     *
     * @return the company remote service
     */
    public com.liferay.portal.service.CompanyService getCompanyService() {
        return companyService;
    }

    /**
     * Sets the company remote service.
     *
     * @param companyService the company remote service
     */
    public void setCompanyService(
        com.liferay.portal.service.CompanyService companyService) {
        this.companyService = companyService;
    }

    /**
     * Returns the company persistence.
     *
     * @return the company persistence
     */
    public CompanyPersistence getCompanyPersistence() {
        return companyPersistence;
    }

    /**
     * Sets the company persistence.
     *
     * @param companyPersistence the company persistence
     */
    public void setCompanyPersistence(CompanyPersistence companyPersistence) {
        this.companyPersistence = companyPersistence;
    }

    /**
     * Returns the group local service.
     *
     * @return the group local service
     */
    public com.liferay.portal.service.GroupLocalService getGroupLocalService() {
        return groupLocalService;
    }

    /**
     * Sets the group local service.
     *
     * @param groupLocalService the group local service
     */
    public void setGroupLocalService(
        com.liferay.portal.service.GroupLocalService groupLocalService) {
        this.groupLocalService = groupLocalService;
    }

    /**
     * Returns the group remote service.
     *
     * @return the group remote service
     */
    public com.liferay.portal.service.GroupService getGroupService() {
        return groupService;
    }

    /**
     * Sets the group remote service.
     *
     * @param groupService the group remote service
     */
    public void setGroupService(
        com.liferay.portal.service.GroupService groupService) {
        this.groupService = groupService;
    }

    /**
     * Returns the group persistence.
     *
     * @return the group persistence
     */
    public GroupPersistence getGroupPersistence() {
        return groupPersistence;
    }

    /**
     * Sets the group persistence.
     *
     * @param groupPersistence the group persistence
     */
    public void setGroupPersistence(GroupPersistence groupPersistence) {
        this.groupPersistence = groupPersistence;
    }

    /**
     * Returns the group finder.
     *
     * @return the group finder
     */
    public GroupFinder getGroupFinder() {
        return groupFinder;
    }

    /**
     * Sets the group finder.
     *
     * @param groupFinder the group finder
     */
    public void setGroupFinder(GroupFinder groupFinder) {
        this.groupFinder = groupFinder;
    }

    /**
     * Returns the layout local service.
     *
     * @return the layout local service
     */
    public com.liferay.portal.service.LayoutLocalService getLayoutLocalService() {
        return layoutLocalService;
    }

    /**
     * Sets the layout local service.
     *
     * @param layoutLocalService the layout local service
     */
    public void setLayoutLocalService(
        com.liferay.portal.service.LayoutLocalService layoutLocalService) {
        this.layoutLocalService = layoutLocalService;
    }

    /**
     * Returns the layout remote service.
     *
     * @return the layout remote service
     */
    public com.liferay.portal.service.LayoutService getLayoutService() {
        return layoutService;
    }

    /**
     * Sets the layout remote service.
     *
     * @param layoutService the layout remote service
     */
    public void setLayoutService(
        com.liferay.portal.service.LayoutService layoutService) {
        this.layoutService = layoutService;
    }

    /**
     * Returns the layout persistence.
     *
     * @return the layout persistence
     */
    public LayoutPersistence getLayoutPersistence() {
        return layoutPersistence;
    }

    /**
     * Sets the layout persistence.
     *
     * @param layoutPersistence the layout persistence
     */
    public void setLayoutPersistence(LayoutPersistence layoutPersistence) {
        this.layoutPersistence = layoutPersistence;
    }

    /**
     * Returns the layout finder.
     *
     * @return the layout finder
     */
    public LayoutFinder getLayoutFinder() {
        return layoutFinder;
    }

    /**
     * Sets the layout finder.
     *
     * @param layoutFinder the layout finder
     */
    public void setLayoutFinder(LayoutFinder layoutFinder) {
        this.layoutFinder = layoutFinder;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the role local service.
     *
     * @return the role local service
     */
    public com.liferay.portal.service.RoleLocalService getRoleLocalService() {
        return roleLocalService;
    }

    /**
     * Sets the role local service.
     *
     * @param roleLocalService the role local service
     */
    public void setRoleLocalService(
        com.liferay.portal.service.RoleLocalService roleLocalService) {
        this.roleLocalService = roleLocalService;
    }

    /**
     * Returns the role remote service.
     *
     * @return the role remote service
     */
    public com.liferay.portal.service.RoleService getRoleService() {
        return roleService;
    }

    /**
     * Sets the role remote service.
     *
     * @param roleService the role remote service
     */
    public void setRoleService(
        com.liferay.portal.service.RoleService roleService) {
        this.roleService = roleService;
    }

    /**
     * Returns the role persistence.
     *
     * @return the role persistence
     */
    public RolePersistence getRolePersistence() {
        return rolePersistence;
    }

    /**
     * Sets the role persistence.
     *
     * @param rolePersistence the role persistence
     */
    public void setRolePersistence(RolePersistence rolePersistence) {
        this.rolePersistence = rolePersistence;
    }

    /**
     * Returns the role finder.
     *
     * @return the role finder
     */
    public RoleFinder getRoleFinder() {
        return roleFinder;
    }

    /**
     * Sets the role finder.
     *
     * @param roleFinder the role finder
     */
    public void setRoleFinder(RoleFinder roleFinder) {
        this.roleFinder = roleFinder;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Returns the user finder.
     *
     * @return the user finder
     */
    public UserFinder getUserFinder() {
        return userFinder;
    }

    /**
     * Sets the user finder.
     *
     * @param userFinder the user finder
     */
    public void setUserFinder(UserFinder userFinder) {
        this.userFinder = userFinder;
    }

    /**
     * Returns the user group local service.
     *
     * @return the user group local service
     */
    public com.liferay.portal.service.UserGroupLocalService getUserGroupLocalService() {
        return userGroupLocalService;
    }

    /**
     * Sets the user group local service.
     *
     * @param userGroupLocalService the user group local service
     */
    public void setUserGroupLocalService(
        com.liferay.portal.service.UserGroupLocalService userGroupLocalService) {
        this.userGroupLocalService = userGroupLocalService;
    }

    /**
     * Returns the user group remote service.
     *
     * @return the user group remote service
     */
    public com.liferay.portal.service.UserGroupService getUserGroupService() {
        return userGroupService;
    }

    /**
     * Sets the user group remote service.
     *
     * @param userGroupService the user group remote service
     */
    public void setUserGroupService(
        com.liferay.portal.service.UserGroupService userGroupService) {
        this.userGroupService = userGroupService;
    }

    /**
     * Returns the user group persistence.
     *
     * @return the user group persistence
     */
    public UserGroupPersistence getUserGroupPersistence() {
        return userGroupPersistence;
    }

    /**
     * Sets the user group persistence.
     *
     * @param userGroupPersistence the user group persistence
     */
    public void setUserGroupPersistence(
        UserGroupPersistence userGroupPersistence) {
        this.userGroupPersistence = userGroupPersistence;
    }

    /**
     * Returns the user group finder.
     *
     * @return the user group finder
     */
    public UserGroupFinder getUserGroupFinder() {
        return userGroupFinder;
    }

    /**
     * Sets the user group finder.
     *
     * @param userGroupFinder the user group finder
     */
    public void setUserGroupFinder(UserGroupFinder userGroupFinder) {
        this.userGroupFinder = userGroupFinder;
    }

    /**
     * Returns the user group role local service.
     *
     * @return the user group role local service
     */
    public com.liferay.portal.service.UserGroupRoleLocalService getUserGroupRoleLocalService() {
        return userGroupRoleLocalService;
    }

    /**
     * Sets the user group role local service.
     *
     * @param userGroupRoleLocalService the user group role local service
     */
    public void setUserGroupRoleLocalService(
        com.liferay.portal.service.UserGroupRoleLocalService userGroupRoleLocalService) {
        this.userGroupRoleLocalService = userGroupRoleLocalService;
    }

    /**
     * Returns the user group role remote service.
     *
     * @return the user group role remote service
     */
    public com.liferay.portal.service.UserGroupRoleService getUserGroupRoleService() {
        return userGroupRoleService;
    }

    /**
     * Sets the user group role remote service.
     *
     * @param userGroupRoleService the user group role remote service
     */
    public void setUserGroupRoleService(
        com.liferay.portal.service.UserGroupRoleService userGroupRoleService) {
        this.userGroupRoleService = userGroupRoleService;
    }

    /**
     * Returns the user group role persistence.
     *
     * @return the user group role persistence
     */
    public UserGroupRolePersistence getUserGroupRolePersistence() {
        return userGroupRolePersistence;
    }

    /**
     * Sets the user group role persistence.
     *
     * @param userGroupRolePersistence the user group role persistence
     */
    public void setUserGroupRolePersistence(
        UserGroupRolePersistence userGroupRolePersistence) {
        this.userGroupRolePersistence = userGroupRolePersistence;
    }

    /**
     * Returns the user group role finder.
     *
     * @return the user group role finder
     */
    public UserGroupRoleFinder getUserGroupRoleFinder() {
        return userGroupRoleFinder;
    }

    /**
     * Sets the user group role finder.
     *
     * @param userGroupRoleFinder the user group role finder
     */
    public void setUserGroupRoleFinder(UserGroupRoleFinder userGroupRoleFinder) {
        this.userGroupRoleFinder = userGroupRoleFinder;
    }

    /**
     * Returns the asset entry local service.
     *
     * @return the asset entry local service
     */
    public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
        return assetEntryLocalService;
    }

    /**
     * Sets the asset entry local service.
     *
     * @param assetEntryLocalService the asset entry local service
     */
    public void setAssetEntryLocalService(
        com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
        this.assetEntryLocalService = assetEntryLocalService;
    }

    /**
     * Returns the asset entry remote service.
     *
     * @return the asset entry remote service
     */
    public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
        return assetEntryService;
    }

    /**
     * Sets the asset entry remote service.
     *
     * @param assetEntryService the asset entry remote service
     */
    public void setAssetEntryService(
        com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
        this.assetEntryService = assetEntryService;
    }

    /**
     * Returns the asset entry persistence.
     *
     * @return the asset entry persistence
     */
    public AssetEntryPersistence getAssetEntryPersistence() {
        return assetEntryPersistence;
    }

    /**
     * Sets the asset entry persistence.
     *
     * @param assetEntryPersistence the asset entry persistence
     */
    public void setAssetEntryPersistence(
        AssetEntryPersistence assetEntryPersistence) {
        this.assetEntryPersistence = assetEntryPersistence;
    }

    /**
     * Returns the asset entry finder.
     *
     * @return the asset entry finder
     */
    public AssetEntryFinder getAssetEntryFinder() {
        return assetEntryFinder;
    }

    /**
     * Sets the asset entry finder.
     *
     * @param assetEntryFinder the asset entry finder
     */
    public void setAssetEntryFinder(AssetEntryFinder assetEntryFinder) {
        this.assetEntryFinder = assetEntryFinder;
    }

    public void afterPropertiesSet() {
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = InfrastructureUtil.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
