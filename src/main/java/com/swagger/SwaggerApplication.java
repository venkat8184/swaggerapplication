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
		if("venkat".equals("venkat")){
			System.out.println("This is venkatramana");
		}
		//This is venkat ramana
		//From master branch.
	}

	public static void venkat() {
		System.out.println("Venkat");
	}
	public static void master(){
		//from master;

	}

	//this is venkat

	public static void master1(){
		//master1
	}



	//this is venkat

	public static void master13(){
		//master1
	}

   private void venkat12(){
		System.out.println("this is venkat12");
   }


   private static void master12(){
		System.out.println("master12");
   }

}
