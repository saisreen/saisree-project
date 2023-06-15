package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Demo";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		Statement s = con.createStatement();
		String sql = "update employee set name ='durga' where eid =103";
		
		
		int x = s.executeUpdate(sql);
		
		
		if (x!= 0)
			System.out.println("Updated successfully");
		

	}

}
