package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the spring configuration file
				//create a spring container
				
				ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
				
				//Retreive beans from spring container
				Employee e = (Employee) context.getBean("emp");
				 
				System.out.println(e.toString());
			


	}

}
