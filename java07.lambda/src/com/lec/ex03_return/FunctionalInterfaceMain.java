package com.lec.ex03_return;

public class FunctionalInterfaceMain {
	
	public static void main(String[] args) {
		
		MyInterface fi = null;
		
		fi = new MyInterface() {	
			@Override public int method(int a, int b) { return a * b; } 
		};
		System.out.println(fi.method(10, 20));
		
		// 매개변수가 2개이상일 경우에는 소괄호 생략불가
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(10, 20));
		
		fi = (x, y) -> x - y;
		System.out.println(fi.method(10, 20));
		
		// 람다식에 함수 정의
		fi = (x,y) -> (int) div(25, 0);
		System.out.println(fi.method(25, 0));
	}

	private static double div(int i, int j) {
		if(j==0) {
			System.out.println("0으로 나눌 수가 없습니다!!");
			return 0;
		}
		return i / j;
	}
}

@FunctionalInterface
interface MyInterface {
	int method(int a, int b);
}