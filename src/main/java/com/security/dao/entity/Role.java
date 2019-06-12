package com.security.dao.entity;

public class Role {
    /**
     * 表：sys_role
     * 字段：id
     * 注释：
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 表：sys_role
     * 字段：name
     * 注释：角色
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 表：sys_role
     * 字段：remark
     * 注释：备注
     *
     * @mbggenerated
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}