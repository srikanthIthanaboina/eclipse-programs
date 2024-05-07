package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
    PrintWriter pw = res.getWriter();
    res.setContentType("text/html");
    req.getRequestDispatcher("index.html").include(req, res);
    Cookie[] cookies = req.getCookies();
    String name = cookies[0].getName();
    String value =cookies[0].getValue();
    System.out.println(name);
    System.out.println(value);
    if(name.equals("user")) {
    	pw.println("welcome to profile");
    }else {
    	pw.println("to access profile please login first");
    }
}
}
