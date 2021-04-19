<%@page import="com.te.springmvcdemo.bean.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String msg = (String)request.getAttribute("msg"); %>
    <% EmployeeBean bean = (EmployeeBean) request.getAttribute("data"); %>
    
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search PAGE</title>


</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
<h1><%=msg %></h1>
<%} %>
<form action="./searchs" method="get">
<fieldset>
<legend>Search PAGE</legend>
<label>Employee Id</label>
<input type="text" name="id" placeholder="Enter the Employee Id">
<br>
<br>
<input type="submit" value="submit">
</fieldset>

</form>
<%if(bean!=null){ %>
<h1>Name :<%=bean.getName() %></h1>
<h1>Id :<%=bean.getId() %></h1>
<h1>DOB :<%=bean.getDob() %></h1>
<% } %>
</body>
</html>