package com.lec.ex01_interface;

public class Bird implements Animal{
	
	@Override
	public void sound() {
		System.out.println("짹짹!!");
	}

	void fly() {
		System.out.println("하늘을 납니다!!");
	}
}
