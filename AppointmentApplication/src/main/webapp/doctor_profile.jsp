<html>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">Welcome to Doctor Home</h1>
<br><br><br>
<h2 align="center">
<a href="doctor_profile.jsp">Profile</a> |
<!--  To Check the appointment details -->
<a href="patient_appointment.jsp">Patient Appointment</a> |
<a href="index.html">Logout</a> |
<br><br><br>
<!--  Write a java code to display the values -->
<%@page import="java.sql.*" %>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/jnit";
String username = "root";
String password ="root";
Connection connection  = DriverManager.getConnection(url, username, password);
//To retrieve value
int id =(Integer)session.getAttribute("id");
PreparedStatement ps = connection.prepareStatement("select*from doctor where id=?");
%>
<!--  create a table -->
<table width ="80%" height="50%" padding="10" align="center" border="2">
<tr>
<td>id </td> 
<td>name </td>
<td>email </td>
<td>phone</td>
<td>specialisation</td></tr>
<%  
ps.setInt(1, id);
ResultSet rs = ps.executeQuery();
while(rs.next()) {
%>
<tr>
<td> <%=rs.getInt(1) %> </td>
<td> <%=rs.getString(2) %> </td>
<td> <%=rs.getString(4) %> </td>
<td> <%=rs.getInt(5) %> </td>
<td> <%=rs.getString(6) %> </td>
</tr>
<% } %>
</table>
</h2>
</body>
</html>