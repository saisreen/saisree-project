package com.jnit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientRegister extends HttpServlet {
	
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
    	  String name = request.getParameter("name");
    	  String password = request.getParameter("password");
    	  String email = request.getParameter("email");
    	  String address = request.getParameter("address");
    	  String mobile = request.getParameter("xyz");
    	  long phone=Long.parseLong(mobile);
    	  PrintWriter pw=response.getWriter();
    	  String sql="insert into patient(name, password, email, phone, address) values(?,?,?,?,?)";
    	  try {
    	  ps=connection.prepareStatement(sql);
    	  ps.setString(1,name);
    	  ps.setString(2, password);
    	  ps.setString(3, email);
    	  ps.setLong(4, phone);
    	  ps.setString(5, address);
    	  int x=ps.executeUpdate();
    	  //pw.println("<html><body bgcolor='wheat'><h1 align='center'>");
    	  if(x!=0)
    		  response.sendRedirect("./patient_login.html");
    		//  pw.println("Doctor Registered Successfully");
    	//  pw.println("</h1></body></html>");
    	  
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