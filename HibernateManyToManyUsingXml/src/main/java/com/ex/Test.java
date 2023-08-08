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
		
		Course c1 = new Course();
		c1.setCourseName("java");
		c1.setDuration("30 days");
		
		Course c2 = new Course();
		c2.setCourseName("sql");
		c2.setCourseName("7 days");
		
		ArrayList al = new ArrayList<Object>();
		al.add(c1);
		al.add(c2);
		
		Student s1 = new Student();
		s1.setStname("sai");
		s1.setCourses(al);
		
		Student s2 = new Student();
		s2.setStname("sree");
		s2.setCourses(al);
		
		Student s3 = new Student();
		s3.setStname("durga");
		s3.setCourses(al);
		
		Student s4 = new Student();
		s4.setStname("laxmi");
		s4.setCourses(al);
		
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		
		tx.commit();
		
		sf.close();
		
		System.out.println("Many To Many Success");
		
		
		
		

	}

}
