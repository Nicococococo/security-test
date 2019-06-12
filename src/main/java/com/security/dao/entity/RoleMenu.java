package com.security.dao.entity;

public class RoleMenu {
    /**
     * 表：sys_role_menu
     * 字段：id
     * 注释：
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 表：sys_role_menu
     * 字段：role_id
     * 注释：角色ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * 表：sys_role_menu
     * 字段：menu_code
     * 注释：菜单ID
     *
     * @mbggenerated
     */
    private String menuCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }
}