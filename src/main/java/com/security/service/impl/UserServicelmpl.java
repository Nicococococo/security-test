package com.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.security.dao.entity.User;
import com.security.dao.mapper.UserMapper;
import com.security.service.UserService;

@Service
@Transactional
public class UserServicelmpl implements UserService {
	
	@Autowired 
	UserMapper userMapper;

	public User findUser(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
