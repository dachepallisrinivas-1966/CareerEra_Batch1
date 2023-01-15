package com.ce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.ce")
@EnableWebMvc
public class SpringWebMvcConfig implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/view/");
		irv.setSuffix(".jsp");
		return irv;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/assets/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
}
