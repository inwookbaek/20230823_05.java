package com.lec.ex03_String;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7,8,9,10";
		String[] nums = str.split(",");
		System.out.println(nums.length);
		
		String txt = "홍길동,홍길자@홍길순-홍길상&홍길성";
		String[] names = txt.split(",|@|&|-");
		System.out.println(names.length);
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(txt, ",|@|&|-");
		int count = st.countTokens();
		System.out.println(count);
		String token = st.nextToken();
		System.out.println(token + ", " + st.countTokens());
		System.out.println();
		
		// 1. for
		st = new StringTokenizer(txt, ",|@|&|-");
		count = st.countTokens();
		for(int i=0;i<count;i++) {
			token = st.nextToken();
			System.out.println(token + ", " + st.countTokens());
		}
		System.out.println();
		
		// 2. while - hasMoreTokens()
		st = new StringTokenizer(txt, ",|@|&|-");
		while(st.hasMoreTokens()) {
			token = st.nextToken();
			System.out.println(token + ", " + st.countTokens());			
		}
		System.out.println();
		
		System.out.println("현재 남아 있는 토큰갯수 = " +  st.countTokens());
		System.out.println("현재 토큰이 남아 있는가? " +  st.hasMoreTokens());
		System.out.println();
		
		st = new StringTokenizer(txt, ",|@|&|-");
		System.out.println("현재 남아 있는 토큰갯수 = " +  st.countTokens());
		System.out.println("현재 토큰이 남아 있는가? " +  st.hasMoreTokens());
		
	}

}






