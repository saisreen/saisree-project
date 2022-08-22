package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
   //Intially, execute a driver 
		Class.forName("com.mysql.cj.jdbc.Driver");  //static factory method
		
		String url ="jdbc:mysql://localhost:3306/task";
		String username = "root";
		String password ="root";
		//Conenct 
		Connection c  = DriverManager.getConnection(url, username, password); // Static Factory Method
		
		//Check the connection is established or not
		if(c!=null)
			System.out.println("Connection established");
		
		Statement s =c.createStatement();      //Instance Factory Method
		//int x = s.executeUpdate("insert into employee values (103,'', 80000)");        //instance factory method.
		int y = s.executeUpdate("update employee set name = 'sree' where eid = 103"); 
		//int z = s.executeUpdate("delete from employee where eid = 102"); 
		
       
	}
}
