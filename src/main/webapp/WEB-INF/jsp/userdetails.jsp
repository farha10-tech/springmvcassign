<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
    String user = (String)request.getAttribute("user");
   int pwd = (int)request.getAttribute("pwd");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>
Name:
<%= user %>
</h1>
<hr>
<h1>
Password:
<%= pwd %>
</h1>
</body>
</html>