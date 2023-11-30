package com.lec.ex01_interface;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍!!");
	}
	
	void keepFamily() {
		System.out.println("가족을 지킵니다!");
	}
}
