package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SecondMeathodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMeathodApplication.class, args);
		runner();
	}
	
	public static void runner() {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Car car=(Car)context.getBean("car");
		car.drive();
	}

}
