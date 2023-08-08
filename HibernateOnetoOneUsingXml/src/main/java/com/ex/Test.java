package com.ex;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c = new Configuration();
		c.configure("hibernate.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e = new Employee();
		e.setName("sai");
	
		Address a = new Address();
		a.setCity(" shiridi irving");
		a.setState("Texas ");
		a.setCountry("USA");
		
		s.save(e);
		s.save(a);
		
		tx.commit();
		sf.close();
		
	    System.out.println("One to One Relationship Success");
		

	}

}
