package com.security.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.dao.entity.User;
import com.security.service.UserService;
import com.security.util.SecurityUtils;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/none")
	public String test(HttpServletRequest request) {
		return "这个接口不拦截";
	}

	/**
	 * 获取用户
	 * @param request
	 * @return
	 */
	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('auth:user')")
	public User getUser(HttpServletRequest request,@PathVariable Integer id) {
		return userService.findUser(id);
	}
	
	/**
	 * 获取登陆人
	 * @return
	 */
	@GetMapping("/loginUser")
	public String getLoginUser() {
		return SecurityUtils.getCurrentUsername();
	}
	
	
}
