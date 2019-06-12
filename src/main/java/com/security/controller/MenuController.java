package com.security.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
	

	/**
	 * 获取所有菜单接口
	 * @param request
	 * @return
	 */
	@GetMapping()
	@PreAuthorize("hasAuthority('auth:menu')")
	public String getMenu(HttpServletRequest request) {
		
		return "获取所有菜单接口";
	}
	
}
