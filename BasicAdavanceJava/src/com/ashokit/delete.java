package com.ashokit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class delete {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
			PreparedStatement pstmt = con.prepareStatement("delete from tution");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
		}catch(Exception e) {
			
		}
	}

}
