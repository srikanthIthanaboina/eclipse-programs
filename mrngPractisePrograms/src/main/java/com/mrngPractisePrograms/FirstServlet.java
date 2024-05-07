package com.mrngPractisePrograms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{
	 @Override
	  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    
	    ServletContext servletContext = getServletContext();
	    String initParameter = servletContext.getInitParameter("dbusername");
	    String initParameter1 = servletContext.getInitParameter("dbuserPassword");
	    PrintWriter out = res.getWriter();
	    out.print("Servlet Context Param :"+initParameter +" "+initParameter1);
	    
	  }


}
