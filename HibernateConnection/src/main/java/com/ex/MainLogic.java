package com.ex;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		
		SessionFactory sf= cf.buildSessionFactory();
		
		Session se = sf.openSession();
		
		
		//Criteria cr = se.createCriteria(Infosys.class); //HCQL 
		//cr.add(Restrictions.gt("salary", 9000));   //HCQL 
		//cr.add(Restrictions.lt("salary", 80000));   //HCQL 
		//List li= nr.list();  //HCQL 
		//Iterator x= li .iterator();  //HCQL 
		//while (x.hasNext()) {    //check whether the value exist or not   //HCQL 
	    //Infosys i = (Infosys ) x.next();  //HCQL   // We should give Object[] for particularly select ref.edi, ref.salary (not all records ) 
		//System.out.println(i.getEid()+" "+i.getName()+" "+i.getSalary()+" "+i.getBranch());  //HCQL //select 
		
		//NativeQuery nr = se.createSQLQuery("select * from infosys ");  //native query 
		NativeQuery nr = se.createSQLQuery("select * from infosys where eid in (?,?)");  //native query
		nr.setParameter(1, 1020);   //native query 
		nr.setParameter(2,  1030);   //native query 
		List li= nr.list();  //native query 
		Iterator x= li .iterator();   //native query
		while (x.hasNext()) {    //check whether the value exist or not  //native query 
	    Object[] i = (Object[]) x.next();  // We should give Object[] for particularly select ref.edi, ref.salary (not all records ) //native query 
	    System.out.println(i[0]+ " "+i[1]+" " +i[2]+ " "+i[3]);  //native query 
		
	    
	    
	    
		 //Query qr = se.createQuery("select ref.eid from Infosys ref where eid in (:sai, :give)");
		// qr.setParameter("sai", 1010); 
		 //qr.setParameter("give", 1030);
			//Infosys i = (Infosys)x.next();
		// System.out.println(i.intValue());   
		 //System.out.println(i[0]+ " "+[1]);
		//Transaction tx = se.beginTransaction();   // For select, this transaction and commit is not required but for others it is required.
		//Infosys i = new Infosys();
		//Infosys i = se.load(Infosys.class, 1030);   //update , delete
		//i.setEid(1030); 
		//i.setSalary( 80000);
		//se.save(i);         //insert the values 
		//se.update(i);     //update the values
		//se.delete(i);       //delete the values
		//System.out.println(i.getEid()+" "+i.getName()+" "+i.getSalary()+" "+i.getBranch());  //select 
		//tx.commit();   //save the values in database  //for select commit is not required 
		
	}
	}
}



