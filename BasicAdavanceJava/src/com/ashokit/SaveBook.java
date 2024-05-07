package com.ashokit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveBook {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
		Statement stmt = con.createStatement();
		int cnt = stmt.executeUpdate("insert into student values(2,'ram',66)");
		System.out.println("Records Effected ::"+cnt);
		stmt.close();
		}catch(Exception e) {
		    System.err.println(e);
		}
		
	}

}
