package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	
	public LoginServlet() {
		System.out.println("first servlet object is created");
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		 PrintWriter pw = res.getWriter();
		 res.setContentType("text/html");
		 String user = req.getParameter("name");
		 String password = req.getParameter("password");
		 if(user.equals("admin")&&password.equals("admin")) {
			 req.getRequestDispatcher("index.html").include(req, res);
			 pw.println("logged in successfully");
			 Cookie ck = new Cookie("user",user);
			 res.addCookie(ck); 
		 }else {
			 req.getRequestDispatcher("common.html").include(req, res);
			 pw.println("invalid user please login again!:");
		 }
	}
}
