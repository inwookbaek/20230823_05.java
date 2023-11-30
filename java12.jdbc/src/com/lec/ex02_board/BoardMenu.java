package com.lec.ex02_board;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardMenu {
	private double ver;

	public BoardMenu(double ver) {
		this.ver = ver;
	}
	
	// main menu
	public void mainBoardMenu() {
		BoardDAOImpl bddao = BoardFactory.getInstance();
		
		while(true) {
			int menuno = mainMenuUi();
			switch(menuno) {
			case 1: makeBoard(bddao); break;
			case 2: listBoard(bddao); break;
			case 3: contentView(bddao); break;
			case 4: updateBoard(bddao); break;
			case 5: deleteBoard(bddao); break;
			case 6: findBySubject(bddao); break;
			case 7: findByWriter(bddao); break;
			case 0: System.out.println("프로그램종료!!"); System.exit(0);
			}
		}

	}

	private void findByWriter(BoardDAOImpl bddao) {
		String writer = JOptionPane.showInputDialog("검색할 작성자를 입력하세요!");
		
		ArrayList<BoardVO> boards = bddao.findByWriterBoard(writer);
		System.out.println("======================================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("======================================================");	
		
		for(BoardVO board:boards) {
			System.out.println(board.toString());
		}
		System.out.println("---------- 게시글 목록 조회 종료 --------------");		
	}

	private void findBySubject(BoardDAOImpl bddao) {
		String subject = JOptionPane.showInputDialog("검색할 글제목을 입력하세요!");
		
		ArrayList<BoardVO> boards = bddao.findBySubjectBoard(subject);
		System.out.println("======================================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("======================================================");	
		
		for(BoardVO board:boards) {
			System.out.println(board.toString());
		}
		System.out.println("---------- 게시글 목록 조회 종료 --------------");		
	}

	private void deleteBoard(BoardDAOImpl bddao) {
		String bno = JOptionPane.showInputDialog("삭제할 글번호를 입력하세요!");
		if((bno == null) || (bno == "")) {
			return;
		} else {
			bddao.deleteBoard(Integer.parseInt(bno));
		}	}

	private void updateBoard(BoardDAOImpl bddao) {
		String bno = JOptionPane.showInputDialog("수정할 글번호를 입력하세요!");
		if((bno == null) || (bno == "")) {
			return;
		} else {
			bddao.updateBoard(Integer.parseInt(bno));
		}
	}

	private void contentView(BoardDAOImpl bddao) {
		String bno = JOptionPane.showInputDialog("조회할 글번호를 입력하세요!");
		if((bno == null) || (bno == "")) {
			return;
		} else {
			BoardVO board = bddao.viewBoard(Integer.parseInt(bno));
			System.out.println("글제목 : " + board.getSubject());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("글내용 : " + board.getContent());
		}
	}

	private void listBoard(BoardDAOImpl bddao) {
		ArrayList<BoardVO> boards = bddao.listBoard();
		System.out.println("======================================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("======================================================");
		
		for(BoardVO board:boards) {
			System.out.println(board.toString());
		}
		System.out.println("---------- 게시글 목록 조회 종료 --------------");
		
	}

	private void makeBoard(BoardDAOImpl bddao) {
		bddao.createBoard();
	}

	private int mainMenuUi() {
		String menuNo = JOptionPane.showInputDialog(
				"==== 게시판관리프로그램 V" + this.ver + "====\n\n"
			  + "1. 새로운 글쓰기 \n"
			  + "2. 전체글 목록 조회 \n"
			  + "3. 본문글 보기 \n"
			  + "4. 본문글 수정 \n"
			  + "5. 본문글 삭제 \n"
			  + "6. 제목으로 게시글 조회 \n"
			  + "7. 작성자로 게시글 조회 \n"
			  + "0. 종료 \n"
			  + "처리할 메뉴번호를 입력하세요!!"
			);
		if((menuNo == null) || (menuNo == "")) {
			return 0;
		} else {
			return Integer.parseInt(menuNo);			
		}
	}
}