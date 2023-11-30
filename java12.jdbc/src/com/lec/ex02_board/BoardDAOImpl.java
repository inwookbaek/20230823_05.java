package com.lec.ex02_board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardDAOImpl implements BoardDAOService {

	private BoardVO insertBoard() {
		BoardVO board = new BoardVO();
		
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요!!");
		String writer = JOptionPane.showInputDialog("작성자를 입력하세요!!");
		String content = JOptionPane.showInputDialog("글내용을 입력하세요!!");
		
		board.setSubject(subject);
		board.setWriter(writer);
		board.setContent(content);
		
		return board;
	}
	
	@Override
	public void createBoard() {
		// insert into board...
		BoardVO board = insertBoard();		
		// System.out.println(board.toString());
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getInsert();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			int row = pstmt.executeUpdate();
			System.out.println(row + "건이 성공적으로 등록되었습니다!");
		} catch (SQLException e) {
			System.out.println("데이터추가실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}
		}
		
	}

	@Override
	public ArrayList<BoardVO> listBoard() {
		// select * from board;
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() + " order by bno desc limit 10";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글목록조회실패!!!");
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}
		}		
		return boardList;
	}

	@Override
	public BoardVO viewBoard(int bno) {
		// select * from board where bno=?
		BoardVO board = new BoardVO();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() + " where bno = ?";		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBno(bno);
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));	
			} else {
				System.out.println("글번호(" + bno + ") - 게시글을 찾지 못했습니다!!! ");
			}
			
		} catch (SQLException e) {
			System.out.println("게시글상세조회실패!!!");
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}
		}		
		return board;
	}

	@Override
	public void updateBoard(int bno) {
		// update board set subject=?,,,, where bno = 1
		BoardVO board = viewBoard(bno);
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요", board.getSubject());
		String content = JOptionPane.showInputDialog("작성자를 입력하세요", board.getContent());

		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getUpdate();
		
		try {
			pstmt = conn.prepareStatement(sql);	
			pstmt.setString(1, subject);
			pstmt.setString(2, content);
			pstmt.setInt(3, bno);
			int row = pstmt.executeUpdate();
			System.out.println("글번호(" + bno + ") - 게시글이 성공적으로 수정되었습니다!!! ");						
		} catch (SQLException e) {
			System.out.println("게시글수정실패!!!");
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

	@Override
	public void deleteBoard(int bno) {
		// delete from board where bno = 1
		BoardVO board = new BoardVO();

		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getDelete();
		
		try {
			pstmt = conn.prepareStatement(sql);	
			pstmt.setInt(1, bno);
			int row = pstmt.executeUpdate();
			
			if(row >= 1) {
				System.out.println("글번호(" + bno + ") - 성공적으로 삭제");
			} else {
				System.out.println("글번호(" + bno + ") - 게시글 찾지 못했습니다 ");										
			}
		} catch (SQLException e) {
			System.out.println("게시글 삭제 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}
		}
	}

	@Override
	public ArrayList<BoardVO> findBySubjectBoard(String subject) {
		// select * from board where subject like '%제목%';
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() 
				+ " where subject like '%" + subject + "%'"
				+ " order by bno desc limit 10";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글목록(by subject)조회실패!!!");
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}
		}		
		return boardList;
	}

	@Override
	public ArrayList<BoardVO> findByWriterBoard(String writer) {
		// select * from board where writer like '%작성자%';
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() 
				+ " where writer like '%" + writer + "%'"
				+ " order by bno desc limit 10";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글목록(by writer)조회실패!!!");
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// dummy
			}
		}		
		return boardList;
	}

}
