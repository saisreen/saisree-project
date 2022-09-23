<%@page import="java.sql.*" %>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/jnit";
String username = "root";
String password ="root";
Connection connection = DriverManager.getConnection(url, username, password);
int id=Integer.parseInt(request.getParameter("id"));
String sql ="update appointment set status=?, doctor_name=? where id=?";
String name=(String)session.getAttribute("name");
PreparedStatement ps =connection.prepareStatement(sql);
ps.setString(1, "Accepted");
ps.setString(2, name);
ps.setInt(3, id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./view_appointment.jsp?msg=Accepted");
%> 