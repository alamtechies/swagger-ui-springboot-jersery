package com.test.config;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.service.UserService;

@Component
@ApplicationPath("/api")
public class JerseyConfiguration extends ResourceConfig {

	@Autowired
	public JerseyConfiguration(ObjectMapper objectMapper) {

		register(UserService.class);
	}

	@PostConstruct
	public void init() {
		this.SwaggerConfig();
	}

	private void SwaggerConfig() {

		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);

		BeanConfig swaggerConfigBean = new BeanConfig();
		swaggerConfigBean.setConfigId("alamtechies Swagger Jersey Example");
		swaggerConfigBean.setTitle("Using Swagger ,Jersey And Spring Boot ");
		swaggerConfigBean.setVersion("v1");
		swaggerConfigBean.setContact("alamtehies");
		swaggerConfigBean.setSchemes(new String[] { "http", "https" });
		swaggerConfigBean.setBasePath("/api");
		swaggerConfigBean.setResourcePackage("com.test.service");
		swaggerConfigBean.setPrettyPrint(true);
		swaggerConfigBean.setScan(true);
	}
}