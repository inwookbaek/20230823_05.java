package com.lec.ex01_datatype;

public class IntegerMain {

	public static void main(String[] args) {
		// A. 기본타입 : 각 타입마다 저장할 수 있는 숫자 범위가 있다.
		// Integer.MIN_VALUE, Integer.MAX_VALUE로 확인 가능
		// 1. 정수타입 : byte(1) < short(2) < char(2) < int(4) < long(8)
		// 2. 실수타입 : float(4) < double(8)
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		int i1 = 3213213;
		byte b1 = (byte) i1;  // 강제형변환
		System.out.println(b1);
		double d1 = i1;       // 자동형변환
		
		char c1 = '가';
		char c2 = 44032;
		char c3 = '\uac00'; // uni code
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);		
		
				
	}

}
