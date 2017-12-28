package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.portlet.social.NoSuchActivityAchievementException;
import com.liferay.portlet.social.model.SocialActivityAchievement;
import com.liferay.portlet.social.model.impl.SocialActivityAchievementImpl;
import com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl;
import com.liferay.portlet.social.service.persistence.SocialActivityAchievementPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the social activity achievement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivityAchievementPersistence
 * @see SocialActivityAchievementUtil
 * @generated
 */
public class SocialActivityAchievementPersistenceImpl
    extends BasePersistenceImpl<SocialActivityAchievement>
    implements SocialActivityAchievementPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SocialActivityAchievementUtil} to access the social activity achievement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SocialActivityAchievementImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            SocialActivityAchievementModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGroupId", new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "socialActivityAchievement.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_U = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_U",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_U",
            new String[] { Long.class.getName(), Long.class.getName() },
            SocialActivityAchievementModelImpl.GROUPID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.USERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_U = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByG_U",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_G_U_GROUPID_2 = "socialActivityAchievement.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_U_USERID_2 = "socialActivityAchievement.userId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_N",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_N",
            new String[] { Long.class.getName(), String.class.getName() },
            SocialActivityAchievementModelImpl.GROUPID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_N = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByG_N",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_G_N_GROUPID_2 = "socialActivityAchievement.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_N_NAME_1 = "socialActivityAchievement.name IS NULL";
    private static final String _FINDER_COLUMN_G_N_NAME_2 = "socialActivityAchievement.name = ?";
    private static final String _FINDER_COLUMN_G_N_NAME_3 = "(socialActivityAchievement.name IS NULL OR socialActivityAchievement.name = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_F = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_F",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_F",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            SocialActivityAchievementModelImpl.GROUPID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.FIRSTINGROUP_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_F = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByG_F",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    private static final String _FINDER_COLUMN_G_F_GROUPID_2 = "socialActivityAchievement.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_F_FIRSTINGROUP_2 = "socialActivityAchievement.firstInGroup = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_G_U_N = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByG_U_N",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                String.class.getName()
            },
            SocialActivityAchievementModelImpl.GROUPID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.USERID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_U_N = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByG_U_N",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_G_U_N_GROUPID_2 = "socialActivityAchievement.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_U_N_USERID_2 = "socialActivityAchievement.userId = ? AND ";
    private static final String _FINDER_COLUMN_G_U_N_NAME_1 = "socialActivityAchievement.name IS NULL";
    private static final String _FINDER_COLUMN_G_U_N_NAME_2 = "socialActivityAchievement.name = ?";
    private static final String _FINDER_COLUMN_G_U_N_NAME_3 = "(socialActivityAchievement.name IS NULL OR socialActivityAchievement.name = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_U_F = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_U_F",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U_F = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_U_F",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                Boolean.class.getName()
            },
            SocialActivityAchievementModelImpl.GROUPID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.USERID_COLUMN_BITMASK |
            SocialActivityAchievementModelImpl.FIRSTINGROUP_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_U_F = new FinderPath(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByG_U_F",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                Boolean.class.getName()
            });
    private static final String _FINDER_COLUMN_G_U_F_GROUPID_2 = "socialActivityAchievement.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_U_F_USERID_2 = "socialActivityAchievement.userId = ? AND ";
    private static final String _FINDER_COLUMN_G_U_F_FIRSTINGROUP_2 = "socialActivityAchievement.firstInGroup = ?";
    private static final String _SQL_SELECT_SOCIALACTIVITYACHIEVEMENT = "SELECT socialActivityAchievement FROM SocialActivityAchievement socialActivityAchievement";
    private static final String _SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE = "SELECT socialActivityAchievement FROM SocialActivityAchievement socialActivityAchievement WHERE ";
    private static final String _SQL_COUNT_SOCIALACTIVITYACHIEVEMENT = "SELECT COUNT(socialActivityAchievement) FROM SocialActivityAchievement socialActivityAchievement";
    private static final String _SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE = "SELECT COUNT(socialActivityAchievement) FROM SocialActivityAchievement socialActivityAchievement WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "socialActivityAchievement.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SocialActivityAchievement exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SocialActivityAchievement exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
    private static Log _log = LogFactoryUtil.getLog(SocialActivityAchievementPersistenceImpl.class);
    private static SocialActivityAchievement _nullSocialActivityAchievement = new SocialActivityAchievementImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SocialActivityAchievement> toCacheModel() {
                return _nullSocialActivityAchievementCacheModel;
            }
        };

    private static CacheModel<SocialActivityAchievement> _nullSocialActivityAchievementCacheModel =
        new CacheModel<SocialActivityAchievement>() {
            @Override
            public SocialActivityAchievement toEntityModel() {
                return _nullSocialActivityAchievement;
            }
        };

    public SocialActivityAchievementPersistenceImpl() {
        setModelClass(SocialActivityAchievement.class);
    }

    /**
     * Returns all the social activity achievements where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the social activity achievements where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @return the range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByGroupId(long groupId,
        int start, int end) throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the social activity achievements where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByGroupId(long groupId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<SocialActivityAchievement> list = (List<SocialActivityAchievement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SocialActivityAchievement socialActivityAchievement : list) {
                if ((groupId != socialActivityAchievement.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SocialActivityAchievement>(list);
                } else {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByGroupId_First(groupId,
                orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<SocialActivityAchievement> list = findByGroupId(groupId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<SocialActivityAchievement> list = findByGroupId(groupId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the social activity achievements before and after the current social activity achievement in the ordered set where groupId = &#63;.
     *
     * @param activityAchievementId the primary key of the current social activity achievement
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement[] findByGroupId_PrevAndNext(
        long activityAchievementId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = findByPrimaryKey(activityAchievementId);

        Session session = null;

        try {
            session = openSession();

            SocialActivityAchievement[] array = new SocialActivityAchievementImpl[3];

            array[0] = getByGroupId_PrevAndNext(session,
                    socialActivityAchievement, groupId, orderByComparator, true);

            array[1] = socialActivityAchievement;

            array[2] = getByGroupId_PrevAndNext(session,
                    socialActivityAchievement, groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SocialActivityAchievement getByGroupId_PrevAndNext(
        Session session, SocialActivityAchievement socialActivityAchievement,
        long groupId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(socialActivityAchievement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SocialActivityAchievement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the social activity achievements where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (SocialActivityAchievement socialActivityAchievement : findByGroupId(
                groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(socialActivityAchievement);
        }
    }

    /**
     * Returns the number of social activity achievements where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the social activity achievements where groupId = &#63; and userId = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @return the matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_U(long groupId, long userId)
        throws SystemException {
        return findByG_U(groupId, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the social activity achievements where groupId = &#63; and userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @return the range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_U(long groupId, long userId,
        int start, int end) throws SystemException {
        return findByG_U(groupId, userId, start, end, null);
    }

    /**
     * Returns an ordered range of all the social activity achievements where groupId = &#63; and userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_U(long groupId, long userId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U;
            finderArgs = new Object[] { groupId, userId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_U;
            finderArgs = new Object[] {
                    groupId, userId,
                    
                    start, end, orderByComparator
                };
        }

        List<SocialActivityAchievement> list = (List<SocialActivityAchievement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SocialActivityAchievement socialActivityAchievement : list) {
                if ((groupId != socialActivityAchievement.getGroupId()) ||
                        (userId != socialActivityAchievement.getUserId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_U_GROUPID_2);

            query.append(_FINDER_COLUMN_G_U_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(userId);

                if (!pagination) {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SocialActivityAchievement>(list);
                } else {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and userId = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_U_First(long groupId, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_U_First(groupId,
                userId, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and userId = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_U_First(long groupId,
        long userId, OrderByComparator orderByComparator)
        throws SystemException {
        List<SocialActivityAchievement> list = findByG_U(groupId, userId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and userId = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_U_Last(long groupId, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_U_Last(groupId,
                userId, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and userId = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_U_Last(long groupId, long userId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_U(groupId, userId);

        if (count == 0) {
            return null;
        }

        List<SocialActivityAchievement> list = findByG_U(groupId, userId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the social activity achievements before and after the current social activity achievement in the ordered set where groupId = &#63; and userId = &#63;.
     *
     * @param activityAchievementId the primary key of the current social activity achievement
     * @param groupId the group ID
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement[] findByG_U_PrevAndNext(
        long activityAchievementId, long groupId, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = findByPrimaryKey(activityAchievementId);

        Session session = null;

        try {
            session = openSession();

            SocialActivityAchievement[] array = new SocialActivityAchievementImpl[3];

            array[0] = getByG_U_PrevAndNext(session, socialActivityAchievement,
                    groupId, userId, orderByComparator, true);

            array[1] = socialActivityAchievement;

            array[2] = getByG_U_PrevAndNext(session, socialActivityAchievement,
                    groupId, userId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SocialActivityAchievement getByG_U_PrevAndNext(Session session,
        SocialActivityAchievement socialActivityAchievement, long groupId,
        long userId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

        query.append(_FINDER_COLUMN_G_U_GROUPID_2);

        query.append(_FINDER_COLUMN_G_U_USERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(socialActivityAchievement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SocialActivityAchievement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the social activity achievements where groupId = &#63; and userId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_U(long groupId, long userId)
        throws SystemException {
        for (SocialActivityAchievement socialActivityAchievement : findByG_U(
                groupId, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(socialActivityAchievement);
        }
    }

    /**
     * Returns the number of social activity achievements where groupId = &#63; and userId = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @return the number of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_U(long groupId, long userId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_U;

        Object[] finderArgs = new Object[] { groupId, userId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_U_GROUPID_2);

            query.append(_FINDER_COLUMN_G_U_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(userId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the social activity achievements where groupId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param name the name
     * @return the matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_N(long groupId, String name)
        throws SystemException {
        return findByG_N(groupId, name, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the social activity achievements where groupId = &#63; and name = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param name the name
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @return the range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_N(long groupId, String name,
        int start, int end) throws SystemException {
        return findByG_N(groupId, name, start, end, null);
    }

    /**
     * Returns an ordered range of all the social activity achievements where groupId = &#63; and name = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param name the name
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_N(long groupId, String name,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N;
            finderArgs = new Object[] { groupId, name };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N;
            finderArgs = new Object[] {
                    groupId, name,
                    
                    start, end, orderByComparator
                };
        }

        List<SocialActivityAchievement> list = (List<SocialActivityAchievement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SocialActivityAchievement socialActivityAchievement : list) {
                if ((groupId != socialActivityAchievement.getGroupId()) ||
                        !Validator.equals(name,
                            socialActivityAchievement.getName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_N_GROUPID_2);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_G_N_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_N_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_G_N_NAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindName) {
                    qPos.add(name);
                }

                if (!pagination) {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SocialActivityAchievement>(list);
                } else {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_N_First(long groupId, String name,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_N_First(groupId,
                name, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_N_First(long groupId,
        String name, OrderByComparator orderByComparator)
        throws SystemException {
        List<SocialActivityAchievement> list = findByG_N(groupId, name, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_N_Last(long groupId, String name,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_N_Last(groupId,
                name, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_N_Last(long groupId, String name,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_N(groupId, name);

        if (count == 0) {
            return null;
        }

        List<SocialActivityAchievement> list = findByG_N(groupId, name,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the social activity achievements before and after the current social activity achievement in the ordered set where groupId = &#63; and name = &#63;.
     *
     * @param activityAchievementId the primary key of the current social activity achievement
     * @param groupId the group ID
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement[] findByG_N_PrevAndNext(
        long activityAchievementId, long groupId, String name,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = findByPrimaryKey(activityAchievementId);

        Session session = null;

        try {
            session = openSession();

            SocialActivityAchievement[] array = new SocialActivityAchievementImpl[3];

            array[0] = getByG_N_PrevAndNext(session, socialActivityAchievement,
                    groupId, name, orderByComparator, true);

            array[1] = socialActivityAchievement;

            array[2] = getByG_N_PrevAndNext(session, socialActivityAchievement,
                    groupId, name, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SocialActivityAchievement getByG_N_PrevAndNext(Session session,
        SocialActivityAchievement socialActivityAchievement, long groupId,
        String name, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

        query.append(_FINDER_COLUMN_G_N_GROUPID_2);

        boolean bindName = false;

        if (name == null) {
            query.append(_FINDER_COLUMN_G_N_NAME_1);
        } else if (name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_G_N_NAME_3);
        } else {
            bindName = true;

            query.append(_FINDER_COLUMN_G_N_NAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindName) {
            qPos.add(name);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(socialActivityAchievement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SocialActivityAchievement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the social activity achievements where groupId = &#63; and name = &#63; from the database.
     *
     * @param groupId the group ID
     * @param name the name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_N(long groupId, String name)
        throws SystemException {
        for (SocialActivityAchievement socialActivityAchievement : findByG_N(
                groupId, name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(socialActivityAchievement);
        }
    }

    /**
     * Returns the number of social activity achievements where groupId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param name the name
     * @return the number of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_N(long groupId, String name) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_N;

        Object[] finderArgs = new Object[] { groupId, name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_N_GROUPID_2);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_G_N_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_N_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_G_N_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindName) {
                    qPos.add(name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the social activity achievements where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @return the matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_F(long groupId,
        boolean firstInGroup) throws SystemException {
        return findByG_F(groupId, firstInGroup, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the social activity achievements where groupId = &#63; and firstInGroup = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @return the range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_F(long groupId,
        boolean firstInGroup, int start, int end) throws SystemException {
        return findByG_F(groupId, firstInGroup, start, end, null);
    }

    /**
     * Returns an ordered range of all the social activity achievements where groupId = &#63; and firstInGroup = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_F(long groupId,
        boolean firstInGroup, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F;
            finderArgs = new Object[] { groupId, firstInGroup };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_F;
            finderArgs = new Object[] {
                    groupId, firstInGroup,
                    
                    start, end, orderByComparator
                };
        }

        List<SocialActivityAchievement> list = (List<SocialActivityAchievement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SocialActivityAchievement socialActivityAchievement : list) {
                if ((groupId != socialActivityAchievement.getGroupId()) ||
                        (firstInGroup != socialActivityAchievement.getFirstInGroup())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_F_GROUPID_2);

            query.append(_FINDER_COLUMN_G_F_FIRSTINGROUP_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(firstInGroup);

                if (!pagination) {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SocialActivityAchievement>(list);
                } else {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_F_First(long groupId,
        boolean firstInGroup, OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_F_First(groupId,
                firstInGroup, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", firstInGroup=");
        msg.append(firstInGroup);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_F_First(long groupId,
        boolean firstInGroup, OrderByComparator orderByComparator)
        throws SystemException {
        List<SocialActivityAchievement> list = findByG_F(groupId, firstInGroup,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_F_Last(long groupId,
        boolean firstInGroup, OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_F_Last(groupId,
                firstInGroup, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", firstInGroup=");
        msg.append(firstInGroup);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_F_Last(long groupId,
        boolean firstInGroup, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByG_F(groupId, firstInGroup);

        if (count == 0) {
            return null;
        }

        List<SocialActivityAchievement> list = findByG_F(groupId, firstInGroup,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the social activity achievements before and after the current social activity achievement in the ordered set where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param activityAchievementId the primary key of the current social activity achievement
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement[] findByG_F_PrevAndNext(
        long activityAchievementId, long groupId, boolean firstInGroup,
        OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = findByPrimaryKey(activityAchievementId);

        Session session = null;

        try {
            session = openSession();

            SocialActivityAchievement[] array = new SocialActivityAchievementImpl[3];

            array[0] = getByG_F_PrevAndNext(session, socialActivityAchievement,
                    groupId, firstInGroup, orderByComparator, true);

            array[1] = socialActivityAchievement;

            array[2] = getByG_F_PrevAndNext(session, socialActivityAchievement,
                    groupId, firstInGroup, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SocialActivityAchievement getByG_F_PrevAndNext(Session session,
        SocialActivityAchievement socialActivityAchievement, long groupId,
        boolean firstInGroup, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

        query.append(_FINDER_COLUMN_G_F_GROUPID_2);

        query.append(_FINDER_COLUMN_G_F_FIRSTINGROUP_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(firstInGroup);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(socialActivityAchievement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SocialActivityAchievement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the social activity achievements where groupId = &#63; and firstInGroup = &#63; from the database.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_F(long groupId, boolean firstInGroup)
        throws SystemException {
        for (SocialActivityAchievement socialActivityAchievement : findByG_F(
                groupId, firstInGroup, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(socialActivityAchievement);
        }
    }

    /**
     * Returns the number of social activity achievements where groupId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param firstInGroup the first in group
     * @return the number of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_F(long groupId, boolean firstInGroup)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_F;

        Object[] finderArgs = new Object[] { groupId, firstInGroup };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_F_GROUPID_2);

            query.append(_FINDER_COLUMN_G_F_FIRSTINGROUP_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(firstInGroup);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the social activity achievement where groupId = &#63; and userId = &#63; and name = &#63; or throws a {@link com.liferay.portlet.social.NoSuchActivityAchievementException} if it could not be found.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param name the name
     * @return the matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_U_N(long groupId, long userId,
        String name) throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_U_N(groupId,
                userId, name);

        if (socialActivityAchievement == null) {
            StringBundler msg = new StringBundler(8);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("groupId=");
            msg.append(groupId);

            msg.append(", userId=");
            msg.append(userId);

            msg.append(", name=");
            msg.append(name);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchActivityAchievementException(msg.toString());
        }

        return socialActivityAchievement;
    }

    /**
     * Returns the social activity achievement where groupId = &#63; and userId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param name the name
     * @return the matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_U_N(long groupId, long userId,
        String name) throws SystemException {
        return fetchByG_U_N(groupId, userId, name, true);
    }

    /**
     * Returns the social activity achievement where groupId = &#63; and userId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param name the name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_U_N(long groupId, long userId,
        String name, boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { groupId, userId, name };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_U_N,
                    finderArgs, this);
        }

        if (result instanceof SocialActivityAchievement) {
            SocialActivityAchievement socialActivityAchievement = (SocialActivityAchievement) result;

            if ((groupId != socialActivityAchievement.getGroupId()) ||
                    (userId != socialActivityAchievement.getUserId()) ||
                    !Validator.equals(name, socialActivityAchievement.getName())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(5);

            query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_U_N_GROUPID_2);

            query.append(_FINDER_COLUMN_G_U_N_USERID_2);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_G_U_N_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_U_N_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_G_U_N_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(userId);

                if (bindName) {
                    qPos.add(name);
                }

                List<SocialActivityAchievement> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_U_N,
                        finderArgs, list);
                } else {
                    SocialActivityAchievement socialActivityAchievement = list.get(0);

                    result = socialActivityAchievement;

                    cacheResult(socialActivityAchievement);

                    if ((socialActivityAchievement.getGroupId() != groupId) ||
                            (socialActivityAchievement.getUserId() != userId) ||
                            (socialActivityAchievement.getName() == null) ||
                            !socialActivityAchievement.getName().equals(name)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_U_N,
                            finderArgs, socialActivityAchievement);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_U_N,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (SocialActivityAchievement) result;
        }
    }

    /**
     * Removes the social activity achievement where groupId = &#63; and userId = &#63; and name = &#63; from the database.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param name the name
     * @return the social activity achievement that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement removeByG_U_N(long groupId, long userId,
        String name) throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = findByG_U_N(groupId,
                userId, name);

        return remove(socialActivityAchievement);
    }

    /**
     * Returns the number of social activity achievements where groupId = &#63; and userId = &#63; and name = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param name the name
     * @return the number of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_U_N(long groupId, long userId, String name)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_U_N;

        Object[] finderArgs = new Object[] { groupId, userId, name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_U_N_GROUPID_2);

            query.append(_FINDER_COLUMN_G_U_N_USERID_2);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_G_U_N_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_U_N_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_G_U_N_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(userId);

                if (bindName) {
                    qPos.add(name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the social activity achievements where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @return the matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_U_F(long groupId,
        long userId, boolean firstInGroup) throws SystemException {
        return findByG_U_F(groupId, userId, firstInGroup, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the social activity achievements where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @return the range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_U_F(long groupId,
        long userId, boolean firstInGroup, int start, int end)
        throws SystemException {
        return findByG_U_F(groupId, userId, firstInGroup, start, end, null);
    }

    /**
     * Returns an ordered range of all the social activity achievements where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findByG_U_F(long groupId,
        long userId, boolean firstInGroup, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U_F;
            finderArgs = new Object[] { groupId, userId, firstInGroup };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_U_F;
            finderArgs = new Object[] {
                    groupId, userId, firstInGroup,
                    
                    start, end, orderByComparator
                };
        }

        List<SocialActivityAchievement> list = (List<SocialActivityAchievement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SocialActivityAchievement socialActivityAchievement : list) {
                if ((groupId != socialActivityAchievement.getGroupId()) ||
                        (userId != socialActivityAchievement.getUserId()) ||
                        (firstInGroup != socialActivityAchievement.getFirstInGroup())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_U_F_GROUPID_2);

            query.append(_FINDER_COLUMN_G_U_F_USERID_2);

            query.append(_FINDER_COLUMN_G_U_F_FIRSTINGROUP_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(userId);

                qPos.add(firstInGroup);

                if (!pagination) {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SocialActivityAchievement>(list);
                } else {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_U_F_First(long groupId,
        long userId, boolean firstInGroup, OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_U_F_First(groupId,
                userId, firstInGroup, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", userId=");
        msg.append(userId);

        msg.append(", firstInGroup=");
        msg.append(firstInGroup);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the first social activity achievement in the ordered set where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_U_F_First(long groupId,
        long userId, boolean firstInGroup, OrderByComparator orderByComparator)
        throws SystemException {
        List<SocialActivityAchievement> list = findByG_U_F(groupId, userId,
                firstInGroup, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByG_U_F_Last(long groupId,
        long userId, boolean firstInGroup, OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByG_U_F_Last(groupId,
                userId, firstInGroup, orderByComparator);

        if (socialActivityAchievement != null) {
            return socialActivityAchievement;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", userId=");
        msg.append(userId);

        msg.append(", firstInGroup=");
        msg.append(firstInGroup);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchActivityAchievementException(msg.toString());
    }

    /**
     * Returns the last social activity achievement in the ordered set where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching social activity achievement, or <code>null</code> if a matching social activity achievement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByG_U_F_Last(long groupId,
        long userId, boolean firstInGroup, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByG_U_F(groupId, userId, firstInGroup);

        if (count == 0) {
            return null;
        }

        List<SocialActivityAchievement> list = findByG_U_F(groupId, userId,
                firstInGroup, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the social activity achievements before and after the current social activity achievement in the ordered set where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param activityAchievementId the primary key of the current social activity achievement
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement[] findByG_U_F_PrevAndNext(
        long activityAchievementId, long groupId, long userId,
        boolean firstInGroup, OrderByComparator orderByComparator)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = findByPrimaryKey(activityAchievementId);

        Session session = null;

        try {
            session = openSession();

            SocialActivityAchievement[] array = new SocialActivityAchievementImpl[3];

            array[0] = getByG_U_F_PrevAndNext(session,
                    socialActivityAchievement, groupId, userId, firstInGroup,
                    orderByComparator, true);

            array[1] = socialActivityAchievement;

            array[2] = getByG_U_F_PrevAndNext(session,
                    socialActivityAchievement, groupId, userId, firstInGroup,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SocialActivityAchievement getByG_U_F_PrevAndNext(
        Session session, SocialActivityAchievement socialActivityAchievement,
        long groupId, long userId, boolean firstInGroup,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT_WHERE);

        query.append(_FINDER_COLUMN_G_U_F_GROUPID_2);

        query.append(_FINDER_COLUMN_G_U_F_USERID_2);

        query.append(_FINDER_COLUMN_G_U_F_FIRSTINGROUP_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(userId);

        qPos.add(firstInGroup);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(socialActivityAchievement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SocialActivityAchievement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the social activity achievements where groupId = &#63; and userId = &#63; and firstInGroup = &#63; from the database.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_U_F(long groupId, long userId, boolean firstInGroup)
        throws SystemException {
        for (SocialActivityAchievement socialActivityAchievement : findByG_U_F(
                groupId, userId, firstInGroup, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(socialActivityAchievement);
        }
    }

    /**
     * Returns the number of social activity achievements where groupId = &#63; and userId = &#63; and firstInGroup = &#63;.
     *
     * @param groupId the group ID
     * @param userId the user ID
     * @param firstInGroup the first in group
     * @return the number of matching social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_U_F(long groupId, long userId, boolean firstInGroup)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_U_F;

        Object[] finderArgs = new Object[] { groupId, userId, firstInGroup };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_U_F_GROUPID_2);

            query.append(_FINDER_COLUMN_G_U_F_USERID_2);

            query.append(_FINDER_COLUMN_G_U_F_FIRSTINGROUP_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(userId);

                qPos.add(firstInGroup);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the social activity achievement in the entity cache if it is enabled.
     *
     * @param socialActivityAchievement the social activity achievement
     */
    @Override
    public void cacheResult(SocialActivityAchievement socialActivityAchievement) {
        EntityCacheUtil.putResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            socialActivityAchievement.getPrimaryKey(), socialActivityAchievement);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_U_N,
            new Object[] {
                socialActivityAchievement.getGroupId(),
                socialActivityAchievement.getUserId(),
                socialActivityAchievement.getName()
            }, socialActivityAchievement);

        socialActivityAchievement.resetOriginalValues();
    }

    /**
     * Caches the social activity achievements in the entity cache if it is enabled.
     *
     * @param socialActivityAchievements the social activity achievements
     */
    @Override
    public void cacheResult(
        List<SocialActivityAchievement> socialActivityAchievements) {
        for (SocialActivityAchievement socialActivityAchievement : socialActivityAchievements) {
            if (EntityCacheUtil.getResult(
                        SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
                        SocialActivityAchievementImpl.class,
                        socialActivityAchievement.getPrimaryKey()) == null) {
                cacheResult(socialActivityAchievement);
            } else {
                socialActivityAchievement.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all social activity achievements.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SocialActivityAchievementImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SocialActivityAchievementImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the social activity achievement.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SocialActivityAchievement socialActivityAchievement) {
        EntityCacheUtil.removeResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            socialActivityAchievement.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(socialActivityAchievement);
    }

    @Override
    public void clearCache(
        List<SocialActivityAchievement> socialActivityAchievements) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SocialActivityAchievement socialActivityAchievement : socialActivityAchievements) {
            EntityCacheUtil.removeResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
                SocialActivityAchievementImpl.class,
                socialActivityAchievement.getPrimaryKey());

            clearUniqueFindersCache(socialActivityAchievement);
        }
    }

    protected void cacheUniqueFindersCache(
        SocialActivityAchievement socialActivityAchievement) {
        if (socialActivityAchievement.isNew()) {
            Object[] args = new Object[] {
                    socialActivityAchievement.getGroupId(),
                    socialActivityAchievement.getUserId(),
                    socialActivityAchievement.getName()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_U_N, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_U_N, args,
                socialActivityAchievement);
        } else {
            SocialActivityAchievementModelImpl socialActivityAchievementModelImpl =
                (SocialActivityAchievementModelImpl) socialActivityAchievement;

            if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_G_U_N.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        socialActivityAchievement.getGroupId(),
                        socialActivityAchievement.getUserId(),
                        socialActivityAchievement.getName()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_U_N, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_U_N, args,
                    socialActivityAchievement);
            }
        }
    }

    protected void clearUniqueFindersCache(
        SocialActivityAchievement socialActivityAchievement) {
        SocialActivityAchievementModelImpl socialActivityAchievementModelImpl = (SocialActivityAchievementModelImpl) socialActivityAchievement;

        Object[] args = new Object[] {
                socialActivityAchievement.getGroupId(),
                socialActivityAchievement.getUserId(),
                socialActivityAchievement.getName()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_U_N, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_U_N, args);

        if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_G_U_N.getColumnBitmask()) != 0) {
            args = new Object[] {
                    socialActivityAchievementModelImpl.getOriginalGroupId(),
                    socialActivityAchievementModelImpl.getOriginalUserId(),
                    socialActivityAchievementModelImpl.getOriginalName()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_U_N, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_U_N, args);
        }
    }

    /**
     * Creates a new social activity achievement with the primary key. Does not add the social activity achievement to the database.
     *
     * @param activityAchievementId the primary key for the new social activity achievement
     * @return the new social activity achievement
     */
    @Override
    public SocialActivityAchievement create(long activityAchievementId) {
        SocialActivityAchievement socialActivityAchievement = new SocialActivityAchievementImpl();

        socialActivityAchievement.setNew(true);
        socialActivityAchievement.setPrimaryKey(activityAchievementId);

        return socialActivityAchievement;
    }

    /**
     * Removes the social activity achievement with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param activityAchievementId the primary key of the social activity achievement
     * @return the social activity achievement that was removed
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement remove(long activityAchievementId)
        throws NoSuchActivityAchievementException, SystemException {
        return remove((Serializable) activityAchievementId);
    }

    /**
     * Removes the social activity achievement with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the social activity achievement
     * @return the social activity achievement that was removed
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement remove(Serializable primaryKey)
        throws NoSuchActivityAchievementException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SocialActivityAchievement socialActivityAchievement = (SocialActivityAchievement) session.get(SocialActivityAchievementImpl.class,
                    primaryKey);

            if (socialActivityAchievement == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchActivityAchievementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(socialActivityAchievement);
        } catch (NoSuchActivityAchievementException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SocialActivityAchievement removeImpl(
        SocialActivityAchievement socialActivityAchievement)
        throws SystemException {
        socialActivityAchievement = toUnwrappedModel(socialActivityAchievement);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(socialActivityAchievement)) {
                socialActivityAchievement = (SocialActivityAchievement) session.get(SocialActivityAchievementImpl.class,
                        socialActivityAchievement.getPrimaryKeyObj());
            }

            if (socialActivityAchievement != null) {
                session.delete(socialActivityAchievement);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (socialActivityAchievement != null) {
            clearCache(socialActivityAchievement);
        }

        return socialActivityAchievement;
    }

    @Override
    public SocialActivityAchievement updateImpl(
        com.liferay.portlet.social.model.SocialActivityAchievement socialActivityAchievement)
        throws SystemException {
        socialActivityAchievement = toUnwrappedModel(socialActivityAchievement);

        boolean isNew = socialActivityAchievement.isNew();

        SocialActivityAchievementModelImpl socialActivityAchievementModelImpl = (SocialActivityAchievementModelImpl) socialActivityAchievement;

        Session session = null;

        try {
            session = openSession();

            if (socialActivityAchievement.isNew()) {
                session.save(socialActivityAchievement);

                socialActivityAchievement.setNew(false);
            } else {
                session.merge(socialActivityAchievement);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew ||
                !SocialActivityAchievementModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        socialActivityAchievementModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] {
                        socialActivityAchievementModelImpl.getGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        socialActivityAchievementModelImpl.getOriginalGroupId(),
                        socialActivityAchievementModelImpl.getOriginalUserId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_U, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U,
                    args);

                args = new Object[] {
                        socialActivityAchievementModelImpl.getGroupId(),
                        socialActivityAchievementModelImpl.getUserId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_U, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U,
                    args);
            }

            if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        socialActivityAchievementModelImpl.getOriginalGroupId(),
                        socialActivityAchievementModelImpl.getOriginalName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N,
                    args);

                args = new Object[] {
                        socialActivityAchievementModelImpl.getGroupId(),
                        socialActivityAchievementModelImpl.getName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N,
                    args);
            }

            if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        socialActivityAchievementModelImpl.getOriginalGroupId(),
                        socialActivityAchievementModelImpl.getOriginalFirstInGroup()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_F, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F,
                    args);

                args = new Object[] {
                        socialActivityAchievementModelImpl.getGroupId(),
                        socialActivityAchievementModelImpl.getFirstInGroup()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_F, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F,
                    args);
            }

            if ((socialActivityAchievementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U_F.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        socialActivityAchievementModelImpl.getOriginalGroupId(),
                        socialActivityAchievementModelImpl.getOriginalUserId(),
                        socialActivityAchievementModelImpl.getOriginalFirstInGroup()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_U_F, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U_F,
                    args);

                args = new Object[] {
                        socialActivityAchievementModelImpl.getGroupId(),
                        socialActivityAchievementModelImpl.getUserId(),
                        socialActivityAchievementModelImpl.getFirstInGroup()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_U_F, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_U_F,
                    args);
            }
        }

        EntityCacheUtil.putResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
            SocialActivityAchievementImpl.class,
            socialActivityAchievement.getPrimaryKey(), socialActivityAchievement);

        clearUniqueFindersCache(socialActivityAchievement);
        cacheUniqueFindersCache(socialActivityAchievement);

        return socialActivityAchievement;
    }

    protected SocialActivityAchievement toUnwrappedModel(
        SocialActivityAchievement socialActivityAchievement) {
        if (socialActivityAchievement instanceof SocialActivityAchievementImpl) {
            return socialActivityAchievement;
        }

        SocialActivityAchievementImpl socialActivityAchievementImpl = new SocialActivityAchievementImpl();

        socialActivityAchievementImpl.setNew(socialActivityAchievement.isNew());
        socialActivityAchievementImpl.setPrimaryKey(socialActivityAchievement.getPrimaryKey());

        socialActivityAchievementImpl.setActivityAchievementId(socialActivityAchievement.getActivityAchievementId());
        socialActivityAchievementImpl.setGroupId(socialActivityAchievement.getGroupId());
        socialActivityAchievementImpl.setCompanyId(socialActivityAchievement.getCompanyId());
        socialActivityAchievementImpl.setUserId(socialActivityAchievement.getUserId());
        socialActivityAchievementImpl.setCreateDate(socialActivityAchievement.getCreateDate());
        socialActivityAchievementImpl.setName(socialActivityAchievement.getName());
        socialActivityAchievementImpl.setFirstInGroup(socialActivityAchievement.isFirstInGroup());

        return socialActivityAchievementImpl;
    }

    /**
     * Returns the social activity achievement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the social activity achievement
     * @return the social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByPrimaryKey(Serializable primaryKey)
        throws NoSuchActivityAchievementException, SystemException {
        SocialActivityAchievement socialActivityAchievement = fetchByPrimaryKey(primaryKey);

        if (socialActivityAchievement == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchActivityAchievementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return socialActivityAchievement;
    }

    /**
     * Returns the social activity achievement with the primary key or throws a {@link com.liferay.portlet.social.NoSuchActivityAchievementException} if it could not be found.
     *
     * @param activityAchievementId the primary key of the social activity achievement
     * @return the social activity achievement
     * @throws com.liferay.portlet.social.NoSuchActivityAchievementException if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement findByPrimaryKey(
        long activityAchievementId)
        throws NoSuchActivityAchievementException, SystemException {
        return findByPrimaryKey((Serializable) activityAchievementId);
    }

    /**
     * Returns the social activity achievement with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the social activity achievement
     * @return the social activity achievement, or <code>null</code> if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SocialActivityAchievement socialActivityAchievement = (SocialActivityAchievement) EntityCacheUtil.getResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
                SocialActivityAchievementImpl.class, primaryKey);

        if (socialActivityAchievement == _nullSocialActivityAchievement) {
            return null;
        }

        if (socialActivityAchievement == null) {
            Session session = null;

            try {
                session = openSession();

                socialActivityAchievement = (SocialActivityAchievement) session.get(SocialActivityAchievementImpl.class,
                        primaryKey);

                if (socialActivityAchievement != null) {
                    cacheResult(socialActivityAchievement);
                } else {
                    EntityCacheUtil.putResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
                        SocialActivityAchievementImpl.class, primaryKey,
                        _nullSocialActivityAchievement);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SocialActivityAchievementModelImpl.ENTITY_CACHE_ENABLED,
                    SocialActivityAchievementImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return socialActivityAchievement;
    }

    /**
     * Returns the social activity achievement with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param activityAchievementId the primary key of the social activity achievement
     * @return the social activity achievement, or <code>null</code> if a social activity achievement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SocialActivityAchievement fetchByPrimaryKey(
        long activityAchievementId) throws SystemException {
        return fetchByPrimaryKey((Serializable) activityAchievementId);
    }

    /**
     * Returns all the social activity achievements.
     *
     * @return the social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the social activity achievements.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @return the range of social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the social activity achievements.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.social.model.impl.SocialActivityAchievementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of social activity achievements
     * @param end the upper bound of the range of social activity achievements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SocialActivityAchievement> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<SocialActivityAchievement> list = (List<SocialActivityAchievement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SOCIALACTIVITYACHIEVEMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SOCIALACTIVITYACHIEVEMENT;

                if (pagination) {
                    sql = sql.concat(SocialActivityAchievementModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SocialActivityAchievement>(list);
                } else {
                    list = (List<SocialActivityAchievement>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the social activity achievements from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SocialActivityAchievement socialActivityAchievement : findAll()) {
            remove(socialActivityAchievement);
        }
    }

    /**
     * Returns the number of social activity achievements.
     *
     * @return the number of social activity achievements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_SOCIALACTIVITYACHIEVEMENT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the social activity achievement persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.portal.util.PropsUtil.get(
                        "value.object.listener.com.liferay.portlet.social.model.SocialActivityAchievement")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SocialActivityAchievement>> listenersList = new ArrayList<ModelListener<SocialActivityAchievement>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SocialActivityAchievement>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SocialActivityAchievementImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
