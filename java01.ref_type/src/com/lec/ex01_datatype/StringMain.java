package com.lec.ex01_datatype;

public class StringMain {

	public static void main(String[] args) {
		// 참조타입 - Class, Array, Interface, Enum
		// String은 class타입, 큰 따옴표로 선언
		String s1 = "손흥민";
		// char c1 = "A"; // char타입은 정수타입으로 한개의 문자만 저장가능, 작은 따옴표로 선언
		char c2 = 'A';
		
		// 참조타입은 객체가 저장되어 있는 메모리 주소를 참조하는 데이터타입이다.
		System.out.println(s1);
		System.out.println("참조타입의 메모리주소 = " + s1.hashCode());

		// 상수 : 자바에서는 상수는 다른 언어와 좀 다른 개념이다.
		// literal vs constant(상수)
		String name = "소향"; // 소향이라는 문자열이 literal
		int i1 = 10;          // 10도 literal
		
		// 상수
		final int min_value = 10; // min_value가 상수이고 10이 literal, 관례에 어긋나
		final int MIN_VALUE = 10; // 상수는 final로 선언되고 변수명은 대문자(스네이크케이스)로 선언
		// MIN_VALUE = 100; 상수는 변경할 수 없다.
		
		// 변수선언과 초기화
		int i2;   //  선언만, 초기화가 되지 않는 변수는 사용할 수 없다.
		int i3 = 10; // 선언과 초기화 동시
		
		
		i2 = 1000;
		System.out.println(i2);
		System.out.println(i3);
		
		
		
		
		
	}

}
