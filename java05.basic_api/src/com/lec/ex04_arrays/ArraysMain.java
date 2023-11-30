package com.lec.ex04_arrays;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		// Arrays클래스는 배열관한 기능을 다양하게 지원하는 utility class이다.
		// 배열의 복사, 배열요소의 정렬, 검색과 같은 기능을 제공
		
		// 1. 기본타입정렬
		int[] scores = {90,98,80};
		Arrays.sort(scores);
		for(int score:scores) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		// 2. 검색 - binarySearch, 인덱스 즉, 위치를 리턴
		int index = Arrays.binarySearch(scores, 90);
		System.out.println(index);
		
		// 3. 참조타입의 정렬
		String[] names = {"박세리", "손흥민", "김하성", "이강인"};
		Arrays.sort(names);
		for(String name:names) {
			System.out.print(name + ", ");
		}
		System.out.println();
		
		// 4. 객체의 비교 및 정렬
		// 전제조건 : Comparale인터페이스의 compareTo메서드를 정의해야 한다.
		Member m1 = new Member("손흥민");
		Member m2 = new Member("김하성");
		Member m3 = new Member("이강인");
		
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(Member member:members) {
			System.out.print(member.name + ", ");
		}
		System.out.println();
	}

}

class Member implements Comparable<Member>{
	String name;
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member m) {
		return this.name.compareTo(m.name); // -1, 0, 1
	}
}














