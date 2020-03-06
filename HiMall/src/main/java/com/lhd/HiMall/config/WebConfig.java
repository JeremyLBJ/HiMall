package com.lhd.HiMall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 
 * 读取本地文件 设置虚拟路径
 * 
 * @author ASUS
 *
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	public void addResourceHandlers (ResourceHandlerRegistry registry) {
		 registry.addResourceHandler("/image/**")
			.addResourceLocations("file:E:/upload/") ;
	}
	
}
