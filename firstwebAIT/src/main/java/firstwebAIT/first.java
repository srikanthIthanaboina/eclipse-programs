package firstwebAIT;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("firstwebAIT.first")
public class first extends HttpServlet{
	public void doPost(HttpServlet req,HttpServlet res)throws SQLException, IOException{
		PrintWriter pw = null ;
		pw.println("name :");
	}
}
