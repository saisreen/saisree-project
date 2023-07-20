package com.eg;

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
		cq.setAmount(10000);
		cq.setChequeType("Bank of America");
		
		CreditCard cc = new CreditCard();
		cc.setAmount(20000);
		cc.setCreditCardType("discovery");
		
		s.save(cq);
		s.save(cc);
		tx.commit();
        sf.close();		
		
        System.out.println("Table Per Hierarchy Using Annotation ");
        System.out.println("For all Super and Sub classes only one table will be created");
		
		

	}

}
