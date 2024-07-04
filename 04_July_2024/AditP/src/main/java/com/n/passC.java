package com.n;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class passC  extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
				
//		String name;
//		String name  =req.getParameter("name");  // Redirect Response
	
		String name  = (String)req.getAttribute("key");     // Request Dispatcher
		double marks = (double) req.getAttribute("marks");  // Request Dispatcher
		
//		HttpSession sess = req.getSession();               //http session
//		String name = (String) sess.getAttribute("name");  //Http Session
//		int age = (int) sess.getAttribute("age");          //Http Session
		
		PrintWriter out = res.getWriter();
//		out.println("You have Passed");
//		out.println("<h1>" + name +" : You have passed!"+"</h1>");
//		out.println("<h1>" + name +" : You have passed!"+"</h1>");
		
		out.println("<h1>" + name +"  :  You Scored! "+ marks + " %</h1>");
		
	
	}
	
	

}

