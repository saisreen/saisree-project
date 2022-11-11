package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Travel travel= context.getBean(Travel.class); //Here we are getting object of student class from IOC Container using the getBean method.
		travel.startJourney();
		
	}

}
