package com.one;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		
		SessionFactory sf= cf.buildSessionFactory();
		
		Session se = sf.openSession();
		
	    Transaction tx = se.beginTransaction();  // transaction is required because whenever we insert we need a transaction.
	    
	    Student sai = new Student();
	    sai.setSid(1023);
	    sai.setSname("sai");
	    sai.setMarks(456);
	    
	    Address a = new Address();
	    a.setAdid(201); 
	    a.setPlace("Hyderabad");
	    a.setObj(sai);
	    
	    se.save(a);                 
	    
	    tx.commit();                  
	    
	    
	    
		
	}
	}





