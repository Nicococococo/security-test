package com.security.dao.entity;

public class User {
    /**
     * 表：sys_user
     * 字段：id
     * 注释：系统用户主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 表：sys_user
     * 字段：username
     * 注释：系统用户登陆账号
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 表：sys_user
     * 字段：password
     * 注释：系统用户登陆密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 表：sys_user
     * 字段：full_name
     * 注释：系统用户全称
     *
     * @mbggenerated
     */
    private String fullName;

    /**
     * 表：sys_user
     * 字段：enabled
     * 注释：系统用户启用（0-否，1-是）
     *
     * @mbggenerated
     */
    private Boolean enabled;

    /**
     * 表：sys_user
     * 字段：account_non_locked
     * 注释：账户非锁定（0-否，1-是）
     *
     * @mbggenerated
     */
    private Boolean accountNonLocked;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }
    
}