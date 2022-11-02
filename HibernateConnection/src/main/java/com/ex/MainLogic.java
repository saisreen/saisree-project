package com.ex;

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
		
		Transaction tx = se.beginTransaction();
		
		Infosys i = new Infosys();
		//i.setEid(1040);
		//i.setName("wipro");
		//i.setSalary( 9000);
		i.setBranch("mumbai");
		
		//se.save(i);         //insert the values 
		//se.update(i);     //update the values
		se.delete(i);       //delete the values
		
		tx.commit();   //save the values in database
		
	}
}
