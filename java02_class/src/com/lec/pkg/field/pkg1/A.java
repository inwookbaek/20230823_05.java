package com.lec.pkg.field.pkg1;

/*
	필드나 메서드에 접근제한자가 있을 경우 접근가능여부?
	접근제한자는 public, default(생략시), private만 가능
	1. B(동일패키지)에서 A의 field or method에 접근가능여부?
	2. C(다른패키지)에서 A의 field or method에 접근가능여부?
	
	결과
	1. 동일패키지의 다른 클래스(B)에서는 public, defalut는 접근가능, private는 접근불가
	2. 다른패키지의 클래스(C)에서는 public만 접근가능, default, private 접근불가
*/
public class A {
	
	public  int field1;
	        int field2;
	private int field3;
	
	public  void method1() {}
	        void method2() {}
	private void method3() {}
	
	public A() {
		
		// 1. field
		field1 = 10;
		field2 = 10;
		field3 = 10;
		
		// 2. method
		method1();
		method2();
		method3();
		
	}

}
