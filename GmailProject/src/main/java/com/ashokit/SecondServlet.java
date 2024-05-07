package com.ashokit;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    Cookie[] cookies = req.getCookies();
	    System.out.println("Name :"+cookies[0].getName());
	    System.out.println("Value :"+cookies[0].getValue());
	  }
}
