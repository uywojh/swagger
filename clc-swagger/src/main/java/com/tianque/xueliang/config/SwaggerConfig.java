package com.tianque.xueliang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket demoApi() {


		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("demo").genericModelSubstitutes(DeferredResult.class)
				.useDefaultResponseMessages(false)
				.forCodeGeneration(false)
				.pathMapping("/").select()
				.paths(or(regex("/api/.*")))// 过滤的接口
				.build().apiInfo(demoApiInfo());
	}

	private ApiInfo demoApiInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"雪亮项目相关接口", // 大标题
				"雪亮项目相关接口", // 小标题
				"1.0", // 版本
				"664507439@qq.com", 
				"wuwei", // 作者
				"杭州天阙科技有限公司", // 链接显示文字
				"http://www.hangzhoutq.com/"// 网站链接
		);

		return apiInfo;
	}

}
