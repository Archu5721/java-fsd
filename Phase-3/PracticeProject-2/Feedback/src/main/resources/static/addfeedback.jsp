<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addfeed" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Comments</td>
				<td><input type="text" name="comments"></td>
			</tr>
			<tr>
				<td>Rating</td>
				<td><input type="text" name="rating"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Submit Feedback"></td>
			</tr>

		</table>
	</form>
</body>
</html>