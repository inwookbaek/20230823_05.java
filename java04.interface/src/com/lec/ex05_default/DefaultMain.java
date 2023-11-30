package com.lec.ex05_default;

public class DefaultMain {

	public static void main(String[] args) {
		
		MyInterface mi1 = new MyImplement();
		mi1.method1();
		mi1.method2();
		mi1.method3();
		System.out.println();
		
		MyInterface mi2 = new MyImplement2();
		mi2.method1();
		mi2.method2();
		mi2.method3();
		System.out.println();
		
		MyInterface.commonMethod();

	}
}