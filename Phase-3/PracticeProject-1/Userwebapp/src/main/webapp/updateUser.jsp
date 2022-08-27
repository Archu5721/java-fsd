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
<h2>update details</h2>
<form action="updateUser" method="post">
	<label>User ID</label>
	<input type="number" name="uid"><br/>
	<label>Product Name</label>
	<input type="text" name="product"><br/>
	<label>Price</label>
	<input type="number" name="price"><br/>
 	<input type="submit" value="update User details"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>