<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body style="background-color:#ABC6EE">
		<h1 align="center">Personal Details</h1>
		
		<p style="font-size:20px" align="center">Check your details before payment</p>
			<b>Name</b> 		: 	${param.name}
			<br/>
			<b>Age</b>			:	${param.age}
			<br/>
			<b>Source</b>		:	${param.source}
			<br/>
			<b>Destination</b>  : 	${param.destination}
			<br/>
			<b>ID</b>			:	${param.id}
			<br/>
			<b>Ph.Number</b>	:	${param.number}
			<br/>
			<b>Date</b>			:	${param.date}
		
			
		<br/>
		<br/>
		Click <a href="Payment.html">Confirm</a> if your details are correct.
</body>
</html>