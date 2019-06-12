package com.security.dao.mapper;

import com.security.dao.entity.Role;

public interface RoleMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

}