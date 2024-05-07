package in.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/userRegister")
public class userRegistrationServlet extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String phonenumber = req.getParameter("phonenumber");
		PrintWriter pw = res.getWriter();
		long phonenumber1 = Long.parseLong(phonenumber);
		try {
			userDao dao = new userDao();
			dao.saveUser(name, email, pwd,phonenumber1);
			pw.println("<h1>Details saved</h1>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
