package com.lec.ex05_wrapper;

/*
	포장클래스(Wrapper Class)
	
	Java의 기본타입(byte~double,boolean)은 객체를 생성할 수 없기 때문에
	기본타입의 데이터를 객체로 생성할 수 있도록 지원하는 클래스를 포장
	클래스라고 한다.
	
	포장클래스사용하는 이유는
	1. 객체 또는 클래스가 제공하는 속성(필드, 메서드)를 사용할 수 있다.
	2. 클래스가 제공하는 상수를 사용할 수 있다.(MIN_VALUE or MAX_VALUE)
	3. 숫자, 문자로 형변환 or 진법변환시에 편리하게 사용
	
	Boxing, Unboxing
	
	Boxing이란 기본타입을 객체로 만드는 과정을 이야기 하고 unboxing은 
	객체를 기본타입으로 즉, 기본타입의 값을 읽어내는 과정을 이야기 한다.
	
*/
public class WrapperMain1 {

	public static void main(String[] args) {
		
		// 1. 포장객체의 기본개념
		int i1 = 10;        // int이 표현하는 수치의 범위
		Integer obj1 = 10;  // 기본타입에서 Integer라는 객체로 자동형변환(자동박싱)
		@SuppressWarnings("deprecated")
		Integer obj2 = new Integer(10); // 생성자를 통해서 객체를 생성
		Integer obj3 = Integer.valueOf(10); // valueOf메서드로 객체를 생성		
		System.out.println(obj1.MIN_VALUE + "~" + obj1.MAX_VALUE);
		
		// 2. 수동박싱
		// a. 생성자이용
		Integer obj4 = new Integer(10);
		Integer obj5 = new Integer("10");
		System.out.println(obj5.toString());
		
		// b. valueOf()메서드이용
		Integer obj6 = Integer.valueOf(10);
		Integer obj7 = Integer.valueOf("10");
		
		Double obj8 = Double.valueOf(100);
		Double obj9 = Double.valueOf(100.0d);
		Double obj10 = Double.valueOf(3.14f);
		System.out.println("double의 수치범위 = " + obj8.MIN_VALUE + " ~ " + obj8.MAX_VALUE);
		
		// 2. 언박싱
		// 객체에서 기본타입으로 변환 (메서드: 기본타입+Value()) 
		int i2 = obj6.intValue(); 
		double d1 = obj8.doubleValue();
		
		// 3. 자동박싱
		Integer obj11 = 10;
		
		// 4. 자동언박싱
		// a. 대입시 자동언박싱
		int i3 = obj11;
		
		// b. 연산시 자동언박싱
		int result = obj11 + 10;
		System.out.println("result = " + result);
		 
	}
}
