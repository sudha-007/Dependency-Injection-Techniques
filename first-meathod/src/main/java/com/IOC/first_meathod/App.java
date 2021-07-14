package com.IOC.first_meathod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
//	For Enterprise Application we usualy use ApplicationContext to get context(IoC)
//	and for small scale application we use BeanFactory 

//	These are called Inversion of Control containers
	//BeanFactory
	//ApplicationContext
//	ClassPathXmlApplicationContext
	
	
    public static void main( String[] args )
    
    {
    	
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	
    	Vehicle car=(Vehicle)context.getBean("car");
    	car.drive();
    }
}
