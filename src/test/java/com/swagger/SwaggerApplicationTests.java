package com.swagger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwaggerApplicationTests {

	@Test
	void contextLoads() {
	}
	public void test(){
		//this is venaktramana
	}


	public void ramana(){
		System.out.println("This is venkatramana adding into venkat branch");
	}
   @Test
	public void master(){
		System.out.println("This is master");
	}
	@Test
	public void master2(){
		this.master();
	}
	@Test
	public void venkat2(){
		System.out.println("Again updating from venkat itself");
	}
	@Test
	public void add(){
		System.out.println(10+20);
	}

}
