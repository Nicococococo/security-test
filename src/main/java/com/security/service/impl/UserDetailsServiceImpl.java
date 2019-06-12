package com.security.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.security.dao.entity.RoleMenu;
import com.security.dao.entity.UserRole;
import com.security.dao.mapper.RoleMenuMapper;
import com.security.dao.mapper.UserMapper;
import com.security.dao.mapper.UserRoleMapper;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Resource
	UserMapper userMapper;
	@Resource
	UserRoleMapper userRoleMapper;
	@Resource
	RoleMenuMapper roleMenuMapper;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		logger.debug("===============用户名："+username);

		com.security.dao.entity.User user= userMapper.selectByUsername(username);
		
		if(user == null){
			throw new UsernameNotFoundException("用户[" + username + "]不存在");	
		}
		
		//获取角色
		UserRole userRole = userRoleMapper.selectByUserId(user.getId());
		//获取菜单权限
		
		List<String> menuCodeList = new ArrayList<String>();
		
		if(userRole != null){
			List<RoleMenu> roleMenuList = roleMenuMapper.selectByRoleId(userRole.getRoleId());

			menuCodeList = roleMenuList.stream().map(roleMenu -> roleMenu.getMenuCode()).collect(Collectors.toList());
		}else{
			menuCodeList.add("none_menu");
		}
		
		return new User(username, user.getPassword(), user.getEnabled(), true, true, user.getAccountNonLocked(), AuthorityUtils.createAuthorityList(menuCodeList.toArray(new String[menuCodeList.size()])));


	}

}
