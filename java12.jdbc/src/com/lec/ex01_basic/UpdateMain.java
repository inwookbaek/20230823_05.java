package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateMain {

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
			sql = "update member set member_name=?, age=? where member_id=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "홍길순");
			pstmt.setInt(2, 98);
			pstmt.setString(3, "hong");
			int row = pstmt.executeUpdate();
			System.out.println("member테이블에 " + row + "건이 수정 되었습니다!!");
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