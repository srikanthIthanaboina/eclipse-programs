package com.ashokit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addbatch {
	
	public static void main(String[]args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
		Statement stmt = con.createStatement();
		//stmt.addBatch("insert into emps values(101,'java',12000.44,'developer','01-feb-2024')");
		//stmt.addBatch("insert into emps values(102,'oracle',34000.44,'developer','03-sep-2024')");
		stmt.addBatch("insert into emps(e_id,e_name) values (102,'spring')");
		int[] cnt = stmt.executeBatch();
		System.out.println(cnt.length);
		con.close();
	}

}
