package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication 
public class SpringBooteX {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ca =SpringApplication.run(SpringBooteX.class, args);
		
		
		StudentDao sd= ca.getBean(StudentDao.class);
		Student s= new Student();
	    s.setSid(1080);
	    s.setMarks(211);
	    s.setSname("Durga");
	    sd.insert(s);
	    
	}

}
