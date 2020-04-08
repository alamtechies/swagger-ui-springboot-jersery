package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * @author Nawed Alam  26/03/2020
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
public class swaggerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(swaggerApplication.class, args);
	}

}
