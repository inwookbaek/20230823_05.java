package com.lec.ex01_nongeneric;

public class BoxMain {

	public static void main(String[] args) {

		Box 과일상자 = new Box();
		과일상자.setObject(new Apple()); // 자동형변환 Apple -> Object
		Apple 사과 = (Apple) 과일상자.getObject(); // 강제형변환 Object -> Apple
		Object 사과1 = 과일상자.getObject(); // 문제점은 Apple에서 추가된 메서드, 속성 날라간다.
		과일상자.setObject(new Hammer());
		Hammer 망치 = (Hammer) 과일상자.getObject();
		과일상자.setObject(new Banana());
		Banana 바나나 = (Banana) 과일상자.getObject();
		과일상자.setObject(new Driver());
		Driver 운전사 = (Driver) 과일상자.getObject();
		과일상자.setObject(new Car());
		Car 자동차 = (Car) 과일상자.getObject();
		
		Box 공구함 = new Box();
		공구함.setObject(new Apple());
		공구함.setObject(new Hammer());
		공구함.setObject("홍길동");
		공구함.setObject(new String("소향"));
		공구함.setObject(Integer.valueOf(1000));
		공구함.setObject(new int[] {1,2,3,4,5});
		
		과일상자.setObject(new Apple[] {new Apple(), new Apple()});
	}

}

class Box {
	private Object object;
	public Object getObject() { return this.object; }
	public void setObject(Object object) { this.object = object; }
}

class Apple { void method() {} }
class Banana {}
class Hammer {}
class Driver {}
class Car {}