package com.lec.ex04_method;

public class MethodMain {

	public static void main(String[] args) {
		// 1. 넌제네릭메서드 - 일반메서드
		Box n_Box = null;
		// n_Box = Util.method(1000);
		// n_Box = Util.method(new Car());
		// n_Box = Util.method(new Apple());
		n_Box = Util.method(new Robot());
		System.out.println(n_Box.get());
				
		// 2. 제네릭메서드
		Box<Integer> g_Box1 = new Box<>();
		Box<Car> g_Box2 = new Box<>();
		Box<Apple> g_Box3 = new Box<>();
		Box<Robot> g_Box4 = new Box<>();

		g_Box1.set(Integer.valueOf(1000));
		g_Box2.set(new Car());
		g_Box3.set(new Apple());
		g_Box4.set(new Robot());
		
		System.out.println(g_Box1.get());
		System.out.println(g_Box2.get());
		System.out.println(g_Box3.get());
		System.out.println(g_Box4.get());
	
	}

}

class Util {
	// 1. 일반메서드
	public static Box method(Robot robot) {
		Box box = new Box();
		box.set(robot);
		box.set("망치");
		box.set(new Car());
		return box;
	}
	
	// 2. 제네릭메서드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
	
}

class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}

class Robot {
	@Override
	public String toString() {
		return "나는 로봇입니다!";
	}
}

class Car {
	@Override
	public String toString() {
		return "나는 로봇입니다!";
	}	
}

class Apple {
	@Override
	public String toString() {
		return "나는 맛있는 사과입니다!";
	}
}

