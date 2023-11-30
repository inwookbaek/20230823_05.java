package com.lec.ex01_typechange;

/*
	형변환 : 강제형변환과 자동형변환이 있다.
	
	1. 자동형변환 
	   - 기본타입 : 작은 타입에서 큰 타입으로 변환
	   - 참조타입 : 상속관계에서 자식에서 부모로 변환
	2. 강제형변환
	   - 기본타입 : 큰 타입에서 작은 타입으로
	   - 참조타입 : 부모에서 자식으로 
	 
*/

public class TypeChangeMain {

	public static void main(String[] args) {
		// A. 기본타입의 형변환(byte < short < chart < int <long < float < double)
		// 1. 자동형변환
		int i1 = 210000000; 
		double d1 = i1;
		System.out.println("i1 = " + i1 + ", d1 = " + d1);
		
		// 2. 강제형변환 - 원래의 값이 소실위험이 있다.
		short s1 = (short) i1;
		System.out.println("i1 = " + i1 + ", s1 = " + s1);
		System.out.println();
		
		// B. 참조타입의 형변환
		// 1. 참조타입의 형변환은 상속관계일 경우에만 변환이 된다.
		// 2. 부모타입으로 형변환된 객체일 경우에만 자식타입을 형변환이 된다.
		//    아닐경우에 문법에러는 아니지만 RuntimeException이 발생
		//    java.lang.ClassCastException이 발생
		Child child = new Child();
		child.method1();  // parent.mehod1
		child.method2();  // child.method2
		child.method3();  // child.method3
		System.out.println();
		
		// 1. 자동형변환 : 자식에서 부모로 
		Parent parent = child;
		parent.method1();  // parent.mehod1
		parent.method2();  // child.method2 -> parent.method2가 child.method2로 덮어써짐
		// parent.method3();  // child.method3는 소실
		System.out.println();
		
		Parent parent1 = new Parent();
		parent1.method1();
		parent1.method2();
		System.out.println();
		
		// 2. 강제형변환
		Child child1 = (Child) parent;
		child1.method1();  // parent.mehod1
		child1.method2();  // child.method2
		child1.method3();  // child.method3
		System.out.println();

		// Child child2 = (Child) parent1; // 에러, 문법에러는 아니고 실행중에러
		// Parent child3 = new 자식();     // 에러, 문법에러
		
		// 동일타입인지 여부를 확인방법
		System.out.println(parent == child);
		System.out.println(parent1 == child);
		System.out.println();
		
		System.out.println("parent = " + parent.getClass());
		System.out.println("child = " + child.getClass());
		System.out.println("parent1 = " + parent1.getClass());
		
		// 강제형변환 : child -> parent -> child
		// 자동형변환(child -> parent) > 강제형변환(parent -> child)
	}

}









