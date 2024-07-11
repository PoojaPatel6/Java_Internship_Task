<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>
<link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="login-box">
        <form action="LoginForm" method="post">
            <h2>Login</h2>
            <label for="email1">Email:</label>
            <input type="text" id="email1" name="email1"/><br><br>
            <label for="pass1">Password:</label>
            <input type="password" id="pass1" name="pass1"/><br><br>
            <input type="submit" value="Login"/>
        </form>
    </div>
</body>
</html>