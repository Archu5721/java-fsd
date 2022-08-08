<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Product JSP</title>
</head>
<body>
		<h1 align="center">Product Details</h1>
		<table style="width:50%">
		<tr>
			<th>Name</th>
			<th>Cost</th>
			<th>Made In</th>
		</tr>
		<tr>
			<td>${param.Pname}</td>
			<td>${param.Pcost}</td>
			<td>${param.country}</td>
		</tr>
		</table>
		<br/>
		<br/>
		<a href="index.html">Home Page</a>
</body>
</html>