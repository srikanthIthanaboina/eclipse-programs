package com.ashokit;

import java.sql.Connection;
public class Hikcon {
	
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_UNAME = "system";
	private static final String DB_PWD= "123456";
	
	public static void main(String[] args) {
		
		/*HikariConfig config = new HikariConfig();
		
		config.setJdbcurl(DB_URL);
		config.setUsername(DB_UNAME);
		config.setPassword(DB_PWD);
		
		HikariDataSource datasource = new HikariDataSource(config);
		Connection con = datasource.getConnection();*/
		
	}

}
