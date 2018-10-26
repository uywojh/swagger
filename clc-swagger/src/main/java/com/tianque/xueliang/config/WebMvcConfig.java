package com.tianque.xueliang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置静态资源映射
 * @author wuwei
 * @since 2017/7/16
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //将所有/static/** 访问都映射到classpath:/static/ 目录下
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/statics/");
//    }
}
