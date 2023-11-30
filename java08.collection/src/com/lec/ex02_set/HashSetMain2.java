package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		// 객체의 비교? 중복여부는?
		// 객체의 동일여부는 hashCode와 equals메서드를 재정의해야 한다.
		Set<Member> members = new HashSet<>();
		
		members.add(new Member("손흥민", 31));
		members.add(new Member("손흥민", 30));
		members.add(new Member("손흥민", 31));
		members.add(new Member("이강인", 23));
		System.out.println("총 객체수 = " + members.size());
		
		for(Member member:members) {
			System.out.println(member.toString() + ", " + member.hashCode());
		}
		
	}
}

class Member {
	
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
//	@Override
//	public int hashCode() {
//		System.out.println(this.name.hashCode() + ", " + this.age);
//		return this.name.hashCode() + this.age; // 이 시점에서 hashCode가 동일
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// name과 age가 같은 경우에 동일객체로 판단해서 true를 리턴
//		// 아닐경우에는 false라 리턴되도록 equals메서드를 재정의
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			return (member.name.equals(this.name) && (member.age == this.age));
//		}
//		return false;
//	}
}




















