package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOneMain {
	
	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/testdb";
	final static String USR = "root";
	final static String PWD = "12345";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			String sql = "select * from member where member_id=? and age=?";
			int row = 0;
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "hong");
			pstmt.setInt(2, 99);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("member_id");
				String name = rs.getString(2);
				String mobile = rs.getString(3);
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + mobile + ", " + age);
			} else {
				System.out.println("자료를 찾지 못했습니다!");
			}
				
		} catch (Exception e) {
			System.out.println("DB연결실패!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}			
		}

	}

}













