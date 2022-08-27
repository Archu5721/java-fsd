<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All User Details</h2>
<core:forEach items="${requestScope.listOfuser}"  var="user">
	<span>Name : ${user.uname}<br/> Product : ${user.product}<br/> Price : ${user.price}<br/> </span>
</core:forEach>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>