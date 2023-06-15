package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Demo";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		Statement s = con.createStatement();
		String sql = "create table employee(eid int(10) Primary key, name varchar(20), Salary int(10))";
		int x = s.executeUpdate(sql);
		
		
		if (x!= 0)
			System.out.println("created table");

	}

}
