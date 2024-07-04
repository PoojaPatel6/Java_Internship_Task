<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--<h1>
<%
String name  = request.getParameter("name");
out.print(name);
%>
</h1>
-->





<%-- 
<%

String name = request.getAttribute("key1").toString();
out.print(name);
%>     --%>


<!-- Expression Language(EL) -->
${key1}<br><br>
${key2}

</body>
</html>