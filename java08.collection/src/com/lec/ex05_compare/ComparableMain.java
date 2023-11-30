package com.lec.ex05_compare;

import java.util.Iterator;
import java.util.TreeSet;

/*
	Comparable vs Comparator
	
	TreeSet의 값과 TreeMap의 키는 저장과 동시에 자동으로 오름차순으로 정렬되는데
	숫자(Integer, Double...)타입일 경우에는 값을 정렬하고 String일 경우에는 유니
	코드로 정렬된다.
	
	TreeSet객체와 TreeMap키를 정렬하기 위해서는 java.lang.Comparable인터페이스를
	구현한 객체를 요구하는데 Integer, Double, String등은 모두 Comparable인터페이
	스를 구현하고 있다.
	
	사용자가 작성한 객체를 TreeSet, TreeMap의 키에 저장하려면 Comparable인터페이스
	를 구현한 객체이어야 한다. 아니면 에러가 발생한다.
*/
public class ComparableMain {

	public static void main(String[] args) {
		
		TreeSet<Member> members = new TreeSet<>();
		members.add(new Member("홍길동", 1000));
		members.add(new Member("손흥민", 31));
		members.add(new Member("이강인", 22));
		members.add(new Member("김민재", 25));
		members.add(new Member("소향", 45));
		members.add(new Member("소향", 30));
		members.add(new Member("소향", 40));
		System.out.println("총 객체수 = " + members.size());
		System.out.println();
		
		Iterator<Member> members1 = members.iterator();
		while(members1.hasNext()) {
			Member member = members1.next();
			System.out.println(member.name + ", " + member.age);
		}
	}

}

class Member implements Comparable<Member> {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Member o) {
//		return 0;
//	}
	
	// 1. 이름순정렬
//	@Override
//	public int compareTo(Member o) {
//		return this.name.compareTo(o.name);
//	}
	
	// 2. 나이정렬
//	@Override
//	public int compareTo(Member o) {
//		return this.age < o.age ? -1 :(this.age == o.age ? 0 : 1);
//	}
	
	// 3. 이름, 나이정렬
	@Override
	public int compareTo(Member o) {
		String x = this.name + this.age;
		String y = o.name + o.age;
		return x.compareToIgnoreCase(y);
	}
}