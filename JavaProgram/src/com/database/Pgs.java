package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Pgs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("org.postgresql.Driver");  
		
		String url ="jdbc:postgresql://localhost:5432/Wipro";
	    String username ="postgres";
		String password ="chinni";
		//Connect 
		Connection c  = DriverManager.getConnection(url, username, password);   // Static Factory Method

		if(c!=null)
			System.out.println("Connection established");
	}

}
