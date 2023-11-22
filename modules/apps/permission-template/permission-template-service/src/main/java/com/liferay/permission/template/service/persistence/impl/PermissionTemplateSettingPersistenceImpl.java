/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.permission.template.service.persistence.impl;

import com.liferay.permission.template.exception.NoSuchPermissionTemplateSettingException;
import com.liferay.permission.template.model.PermissionTemplateSetting;
import com.liferay.permission.template.model.PermissionTemplateSettingTable;
import com.liferay.permission.template.model.impl.PermissionTemplateSettingImpl;
import com.liferay.permission.template.model.impl.PermissionTemplateSettingModelImpl;
import com.liferay.permission.template.service.persistence.PermissionTemplateSettingPersistence;
import com.liferay.permission.template.service.persistence.PermissionTemplateSettingUtil;
import com.liferay.permission.template.service.persistence.impl.constants.PermissionTemplateSettingPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.change.tracking.CTColumnResolutionType;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.persistence.change.tracking.helper.CTPersistenceHelper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the permission template setting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PermissionTemplateSettingPersistence.class)
public class PermissionTemplateSettingPersistenceImpl
	extends BasePersistenceImpl<PermissionTemplateSetting>
	implements PermissionTemplateSettingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PermissionTemplateSettingUtil</code> to access the permission template setting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PermissionTemplateSettingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByG_C_C_C;
	private FinderPath _finderPathCountByG_C_C_C;

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
	@Override
	public PermissionTemplateSetting findByG_C_C_C(
			long groupId, long companyId, long classNameId, long classPK)
		throws NoSuchPermissionTemplateSettingException {

		PermissionTemplateSetting permissionTemplateSetting = fetchByG_C_C_C(
			groupId, companyId, classNameId, classPK);

		if (permissionTemplateSetting == null) {
			StringBundler sb = new StringBundler(10);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("groupId=");
			sb.append(groupId);

			sb.append(", companyId=");
			sb.append(companyId);

			sb.append(", classNameId=");
			sb.append(classNameId);

			sb.append(", classPK=");
			sb.append(classPK);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPermissionTemplateSettingException(sb.toString());
		}

		return permissionTemplateSetting;
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
	@Override
	public PermissionTemplateSetting fetchByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK) {

		return fetchByG_C_C_C(groupId, companyId, classNameId, classPK, true);
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
	@Override
	public PermissionTemplateSetting fetchByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK,
		boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				groupId, companyId, classNameId, classPK
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByG_C_C_C, finderArgs, this);
		}

		boolean productionMode = ctPersistenceHelper.isProductionMode(
			PermissionTemplateSetting.class);

		if (result instanceof PermissionTemplateSetting) {
			PermissionTemplateSetting permissionTemplateSetting =
				(PermissionTemplateSetting)result;

			if ((groupId != permissionTemplateSetting.getGroupId()) ||
				(companyId != permissionTemplateSetting.getCompanyId()) ||
				(classNameId != permissionTemplateSetting.getClassNameId()) ||
				(classPK != permissionTemplateSetting.getClassPK())) {

				result = null;
			}
			else if (!ctPersistenceHelper.isProductionMode(
						PermissionTemplateSetting.class,
						permissionTemplateSetting.getPrimaryKey())) {

				result = null;
			}
		}
		else if (!productionMode && (result instanceof List<?>)) {
			result = null;
		}

		if (result == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_SQL_SELECT_PERMISSIONTEMPLATESETTING_WHERE);

			sb.append(_FINDER_COLUMN_G_C_C_C_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_C_C_C_COMPANYID_2);

			sb.append(_FINDER_COLUMN_G_C_C_C_CLASSNAMEID_2);

			sb.append(_FINDER_COLUMN_G_C_C_C_CLASSPK_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(companyId);

				queryPos.add(classNameId);

				queryPos.add(classPK);

				List<PermissionTemplateSetting> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache && productionMode) {
						finderCache.putResult(
							_finderPathFetchByG_C_C_C, finderArgs, list);
					}
				}
				else {
					PermissionTemplateSetting permissionTemplateSetting =
						list.get(0);

					result = permissionTemplateSetting;

					cacheResult(permissionTemplateSetting);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (PermissionTemplateSetting)result;
		}
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
	@Override
	public PermissionTemplateSetting removeByG_C_C_C(
			long groupId, long companyId, long classNameId, long classPK)
		throws NoSuchPermissionTemplateSettingException {

		PermissionTemplateSetting permissionTemplateSetting = findByG_C_C_C(
			groupId, companyId, classNameId, classPK);

		return remove(permissionTemplateSetting);
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
	@Override
	public int countByG_C_C_C(
		long groupId, long companyId, long classNameId, long classPK) {

		boolean productionMode = ctPersistenceHelper.isProductionMode(
			PermissionTemplateSetting.class);

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		Long count = null;

		if (productionMode) {
			finderPath = _finderPathCountByG_C_C_C;

			finderArgs = new Object[] {
				groupId, companyId, classNameId, classPK
			};

			count = (Long)finderCache.getResult(finderPath, finderArgs, this);
		}

		if (count == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_COUNT_PERMISSIONTEMPLATESETTING_WHERE);

			sb.append(_FINDER_COLUMN_G_C_C_C_GROUPID_2);

			sb.append(_FINDER_COLUMN_G_C_C_C_COMPANYID_2);

			sb.append(_FINDER_COLUMN_G_C_C_C_CLASSNAMEID_2);

			sb.append(_FINDER_COLUMN_G_C_C_C_CLASSPK_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				queryPos.add(companyId);

				queryPos.add(classNameId);

				queryPos.add(classPK);

				count = (Long)query.uniqueResult();

				if (productionMode) {
					finderCache.putResult(finderPath, finderArgs, count);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_C_C_C_GROUPID_2 =
		"permissionTemplateSetting.groupId = ? AND ";

	private static final String _FINDER_COLUMN_G_C_C_C_COMPANYID_2 =
		"permissionTemplateSetting.companyId = ? AND ";

	private static final String _FINDER_COLUMN_G_C_C_C_CLASSNAMEID_2 =
		"permissionTemplateSetting.classNameId = ? AND ";

	private static final String _FINDER_COLUMN_G_C_C_C_CLASSPK_2 =
		"permissionTemplateSetting.classPK = ?";

	public PermissionTemplateSettingPersistenceImpl() {
		setModelClass(PermissionTemplateSetting.class);

		setModelImplClass(PermissionTemplateSettingImpl.class);
		setModelPKClass(long.class);

		setTable(PermissionTemplateSettingTable.INSTANCE);
	}

	/**
	 * Caches the permission template setting in the entity cache if it is enabled.
	 *
	 * @param permissionTemplateSetting the permission template setting
	 */
	@Override
	public void cacheResult(
		PermissionTemplateSetting permissionTemplateSetting) {

		if (permissionTemplateSetting.getCtCollectionId() != 0) {
			return;
		}

		entityCache.putResult(
			PermissionTemplateSettingImpl.class,
			permissionTemplateSetting.getPrimaryKey(),
			permissionTemplateSetting);

		finderCache.putResult(
			_finderPathFetchByG_C_C_C,
			new Object[] {
				permissionTemplateSetting.getGroupId(),
				permissionTemplateSetting.getCompanyId(),
				permissionTemplateSetting.getClassNameId(),
				permissionTemplateSetting.getClassPK()
			},
			permissionTemplateSetting);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the permission template settings in the entity cache if it is enabled.
	 *
	 * @param permissionTemplateSettings the permission template settings
	 */
	@Override
	public void cacheResult(
		List<PermissionTemplateSetting> permissionTemplateSettings) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (permissionTemplateSettings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PermissionTemplateSetting permissionTemplateSetting :
				permissionTemplateSettings) {

			if (permissionTemplateSetting.getCtCollectionId() != 0) {
				continue;
			}

			if (entityCache.getResult(
					PermissionTemplateSettingImpl.class,
					permissionTemplateSetting.getPrimaryKey()) == null) {

				cacheResult(permissionTemplateSetting);
			}
		}
	}

	/**
	 * Clears the cache for all permission template settings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PermissionTemplateSettingImpl.class);

		finderCache.clearCache(PermissionTemplateSettingImpl.class);
	}

	/**
	 * Clears the cache for the permission template setting.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PermissionTemplateSetting permissionTemplateSetting) {

		entityCache.removeResult(
			PermissionTemplateSettingImpl.class, permissionTemplateSetting);
	}

	@Override
	public void clearCache(
		List<PermissionTemplateSetting> permissionTemplateSettings) {

		for (PermissionTemplateSetting permissionTemplateSetting :
				permissionTemplateSettings) {

			entityCache.removeResult(
				PermissionTemplateSettingImpl.class, permissionTemplateSetting);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PermissionTemplateSettingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PermissionTemplateSettingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PermissionTemplateSettingModelImpl permissionTemplateSettingModelImpl) {

		Object[] args = new Object[] {
			permissionTemplateSettingModelImpl.getGroupId(),
			permissionTemplateSettingModelImpl.getCompanyId(),
			permissionTemplateSettingModelImpl.getClassNameId(),
			permissionTemplateSettingModelImpl.getClassPK()
		};

		finderCache.putResult(_finderPathCountByG_C_C_C, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByG_C_C_C, args,
			permissionTemplateSettingModelImpl);
	}

	/**
	 * Creates a new permission template setting with the primary key. Does not add the permission template setting to the database.
	 *
	 * @param permissionTemplateSettingId the primary key for the new permission template setting
	 * @return the new permission template setting
	 */
	@Override
	public PermissionTemplateSetting create(long permissionTemplateSettingId) {
		PermissionTemplateSetting permissionTemplateSetting =
			new PermissionTemplateSettingImpl();

		permissionTemplateSetting.setNew(true);
		permissionTemplateSetting.setPrimaryKey(permissionTemplateSettingId);

		permissionTemplateSetting.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return permissionTemplateSetting;
	}

	/**
	 * Removes the permission template setting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting that was removed
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting remove(long permissionTemplateSettingId)
		throws NoSuchPermissionTemplateSettingException {

		return remove((Serializable)permissionTemplateSettingId);
	}

	/**
	 * Removes the permission template setting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the permission template setting
	 * @return the permission template setting that was removed
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting remove(Serializable primaryKey)
		throws NoSuchPermissionTemplateSettingException {

		Session session = null;

		try {
			session = openSession();

			PermissionTemplateSetting permissionTemplateSetting =
				(PermissionTemplateSetting)session.get(
					PermissionTemplateSettingImpl.class, primaryKey);

			if (permissionTemplateSetting == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPermissionTemplateSettingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(permissionTemplateSetting);
		}
		catch (NoSuchPermissionTemplateSettingException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PermissionTemplateSetting removeImpl(
		PermissionTemplateSetting permissionTemplateSetting) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(permissionTemplateSetting)) {
				permissionTemplateSetting =
					(PermissionTemplateSetting)session.get(
						PermissionTemplateSettingImpl.class,
						permissionTemplateSetting.getPrimaryKeyObj());
			}

			if ((permissionTemplateSetting != null) &&
				ctPersistenceHelper.isRemove(permissionTemplateSetting)) {

				session.delete(permissionTemplateSetting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (permissionTemplateSetting != null) {
			clearCache(permissionTemplateSetting);
		}

		return permissionTemplateSetting;
	}

	@Override
	public PermissionTemplateSetting updateImpl(
		PermissionTemplateSetting permissionTemplateSetting) {

		boolean isNew = permissionTemplateSetting.isNew();

		if (!(permissionTemplateSetting instanceof
				PermissionTemplateSettingModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(permissionTemplateSetting.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					permissionTemplateSetting);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in permissionTemplateSetting proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PermissionTemplateSetting implementation " +
					permissionTemplateSetting.getClass());
		}

		PermissionTemplateSettingModelImpl permissionTemplateSettingModelImpl =
			(PermissionTemplateSettingModelImpl)permissionTemplateSetting;

		Session session = null;

		try {
			session = openSession();

			if (ctPersistenceHelper.isInsert(permissionTemplateSetting)) {
				if (!isNew) {
					session.evict(
						PermissionTemplateSettingImpl.class,
						permissionTemplateSetting.getPrimaryKeyObj());
				}

				session.save(permissionTemplateSetting);
			}
			else {
				permissionTemplateSetting =
					(PermissionTemplateSetting)session.merge(
						permissionTemplateSetting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (permissionTemplateSetting.getCtCollectionId() != 0) {
			if (isNew) {
				permissionTemplateSetting.setNew(false);
			}

			permissionTemplateSetting.resetOriginalValues();

			return permissionTemplateSetting;
		}

		entityCache.putResult(
			PermissionTemplateSettingImpl.class,
			permissionTemplateSettingModelImpl, false, true);

		cacheUniqueFindersCache(permissionTemplateSettingModelImpl);

		if (isNew) {
			permissionTemplateSetting.setNew(false);
		}

		permissionTemplateSetting.resetOriginalValues();

		return permissionTemplateSetting;
	}

	/**
	 * Returns the permission template setting with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the permission template setting
	 * @return the permission template setting
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPermissionTemplateSettingException {

		PermissionTemplateSetting permissionTemplateSetting = fetchByPrimaryKey(
			primaryKey);

		if (permissionTemplateSetting == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPermissionTemplateSettingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return permissionTemplateSetting;
	}

	/**
	 * Returns the permission template setting with the primary key or throws a <code>NoSuchPermissionTemplateSettingException</code> if it could not be found.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting
	 * @throws NoSuchPermissionTemplateSettingException if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting findByPrimaryKey(
			long permissionTemplateSettingId)
		throws NoSuchPermissionTemplateSettingException {

		return findByPrimaryKey((Serializable)permissionTemplateSettingId);
	}

	/**
	 * Returns the permission template setting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the permission template setting
	 * @return the permission template setting, or <code>null</code> if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting fetchByPrimaryKey(
		Serializable primaryKey) {

		if (ctPersistenceHelper.isProductionMode(
				PermissionTemplateSetting.class, primaryKey)) {

			return super.fetchByPrimaryKey(primaryKey);
		}

		PermissionTemplateSetting permissionTemplateSetting = null;

		Session session = null;

		try {
			session = openSession();

			permissionTemplateSetting = (PermissionTemplateSetting)session.get(
				PermissionTemplateSettingImpl.class, primaryKey);

			if (permissionTemplateSetting != null) {
				cacheResult(permissionTemplateSetting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		return permissionTemplateSetting;
	}

	/**
	 * Returns the permission template setting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionTemplateSettingId the primary key of the permission template setting
	 * @return the permission template setting, or <code>null</code> if a permission template setting with the primary key could not be found
	 */
	@Override
	public PermissionTemplateSetting fetchByPrimaryKey(
		long permissionTemplateSettingId) {

		return fetchByPrimaryKey((Serializable)permissionTemplateSettingId);
	}

	@Override
	public Map<Serializable, PermissionTemplateSetting> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (ctPersistenceHelper.isProductionMode(
				PermissionTemplateSetting.class)) {

			return super.fetchByPrimaryKeys(primaryKeys);
		}

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, PermissionTemplateSetting> map =
			new HashMap<Serializable, PermissionTemplateSetting>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			PermissionTemplateSetting permissionTemplateSetting =
				fetchByPrimaryKey(primaryKey);

			if (permissionTemplateSetting != null) {
				map.put(primaryKey, permissionTemplateSetting);
			}

			return map;
		}

		if ((databaseInMaxParameters > 0) &&
			(primaryKeys.size() > databaseInMaxParameters)) {

			Iterator<Serializable> iterator = primaryKeys.iterator();

			while (iterator.hasNext()) {
				Set<Serializable> page = new HashSet<>();

				for (int i = 0;
					 (i < databaseInMaxParameters) && iterator.hasNext(); i++) {

					page.add(iterator.next());
				}

				map.putAll(fetchByPrimaryKeys(page));
			}

			return map;
		}

		StringBundler sb = new StringBundler((primaryKeys.size() * 2) + 1);

		sb.append(getSelectSQL());
		sb.append(" WHERE ");
		sb.append(getPKDBName());
		sb.append(" IN (");

		for (Serializable primaryKey : primaryKeys) {
			sb.append((long)primaryKey);

			sb.append(",");
		}

		sb.setIndex(sb.index() - 1);

		sb.append(")");

		String sql = sb.toString();

		Session session = null;

		try {
			session = openSession();

			Query query = session.createQuery(sql);

			for (PermissionTemplateSetting permissionTemplateSetting :
					(List<PermissionTemplateSetting>)query.list()) {

				map.put(
					permissionTemplateSetting.getPrimaryKeyObj(),
					permissionTemplateSetting);

				cacheResult(permissionTemplateSetting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the permission template settings.
	 *
	 * @return the permission template settings
	 */
	@Override
	public List<PermissionTemplateSetting> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<PermissionTemplateSetting> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<PermissionTemplateSetting> findAll(
		int start, int end,
		OrderByComparator<PermissionTemplateSetting> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<PermissionTemplateSetting> findAll(
		int start, int end,
		OrderByComparator<PermissionTemplateSetting> orderByComparator,
		boolean useFinderCache) {

		boolean productionMode = ctPersistenceHelper.isProductionMode(
			PermissionTemplateSetting.class);

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache && productionMode) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache && productionMode) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PermissionTemplateSetting> list = null;

		if (useFinderCache && productionMode) {
			list = (List<PermissionTemplateSetting>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PERMISSIONTEMPLATESETTING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PERMISSIONTEMPLATESETTING;

				sql = sql.concat(
					PermissionTemplateSettingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PermissionTemplateSetting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache && productionMode) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the permission template settings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PermissionTemplateSetting permissionTemplateSetting : findAll()) {
			remove(permissionTemplateSetting);
		}
	}

	/**
	 * Returns the number of permission template settings.
	 *
	 * @return the number of permission template settings
	 */
	@Override
	public int countAll() {
		boolean productionMode = ctPersistenceHelper.isProductionMode(
			PermissionTemplateSetting.class);

		Long count = null;

		if (productionMode) {
			count = (Long)finderCache.getResult(
				_finderPathCountAll, FINDER_ARGS_EMPTY, this);
		}

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PERMISSIONTEMPLATESETTING);

				count = (Long)query.uniqueResult();

				if (productionMode) {
					finderCache.putResult(
						_finderPathCountAll, FINDER_ARGS_EMPTY, count);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "permissionTemplateSettingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PERMISSIONTEMPLATESETTING;
	}

	@Override
	public Set<String> getCTColumnNames(
		CTColumnResolutionType ctColumnResolutionType) {

		return _ctColumnNamesMap.getOrDefault(
			ctColumnResolutionType, Collections.emptySet());
	}

	@Override
	public List<String> getMappingTableNames() {
		return _mappingTableNames;
	}

	@Override
	public Map<String, Integer> getTableColumnsMap() {
		return PermissionTemplateSettingModelImpl.TABLE_COLUMNS_MAP;
	}

	@Override
	public String getTableName() {
		return "PermissionTemplateSetting";
	}

	@Override
	public List<String[]> getUniqueIndexColumnNames() {
		return _uniqueIndexColumnNames;
	}

	private static final Map<CTColumnResolutionType, Set<String>>
		_ctColumnNamesMap = new EnumMap<CTColumnResolutionType, Set<String>>(
			CTColumnResolutionType.class);
	private static final List<String> _mappingTableNames =
		new ArrayList<String>();
	private static final List<String[]> _uniqueIndexColumnNames =
		new ArrayList<String[]>();

	static {
		Set<String> ctControlColumnNames = new HashSet<String>();
		Set<String> ctStrictColumnNames = new HashSet<String>();

		ctControlColumnNames.add("mvccVersion");
		ctControlColumnNames.add("ctCollectionId");
		ctStrictColumnNames.add("groupId");
		ctStrictColumnNames.add("companyId");
		ctStrictColumnNames.add("classNameId");
		ctStrictColumnNames.add("classPK");
		ctStrictColumnNames.add("permissionTemplateEnabled");

		_ctColumnNamesMap.put(
			CTColumnResolutionType.CONTROL, ctControlColumnNames);
		_ctColumnNamesMap.put(
			CTColumnResolutionType.PK,
			Collections.singleton("permissionTemplateSettingId"));
		_ctColumnNamesMap.put(
			CTColumnResolutionType.STRICT, ctStrictColumnNames);

		_uniqueIndexColumnNames.add(
			new String[] {"groupId", "companyId", "classNameId", "classPK"});
	}

	/**
	 * Initializes the permission template setting persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchByG_C_C_C = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByG_C_C_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			new String[] {"groupId", "companyId", "classNameId", "classPK"},
			true);

		_finderPathCountByG_C_C_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_C_C_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Long.class.getName(), Long.class.getName()
			},
			new String[] {"groupId", "companyId", "classNameId", "classPK"},
			false);

		PermissionTemplateSettingUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PermissionTemplateSettingUtil.setPersistence(null);

		entityCache.removeCache(PermissionTemplateSettingImpl.class.getName());
	}

	@Override
	@Reference(
		target = PermissionTemplateSettingPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PermissionTemplateSettingPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PermissionTemplateSettingPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected CTPersistenceHelper ctPersistenceHelper;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PERMISSIONTEMPLATESETTING =
		"SELECT permissionTemplateSetting FROM PermissionTemplateSetting permissionTemplateSetting";

	private static final String _SQL_SELECT_PERMISSIONTEMPLATESETTING_WHERE =
		"SELECT permissionTemplateSetting FROM PermissionTemplateSetting permissionTemplateSetting WHERE ";

	private static final String _SQL_COUNT_PERMISSIONTEMPLATESETTING =
		"SELECT COUNT(permissionTemplateSetting) FROM PermissionTemplateSetting permissionTemplateSetting";

	private static final String _SQL_COUNT_PERMISSIONTEMPLATESETTING_WHERE =
		"SELECT COUNT(permissionTemplateSetting) FROM PermissionTemplateSetting permissionTemplateSetting WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"permissionTemplateSetting.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PermissionTemplateSetting exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PermissionTemplateSetting exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PermissionTemplateSettingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}