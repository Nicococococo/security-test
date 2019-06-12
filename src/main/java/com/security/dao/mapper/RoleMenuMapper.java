package com.security.dao.mapper;

import java.util.List;

import com.security.dao.entity.RoleMenu;

public interface RoleMenuMapper {
	
	List<RoleMenu> selectByRoleId(Integer roleId);
	
    int deleteByPrimaryKey(Integer id);

    int insertSelective(RoleMenu record);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenu record);

}