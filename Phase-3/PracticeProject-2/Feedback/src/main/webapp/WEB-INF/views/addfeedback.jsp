<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack</title>
</head>
<body>
	<h1 align="center">Feedback Form</h1>
	<form action="inputfeedback" method="post">
		<table align="center">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Comments:</td>
				<td><input type="text" name="comments"></td>
			</tr>
			<tr>
				<td>Rating:</td>
				<td><input type="text" name="rating"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Submit Feedback"></td>
			</tr>

		</table>
	</form>
</body>
</html>