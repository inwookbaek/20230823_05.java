package com.lec.pkg.constructor.pkg1;

public class B {

	A a1 = new A(false);    // public
	A a2 = new A(1.0);      // protected
	A a3 = new A(1);        // default
	// A a4 = new A("문자열"); // private, 접근불가
}
