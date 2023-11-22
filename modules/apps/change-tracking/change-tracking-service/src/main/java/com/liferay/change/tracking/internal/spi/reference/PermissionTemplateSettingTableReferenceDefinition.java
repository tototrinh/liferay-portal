/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.change.tracking.internal.spi.reference;

import com.liferay.change.tracking.spi.reference.TableReferenceDefinition;
import com.liferay.change.tracking.spi.reference.builder.ChildTableReferenceInfoBuilder;
import com.liferay.change.tracking.spi.reference.builder.ParentTableReferenceInfoBuilder;
import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.permission.template.model.PermissionTemplateSettingTable;
import com.liferay.permission.template.service.persistence.PermissionTemplateSettingPersistence;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Quan Huynh
 */
@Component(service = TableReferenceDefinition.class)
public class PermissionTemplateSettingTableReferenceDefinition
	implements TableReferenceDefinition<PermissionTemplateSettingTable> {

	@Override
	public void defineChildTableReferences(
		ChildTableReferenceInfoBuilder<PermissionTemplateSettingTable>
			childTableReferenceInfoBuilder) {

		childTableReferenceInfoBuilder.resourcePermissionReference(
			PermissionTemplateSettingTable.INSTANCE.permissionTemplateSettingId,
			PermissionTemplateSetting.class);
	}

	@Override
	public void defineParentTableReferences(
		ParentTableReferenceInfoBuilder<PermissionTemplateSettingTable>
			parentTableReferenceInfoBuilder) {
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _permissionTemplateSettingPersistence;
	}

	@Override
	public PermissionTemplateSettingTable getTable() {
		return PermissionTemplateSettingTable.INSTANCE;
	}

	@Reference
	private PermissionTemplateSettingPersistence
		_permissionTemplateSettingPersistence;

}