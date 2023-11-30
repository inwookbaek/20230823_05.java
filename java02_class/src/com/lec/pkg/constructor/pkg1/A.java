package com.lec.pkg.constructor.pkg1;

/*
	생성자의 접근제한자는 public, default(생략), private, protected
	1. A에서 자신의 생성자를 접근가능?
	2. B(동일패키지)에서 A의 생성자 접근가능?
	3. C(다른패키지)에서 A의 생성자 접근가능?
*/
public class A {

	public    A(boolean b) {}
	protected A(double d)  {}
	          A(int i)     {}
	private   A(String s)  {}
	
	A a1 = new A(false);
	A a2 = new A(1.0);
	A a3 = new A(1);
	A a4 = new A("문자열");
}
