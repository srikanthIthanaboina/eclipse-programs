package com.userDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.userDetails.connectionFactory1;

public class userDao {

	public void saveUser(String name,String email,int pwd,int phonenumber) throws Exception {
		Connection con = connectionFactory1.getConnection();
		java.sql.PreparedStatement pstmt = con.prepareStatement("insert into RegDetails values(?,?,?,?)");
		pstmt.setString(1,name );
		pstmt.setString(2, email);
		pstmt.setInt(3, pwd);
		pstmt.setInt(4,phonenumber);
		int executeUpdate = pstmt.executeUpdate();
		System.out.println(executeUpdate);
	}
	public String getUser(String email,int pwd) throws Exception {
		Connection con = connectionFactory1.getConnection();
		Statement stmt =con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("select * from RegDetails where email=? and pwd =? ");
		 pstmt.setString(1, email);
	        pstmt.setInt(2, pwd);
	        ResultSet resultSet = pstmt.executeQuery();
	        
	        if (resultSet.next()) {
	            return "Login successful";
	        } else {
	            return null; // User not found or incorrect credentials
	        }
	        }
	}
