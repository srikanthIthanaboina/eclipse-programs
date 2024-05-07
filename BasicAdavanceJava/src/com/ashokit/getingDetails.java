package com.ashokit;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class getingDetails {
	public static void main(String[] args) {
	try {
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from student");
	while(rs.next()) {
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.println(rs.getInt(3));
	}
	}catch (Exception e) {
	}
	}
}
