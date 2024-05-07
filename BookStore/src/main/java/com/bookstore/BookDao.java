package com.bookstore;

import java.sql.Connection;

public class BookDao {
	
	public void saveBook(int b_id,String b_uname,int b_price) throws Exception {
		Connection con = connectionFactory.getConnection();
		java.sql.PreparedStatement pstmt = con.prepareStatement("insert into server values(?,?,?)");
		pstmt.setInt(1, b_id);
		pstmt.setString(2, b_uname);
		pstmt.setInt(3, b_price);
		int executeUpdate = pstmt.executeUpdate();
		System.out.println(executeUpdate);
	}

}
