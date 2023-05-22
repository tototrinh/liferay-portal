package com.liferay.document.library.web.internal.security.permission.propagator;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLFolderLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.security.permission.propagator.BasePermissionPropagator;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.documentlibrary.service.impl.DLFolderLocalServiceImpl;
import com.liferay.roles.admin.role.type.contributor.RoleTypeContributor;
import com.liferay.roles.admin.role.type.contributor.provider.RoleTypeContributorProvider;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component(
	service = DLFolderPermissionPropagator.class
)
public class DLFolderPermissionPropagator extends BasePermissionPropagator {
	@Override
	public void propagateRolePermissions(
		ActionRequest actionRequest, String className, String primKey,
		long[] roleIds) throws PortalException {

		long folderId = GetterUtil.getLong(primKey);

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		DLFolder dlFolder = _dlFolderLocalService.getFolder(folderId);

		if(dlFolder == null){
			return;
		}
		Set<String> excludedRoleNamesSet = new HashSet<String>() {
			{
				add(RoleConstants.ADMINISTRATOR);
				add(RoleConstants.GUEST);
			}
		};

		for (RoleTypeContributor roleTypeContributor :
			_roleTypeContributorProvider.getRoleTypeContributors()) {

			Collections.addAll(
				excludedRoleNamesSet,
				roleTypeContributor.getExcludedRoleNames());
		}

		List<String> excludedRoleNames = ListUtil.fromCollection(
			excludedRoleNamesSet);

		List<Role> roleIdDLs = RoleLocalServiceUtil.getGroupRolesAndTeamRoles(
			themeDisplay.getCompanyId(), null, excludedRoleNames,
			null, null, RoleConstants.TYPES_REGULAR_AND_SITE, dlFolder.getParentFolderId(),
			dlFolder.getGroupId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		long parentFolderId = dlFolder.getParentFolderId();

		for (Role role : roleIdDLs) {
			propagateRolePermissions(
				actionRequest, role.getRoleId(), DLFolder.class.getName(), parentFolderId,
				DLFolder.class.getName(), folderId);
		}
	}



	@Reference
	private DLFolderLocalService _dlFolderLocalService;

	@Reference
	private RoleTypeContributorProvider _roleTypeContributorProvider;
}
