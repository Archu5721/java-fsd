<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>
	<h1 align="center">Products</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Cost</th>
		</tr>
		<c:forEach  var="product" items="${product_list}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.cost}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="index.html">Home Page</a>
</body>
</html>