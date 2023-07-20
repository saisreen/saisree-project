package com.sai;

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

public class clientRegister extends HttpServlet {

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
	
	public void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String requirement = request.getParameter("requirement");
		//String mobile = request.getParameter("phone");
		//int phone = Integer.parseInt("mobile");
		String eventtype = request.getParameter("eventtype");
		String address = request.getParameter("address");
		PrintWriter pw = response.getWriter();
		String sql = "insert into client(name, password, email, requirement, eventtype, address) values(?,?,?,?,?,?)";
	try {
			ps=connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, requirement);
			ps.setString(5, eventtype);
			ps.setString(6, address);
			int x=ps.executeUpdate();
			pw.println("<html><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><body bgcolor='orange'> <h1 align ='center'>");
			if(x!=0)
				//pw.println(" Thank you for registering SBSTUDIOS - we will reach you shortly.");
			 
			    //pw.println("</h1></body></html>");
				response.sendRedirect("./client_login.html");
			
		
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
