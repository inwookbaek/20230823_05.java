package com.lec.ex05_wrapper;

public class WrapperMain3 {

	public static void main(String[] args) {
		// 파싱
		// 1. 박싱
		int val1 = Integer.valueOf("100");
		
		// 2. parsing : pares+기본타입() 메서드
		int val2 = Integer.parseInt("100");
		double val3 = Double.parseDouble("100");
		boolean val4 = Boolean.parseBoolean("100"); // true가 아닌 모든 값은 false
		boolean val5 = Boolean.parseBoolean("true");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
	}

}
