<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<fieldset>
<legend>Login Form</legend>
<!-- <form action="./Login1" method="post"> -->
<!-- <form action="./login" method="post">  -->
 <form action="./Login2" method="post"> 
<!-- <form action="./Login3" method="post"> -->
<table>
<tr>
<td> Enter the User name </td>
<td>:</td>
<td><input type="text" name="user" required="required"> </td>
</tr>

<tr>
<td> Enter the Password </td>
<td>:</td>
<td><input type="password" name="pwd" required="required"> </td>
</tr>

<tr>

<td><input type="submit" value="submit"> </td>
</tr>

</table>
</form>
</fieldset>
</body>
</html>