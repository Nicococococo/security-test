package com.security.dao.mapper;

import com.security.dao.entity.UserRole;

public interface UserRoleMapper {
	
	UserRole selectByUserId(Integer userId);
	
    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

}