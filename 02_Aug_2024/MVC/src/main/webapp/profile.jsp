<%@page import="in.sp.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
<% 
    User user = (User) session.getAttribute("session_user");
    /* if (user != null) { */
%>

<h2>Hi</h2>
<h3>Name: <%= user.getName() %> </h3>
<h3>Email: <%= user.getEmail() %> </h3>
<h3>City: <%= user.getCity() %> </h3>

<a href="logout">Logout</a>
<%-- <% 
    } else {
%>
<h3>No user is logged in.</h3>
<% 
    }
%> --%>
</body>
</html>
