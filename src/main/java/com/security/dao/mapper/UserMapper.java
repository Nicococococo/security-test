package com.security.dao.mapper;

import com.security.dao.entity.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

	User selectByUsername(String username);
}