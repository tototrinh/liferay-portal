/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.document.library.web.internal.security.permission.propagator;

import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLFolderLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.propagator.BasePermissionPropagator;
import com.liferay.portal.kernel.security.permission.propagator.PermissionPropagator;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Loc Pham
 */
@Component(
	property = {
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY,
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY_ADMIN,
		"javax.portlet.name=" + DLPortletKeys.MEDIA_GALLERY_DISPLAY
	},
	service = PermissionPropagator.class
)
public class DLFolderPermissionPropagator extends BasePermissionPropagator {

	@Override
	public void propagateRolePermissions(
			ActionRequest actionRequest, String className, String primKey,
			long[] roleIds)
		throws PortalException {

		DLFolder dlFolder = _dlFolderLocalService.fetchFolder(
			GetterUtil.getLong(primKey));

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		if ((dlFolder == null) || !cmd.equals(Constants.ADD)) {
			return;
		}

		long parentFolderId = dlFolder.getParentFolderId();

		for (long roleId : roleIds) {
			propagateRolePermissions(
				actionRequest, roleId, className, parentFolderId, className,
				dlFolder.getFolderId());
		}
	}

	@Reference
	private DLFolderLocalService _dlFolderLocalService;

}