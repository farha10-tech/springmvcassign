<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login PAGE</title>
</head>
<body>
<form action="./login1form" method="post">
<fieldset>
<legend>Login PAGE</legend>
<label>Employee Id</label>
<input type="text" name="id" placeholder="Enter the Employee Id">
<br>
<br>
<label>Password</label>
<input type="password" name="pwd" placeholder="Enter the password" required="required">
<br>
<br>
<input type="submit" value="submit">
</fieldset>
</form>
</body>
</html>