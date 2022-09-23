<html>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">Welcome to Patient Home</h1>
<br><br><br>
<h2 align="center">
<a href="patient_profile.jsp">Profile</a> |
<a href="apply_appointment.jsp">Apply Appointment</a> |
<a href="appointment_status.jsp">Appointment Status</a> |
<a href="index.html">Logout</a> |
</h2>
<br><br>
<%@page import="java.sql.*" %>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/jnit";
String username = "root";
String password ="root";
Connection connection = DriverManager.getConnection(url, username, password);
//To retrieve value
//int id =(Integer)session.getAttribute("id");
PreparedStatement ps = connection.prepareStatement("select*from appointment");
%>
<!--  create a table -->
<table width ="80%" height="50%" padding="10" align="center" border="2">
<tr>
<td>id </td> 
<td>name </td>
<td>date </td>
<td>time</td>
<td>specialisation</td>
<td>Doctor</td>
<td>Status</td>
</tr>
<%  

ResultSet rs = ps.executeQuery();
while(rs.next()) {
%>
<tr>
<td> <%=rs.getInt(1) %> </td>
<td> <%=rs.getString(2) %> </td>
<td> <%=rs.getString(3) %> </td>
<td> <%=rs.getString(4) %> </td>
<td> <%=rs.getString(5) %> </td>
<td> <%=rs.getString(6) %> </td>
<td> <%=rs.getString(7) %> </td>
</tr>
<% } %>
</table>
</body>
</html>