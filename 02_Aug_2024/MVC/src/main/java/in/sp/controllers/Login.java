

package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.dbcon.DbConnection;
import in.sp.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/loginForm")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	PrintWriter out = resp.getWriter();
    	resp.setContentType("text/html");
    	
        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");

       try {
    	   Connection con = DbConnection.getConnection();
    	   
    	   String query = "select * from register where email=? and password=?";
    	   PreparedStatement ps = con.prepareStatement(query);
    	   ps.setString(1, myemail);
    	   ps.setString(2, mypass);
    	   
    	  ResultSet rs =  ps.executeQuery();
    	  if(rs.next()) 
    	  
    	  {
    		User user =  new User();
    		user.setName(rs.getString("name"));
    		user.setEmail(rs.getString("email"));
    		user.setCity(rs.getString("city"));
    		
    		HttpSession session = req.getSession();
    		session.setAttribute("session_user", user);
    		
    		RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
    		rd.forward(req, resp);
    		
    	 }else {
    		
    		out.println("<h3 style='color:red'>Email id & Password didn't matched</h3>");
    		
    		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
    		rd.include(req, resp);
    	}
    	  
    	  
    	  
    	  
    	  
       }catch(Exception e){
    	   
    	   e.printStackTrace();
       }
        String validEmail = "user@example.com";
        String validPassword = "password123";

        
        if (myemail.equals(validEmail) && mypass.equals(validPassword)) {
            
           resp.getWriter().write("Login successful!");
       } else {
            // Failed login
            resp.getWriter().write("Invalid email or password. Please try again.");
       }
    }
}
