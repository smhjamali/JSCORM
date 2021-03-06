package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFUser;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFUserPersistenceImpl
 * @see LFUserUtil
 * @generated
 */
public interface LFUserPersistence extends BasePersistence<LFUser> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFUserUtil} to access the l f user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the l f user in the entity cache if it is enabled.
    *
    * @param lfUser the l f user
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFUser lfUser);

    /**
    * Caches the l f users in the entity cache if it is enabled.
    *
    * @param lfUsers the l f users
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> lfUsers);

    /**
    * Creates a new l f user with the primary key. Does not add the l f user to the database.
    *
    * @param lfid the primary key for the new l f user
    * @return the new l f user
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser create(long lfid);

    /**
    * Removes the l f user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lfid the primary key of the l f user
    * @return the l f user that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException if a l f user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser remove(long lfid)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFUser updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFUser lfUser, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f user with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFUserException} if it could not be found.
    *
    * @param lfid the primary key of the l f user
    * @return the l f user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException if a l f user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser findByPrimaryKey(
        long lfid)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f user with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param lfid the primary key of the l f user
    * @return the l f user, or <code>null</code> if a l f user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser fetchByPrimaryKey(
        long lfid) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f user where id = &#63; or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFUserException} if it could not be found.
    *
    * @param id the ID
    * @return the matching l f user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser findByUserId(
        java.lang.Integer id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f user where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param id the ID
    * @return the matching l f user, or <code>null</code> if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser fetchByUserId(
        java.lang.Integer id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f user where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param id the ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching l f user, or <code>null</code> if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser fetchByUserId(
        java.lang.Integer id, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f users where id = &#63;.
    *
    * @param id the ID
    * @return the matching l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findByUserIdCollection(
        java.lang.Integer id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f users where id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the ID
    * @param start the lower bound of the range of l f users
    * @param end the upper bound of the range of l f users (not inclusive)
    * @return the range of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findByUserIdCollection(
        java.lang.Integer id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f users where id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the ID
    * @param start the lower bound of the range of l f users
    * @param end the upper bound of the range of l f users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findByUserIdCollection(
        java.lang.Integer id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f user in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser findByUserIdCollection_First(
        java.lang.Integer id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f user in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f user, or <code>null</code> if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser fetchByUserIdCollection_First(
        java.lang.Integer id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f user in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser findByUserIdCollection_Last(
        java.lang.Integer id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f user in the ordered set where id = &#63;.
    *
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f user, or <code>null</code> if a matching l f user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser fetchByUserIdCollection_Last(
        java.lang.Integer id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f users before and after the current l f user in the ordered set where id = &#63;.
    *
    * @param lfid the primary key of the current l f user
    * @param id the ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException if a l f user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser[] findByUserIdCollection_PrevAndNext(
        long lfid, java.lang.Integer id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f users where id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ids the IDs
    * @return the matching l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findByUserIdCollection(
        java.lang.Integer[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f users where id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ids the IDs
    * @param start the lower bound of the range of l f users
    * @param end the upper bound of the range of l f users (not inclusive)
    * @return the range of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findByUserIdCollection(
        java.lang.Integer[] ids, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f users where id = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ids the IDs
    * @param start the lower bound of the range of l f users
    * @param end the upper bound of the range of l f users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findByUserIdCollection(
        java.lang.Integer[] ids, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f users.
    *
    * @return the l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f users.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f users
    * @param end the upper bound of the range of l f users (not inclusive)
    * @return the range of l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f users.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f users
    * @param end the upper bound of the range of l f users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFUser> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the l f user where id = &#63; from the database.
    *
    * @param id the ID
    * @return the l f user that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFUser removeByUserId(
        java.lang.Integer id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f users where id = &#63; from the database.
    *
    * @param id the ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserIdCollection(java.lang.Integer id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f users from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f users where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public int countByUserId(java.lang.Integer id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f users where id = &#63;.
    *
    * @param id the ID
    * @return the number of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public int countByUserIdCollection(java.lang.Integer id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f users where id = any &#63;.
    *
    * @param ids the IDs
    * @return the number of matching l f users
    * @throws SystemException if a system exception occurred
    */
    public int countByUserIdCollection(java.lang.Integer[] ids)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f users.
    *
    * @return the number of l f users
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
