package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertMain {

	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/testdb";
	final static String USR = "root";
	final static String PWD = "12345";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			sql = "insert into member(member_id, member_name, mobile, age) " +
			      " values(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "kim");
			pstmt.setString(2, "김민재");
			pstmt.setString(3, "010-7777-88885");
			pstmt.setInt(4, 25);
			int row = pstmt.executeUpdate();
			System.out.println("member테이블에 " + row + "건이 추가 되었습니다!!");
		} catch (Exception e) {
			System.out.println("DB접속실패!!");
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