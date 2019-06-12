package com.security.util;

import java.security.Principal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUtils {
	
	/**
	 * 获取登陆人
	 */
	public static String getCurrentUsername() {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {

			return ((UserDetails) principal).getUsername();
		}

		if (principal instanceof Principal) {
			
			return ((Principal) principal).getName();
		}

		return String.valueOf(principal);
	}

}
