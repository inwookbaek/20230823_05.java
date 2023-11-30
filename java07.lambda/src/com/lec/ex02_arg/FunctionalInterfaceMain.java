package com.lec.ex02_arg;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		MyInterface fi= null;
		
		fi = new MyInterface() {
			@Override public void method(int a) {
				System.out.println("fi의 매개변수 a(1) = " + a);
			}
		};
		fi.method(10);
		
		fi = (int a) -> { System.out.println("fi의 매개변수 a(2) = " + a); };
		fi.method(20);
		// fi.method("문자열"); 타입에러
		
		fi = a -> { System.out.println("fi의 매개변수 a(3) = " + a); };
		fi.method(30);

		fi = a -> System.out.println("fi의 매개변수 a(4) = " + a);
		fi.method(40);
		
		fi = x -> {
			int result = x * 10;
			System.out.println("fi의 매개변수 a(5) = " + result);
		};
		fi.method(50);
	}
}

@FunctionalInterface
interface MyInterface {
	void method(int a);
}
