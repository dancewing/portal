package com.liferay.portal.workflow.kaleo.designer.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.workflow.kaleo.designer.model.KaleoDraftDefinition;
import com.liferay.portal.workflow.kaleo.designer.service.KaleoDraftDefinitionLocalServiceUtil;

public class KaleoDraftDefinitionPermission
{
  public static void check(PermissionChecker permissionChecker, KaleoDraftDefinition kaleoDraftDefinition, String actionId)
    throws PortalException
  {
    if (!contains(permissionChecker, kaleoDraftDefinition, actionId))
      throw new PrincipalException();
  }

  public static void check(PermissionChecker permissionChecker, long kaleoDraftDefinitionId, String actionId)
    throws PortalException, SystemException
  {
    if (!contains(permissionChecker, kaleoDraftDefinitionId, actionId))
      throw new PrincipalException();
  }

  public static boolean contains(PermissionChecker permissionChecker, KaleoDraftDefinition kaleoDraftDefinition, String actionId)
  {
    if (permissionChecker.hasOwnerPermission(
      kaleoDraftDefinition.getCompanyId(), 
      KaleoDraftDefinition.class.getName(), 
      kaleoDraftDefinition.getKaleoDraftDefinitionId(), 
      kaleoDraftDefinition.getUserId(), actionId))
    {
      return true;
    }

    return permissionChecker.hasPermission(
      kaleoDraftDefinition.getGroupId(), 
      KaleoDraftDefinition.class.getName(), 
      kaleoDraftDefinition.getKaleoDraftDefinitionId(), actionId);
  }

  public static boolean contains(PermissionChecker permissionChecker, long kaleoDraftDefinitionId, String actionId)
    throws PortalException, SystemException
  {
    KaleoDraftDefinition kaleoDraftDefinition = 
      KaleoDraftDefinitionLocalServiceUtil.getKaleoDraftDefinition(
      kaleoDraftDefinitionId);

    return contains(permissionChecker, kaleoDraftDefinition, actionId);
  }
}