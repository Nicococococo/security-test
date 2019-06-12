package com.security.dao.entity;

public class Menu {
    /**
     * 表：sys_menu
     * 字段：code
     * 注释：主键ID
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 表：sys_menu
     * 字段：name
     * 注释：菜单名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 表：sys_menu
     * 字段：parent_id
     * 注释：父ID
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * 表：sys_menu
     * 字段：url
     * 注释：菜单链接
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 表：sys_menu
     * 字段：type
     * 注释：类型 0：目录 1：菜单 2：按钮
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * 表：sys_menu
     * 字段：order_num
     * 注释：排序
     *
     * @mbggenerated
     */
    private Integer orderNum;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}