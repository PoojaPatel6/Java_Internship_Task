<%@page import="java.time.LocalDate"%>
<%@ page import= "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!  
int a = 10;
String name = "Pooja Patel";
String name1 = "Sushma";
int square(){
	return a*a;
}



%>


<%

// Print Using out.println tags

out.println("<br>"+"Value of a is  : "+a + "<br>");
out.println("Square of a is: "+ square()+"<br>");
out.println("Name : "+name+"<br>");






int b = 20;


if(b<50){
	out.println("b is smaller than 50"+"<br>");
	
}else{
	
	out.println("b is grater than 50"+"<br>");
}

for(int i= 0; i<=5; i++){
	
	out.println("Print the Number using ForLoop: " +i+"<br><br>");
}
%>

  // Print Using Expression tags
  
<%="<br>"+"value of a: "+ a+"<br>" %>
<%= "Name is: "+name1+ "<br>" %>
<%= "Square is: "+square()+"<br>" %>
<%= "Random Number: "+Math.random()+"<br>" %>
<%="Local Date is:"+ LocalDate.now() +"<br>" %>
<%= new Date().toLocaleString()+"<br>" %>



</body>
</html>