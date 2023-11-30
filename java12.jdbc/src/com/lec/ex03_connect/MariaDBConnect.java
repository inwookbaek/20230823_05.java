package com.lec.ex03_connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lec.connector.MariaDBConnector;
import com.lec.ex02_board.BoardVO;

public class MariaDBConnect {

	public static void main(String[] args) {
		
		Connection conn = MariaDBConnector.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement("select * from board order by bno desc");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBno(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setWriter(rs.getString(3));
				vo.setContent(rs.getString(4));
				System.out.println(vo.toString());
			}
		} catch (Exception e) {
			System.out.println("DB접속실패!!");
		} finally {
			MariaDBConnector.close(conn, pstmt, rs);
		}

	}

}
