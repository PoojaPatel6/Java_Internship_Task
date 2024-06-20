<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  ${param.uname} : ${param.age } : ${param.gender }-->

<%
out.println("Name :"+" " +request.getParameter("uname"));
out.println("<br>"+"Age : "+request.getParameter("age"));
out.println("<br>"+"Gender :"+request.getParameter("gender"));

%>
</body>
</html>