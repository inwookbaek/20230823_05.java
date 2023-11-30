package com.lec.ex02_generic;

public class BoxMain {

	public static void main(String[] args) {
		Box<Apple> 사과상자 = new Box<>();
		사과상자.setObject(new Apple());
		Apple 맛있는사과 = 사과상자.getObject();
		System.out.println(맛있는사과.toString());
		
		Box<Hammer> 도구상자 = new Box<>();
		도구상자.setObject(new Hammer());
		Hammer 망치 = 도구상자.getObject();
		System.out.println(망치.toString());
	}
}

class Box<T> {
	private T t;
	public T getObject() { return this.t; }
	public void setObject(T t) { this.t = t; }
}

class Apple {
	@Override
	public String toString() {
		return "나는 맛있는 사과입니다!!";
	}
}
class Hammer {
	@Override
	public String toString() {
		return "나는 망치입니다!";
	}
}