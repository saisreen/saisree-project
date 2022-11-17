package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class SpringTemplate {
	
	private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}


	//i have record i have to retrieve it so i need to select method 
	public void select() {
	Session se=sf.openSession();
	Query qr= se.createQuery("from Student s");
	List li=qr.list();
	Iterator i = li.iterator(); //factory method
	while (i.hasNext()) {
		Student s=(Student)i.next();
		System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMarks());
	}	
	}
	

}
