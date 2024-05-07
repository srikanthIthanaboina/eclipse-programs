package com.ashokit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class executeUpdate {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
			Statement stmt = con.createStatement();
			int cnt = stmt.executeUpdate("update primaryscl set marks = 12 where marks = 77");
			System.out.println(cnt);
		}catch (Exception e) {
			
		}
	}

}
