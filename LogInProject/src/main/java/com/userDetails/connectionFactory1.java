package com.userDetails;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class connectionFactory1 {
	private static DataSource ds = null;
	
	public static Connection getConnection() throws Exception{
	
		if(ds==null) {
			File f = new File("C:\\eclipse Ide\\eclipse2\\LogInProject\\db.properties");
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			String url = p.getProperty("db.url");
			String uname = p.getProperty("db.uname");
			String pwd = p.getProperty("db.pwd");
			String driver = p.getProperty("db.driver");
			HikariConfig Config = new HikariConfig();
			Config.setJdbcUrl(url);
			Config.setUsername(uname);
			Config.setPassword(pwd);
			Config.setDriverClassName(p.getProperty("db.driver"));
			ds = new HikariDataSource(Config);
		}
		
		return ds.getConnection();
	}

}
