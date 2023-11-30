package com.lec.ex01_interface;

public interface Animal {
	// interface는 생성자를 정의할 수 없다.
	// 즉, 인터페이스는 객체를 생성할 수 없다.
	String KIND = "동물";  // public static final 생략 즉, 상수속성
	void sound();          // public abstract 생략
}