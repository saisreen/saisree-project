package com.jnit;

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

public class PatientLogin extends HttpServlet {
	
	Connection connection = null;
	PreparedStatement ps = null;
	
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url ="jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password ="root";
		try {
			connection  = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
      public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException  {
    	  String password = request.getParameter("password");
    	  String email = request.getParameter("email");
    	  PrintWriter pw=response.getWriter();
    	  String sql="select * from patient where email=? and password=?";
    	  try {
    	  ps=connection.prepareStatement(sql);
    	  ps.setString(1, email);
    	  ps.setString(2, password);
    	  ResultSet rs=ps.executeQuery();
    	  //pw.println("<html><body bgcolor='wheat'><h1 align='center'>");
    	  if(rs.next())
    		  response.sendRedirect("./patient_home.html");
    		  //pw.println("Doctor Logged in Successfully");
    	  //pw.println("</h1></body></html>");
    	  
      } catch (SQLException e) {
    	  e.printStackTrace();
}
      }
      public void destroy() {
    	try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}