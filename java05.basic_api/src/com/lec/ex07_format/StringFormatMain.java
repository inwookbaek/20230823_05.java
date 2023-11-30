package com.lec.ex07_format;

import java.text.MessageFormat;

public class StringFormatMain {

	public static void main(String[] args) {
		
		String userid = "hong";
		String userName = "홍길동";
		String phone = "010-9999-8888";
		
		String text = "회원ID={0}, 회원이름={1}, 전화번호={2}";
		String result = MessageFormat.format(text, userid, userName, phone);
		System.out.println(result);
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] member = {"hong", "홍길동", "010-9999-8888"};
		System.out.println(MessageFormat.format(sql, member));

	}

}
