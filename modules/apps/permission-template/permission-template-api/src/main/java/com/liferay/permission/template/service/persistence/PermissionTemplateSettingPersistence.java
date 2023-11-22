/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.service.persistence;

import com.liferay.permission.template.exception.NoSuchPermissionTemplateSettingException;
import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the permission template setting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermissionTemplateSettingUtil
 * @generated
 */
@ProviderType
public interface PermissionTemplateSettingPersistence
	extends BasePersistence<PermissionTemplateSetting>,
			CTPersistence<PermissionTemplateSetting> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PermissionTemplateSettingUtil} to access the permission template setting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the permission template setting where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63; or throws a <code>NoSuchPermissionTemplateSettingException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching permission template setting
	 * @throws NoSuchPermissionTemplateSettingException if a matching permission template setting could not be found
	 */
	public PermissionTemplateSetting findByG_C_C_C(
			long groupId, long companyId, long classNameId, long classPK)
		throws NoSuchPermissionTemplateSettingException;

	/**
	 * Returns the permission template setting where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching permission template setting, or <code>null</code> if a matching permission template setting could not be found
	 */
	public PermissionTemplateSetting fetchByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK);

	/**
	 * Returns the permission template setting where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching permission template setting, or <code>null</code> if a matching permission template setting could not be found
	 */
	public PermissionTemplateSetting fetchByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK,
		boolean useFinderCache);

	/**
	 * Removes the permission template setting where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the permission template setting that was removed
	 */
	public PermissionTemplateSetting removeByG_C_C_C(
			long groupId, long companyId, long classNameId, long classPK)
		throws NoSuchPermissionTemplateSettingException;

	/**
	 * Returns the number of permission template settings where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the number of matching permission template settings
	 */
	public int countByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK);

	/**
	 * Caches the permission template setting in the entity cache if it is enabled.
	 *
	 * @param permissionTemplateSetting the permission template setting
	 */
	public void cacheResult(
		PermissionTemplateSetting permissionTemplateSetting);

	/**
	 * Caches the permission template settings in the entity cache if it is enabled.
	 *
	 * @param permissionTemplateSettings the permission template settings
	 */
	public void cacheResult(
		java.util.List<PermissionTemplateSetting> permissionTemplateSettings);

	/**
	 * Creates a new permission template setting with the primary key. Does not add the permission template setting to the database.
	 *
	 * @param permissionTemplateSettingId the primary key for the new permission template setting
	 * @return the new permission template setting
	 */
	public PermissionTemplateSetting create(long permissionTemplateSettingId);

	/**
	 * Removes the permission template setting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting that was removed
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	public PermissionTemplateSetting remove(long permissionTemplateSettingId)
		throws NoSuchPermissionTemplateSettingException;

	public PermissionTemplateSetting updateImpl(
		PermissionTemplateSetting permissionTemplateSetting);

	/**
	 * Returns the permission template setting with the primary key or throws a <code>NoSuchPermissionTemplateSettingException</code> if it could not be found.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	public PermissionTemplateSetting findByPrimaryKey(
			long permissionTemplateSettingId)
		throws NoSuchPermissionTemplateSettingException;

	/**
	 * Returns the permission template setting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting, or <code>null</code> if a permission template setting with the primary key could not be found
	 */
	public PermissionTemplateSetting fetchByPrimaryKey(
		long permissionTemplateSettingId);

	/**
	 * Returns all the permission template settings.
	 *
	 * @return the permission template settings
	 */
	public java.util.List<PermissionTemplateSetting> findAll();

	/**
	 * Returns a range of all the permission template settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermissionTemplateSettingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission template settings
	 * @param end the upper bound of the range of permission template settings (not inclusive)
	 * @return the range of permission template settings
	 */
	public java.util.List<PermissionTemplateSetting> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the permission template settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermissionTemplateSettingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission template settings
	 * @param end the upper bound of the range of permission template settings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of permission template settings
	 */
	public java.util.List<PermissionTemplateSetting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PermissionTemplateSetting> orderByComparator);

	/**
	 * Returns an ordered range of all the permission template settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermissionTemplateSettingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission template settings
	 * @param end the upper bound of the range of permission template settings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of permission template settings
	 */
	public java.util.List<PermissionTemplateSetting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PermissionTemplateSetting> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the permission template settings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of permission template settings.
	 *
	 * @return the number of permission template settings
	 */
	public int countAll();

}