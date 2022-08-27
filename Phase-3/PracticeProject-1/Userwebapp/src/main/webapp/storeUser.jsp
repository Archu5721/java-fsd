<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>Add details</h2>
<form action="storeUser" method="post">
	<label>User ID</label>
	<input type="number" name="uid"><br/>
	<label>User Name</label>
	<input type="text" name="uname"><br/>
	<label>Product Name</label>
	<input type="text" name="product"><br/>
	<label>Price</label>
	<input type="number" name="price"><br/>
 	<input type="submit" value="Add User details"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>