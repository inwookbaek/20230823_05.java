package com.lec.ex01_interface;

public class Cat implements Animal {
	
	@Override
	public void sound() {
		System.out.println("야옹!!");
	}
	
	void walk() {
		System.out.println("살금살금 걷습니다!");
	}
}
