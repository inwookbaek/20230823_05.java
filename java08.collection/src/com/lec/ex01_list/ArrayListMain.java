package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// 1. ArrayList - non generic
		// 1) add
		List list = new ArrayList();
		list.add("문자열");
		list.add(new String("손흥민"));
		list.add(10);                   // 기본타입 자동박싱(Integer)
		list.add(Integer.valueOf(100)); // 수동박싱
		list.add(new Apple());
		list.add(new Car());
		list.add(new Hammer());
		
		// 2) get
		String val0 = (String) list.get(0);
		String val1 = (String) list.get(1);
		Integer val2 = (Integer) list.get(2);
		Integer val3 = (Integer) list.get(3);
		Apple val4 = (Apple) list.get(4);
		Car val5 = (Car) list.get(5);
		Hammer val6 = (Hammer) list.get(6);
		
		System.out.println(val0);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println();
		
		// 2. ArrayList - generic, 원초적으로 저장객체의 타입을 제한역할
		// 1) add
		List<String> list1 = new ArrayList();
		// list1.add(10);
		// list1.add(new Apple());
		list1.add("Java");
		list1.add("Python");
		list1.add("JavaScript");
		list1.add("Apple");
		list1.add("Car");
		list1.add("Hammer");
				
		// 2) get
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		System.out.println(list1.get(5));
		System.out.println();
		
		// 3) 삽입 - add(index, value)
		list1.add(2, "자바스크립트");
		for(String lst:list1) {
			System.out.println(lst);
		}
		System.out.println();
		
		// 4) 삭제 - remove(index)
		list1.remove(3);
		for(String lst:list1) {
			System.out.println(lst);
		}
		System.out.println();
		
		// 5) 중복확인
		list1.add("자바스크립트");
		for(String lst:list1) {
			System.out.println(lst);
		}
		System.out.println();
		
		// 6) 전체삭제
		list1.clear();
		System.out.println("list1의 갯수 = " + list1.size());
		
	}

}
class Apple {
	@Override
	public String toString() {
		return "사과";
	}
}
class Hammer {}
class Car {}