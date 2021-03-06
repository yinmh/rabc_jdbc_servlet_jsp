package com.westos.rbac.dao;

import com.westos.rbac.domain.Role;
import com.westos.rbac.domain.User;

import java.util.List;

/**
 * @author yihang
 */
public interface UserDao {

    /**
     * 根据用户名查询用户对象
     *
     * @param username 用户名
     * @return 返回用户对象，如果查询不到返回null
     */
    User findByUsername(String username);

    /**
     * 根据用户id查询
     *
     * @param userId 用户编号
     * @return 返回用户对象
     */
    User findById(int userId);

    /**
     * 查询所有用户
     * @return 返回用户集合
     */
    List<User> findAll();

    /**
     * 分页查询用户
     * @param page 页号
     * @param rows 每页记录数
     * @return 返回用户集合
     */
    List<User> findByPage(int page, int rows);

    /**
     * 查询用户总数
     * @return 用户总数
     */
    int findCount();

    /**
     * 新增用户
     * @param user 用户对象
     */
    int insert(User user);

    /**
     * 修改用户
     * @param user 用户对象
     */
    int update(User user);

    /**
     * 删除用户
     * @param userId 用户编号
     */
    int delete(int userId);

    /**
     * 通过用户Id删除该用户下的角色
     * @param userId 用户编号
     */

    int deleteRoleByUserId(int userId);

    /**
     * 插入该用户下的角色
     * @param userId 用户编号
     */

    int insertRoleByUserId(int userId,int roleId);

    /**
     *  通过用户名查询用户是否存在
     *  @param username 用户名称
     */
    boolean exists(String username);
}
