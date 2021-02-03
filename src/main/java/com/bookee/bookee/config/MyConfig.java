package com.bookee.bookee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.bookee.bookee.filter.UrlFilter;
import com.bookee.bookee.interceptor.AdminLoginInterceptor;
import com.bookee.bookee.interceptor.LogInterceptor;
import com.bookee.bookee.interceptor.OldLoginInterceptor;

@Configuration
public class MyConfig implements WebMvcConfigurer {
	
	@Autowired
	UrlFilter urlFilter;
	
	@Autowired
	LogInterceptor logInterceptor;
	
	@Autowired
	OldLoginInterceptor oldLoginInterceptor;
	
	@Autowired
	AdminLoginInterceptor adminLoginInterceptor;

	public FilterRegistrationBean<UrlFilter> urlFilterRegistrationBean(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(urlFilter);
		filterRegistrationBean.setOrder(1);
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(logInterceptor);
		
		registry.addInterceptor(oldLoginInterceptor).addPathPatterns("/system/user/oldLogin");
		
		registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/system/user/*").excludePathPatterns("/system/user/oldLogin");
	}
}
