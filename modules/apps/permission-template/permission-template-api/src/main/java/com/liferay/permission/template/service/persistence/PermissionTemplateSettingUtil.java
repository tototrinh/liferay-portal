/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.service.persistence;

import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the permission template setting service. This utility wraps <code>com.liferay.permission.template.service.persistence.impl.PermissionTemplateSettingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermissionTemplateSettingPersistence
 * @generated
 */
public class PermissionTemplateSettingUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		PermissionTemplateSetting permissionTemplateSetting) {

		getPersistence().clearCache(permissionTemplateSetting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, PermissionTemplateSetting>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PermissionTemplateSetting> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PermissionTemplateSetting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PermissionTemplateSetting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PermissionTemplateSetting> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PermissionTemplateSetting update(
		PermissionTemplateSetting permissionTemplateSetting) {

		return getPersistence().update(permissionTemplateSetting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PermissionTemplateSetting update(
		PermissionTemplateSetting permissionTemplateSetting,
		ServiceContext serviceContext) {

		return getPersistence().update(
			permissionTemplateSetting, serviceContext);
	}

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
	public static PermissionTemplateSetting findByG_C_C_C(
			long groupId, long companyId, long classNameId, long classPK)
		throws com.liferay.permission.template.exception.
			NoSuchPermissionTemplateSettingException {

		return getPersistence().findByG_C_C_C(
			groupId, companyId, classNameId, classPK);
	}

	/**
	 * Returns the permission template setting where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching permission template setting, or <code>null</code> if a matching permission template setting could not be found
	 */
	public static PermissionTemplateSetting fetchByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK) {

		return getPersistence().fetchByG_C_C_C(
			groupId, companyId, classNameId, classPK);
	}

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
	public static PermissionTemplateSetting fetchByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK,
		boolean useFinderCache) {

		return getPersistence().fetchByG_C_C_C(
			groupId, companyId, classNameId, classPK, useFinderCache);
	}

	/**
	 * Removes the permission template setting where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the permission template setting that was removed
	 */
	public static PermissionTemplateSetting removeByG_C_C_C(
			long groupId, long companyId, long classNameId, long classPK)
		throws com.liferay.permission.template.exception.
			NoSuchPermissionTemplateSettingException {

		return getPersistence().removeByG_C_C_C(
			groupId, companyId, classNameId, classPK);
	}

	/**
	 * Returns the number of permission template settings where groupId = &#63; and companyId = &#63; and classNameId = &#63; and classPK = &#63;.
	 *
	 * @param groupId the group ID
	 * @param companyId the company ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the number of matching permission template settings
	 */
	public static int countByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK) {

		return getPersistence().countByG_C_C_C(
			groupId, companyId, classNameId, classPK);
	}

	/**
	 * Caches the permission template setting in the entity cache if it is enabled.
	 *
	 * @param permissionTemplateSetting the permission template setting
	 */
	public static void cacheResult(
		PermissionTemplateSetting permissionTemplateSetting) {

		getPersistence().cacheResult(permissionTemplateSetting);
	}

	/**
	 * Caches the permission template settings in the entity cache if it is enabled.
	 *
	 * @param permissionTemplateSettings the permission template settings
	 */
	public static void cacheResult(
		List<PermissionTemplateSetting> permissionTemplateSettings) {

		getPersistence().cacheResult(permissionTemplateSettings);
	}

	/**
	 * Creates a new permission template setting with the primary key. Does not add the permission template setting to the database.
	 *
	 * @param permissionTemplateSettingId the primary key for the new permission template setting
	 * @return the new permission template setting
	 */
	public static PermissionTemplateSetting create(
		long permissionTemplateSettingId) {

		return getPersistence().create(permissionTemplateSettingId);
	}

	/**
	 * Removes the permission template setting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting that was removed
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	public static PermissionTemplateSetting remove(
			long permissionTemplateSettingId)
		throws com.liferay.permission.template.exception.
			NoSuchPermissionTemplateSettingException {

		return getPersistence().remove(permissionTemplateSettingId);
	}

	public static PermissionTemplateSetting updateImpl(
		PermissionTemplateSetting permissionTemplateSetting) {

		return getPersistence().updateImpl(permissionTemplateSetting);
	}

	/**
	 * Returns the permission template setting with the primary key or throws a <code>NoSuchPermissionTemplateSettingException</code> if it could not be found.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	public static PermissionTemplateSetting findByPrimaryKey(
			long permissionTemplateSettingId)
		throws com.liferay.permission.template.exception.
			NoSuchPermissionTemplateSettingException {

		return getPersistence().findByPrimaryKey(permissionTemplateSettingId);
	}

	/**
	 * Returns the permission template setting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting, or <code>null</code> if a permission template setting with the primary key could not be found
	 */
	public static PermissionTemplateSetting fetchByPrimaryKey(
		long permissionTemplateSettingId) {

		return getPersistence().fetchByPrimaryKey(permissionTemplateSettingId);
	}

	/**
	 * Returns all the permission template settings.
	 *
	 * @return the permission template settings
	 */
	public static List<PermissionTemplateSetting> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<PermissionTemplateSetting> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<PermissionTemplateSetting> findAll(
		int start, int end,
		OrderByComparator<PermissionTemplateSetting> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<PermissionTemplateSetting> findAll(
		int start, int end,
		OrderByComparator<PermissionTemplateSetting> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the permission template settings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of permission template settings.
	 *
	 * @return the number of permission template settings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PermissionTemplateSettingPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PermissionTemplateSettingPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PermissionTemplateSettingPersistence _persistence;

}