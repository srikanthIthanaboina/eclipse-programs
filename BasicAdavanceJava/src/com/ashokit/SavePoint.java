package com.ashokit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePoint {
	
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("insert into primaryscl values(333,'aws',100)");
			Savepoint svpt = con.setSavepoint("my save point");
			stmt.executeUpdate("update primaryscl set id = 99 where id =1");
			stmt.executeUpdate("insert into emps values(99,'raju',333.33,'driver',null)");
			con.rollback(svpt);
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
