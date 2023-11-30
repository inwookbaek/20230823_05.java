package com.lec.ex03_String;

public class StringBuilderMain {

	public static void main(String[] args) {
		// StringBuffer, StringBuilder - 2개의 차이점은 buffer를 사용여부
		// append, insert, delete, deleteCharAt, replace, reverse, setChatAt
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode()+ ", " + sb);
		
		sb.append("Java");
		System.out.println(sb.hashCode()+ ", " + sb);

		sb.insert(0, "파이썬");
		sb.insert(2, "자바스크립트");
		System.out.println(sb.hashCode()+ ", " + sb.toString());
		
		sb.delete(4,  5);
		System.out.println(sb.hashCode()+ ", " + sb.toString());

		sb.replace(4, 6, "이강인");
		System.out.println(sb.hashCode()+ ", " + sb.toString());
		
		sb.reverse();
		System.out.println(sb.hashCode()+ ", " + sb.toString());
		
		sb.setCharAt(6, 'X');
		System.out.println(sb.hashCode()+ ", " + sb.toString());
	}

}
