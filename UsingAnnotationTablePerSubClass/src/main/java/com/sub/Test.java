package com.sub;

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
		
		
		Cheque cq = new Cheque (); //Transient State
		cq.setAmount(100);
		cq.setChequeType("Bank of America");
		
		CreditCard cc = new CreditCard();
		cc.setAmount(200);
		cc.setCreditCardType("discovery");
		
		s.save(cq); //Persistence state 
		s.save(cc);
		tx.commit();
        sf.close();		//detached state
		
        System.out.println("Table Per Sub Class using Annotation ");
        System.out.println("For all each and every classes, separate table will be created");
		
		

	}

}
