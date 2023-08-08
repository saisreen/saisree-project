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
		e.setName("sai");
		e.setEmail("sai@gmail.com");
		
		Employee e1 = new Employee();
		e1.setName("sree");
		e1.setEmail("sree@gmail.com");
		
		Department d = new Department();
		d.setDeptname("CSE");
		
		e.setDepartment(d);
		e1.setDepartment(d);
		
		s.save(e);
		s.save(e1);
		
		tx.commit();
		
		sf.close();
		
		System.out.println("Many To One Successful");
		

	}

}
