package com.whw;


import com.whw.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.whw")
public class MainApplication {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserServiceImpl.class);
		UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
		bean.sayHi();
	}
}
