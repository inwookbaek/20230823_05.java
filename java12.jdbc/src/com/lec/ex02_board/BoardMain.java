package com.lec.ex02_board;

/*
	A. DAO와 DTO(VO) 개념
	
	1. DAO(Data Access Object)
	
	   DAO는 DataBase의 data에 접근하기위한 객체를 의미한다.
	   DAO는 DB에 접근해서 테이터를 조회하거나 조작하는 기능을
	   전담하는 객체이다.
	   DAO객체는 interface를 선언후 그 인터페이스를 구현한 객체
	   를 만들어서 편리하게 사용하도록 한다.
	
	2. DTO(Data Transfer Object, VO Value Object)
	
	   DTO는 데이터를 교환하는 즉, 데이터를 주고 받는 중간 매개체
	   역할을 하는 객체이다.
	   DTO는 로직을 가지고 있지 않고 속성, get/set메서드만 가진
	   객체이다.
	
	B. 게시판 Application(only Java)
	
	1. 테이블생성
	
		CREATE TABLE BOARD (
		  BNO int(11) NOT NULL AUTO_INCREMENT,
		  SUBJECT varchar(100) NOT NULL,
		  WRITER varchar(50) NOT NULL,
		  CONTENT varchar(255) DEFAULT NULL,
		  CRTDATE datetime DEFAULT current_timestamp(),
		  READCNT int(11) DEFAULT 0,
		  PRIMARY KEY (BNO)
		);
	
	2. jdbc.properties 생성
	   1) DB접속정보
	   2) SQL정보
	
	3. board프로그램
	
	   1) BoardMain : 게시판 메인프로그램
	   2) BoardVO   : 게시판 모델클래스(DTO)
	   3) ConnectionFactory : DB접속정보를 공통사용, 이 클래스를 통해서 conn객체생성
	   4) BoardDAOService   : 게시판 Interface
	   5) BoardDAOImpl      : 게시판 구현 클래스
	   6) BoardFactory      : 게시글을 생성 클래스(Singleton패턴)
	   7) BoardMenu         : 게시판 메인메뉴 클래스 
*/

public class BoardMain {

	public static void main(String[] args) {
		
		BoardMenu menu = new BoardMenu(1.0);
		menu.mainBoardMenu();
	}

}
