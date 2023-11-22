/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * <p>
 * This class is a wrapper for {@link PermissionTemplateSetting}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermissionTemplateSetting
 * @generated
 */
public class PermissionTemplateSettingWrapper
	extends BaseModelWrapper<PermissionTemplateSetting>
	implements ModelWrapper<PermissionTemplateSetting>,
			   PermissionTemplateSetting {

	public PermissionTemplateSettingWrapper(
		PermissionTemplateSetting permissionTemplateSetting) {

		super(permissionTemplateSetting);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("ctCollectionId", getCtCollectionId());
		attributes.put(
			"permissionTemplateSettingId", getPermissionTemplateSettingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put(
			"permissionTemplateEnabled", isPermissionTemplateEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long ctCollectionId = (Long)attributes.get("ctCollectionId");

		if (ctCollectionId != null) {
			setCtCollectionId(ctCollectionId);
		}

		Long permissionTemplateSettingId = (Long)attributes.get(
			"permissionTemplateSettingId");

		if (permissionTemplateSettingId != null) {
			setPermissionTemplateSettingId(permissionTemplateSettingId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Boolean permissionTemplateEnabled = (Boolean)attributes.get(
			"permissionTemplateEnabled");

		if (permissionTemplateEnabled != null) {
			setPermissionTemplateEnabled(permissionTemplateEnabled);
		}
	}

	@Override
	public PermissionTemplateSetting cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the fully qualified class name of this permission template setting.
	 *
	 * @return the fully qualified class name of this permission template setting
	 */
	@Override
	public String getClassName() {
		return model.getClassName();
	}

	/**
	 * Returns the class name ID of this permission template setting.
	 *
	 * @return the class name ID of this permission template setting
	 */
	@Override
	public long getClassNameId() {
		return model.getClassNameId();
	}

	/**
	 * Returns the class pk of this permission template setting.
	 *
	 * @return the class pk of this permission template setting
	 */
	@Override
	public long getClassPK() {
		return model.getClassPK();
	}

	/**
	 * Returns the company ID of this permission template setting.
	 *
	 * @return the company ID of this permission template setting
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the ct collection ID of this permission template setting.
	 *
	 * @return the ct collection ID of this permission template setting
	 */
	@Override
	public long getCtCollectionId() {
		return model.getCtCollectionId();
	}

	/**
	 * Returns the group ID of this permission template setting.
	 *
	 * @return the group ID of this permission template setting
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mvcc version of this permission template setting.
	 *
	 * @return the mvcc version of this permission template setting
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the permission template enabled of this permission template setting.
	 *
	 * @return the permission template enabled of this permission template setting
	 */
	@Override
	public boolean getPermissionTemplateEnabled() {
		return model.getPermissionTemplateEnabled();
	}

	/**
	 * Returns the permission template setting ID of this permission template setting.
	 *
	 * @return the permission template setting ID of this permission template setting
	 */
	@Override
	public long getPermissionTemplateSettingId() {
		return model.getPermissionTemplateSettingId();
	}

	/**
	 * Returns the primary key of this permission template setting.
	 *
	 * @return the primary key of this permission template setting
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns <code>true</code> if this permission template setting is permission template enabled.
	 *
	 * @return <code>true</code> if this permission template setting is permission template enabled; <code>false</code> otherwise
	 */
	@Override
	public boolean isPermissionTemplateEnabled() {
		return model.isPermissionTemplateEnabled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void setClassName(String className) {
		model.setClassName(className);
	}

	/**
	 * Sets the class name ID of this permission template setting.
	 *
	 * @param classNameId the class name ID of this permission template setting
	 */
	@Override
	public void setClassNameId(long classNameId) {
		model.setClassNameId(classNameId);
	}

	/**
	 * Sets the class pk of this permission template setting.
	 *
	 * @param classPK the class pk of this permission template setting
	 */
	@Override
	public void setClassPK(long classPK) {
		model.setClassPK(classPK);
	}

	/**
	 * Sets the company ID of this permission template setting.
	 *
	 * @param companyId the company ID of this permission template setting
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the ct collection ID of this permission template setting.
	 *
	 * @param ctCollectionId the ct collection ID of this permission template setting
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId) {
		model.setCtCollectionId(ctCollectionId);
	}

	/**
	 * Sets the group ID of this permission template setting.
	 *
	 * @param groupId the group ID of this permission template setting
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mvcc version of this permission template setting.
	 *
	 * @param mvccVersion the mvcc version of this permission template setting
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets whether this permission template setting is permission template enabled.
	 *
	 * @param permissionTemplateEnabled the permission template enabled of this permission template setting
	 */
	@Override
	public void setPermissionTemplateEnabled(
		boolean permissionTemplateEnabled) {

		model.setPermissionTemplateEnabled(permissionTemplateEnabled);
	}

	/**
	 * Sets the permission template setting ID of this permission template setting.
	 *
	 * @param permissionTemplateSettingId the permission template setting ID of this permission template setting
	 */
	@Override
	public void setPermissionTemplateSettingId(
		long permissionTemplateSettingId) {

		model.setPermissionTemplateSettingId(permissionTemplateSettingId);
	}

	/**
	 * Sets the primary key of this permission template setting.
	 *
	 * @param primaryKey the primary key of this permission template setting
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public Map<String, Function<PermissionTemplateSetting, Object>>
		getAttributeGetterFunctions() {

		return model.getAttributeGetterFunctions();
	}

	@Override
	public Map<String, BiConsumer<PermissionTemplateSetting, Object>>
		getAttributeSetterBiConsumers() {

		return model.getAttributeSetterBiConsumers();
	}

	@Override
	protected PermissionTemplateSettingWrapper wrap(
		PermissionTemplateSetting permissionTemplateSetting) {

		return new PermissionTemplateSettingWrapper(permissionTemplateSetting);
	}

}