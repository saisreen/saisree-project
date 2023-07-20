<html>
<body bgcolor="orange">
<br><br><br>
<h1 align="center">SBSTUDIOS Dashboard</h1>
<br><br><br>
<h2 align="center">
<a href="admin_Profile.jsp">Profile</a> |
<a href="client_appointment.jsp">Client appointment</a> | 
<a href="index.html">Logout</a> |

<%@page import="java.sql.*" %>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/studio";
String UserName = "root";
String Password ="root";
Connection connection = DriverManager.getConnection(url, UserName, Password);
int id = (Integer) session.getAttribute("eid");
System.out.println(id);
PreparedStatement ps=connection.prepareStatement("select*from admin where id=?");

%>
<table width ="80%" height ="50%" padding="10" align="center" border="2" >
<tr>
<td>id </td>
<td>name</td>
<td>email</td>
<td>Requirement</td>
</tr>
<%
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()) {	
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
</tr>
<% } %>
</table>
</h2>
</body>
</html>