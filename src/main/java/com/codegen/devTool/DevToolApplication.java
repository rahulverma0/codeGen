package com.codegen.devTool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevToolApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevToolApplication.class, args);
	}
}
