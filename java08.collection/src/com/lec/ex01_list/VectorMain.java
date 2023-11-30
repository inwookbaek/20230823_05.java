package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		// 1. ArrayList - Member
		List<Member> members = new ArrayList<>();
		members.add(new Member(1, "12345", "홍길동", "hong1@gmail.com"));
		members.add(new Member(2, "12345", "홍길순", "hong2@gmail.com"));
		members.add(new Member(3, "12345", "홍길자", "hong3@gmail.com"));
		members.add(new Member(4, "12345", "홍길녀", "hong4@gmail.com"));
		members.add(new Member(5, "12345", "홍길성", "hong5@gmail.com"));
		for(Member member:members) {
			System.out.println(member.toString());
		}
		System.out.println();	
		
		// 2. Vector - Board
		// insert into board values(....);
		List<Board> boards = new Vector<>();
		boards.add(new Board(1, "제목1", "작성자1", "글내용1"));
		boards.add(new Board(2, "제목2", "작성자2", "글내용2"));
		boards.add(new Board(3, "제목3", "작성자3", "글내용3"));
		boards.add(new Board(4, "제목4", "작성자4", "글내용4"));
		boards.add(new Board(5, "제목5", "작성자5", "글내용5"));
		for(Board board:boards) {
			System.out.println(board.toString());
		}
		System.out.println();	
		
		// 삭제 - delete from borad where bno=3;
		boards.remove(3);
		System.out.println("boards 의 갯수 = " + boards.size());
		
		// 조회 : select * from board;
		System.out.println("<table border=\"1\">");
		for(Board board:boards) {
			System.out.println("<tr>" 
					+ "<td>" + board.bno + "</td>"
					+ "<td>" + board.title + "</td>"
					+ "<td>" + board.writer + "</td>"
					+ "<td>" + board.content + "</td>"
					+ "</tr>");
		}
		System.out.println("</table>");
	}

}

class Member {
	private int id;
	private String pw;
	private String name;
	private String email;

	public Member(int id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;	
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + "]";
	}
}

class Board {
	int bno;
	String title;
	String writer;
	String content;
	
	public Board(int bno, String title, String writer, String content) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
}
