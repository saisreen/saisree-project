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
<form action="./patient_appointment.jsp" method="get" align="center">
<input type="text" name="name" placeholder="Enter name">
<input type="date" name="doa" placeholder="Enter date">
<input type="text" name="toa" placeholder="Enter time">
<select name="specialisation"> 
<option value="ENT">ENT</option>
<option value="Heart">Heart</option>
<option value="Dentist">Dentist</option>
<option value="Nuerologist">neurologist</option>
</select>

<input type="submit" value="Apply">
</form>
</body>
</html>