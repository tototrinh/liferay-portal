/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.service;

import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PermissionTemplateSetting. This utility wraps
 * <code>com.liferay.permission.template.service.impl.PermissionTemplateSettingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PermissionTemplateSettingLocalService
 * @generated
 */
public class PermissionTemplateSettingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.permission.template.service.impl.PermissionTemplateSettingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the permission template setting to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermissionTemplateSettingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permissionTemplateSetting the permission template setting
	 * @return the permission template setting that was added
	 */
	public static PermissionTemplateSetting addPermissionTemplateSetting(
		PermissionTemplateSetting permissionTemplateSetting) {

		return getService().addPermissionTemplateSetting(
			permissionTemplateSetting);
	}

	/**
	 * Creates a new permission template setting with the primary key. Does not add the permission template setting to the database.
	 *
	 * @param permissionTemplateSettingId the primary key for the new permission template setting
	 * @return the new permission template setting
	 */
	public static PermissionTemplateSetting createPermissionTemplateSetting(
		long permissionTemplateSettingId) {

		return getService().createPermissionTemplateSetting(
			permissionTemplateSettingId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the permission template setting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermissionTemplateSettingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting that was removed
	 * @throws PortalException if a permission template setting with the primary key could not be found
	 */
	public static PermissionTemplateSetting deletePermissionTemplateSetting(
			long permissionTemplateSettingId)
		throws PortalException {

		return getService().deletePermissionTemplateSetting(
			permissionTemplateSettingId);
	}

	/**
	 * Deletes the permission template setting from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermissionTemplateSettingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permissionTemplateSetting the permission template setting
	 * @return the permission template setting that was removed
	 */
	public static PermissionTemplateSetting deletePermissionTemplateSetting(
		PermissionTemplateSetting permissionTemplateSetting) {

		return getService().deletePermissionTemplateSetting(
			permissionTemplateSetting);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.permission.template.model.impl.PermissionTemplateSettingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.permission.template.model.impl.PermissionTemplateSettingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PermissionTemplateSetting fetchPermissionTemplateSetting(
		long permissionTemplateSettingId) {

		return getService().fetchPermissionTemplateSetting(
			permissionTemplateSettingId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the permission template setting with the primary key.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting
	 * @throws PortalException if a permission template setting with the primary key could not be found
	 */
	public static PermissionTemplateSetting getPermissionTemplateSetting(
			long permissionTemplateSettingId)
		throws PortalException {

		return getService().getPermissionTemplateSetting(
			permissionTemplateSettingId);
	}

	/**
	 * Returns a range of all the permission template settings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.permission.template.model.impl.PermissionTemplateSettingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission template settings
	 * @param end the upper bound of the range of permission template settings (not inclusive)
	 * @return the range of permission template settings
	 */
	public static List<PermissionTemplateSetting> getPermissionTemplateSettings(
		int start, int end) {

		return getService().getPermissionTemplateSettings(start, end);
	}

	/**
	 * Returns the number of permission template settings.
	 *
	 * @return the number of permission template settings
	 */
	public static int getPermissionTemplateSettingsCount() {
		return getService().getPermissionTemplateSettingsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the permission template setting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermissionTemplateSettingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permissionTemplateSetting the permission template setting
	 * @return the permission template setting that was updated
	 */
	public static PermissionTemplateSetting updatePermissionTemplateSetting(
		PermissionTemplateSetting permissionTemplateSetting) {

		return getService().updatePermissionTemplateSetting(
			permissionTemplateSetting);
	}

	public static PermissionTemplateSettingLocalService getService() {
		return _service;
	}

	public static void setService(
		PermissionTemplateSettingLocalService service) {

		_service = service;
	}

	private static volatile PermissionTemplateSettingLocalService _service;

}