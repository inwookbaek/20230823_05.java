package com.lec.ex01_noarg;

/*
	람다식은 익명객체(함수)를 생성하기 위한 언어이다. 
	람다식으로 작성된 것은 객체지향언어보다 함수지향언어에 가깝다.
	람다식을 사용하는 이유는 자바코드가 간결해지고 컬렉션요소들을
	매핑등의 작업을 수행해 결과를 쉽게 얻을 수 있기 때문이다.
	
	작성방법
	
	1. 매개변수가 없을 경우      : () -> { ... }
	2. 매개변수가 하나일 경우    : a -> { ... }
	3. 매개변수가 여러개 일 경우 : (a,...x) -> { ... }
	4. 실행문장이 하나일 경우    : () -> System.out.println();
	5. 실행문장이 하나, return있을 경우 : (a,b) -> a+b;
*/
public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		// 타깃타입(MyInterface2)와 구현객체(MyClass)
		MyInterface2 myClass = new MyClass();
		myClass.method1();
		myClass.method2();
		
		// interface는 객체를 생성할 수 없다.
		// MyInterface2 myClass1 = new MyInterface2();
		MyInterface2 myClass1 = new MyInterface2() {
			
			@Override public void method2() {}
			@Override public void method1() {}
		};
		myClass1.method1();
		myClass1.method2();
		
		// FunctionalInterface
		// 타깃타입(MyInterface1)와 익명(구현)객체
		Runnable yyy = new Runnable() {
			@Override public void run() {}
		};
		// a. 람다식 미사용
		MyInterface1 fi1 = new MyInterface1() {
			
			@Override
			public void method() {
				System.out.println("fi1-FuntionalInterface.method1이 호출(1)");	
			}
		};
		fi1.method();
		
		// b. 람다식사용
		MyInterface1 fi2 = () -> { System.out.println("fi1-FuntionalInterface.method1이 호출(2)"); };
		fi2.method();
		MyInterface1 fi3 = () -> System.out.println("fi1-FuntionalInterface.method1이 호출(3)");
		fi3.method();
		
		
	}

}

// @FunctionalInterface는 추상메서드가 오직 1개만 존재해야 한다.
// @FunctionalInterface는 람다식으로 작성할 수 있다.
@FunctionalInterface
interface MyInterface1 {
	void method();
}

interface MyInterface2 {
	void method1();
	void method2();
}

class MyClass implements MyInterface2 {
	@Override public void method1() {}
	@Override public void method2() {}	
}