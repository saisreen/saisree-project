package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pgsStatementUpdate extends Pgs  {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url ="jdbc:postgresql://localhost:5432/Wipro";
	    String username ="postgres";
		String password ="chinni";
		//Connect 
		Connection c  = DriverManager.getConnection(url, username, password);   // Static Factory Method

		
      
		Statement s = c.createStatement(); //instance factory method
		s.executeUpdate("insert into employee values(105,'ram', 8000)");
		s.executeUpdate("insert into employee values(106,'siri', 6000)");
	    s.executeUpdate("update employee set eid = 102 where name ='ram'");
	    s.executeUpdate("delete from employee where eid = 102");
	     
	     System.out.println("inserted, updated, deleted");
	   
	}
}
