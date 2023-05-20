package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
		System.out.println("this is venkat");
		System.out.println("this is second method");
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		//From master branch.
	}
	public static void master(){
		//from master;
	}
	public static void master1(){
		//master1
	}

}
