package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException {
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			req.getRequestDispatcher("common.html").include(req, res);
			Cookie[] cookies = req.getCookies();
			Cookie ck = cookies[0];
			ck.setMaxAge(0);
			res.addCookie(ck);
			pw.print("logged out successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
