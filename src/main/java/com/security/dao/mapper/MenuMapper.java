package com.security.dao.mapper;

import com.security.dao.entity.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(String code);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}