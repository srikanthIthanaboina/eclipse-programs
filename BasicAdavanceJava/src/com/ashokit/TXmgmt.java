package com.ashokit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TXmgmt {
	
	public static void main(String[] args) throws SQLException {
	
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
	con.setAutoCommit(false);
	try {
		PreparedStatement pstmt = con.prepareStatement("insert into emps values(?,?,?,?,?)");
		pstmt.setInt(1, 222);
		pstmt.setString(2,"john");
		pstmt.setDouble(3, 1000.00);
		pstmt.setString(4,"developer");
		pstmt.setDate(5, null);
		pstmt.executeUpdate();
		
		pstmt = con.prepareStatement("insert into primaryscl values(?,?,?)");
		pstmt.setInt(1, 222);
		pstmt.setString(2, "john");
		pstmt.setInt(3, 99);
		pstmt.executeUpdate();
		con.commit();
	}catch(Exception e) {
		System.out.println("transcation rolled back...");
		con.rollback();
	}
	con.close();
}
}
