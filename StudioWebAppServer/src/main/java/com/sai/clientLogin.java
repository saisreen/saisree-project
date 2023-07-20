package com.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class clientLogin extends HttpServlet {

	Connection connection=null;
	PreparedStatement ps=null;
	
	public void init(ServletConfig config) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/studio";
		String UserName = "root";
		String Password ="root";
		try {
			 connection = DriverManager.getConnection(url, UserName, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		String sql = "select * from client  where email=? and password =?";
	try {
			 ps=connection.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			pw.println("<html><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><body bgcolor='orange'> <h1 align ='center'>");
			if(rs.next())
				//pw.println(" SBSTUDIOS Login Successfully");
			 
			    //pw.println("</h1></body></html>");
				response.sendRedirect("./client_Home.html");
			
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}

	public void destroy() {
		try {
			 connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
}
	
}
