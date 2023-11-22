/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.service;

import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.change.tracking.CTPersistence;

/**
 * Provides a wrapper for {@link PermissionTemplateSettingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PermissionTemplateSettingLocalService
 * @generated
 */
public class PermissionTemplateSettingLocalServiceWrapper
	implements PermissionTemplateSettingLocalService,
			   ServiceWrapper<PermissionTemplateSettingLocalService> {

	public PermissionTemplateSettingLocalServiceWrapper() {
		this(null);
	}

	public PermissionTemplateSettingLocalServiceWrapper(
		PermissionTemplateSettingLocalService
			permissionTemplateSettingLocalService) {

		_permissionTemplateSettingLocalService =
			permissionTemplateSettingLocalService;
	}

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
	@Override
	public PermissionTemplateSetting addPermissionTemplateSetting(
		PermissionTemplateSetting permissionTemplateSetting) {

		return _permissionTemplateSettingLocalService.
			addPermissionTemplateSetting(permissionTemplateSetting);
	}

	/**
	 * Creates a new permission template setting with the primary key. Does not add the permission template setting to the database.
	 *
	 * @param permissionTemplateSettingId the primary key for the new permission template setting
	 * @return the new permission template setting
	 */
	@Override
	public PermissionTemplateSetting createPermissionTemplateSetting(
		long permissionTemplateSettingId) {

		return _permissionTemplateSettingLocalService.
			createPermissionTemplateSetting(permissionTemplateSettingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permissionTemplateSettingLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public PermissionTemplateSetting deletePermissionTemplateSetting(
			long permissionTemplateSettingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permissionTemplateSettingLocalService.
			deletePermissionTemplateSetting(permissionTemplateSettingId);
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
	@Override
	public PermissionTemplateSetting deletePermissionTemplateSetting(
		PermissionTemplateSetting permissionTemplateSetting) {

		return _permissionTemplateSettingLocalService.
			deletePermissionTemplateSetting(permissionTemplateSetting);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permissionTemplateSettingLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _permissionTemplateSettingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _permissionTemplateSettingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _permissionTemplateSettingLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _permissionTemplateSettingLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _permissionTemplateSettingLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _permissionTemplateSettingLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _permissionTemplateSettingLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _permissionTemplateSettingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public PermissionTemplateSetting fetchPermissionTemplateSetting(
		long permissionTemplateSettingId) {

		return _permissionTemplateSettingLocalService.
			fetchPermissionTemplateSetting(permissionTemplateSettingId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _permissionTemplateSettingLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _permissionTemplateSettingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _permissionTemplateSettingLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the permission template setting with the primary key.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting
	 * @throws PortalException if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting getPermissionTemplateSetting(
			long permissionTemplateSettingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permissionTemplateSettingLocalService.
			getPermissionTemplateSetting(permissionTemplateSettingId);
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
	@Override
	public java.util.List<PermissionTemplateSetting>
		getPermissionTemplateSettings(int start, int end) {

		return _permissionTemplateSettingLocalService.
			getPermissionTemplateSettings(start, end);
	}

	/**
	 * Returns the number of permission template settings.
	 *
	 * @return the number of permission template settings
	 */
	@Override
	public int getPermissionTemplateSettingsCount() {
		return _permissionTemplateSettingLocalService.
			getPermissionTemplateSettingsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permissionTemplateSettingLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public PermissionTemplateSetting updatePermissionTemplateSetting(
		PermissionTemplateSetting permissionTemplateSetting) {

		return _permissionTemplateSettingLocalService.
			updatePermissionTemplateSetting(permissionTemplateSetting);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _permissionTemplateSettingLocalService.getBasePersistence();
	}

	@Override
	public CTPersistence<PermissionTemplateSetting> getCTPersistence() {
		return _permissionTemplateSettingLocalService.getCTPersistence();
	}

	@Override
	public Class<PermissionTemplateSetting> getModelClass() {
		return _permissionTemplateSettingLocalService.getModelClass();
	}

	@Override
	public <R, E extends Throwable> R updateWithUnsafeFunction(
			UnsafeFunction<CTPersistence<PermissionTemplateSetting>, R, E>
				updateUnsafeFunction)
		throws E {

		return _permissionTemplateSettingLocalService.updateWithUnsafeFunction(
			updateUnsafeFunction);
	}

	@Override
	public PermissionTemplateSettingLocalService getWrappedService() {
		return _permissionTemplateSettingLocalService;
	}

	@Override
	public void setWrappedService(
		PermissionTemplateSettingLocalService
			permissionTemplateSettingLocalService) {

		_permissionTemplateSettingLocalService =
			permissionTemplateSettingLocalService;
	}

	private PermissionTemplateSettingLocalService
		_permissionTemplateSettingLocalService;

}