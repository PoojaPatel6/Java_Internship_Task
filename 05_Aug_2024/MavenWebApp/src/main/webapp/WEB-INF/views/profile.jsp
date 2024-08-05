<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome : User</h2>
<%-- <h3>Name : ${model_name}</h3> 
<h3>Email Id : ${model_email}</h3>
<h3>Phone No : ${model_phno}</h3> --%>

<h3>Name : ${model_user.getName()}</h3>
<h3>Email Id : ${model_user.getEmail()}</h3>
<h3>Phone No : ${model_user.getPhoneno()}</h3>

</body>
</html>
