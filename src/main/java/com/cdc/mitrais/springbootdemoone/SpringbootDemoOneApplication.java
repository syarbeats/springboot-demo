package com.cdc.mitrais.springbootdemoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringbootDemoOneApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoOneApplication.class, args);
	}
	
	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		 return application.sources(applicationClass);
	 }

	 private static Class<SpringbootDemoOneApplication> applicationClass = SpringbootDemoOneApplication.class;
}
