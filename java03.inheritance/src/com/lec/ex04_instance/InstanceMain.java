package com.lec.ex04_instance;

public class InstanceMain {

	public static void main(String[] args) {
		// 강제형변환 불가
		Parent parent = new Parent();
		// Child child = (Child) parent; // casting error
		System.out.println(parent.getClass());
		System.out.println();
		
		// 자동형변환
		Parent parent1 = new Child();
		method1(parent1);
		System.out.println();
		
		// 형변환이 일어나지 않았음
		Parent parent2 = new Parent();
		method2(parent2);
		System.out.println();
		
		method1(parent2); // parent2의 class는 Parent
		method2(parent1); // parent1의 class는 Child
		
	}

	static void method1(Parent instance) {
		System.out.println(instance.getClass()); // instance의 Class는 Child
		if(instance instanceof Child) {
			Child child = (Child) instance; 
			System.out.println("강제형변환성공!!");
		} else {
			System.out.println("형변환을 할 수 없습니다!");			
		}
	}
	
	static void method2(Parent instance) {
		System.out.println(instance.getClass()); // instance의 Class는 Parent
		if(instance instanceof Child) {
			Child child = (Child) instance; 			
		} else {
			System.out.println("형변환을 할 수 없습니다!");
		}
	}
}









