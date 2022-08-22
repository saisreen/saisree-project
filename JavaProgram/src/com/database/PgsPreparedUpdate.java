package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PgsPreparedUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url ="jdbc:postgresql://localhost:5432/Wipro";
	    String username ="postgres";
		String password ="chinni";
		//Connect 
		Connection c  = DriverManager.getConnection(url, username, password);   // Static Factory Method
        
		PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?)");
		
		ps.setInt(1,103);
		ps.setString(2,"ravi");
		ps.setInt(3, 2000);
		ps.executeUpdate();
		
		System.out.println("Inserted");
		}

	}


