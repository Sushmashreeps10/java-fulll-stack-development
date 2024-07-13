<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./InsertData" method="post">
<table> 

<tr><td>Enter Name:</td> 
<td><input type="text" name="name"/></td>
</tr>
<tr><td>Enter date:</td> 
<td><input type="text" name="date"/></td>
</tr>
<tr><td>Enter source place:</td> 
<td><input type="text" name="place1"/></td>
</tr>
<tr><td>Enter  destination place:</td> 
<td><input type="text" name="place2"/></td>
</tr>
<tr><td>Enter fare:</td> 
<td><input type="text" name="fare"/></td>
</tr>


<tr><td><input type="submit"/></td></tr>
</table>
</form>
</body>
</html>