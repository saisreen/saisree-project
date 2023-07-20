package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	Configuration cf=new Configuration();
	cf.configure("employeec.xml");
	
	SessionFactory sf= cf.buildSessionFactory();
	
	Session se = sf.openSession();
	
	

}
