package com.ex;

import java.util.Iterator;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//Display the values 
        Category ct= context.getBean(Category.class);		
	    System.out.println("Category name:"+ct.getName());
	    Book bk = ct.getBk();
	    System.out.println("Book name: "+bk.getBookName());
	    System.out.println("Book price: "+bk.getBookPrice());
	    System.out.println("Book Author: "+bk.getBookAuthor());
	}
	
	
}


