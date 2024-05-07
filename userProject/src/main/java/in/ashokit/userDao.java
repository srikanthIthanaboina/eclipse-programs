package in.ashokit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import in.ashokit.*;
public class userDao {
	public void saveUser(String name,String email,String pwd,long phonenumber) throws Exception {
		Connection con = connectoinFactory.getConnection();
		java.sql.PreparedStatement pstmt = con.prepareStatement("insert into userDetails values(?,?,?,?)");
		pstmt.setString(1,name );
		pstmt.setString(2, email);
		pstmt.setString(3, pwd);
		pstmt.setLong(4,phonenumber);
		int executeUpdate = pstmt.executeUpdate();
		System.out.println(executeUpdate);
	}
	
	public Boolean getUser(String email,String pwd) throws Exception {
		Connection con = connectoinFactory.getConnection();
		Statement stmt =con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("select * from userDetails where email=? and pwd =? ");
		 pstmt.setString(1, email);
	        pstmt.setString(2, pwd);
	        ResultSet resultSet = pstmt.executeQuery();
	        
	        if (resultSet.next()) {
	            return true;
	        } else {
	            return false; // User not found or incorrect credentials
	        }
	        }
}


