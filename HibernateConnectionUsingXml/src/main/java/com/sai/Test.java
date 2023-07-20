package com.sai;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	Configuration cf = new Configuration();
	cf.configure("Config.xml");
	SessionFactory sf = cf.buildSessionFactory();
    Session s = sf.openSession();
    Transaction tx = s.beginTransaction();
	Employee e = new Employee();
	
}

	
	
	

