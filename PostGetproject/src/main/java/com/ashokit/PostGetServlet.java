package com.ashokit;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/book1")
public class PostGetServlet extends GenericServlet{
	int i=1;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phonenumber = req.getParameter("phonenumber");
		PrintWriter pw = res.getWriter();
		Long phonenumber1 = Long.parseLong(phonenumber);
		ArrayList<String> cars = new ArrayList<String>();
		boolean there = false;
		try {
		    PostGetDao dao = new PostGetDao();
			there = dao.saveDetails(name, email, phonenumber1);
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, res);
			pw.println("<h1 style='color:blue' align='center'>Details Information</h1>");
			//cars = dao.getDetails();
			//pw.println(cars);
			Connection con = connectionFactory.getConnection();
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from lab");
			int i=0;
			if(there) {
				pw.print("<table border ='1' width = 700px align = 'center' style='background-color:powderblue'><tr><th>s.no</th><th>name</th><th>email</th><th>phonenumber</th></tr>");
				while(rs.next()) {
					i++;
					pw.print("<tr><td>");
					pw.print(i);
					pw.print("</td>");
					pw.print("<td>");
					pw.print(rs.getString(1));
					pw.print("</td>");
					pw.print("<td>");
					pw.print(rs.getString(2));
					pw.print("</td>");
					pw.print("<td>");
					long s2 = rs.getLong(3);
					pw.print(Long.toString(s2));
					pw.print("</td>");
				}
				pw.print("</table>");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}