package com.example.DemoUserApplicarionwithMongo1;

import org.springframework.boot.builder.SpringApplicationBuilder;


import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import repository.DemoUserApplicationwithMongo1Application;

@EnableWebMvc
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoUserApplicationwithMongo1Application.class);
	}

}
