package com.lec;

public interface Human {

	// 인터페이스는 설계도, 그 중에서 시방서로 이해
	// 인터페이스 속성(변수)은 final static 즉 상수로 선언되고
	// 상수이기 때문에 초기값을 반드시 선언되어야 한다.
	final static String name = "";
	String gender = "";  // 컴파일시에 자동으로 final static으로 선언된다.
	
	void speak(); 
	void think(); 
	void eat(); 
	
}
