<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<h4>Submit your information</h4>
	<hr/>
	<form:form action="hello" modelAttribute="info">
	
	First Name : <form:input path="firstName" required="true"/>
	<p/>
	Last Name : <form:input path="lastName"/>
	<p/>
	
	<p> Gender : <form:radiobutton path="gender" value="male"/>male
	<form:radiobutton path="gender" value="female"/>female
	</p>
	<p>Country : <form:select path="country" items="${country}">
	               
	</form:select></p>
	
	<p>Visited Countries : <form:checkbox path="visit" value="USA"/>USA
	 <form:checkbox path="visit" value="Canada"/>Canada
	  <form:checkbox path="visit" value="EU"/>EU
	  <form:checkbox path="visit" value="India"/>India</p>
	  <p>Your Expreience : 
	  <form:textarea path="text" placeholder="Enter your text here...."/></p>

	<input type="submit" Value="Submit">
	</form:form>
</body>
</html>