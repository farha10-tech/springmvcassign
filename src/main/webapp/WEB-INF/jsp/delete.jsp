<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String msg = (String)request.getAttribute("msg"); %>
    <% String errmsg =(String) request.getAttribute("errmsg"); %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
<h1><%=msg %></h1>
<%} %>
<%if(errmsg!=null && !errmsg.isEmpty()){ %>
<h1><%=errmsg %></h1>
<%} %>
<form action="./deleted" method="get">
<fieldset>
<legend>Deleted PAGE</legend>
<label>Employee Id</label>
<input type="text" name="id" placeholder="Enter the Employee Id">
<br>
<br>
<input type="submit" value="submit">
</fieldset>
</form>

</body>
</html>