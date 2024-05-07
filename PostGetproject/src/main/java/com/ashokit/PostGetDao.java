package com.ashokit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

public class PostGetDao {
	String name;
	String email;
	long phonenumber;
	int i=1;
	public boolean saveDetails(String name,String email,Long phonenumber) throws Exception {
		Connection con = connectionFactory.getConnection();
		java.sql.PreparedStatement pstmt = con.prepareStatement("insert into lab values(?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setLong(3, phonenumber);
		int executeUpdate = pstmt.executeUpdate();
		if(executeUpdate>0) {
			return true;
		}else 
			return false;
	}
	
	public ArrayList getDetails() throws Exception {
		Connection con = connectionFactory.getConnection();
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from lab");
		ArrayList cars = new ArrayList<String>();
		while(rs.next()) {
				String s = rs.getString(1);
				String s1 = rs.getString(2);
				long s2 = rs.getLong(3);
				String s3 = Long.toString(s2);
				cars.add(s1);
				cars.add(s);
				cars.add(s3);
		}
			return cars;
		}



}
