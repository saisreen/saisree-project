package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Demo";
		String UserName = "root";
		String Password ="root";
		Connection con = DriverManager.getConnection(url, UserName, Password);
		Statement s = con.createStatement();
		String sql = "insert into employee values (101,'sai', 100000 )";
		String sqls = "insert into employee values (102,'Baba', 100000 )";
		String sqlss = "insert into employee values (103,'sree', 900000 )";
		
		int x = s.executeUpdate(sql);
		int y = s.executeUpdate(sqls);
		int z = s.executeUpdate(sqlss);
		
		if (x!= 0)
			System.out.println("Inserted record successfully");
		if (y!= 0)
			System.out.println("Inserted record successfully");
		if (z!= 0)
			System.out.println("Inserted record successfully");
		
	}

}
