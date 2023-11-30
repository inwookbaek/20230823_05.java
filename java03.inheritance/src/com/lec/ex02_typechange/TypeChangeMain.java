package com.lec.ex02_typechange;

public class TypeChangeMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동형변환
		// 1. 직접상속관계가 있을 경우 - 가능
		a = b;
		a = c;
		a = d;
		a = e;
		
		b = d;
		c = e;
		
		// 2. 직접상속관계가 없을 경우 - 불가능
		// b = e; (x)
		// c = d; (x)

		// 3. 메서드의 매개변수로 전달할 경우
		method_a((short) 10);
		method_a(10);
		method_a("문자열자동형변환");
		System.out.println();
		
		method_a(a);
		method_a(b);
		method_a(c);
		method_a(d);
		method_a(e);		
		System.out.println();
		
		// method_b(a); (x)
		method_b(b); // (o)
		// method_b(c); // (x)
		method_b(d); // (x)
		// method_b(e); // (x)
		
	}

	static void method_a(short a) { System.out.println("정수형 = " + a); }
	static void method_a(double a) { System.out.println("실수형 = " + a); }
	static void method_a(String a) { System.out.println("문자열 = " + a); }
	static void method_a(A a) { System.out.println("A.java = " + a); }
	static void method_a(B a) { System.out.println("B.java = " + a); }
	static void method_b(B a) { System.out.println("B.java = " + a); }
	
}











