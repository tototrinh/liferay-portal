/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;PermissionTemplateSetting&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PermissionTemplateSetting
 * @generated
 */
public class PermissionTemplateSettingTable
	extends BaseTable<PermissionTemplateSettingTable> {

	public static final PermissionTemplateSettingTable INSTANCE =
		new PermissionTemplateSettingTable();

	public final Column<PermissionTemplateSettingTable, Long> mvccVersion =
		createColumn(
			"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<PermissionTemplateSettingTable, Long> ctCollectionId =
		createColumn(
			"ctCollectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PermissionTemplateSettingTable, Long>
		permissionTemplateSettingId = createColumn(
			"permissionTemplateSettingId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PermissionTemplateSettingTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermissionTemplateSettingTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermissionTemplateSettingTable, Long> classNameId =
		createColumn(
			"classNameId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermissionTemplateSettingTable, Long> classPK =
		createColumn("classPK", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PermissionTemplateSettingTable, Boolean>
		permissionTemplateEnabled = createColumn(
			"permissionTemplateEnabled", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);

	private PermissionTemplateSettingTable() {
		super("PermissionTemplateSetting", PermissionTemplateSettingTable::new);
	}

}