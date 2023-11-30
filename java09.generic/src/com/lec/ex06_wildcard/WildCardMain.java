package com.lec.ex06_wildcard;

import java.util.Arrays;

/*
	와일드카드(<?>, <? extends 상위타입>, <? super 하위타입>
	
	1. <?>  : 타입의 제한없다
	2. <? extends 상위타입> : 상위타입포함한 하위타입허용
	3. <? super 하위타입>   : 하위타입포함한 상위타입허용
*/
public class WildCardMain {

	public static void main(String[] args) {
		
		// A. class
		// 1. 일반인과정 : 모두 수강등록이 가능한 과정
		Course<Person> 일반인 = new Course<>("일반인과정", 5);
		일반인.add(new Person("일반인A"));
		일반인.add(new Worker("직장인A"));
		일반인.add(new Student("학생A"));
		일반인.add(new HighStudent("고딩A"));
		
		// 2. 학생반     : 학생만 수강등록이 가능한 과정
		Course<Student> 학생 = new Course<>("학생과정", 5);
		// 학생.add(new Person("일반인B"));
		// 학생.add(new Worker("직장인B"));
		학생.add(new Student("학생B"));
		학생.add(new HighStudent("고딩B"));
		
		// 3. 직장인반   : 직장인만 수강등록이 가능한 과정
		Course<Worker> 직장인 = new Course<>("직장인과정", 5);
		// 직장인.add(new Person("일반인C"));
		직장인.add(new Worker("직장인C"));
		// 직장인.add(new Student("학생C"));
		// 직장인.add(new HighStudent("고딩C"));	
		
		// B. 메서드
		System.out.println("-------- 일반인과정 -------");
		일반인과정(일반인);
		일반인과정(학생);
		일반인과정(직장인);
		
		System.out.println("-------- 학생과정 -------");
		// 학생과정(일반인);
		학생과정(학생);
		// 학생과정(직장인);
		
		System.out.println("-------- 직장인과정 -------");
		직장인과정(일반인);
		// 직장인과정(학생);
		직장인과정(직장인);
		
	}
	
	// 수강등록메서드
	// 1. 일반인
	public static void 일반인과정(Course<?> course) {
		System.out.println(course.getName() + " : 수강생 - " 
				+ Arrays.toString(course.getStudents()));
	}
	
	// 2. 학생
	public static void 학생과정(Course<? extends Student> course) {
		System.out.println(course.getName() + " : 수강생 - " 
				+ Arrays.toString(course.getStudents()));
	}	
	
	// 3. 직장인
	public static void 직장인과정(Course<? super Worker> course) {
		System.out.println(course.getName() + " : 수강생 - " 
				+ Arrays.toString(course.getStudents()));
	}		
	

}

class Course<T> {
	private String name;
	private T[] students; // 일반인강좌 - 학생, 고딩이, 일반, 근로
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[5]; // 수강등록인원
	}

	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
class Student extends Person {

	public Student(String name) {
		super(name);
	}
}
class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}
}

class Worker extends Person {

	public Worker(String name) {
		super(name);
	}
}















