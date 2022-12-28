<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${name}

<hr>
<%

List<String> list = (List<String>)request.getAttribute("friends");
for(String n:list){
	out.println(n);
	out.println("<br>");
}
	
%>
</body>
</html>