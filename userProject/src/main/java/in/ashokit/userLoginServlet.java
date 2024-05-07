package in.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Login")
public class userLoginServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		PrintWriter pw = res.getWriter();
		userDao dao = new userDao();
		try {
			boolean s=dao.getUser(email, pwd);
			if(s==true) {
				pw.println("<h1>Log in Succesfully</h1>");
				pw.println("<h1>welcome to ashok it</h1>");
				pw.println("<a href=\"login.html\">Log Out</a>");
			}else {
				pw.println("<h1>Log in Failed</h1>");
				pw.println("<a href=\"login.html\">Try again</a>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
