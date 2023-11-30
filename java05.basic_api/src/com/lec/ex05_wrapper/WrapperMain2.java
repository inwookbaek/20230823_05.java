package com.lec.ex05_wrapper;

public class WrapperMain2 {

	public static void main(String[] args) {
		// 포장객체의 비교
		// ==, != 연산자는 사용불가, 대신에 equals()메서드를 사용
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println("언박싱전 비교 결과(1) : " + (i1 == i2)); 
		System.out.println("언박싱전 비교 결과(2) : " + i1.equals(i2)); 
		System.out.println(i1.hashCode() + " : " + i2.hashCode());
		System.out.println();
		
		System.out.println("언박싱후 비교 결과 : " + (i1.intValue() == i2.intValue())); 
		
	}

}
