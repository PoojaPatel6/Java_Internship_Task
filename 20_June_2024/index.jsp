package com.pooja;

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Title Here</title>
</head>
<body>
<h1>
<% out.println("data"); %>
</h1>
<form>
Name : <input type="text" name = "fname"/><br><br>
Age: <input type="text" name = "age"/><br><br>
<% out.println("Welcome: "+" "+request.getParameter("fname")); %>
 <input type="submit"/>
 
 <br><br>
Welcome : ${param.fname}<br> Your Age is: ${param.age} 
</form>




</body>
</html>
