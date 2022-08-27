<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking</title>
</head>
<body style="background-color:#ABC6EE">
	<h1 align="center">Book Ticket</h1>
	<form action="flightdetailServlet" >
	<table align="center">
		<tr>
			<td>Date:</td>
			<td><input type="text" value="YYYY-MM-DD" name="date"></td>
		</tr>
		<tr>
			<td>Source:</td>
			<td><input type="text" name="source"></td>
		</tr>
		<tr>
			<td>Destination:</td>
			<td><input type="text" name="destination"></td>
		</tr>
		<tr>
			<td>Travellers:</td>
			<td><input type="text" name="traveller"></td>
		</tr>
		<tr>
			<td align="center"><input type="submit" value="Book Tickets"></td>
		</tr>
	</table>
	</form>

</body>
</html>