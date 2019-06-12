package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * 配置密码加密解密方式
	 * @return
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.formLogin()
		.loginPage("/login.html")//调转到自定义的登录页
		.loginProcessingUrl("/login")//登录页向后台发送的登录请求地址
		//.successHandler(successHandler) //登录成功后的处理
		//.failureHandler(failureHandler)//登录失败后的处理
		.and()
		.authorizeRequests()
		.antMatchers("/login.html","/user/none").permitAll()//不拦截的地址
		.anyRequest()
		.authenticated();
		http.csrf().disable();
	}


	@Override
	public void configure(WebSecurity web) throws Exception {

		//放行静态资源被拦截
		web.ignoring().antMatchers("/css/**");
		web.ignoring().antMatchers("/js/**");
		web.ignoring().antMatchers("/images/**");
	}

}
