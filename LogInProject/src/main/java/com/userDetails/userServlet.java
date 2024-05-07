package com.userDetails;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Register")
public class userServlet extends GenericServlet{

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String phonenumber = req.getParameter("phonenumber");
		PrintWriter pw = res.getWriter();
		int pwd1= Integer.parseInt(pwd);
		if(phonenumber==null) {
			phonenumber= "-1";
		}
		int phonenumber1 = Integer.parseInt(phonenumber);
		try {
			userDao dao = new userDao();
			if(name!=null) {
			dao.saveUser(name, email, pwd1,phonenumber1);
			pw.println("<h1>Details saved</h1>");
			}else {
			String s=dao.getUser(email, pwd1);
		if(s!=null) {
			pw.println(s);
		}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
