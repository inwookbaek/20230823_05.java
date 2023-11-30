package com.lec.ex05_compare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorMain {

	public static void main(String[] args) {
		
		
		TreeSet<Student> ts1 = new TreeSet<>(new StudentComparator());
		ts1.add(new Student("홍길동", 1000));
		ts1.add(new Student("손흥민", 31));
		ts1.add(new Student("이강인", 22));
		ts1.add(new Student("김민재", 25));
		ts1.add(new Student("소향", 45));
		ts1.add(new Student("소향", 30));
		ts1.add(new Student("소향", 40));		
		System.out.println("총 객체수 = " + ts1.size());
		
		Iterator<Student> students = ts1.iterator();
		while(students.hasNext()) {
			Student student = students.next();
			System.out.println(student.name + ", " + student.sno);
		}		
	}

}

class Student {
	String name;
	int sno;
	
	public Student(String name, int sno) {
		this.name = name;
		this.sno = sno;
	}
}

// 비교객체(비교자역할을 하는 객체)
class StudentComparator implements Comparator<Student> {

	// 1. 이름순
//	@Override
//	public int compare(Student s1, Student s2) {
//		return s1.name.compareTo(s2.name);
//	}
	
	// 2. 번호순
//	@Override
//	public int compare(Student s1, Student s2) {
//		// return s1.sno < s2.sno ? -1 :(s1.sno == s2.sno ? 0 : 1);
//		return Integer.compare(s1.sno, s2.sno);
//	}
	
	// 3. 번호순, 이름순
	@Override
	public int compare(Student s1, Student s2) {
		String sno1 = s1.name + s1.sno;
		String sno2 = s2.name + s2.sno;
		return sno1.compareToIgnoreCase(sno2);
	}
}
