<%@page import="java.sql.*" %>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/jnit";
String username = "root";
String password ="root";
Connection connection  = DriverManager.getConnection(url, username, password);
String name=request.getParameter("name");
String doa=request.getParameter("doa");
String toa=request.getParameter("toa");
String specialisation=request.getParameter("specialisation");
String sql="insert into appointment(name,doa,toa,specialist,doctor_name,status) values(?,?,?,?,?,?)";
PreparedStatement ps=connection.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, doa);
ps.setString(3, toa);
ps.setString(4, specialisation);
ps.setString(5, "None");
ps.setString(6, "Pending");
int x= ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./patient_home.html");
%>
