package com.tianque.xueliang;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;


import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@RestController
@EnableAsync
@EnableSwagger2
public class App {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}


}