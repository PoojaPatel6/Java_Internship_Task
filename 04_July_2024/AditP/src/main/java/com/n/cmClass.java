package com.n;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//controller
@WebServlet("/cmmodel")
public class cmClass extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// variable|object|array
		  String name = "Pooja";
		  int age = 24;
		
		req.setAttribute("key1", name);
		req.setAttribute("key2" , age);
		RequestDispatcher rd  =  req.getRequestDispatcher("log.jsp");
		rd.forward(req, resp);
	}

}
