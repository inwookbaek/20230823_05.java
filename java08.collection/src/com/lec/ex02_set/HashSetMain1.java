package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain1 {

	public static void main(String[] args) {
		// List/Set
		// List는 순서가 있고 중복가능, index접근읽기가능
		// Set은 순서가 없고 중복불가, index가 없고 iterator를 통해 읽기가능
		// Set를 구현한 HashSet, TreeSet, LinkedHashSet
		// Set컬렉션은 인덱스가 없기 때문에 Set계열에 맞는 메서드를 지원
		// hasNext(), next(), remove()
		// 특히, 객체를 비교할 때는 hashCode()와 equals()메서드를 재정의해서 비교
		// 동등객체여부에 따라 중복여부를 결정하고 중복일 경우 중복불허
		
		// 1. add() - 추가(중복여부확인)
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("R");
		set.add("JavaSript");
		set.add("SQL");
		set.add("Java");
		set.add("JDBC");
		System.out.println("총객체수 = " + set.size());
		System.out.println();
		
		// 2. 읽기 - Iterator
		Iterator<String> data = set.iterator();
		System.out.println("data존재여부 = " + data.hasNext());
		System.out.println();
		
		while(data.hasNext()) {
			String element = data.next();
			System.out.println("data의 요소 = " + element);
		}
		System.out.println();
		System.out.println("data존재여부 = " + data.hasNext());
		
		// String element = data.next(); // NoSuchElementException 더이상읽을 자료가 없을 경우
		// 다시 읽을 경우 iterator을 생성
		data = set.iterator();
		System.out.println("data존재여부 = " + data.hasNext());
		System.out.println(data.next());
		System.out.println();
		
		// 3. 삭제 - remove()
		set.remove("JavaSript");
		data = set.iterator();
		while(data.hasNext()) {
			String element = data.next();
			System.out.println("data의 요소 = " + element);
		}
		System.out.println();
		
		// 4. 전체삭제 - clear()
		set.clear();
		System.out.println("data존재여부 = " + data.hasNext());
	}
}