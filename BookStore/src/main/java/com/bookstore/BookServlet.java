package com.bookstore;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/book1")
public class BookServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("b_id");
		String name = req.getParameter("b_name");
		String price = req.getParameter("b_price");
		PrintWriter pw = res.getWriter();
			int bid1= Integer.parseInt(id);
		String b = name;
		int bprice1 = Integer.parseInt(price);
		try {
		
		    BookDao dao = new BookDao();
			dao.saveBook(bid1, b, bprice1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		pw.println("<h1>books saved</h1>");
	}
}