<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>
<%
//int a = 10;
//int a = 899/0;     // complie time eeror
//out.print(a);
%>


<%-- <%
try{
	int a = 99/0;
	out.print(a);
}catch(Exception ex){
	out.print("error is: " + ex.getMessage());
}
%> --%>


<%
int a= 1/0;    // internal server error(405)
%>
</h1>
</body>
</html>