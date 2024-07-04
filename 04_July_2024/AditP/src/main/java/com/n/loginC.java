package com.n;




import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class loginC extends HttpServlet {
	
 
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	String  name = req.getParameter("name");
    	int age = Integer.parseInt(req.getParameter("age"));
//    	int marks = Integer.parseInt(req.getParameter("marks"));
    	
    	int en = Integer.parseInt(req.getParameter("english"));
    	int ma = Integer.parseInt(req.getParameter("math"));
    	int sc = Integer.parseInt(req.getParameter("science"));
    	double total = en+ma+sc;
    	double per = total/3;
    	
    	
    	// Http session 
//    	HttpSession sess = req.getSession();
//    	sess.setAttribute("name", name);
//    	sess.setAttribute("age", age);
//    	sess.setAttribute("per", per);
    	
    	
    	// Request Dispatcher
    	req.setAttribute("key", name);             // req dispatcher
    	req.setAttribute("marks", per);           // req dispatcher
     	RequestDispatcher rd = req.getRequestDispatcher("pass");
        rd.forward(req,res);
    	
    	
//    	res.sendRedirect("pass?key="+ name);  //res redirect
//    	res.sendRedirect("pass");             //res redirect
    	
//   
//    	System.out.println(name+ " "+ age + " "+marks);
    	PrintWriter out = res.getWriter();
     
//        out.print("<body bgcolor='yellow'>");
//        out.print("<h1>");
//        out.print("Login Success...");
//        out.print("</h1>");
//        out.print("<h1>");
//        out.print("Name: " + name + "<br>");
//        out.print("Age: " + age + "<br>");
//        out.print("Marks: " + marks + "<br>");
//        out.print("</h1>");
//        out.print("</body>");
    	
        
    	
        out.print("<h1>");
        out.print("Name" + " "  + name);
        out.print("/<h1>");
        
        out.print("<h1>");
        out.print("Age" + " " + age);
        out.print("/<h1>");
        
        out.print("<h1>");
        out.print("Percentage : " + " " + per + "%" + "<br>");
        out.print("</h1>");
        out.print("</body>");
    }
}









