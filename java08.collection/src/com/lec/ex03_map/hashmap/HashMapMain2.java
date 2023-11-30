package com.lec.ex03_map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapMain2 {

	public static void main(String[] args) {

		// key의 중복확인
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "소향"), 99);
		map.put(new Student(2, "나얼"), 90);
		map.put(new Student(2, "나얼"), 88);
		System.out.println("총 객체수 = " + map.size());
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> students = keySet.iterator();
		while(students.hasNext()) {
			Student student = students.next();
			Integer score = map.get(student);
			System.out.println(student + "학생의 점수 = " + score);
		}
	}

}

class Student {
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && sno == other.sno;
	}

}