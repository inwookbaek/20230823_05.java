package com.lec.ex02_board;

import java.util.ArrayList;

public interface BoardDAOService {

	void createBoard();                      // 1. 글쓰기
	ArrayList<BoardVO> listBoard();          // 2. 글목록조회
	BoardVO viewBoard(int bno);              // 3. 글내용보기
	void updateBoard(int bno);               // 4. 글수정
	void deleteBoard(int bno);               // 5. 글삭제
	
	ArrayList<BoardVO> findBySubjectBoard(String subject); // 6. 제목별 글목록
	ArrayList<BoardVO> findByWriterBoard(String writer);   // 7. 작성자별 글목록
}
