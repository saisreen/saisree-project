package com.ex;

import java.util.ArrayList;

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
		e.setEname("durga");
		e.setSalary(3000);
		
		Employee e1 = new Employee();
		e1.setEname("kanaka");
		e1.setSalary(4000);
		
		ArrayList<Employee> al = new ArrayList<Employee> ();
		al.add(e);
		al.add(e1);
		
		Department d = new Department();
		d.setName("IT");
		d.setEmployees(al);
		
		s.save(d);
		tx.commit();
		sf.close();
		System.out.println("One to Many success");
		
		
		

	}

}
