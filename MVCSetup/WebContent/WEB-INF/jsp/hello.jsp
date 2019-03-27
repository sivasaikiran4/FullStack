<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
Hello ${firstName} ${lastName} <br>
Gender : ${gender}<br>
Country :${country}<br>
Visted Countries :
<ul><c:forEach items="${visit}" var="trip">
<li>${trip}</li></c:forEach></ul>
Your Wrote : "${text}"

</body>
</html>