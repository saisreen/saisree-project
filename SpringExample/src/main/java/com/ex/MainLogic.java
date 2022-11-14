package com.ex;

import java.util.Iterator;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student sai= context.getBean(Student.class); //Here we are getting object of student class from IOC Container using the getBean method.
		System.out.println(sai.getSid()+" "+sai.getSname()+" "+sai.getMarks()+" "+sai.getBranch());
		List s= sai.getCourse();  //setter injection 
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
	}


