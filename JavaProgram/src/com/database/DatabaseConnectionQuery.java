package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://localhost:3306/task";
		String username = "root";
		String password ="root";
		//Conenct 
		Connection c  = DriverManager.getConnection(url, username, password); // Static Factory Method
		
		Statement s = c.createStatement(); //Instance factory method 
		ResultSet rs = s.executeQuery("select eid, salary from employee where eid=101 ");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getInt(2));
		}
	}
}
