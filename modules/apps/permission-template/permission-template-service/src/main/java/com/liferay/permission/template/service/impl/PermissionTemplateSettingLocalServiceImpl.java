/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.service.impl;

import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.permission.template.service.base.PermissionTemplateSettingLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.service.ClassNameLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.permission.template.model.PermissionTemplateSetting",
	service = AopService.class
)
public class PermissionTemplateSettingLocalServiceImpl
	extends PermissionTemplateSettingLocalServiceBaseImpl {

	public PermissionTemplateSetting addPermissionTemplateSetting(
		long companyId, long groupId, String className, long classPK,
		boolean permissionTemplateEnabled) {

		long permissionTemplateSettingId = counterLocalService.increment();

		PermissionTemplateSetting permissionTemplateSetting =
			permissionTemplateSettingPersistence.create(
				permissionTemplateSettingId);

		permissionTemplateSetting.setGroupId(groupId);
		permissionTemplateSetting.setCompanyId(companyId);
		permissionTemplateSetting.setClassNameId(
			_classNameLocalService.getClassNameId(className));
		permissionTemplateSetting.setClassPK(classPK);
		permissionTemplateSetting.setPermissionTemplateEnabled(
			permissionTemplateEnabled);

		return permissionTemplateSettingPersistence.update(
			permissionTemplateSetting);
	}

	public PermissionTemplateSetting fetchPermissionTemplateSetting(
		long companyId, long groupId, String className, long classPK) {

		return permissionTemplateSettingPersistence.fetchByG_C_C_C(
			groupId, companyId,
			_classNameLocalService.getClassNameId(className), classPK);
	}

	public PermissionTemplateSetting updatePermissionTemplateSetting(
		long companyId, long groupId, String className, long classPK,
		boolean permissionTemplateEnabled) {

		PermissionTemplateSetting permissionTemplateSetting =
			fetchPermissionTemplateSetting(
				companyId, groupId, className, classPK);

		if (permissionTemplateSetting == null) {
			return addPermissionTemplateSetting(
				companyId, groupId, className, classPK,
				permissionTemplateEnabled);
		}

		permissionTemplateSetting.setPermissionTemplateEnabled(
			permissionTemplateEnabled);

		return permissionTemplateSettingPersistence.update(
			permissionTemplateSetting);
	}

	@Reference
	private ClassNameLocalService _classNameLocalService;

}