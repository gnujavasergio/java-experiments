<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Autenticación</title>
</head>
<body>
	<h1>Autenticacion</h1>

	<form action="login" method="post">
		<label for="username">User</label> 
		<input type="text" name="name" />
		<label for="password">Password</label> 
		<input type="password" name="password" /> 
		<input type="submit" value="login" />
	</form>
</body>
</html>