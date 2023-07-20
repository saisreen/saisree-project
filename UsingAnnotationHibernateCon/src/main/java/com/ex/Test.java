package com.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c = new Configuration();
		c.configure("hibernate.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee e = new Employee();
		e.setId(1);
		e.setName("sai");
		s.save(e);
	    tx.commit();
	    sf.close();
	    System.out.println("inserted the values successfully");
		

	}

}
