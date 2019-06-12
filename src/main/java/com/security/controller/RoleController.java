package com.security.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
	

	/**
	 * 获取所有角色接口
	 * @param request
	 * @return
	 */
	@GetMapping()
	@PreAuthorize("hasAuthority('auth:role')")
	public String getRole(HttpServletRequest request) {
		
		return "获取所有角色接口";
	}
	
}
