package com.lec.ex02_class;

public class ClassMain {

	public static void main(String[] args) {
		// 객체를 만드는 방법
		// 1. 생성된 객체로부터 얻는 방법
		// 2. 클래스바이트파일(~.class)로 부터 얻는 방법
		// 3. Class클래스의 forName()메서드로 부터 얻는 방법
		Class obj1 = new Employee().getClass();
		Class obj2 = Employee.class; 
		try {
			Class obj3 = Class.forName("com.lec.ex02_class.Employee");
			System.out.println("정상처리!!");
		} catch (Exception e) {
			System.out.println("에러발생!!");
			// e.printStackTrace();
		}

	}

}

class Employee {}
