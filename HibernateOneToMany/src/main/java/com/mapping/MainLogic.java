package com.mapping;



import java.util.HashSet;
import java.util.Set;

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
	    
	    Vendor v = new Vendor();
	    
	    //v.setVid(101);
	    //v.setVname("Amazon");
	    
	    v.setVid(102);
	    v.setVname("Flipkart");
	    
	    Customer sai = new Customer();
	   // sai.setCid(201);
	   // sai.setCname("sai sree");
	    sai.setCid(203);
	    sai.setCname("chinni");
	    
	    Customer sudha = new Customer();
	    //sudha.setCid(202);
	   // sudha.setCname("sudha Rani");
	    sudha.setCid(204);
	    sudha.setCname("valiveti");

	    Set hs = new HashSet();
	    hs.add(sai);
	    hs.add(sudha);
	    
	    v.setCust(hs);
	    se.save(v);
	    
	    tx.commit();    
		
	}
	}





