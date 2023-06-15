package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Sai";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		if (con!= null)
			System.out.println("Connection Established");
		

	}

}
