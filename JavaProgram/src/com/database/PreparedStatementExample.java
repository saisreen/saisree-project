package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://localhost:3306/task";
		String username = "root";
		String password ="root";
		//Conenct 
		Connection c  = DriverManager.getConnection(url, username, password); // Static Factory Method
		
		PreparedStatement ps = c.prepareStatement("select * from employee"); //instance factory method
        
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " "+rs.getInt(3));
		}
         
     
          
	}

}
