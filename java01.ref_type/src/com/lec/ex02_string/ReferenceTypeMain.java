package com.lec.ex02_string;

public class ReferenceTypeMain {

	public static void main(String[] args) {
		
		// 참조타입은 생성자로 객체를 생성한다.
		// JVM의 메모리영역
		// 1. stack : 변수명이 저장되는 영역
		// 2. heap  : 객체가 저장되는 영역
		// 3. method(class)영역 : static으로 선언된 변수나 메서드가 저장되는 영역
		// 4. constant pool : 리터럴이 저장되는 영역
		String s1 = "소향";
		String s2 = new String("소향");  // 생성자, 클래스이름과 동일한 메서드가 생성자메서드이다.
		
		String str1 = new String("홍길동"); // heap 영역
		String str2 = "홍길동";             // C.P 영역
		String str3 = "홍길동";             // C.P 영역 "홍길동"은 리터럴이기 때문에 동일자료
		String str4 = new String("홍길동"); // heap 영역 str1과 str2는 다른 객체
		
		String name1 = "소향";
		String name2 = "소향";
		String name3 = new String("소향");
		String name4 = new String("소향");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());		
		System.out.println();
		
		// 1. 객체의 비교 : 메모리주소만 비교
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name3 == name4);
		System.out.println();
		
		// 2. 객체의 비교 : 값을 비교
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name3.equals(name4));
		System.out.println();
		
		// 객체의 생성
		ReferenceTypeMain ref1 = new ReferenceTypeMain(); // 기본생성자
		ReferenceTypeMain ref2 = new ReferenceTypeMain(); // 기본생성자
		
		System.out.println(ref1.hashCode());
		System.out.println(ref2.hashCode());
	}

}
