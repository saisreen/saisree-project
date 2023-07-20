package com.mine;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	Configuration c = new Configuration();
	c.configure("hibernate.xml");
	SessionFactory sf = c.buildSessionFactory();
	 Session s = sf.openSession(); {
	Transaction tx = s.beginTransaction();
	
	
	

