package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Demo";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		PreparedStatement ps = con.prepareStatement("update employee set salary = ? where eid = ?");
		ps.setInt(1, 400000);
		ps.setInt(2, 105);
		ps.executeUpdate();
		
		if(ps!=null)
			System.out.println("Inserted Sucessfully");

	}

}
