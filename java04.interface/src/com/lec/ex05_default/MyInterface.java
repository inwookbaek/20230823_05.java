package com.lec.ex05_default;

public interface MyInterface {
	void method1();
	// 몇년뒤에 새로운 업무(method2)가 변경
	default void method2() {
		System.out.println("1년뒤에 새로운 기능이 추가 되었습니다!");
	}
	
	// default 메서드 - 객체멤버, 구현하지 않아도 된다.
	default void method3() {
		System.out.println("5년뒤에 새로운 기능이 추가 되었습니다!");
	} 
	
	// static 메서드 - 인터페이스멤버, 구현하지 않아도 된다.
	static void commonMethod() {
		System.out.println("공통으로 사용되는 메서드 입니다!");
	}
}
