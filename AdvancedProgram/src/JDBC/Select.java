package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Demo";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		Statement s = con.createStatement();
		//ResultSet rs = s.executeQuery("select * from employee"); 
		ResultSet rs = s.executeQuery("select eid, name from employee");
		
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("salary"));
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
		
		

	}

}
