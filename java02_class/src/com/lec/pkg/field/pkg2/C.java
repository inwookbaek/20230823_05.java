package com.lec.pkg.field.pkg2;

import com.lec.pkg.field.pkg1.A;

public class C {

	public C() {
		
		A a = new A();
		
		a.field1 = 20;    // public
		// a.field2 = 20; // default, 접근불가
		// a.field3 = 20; // private 접근불가
		
		a.method1();    // puiblic
		// a.method2(); // default, 접근불가
		// a.method3(); // private, 접근불가
	}
}
