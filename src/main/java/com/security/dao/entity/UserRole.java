package com.security.dao.entity;

public class UserRole {
    /**
     * 表：sys_user_role
     * 字段：id
     * 注释：主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 表：sys_user_role
     * 字段：user_id
     * 注释：用户ID
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 表：sys_user_role
     * 字段：role_id
     * 注释：角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}