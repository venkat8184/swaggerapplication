package com.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Configuration
//this is helpful for configuration
public class SwaggerConfig {
    
	  @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.swagger"))
	                .paths(PathSelectors.any())
	                .build();
	  }
	  public void test() {
		  System.out.println("this is venkatramana");
	  }
	  //this is venkatramana
}
