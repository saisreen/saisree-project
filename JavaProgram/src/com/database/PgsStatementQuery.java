package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PgsStatementQuery extends Pgs {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String url ="jdbc:postgresql://localhost:5432/Wipro";
	    String username ="postgres";
		String password ="chinni";
		//Connect 
		Connection c  = DriverManager.getConnection(url, username, password);   // Static Factory Method
		
			Statement s = c.createStatement(); //instance factory method
			ResultSet rs = s.executeQuery("select * from employee");
            while(rs.next()) {
            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
	}

}
