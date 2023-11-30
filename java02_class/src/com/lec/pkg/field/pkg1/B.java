package com.lec.pkg.field.pkg1;

public class B {

	public B() {
		A a = new A();
		
		a.field1 = 20;    // public
		a.field2 = 20;    // default
		// a.field3 = 20; // private 접근 불가
		
		a.method1();    // puiblic
		a.method2();    // default
		// a.method3(); // private, 접근불가
	}
}
