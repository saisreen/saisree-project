package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Demo";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1,105);
		ps.setString(2, "Ram");
		ps.setInt(3, 500000);
		ps.executeUpdate();
		
		if(ps!=null)
			System.out.println("Inserted Sucessfully");
		
		

	}

}
