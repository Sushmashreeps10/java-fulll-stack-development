<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="endterm7.LoginBean"%> 
<p>You are successfully logged in!</p> 
<% 
LoginBean bean=(LoginBean)request.getAttribute("bean"); 
out.print("Welcome, "+bean.getName()); 
%>
</body>
</html>