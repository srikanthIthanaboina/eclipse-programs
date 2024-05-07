package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class DisplayServlet extends HttpServlet{
	
	  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		    
		    javax.servlet.ServletContext servletContext = getServletContext();
		    String initParameter = servletContext.getInitParameter("dbusername");
		    String initParameter1 = servletContext.getInitParameter("dbuserPassword");
		    PrintWriter out = res.getWriter();
		    out.print("Servlet Context Param :"+initParameter +" "+initParameter1);
		    
		  }
}

