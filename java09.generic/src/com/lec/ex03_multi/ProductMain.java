package com.lec.ex03_multi;

public class ProductMain {

	public static void main(String[] args) {
		
		// 1. nongeneric
		Product 자동차 = new Product();
		자동차.setKind("스포츠카");
		자동차.setModel("500cc");
		String kind = (String) 자동차.getKind();
		String model = (String) 자동차.getModel();
		System.out.println(kind + ", " + model);
		
		자동차.setModel(Integer.valueOf(500));
		kind = (String) 자동차.getKind();
		Integer cc = (Integer) 자동차.getModel(); // 형변환이 않될 경우 에러발생
		System.out.println(kind + ", " + cc);
		
		// 2. generic
		Product<Robot, String> 로봇 = new Product<>();
		로봇.setKind(new Robot());
		로봇.setModel("수퍼로봇");
		Robot superRobot = 로봇.getKind();
		String robotModel = 로봇.getModel();
		System.out.println(superRobot.toString() + robotModel + "입니다!");

		Product<Car, String> car = new Product<>();
		car.setKind(new Car());
		car.setModel("포르쉐 911카레라");
		System.out.println(car.getKind() + " " + car.getModel());
		
		// nogeneric(자동차)
		자동차.setKind(1);
		자동차.setKind(new Robot());
		자동차.setKind(new TV());
		자동차.setKind(new Student());
		
		// generic(car)
//		car.setKind(1);
//		car.setKind(new Robot());
//		car.setKind(new TV());
//		car.setKind(new Student());
		car.setKind(new Car());
		
//		car.setModel(1);
		car.setModel("벤츠");
		
	}

}

class Product<K, M> {
	
	private K kind;
	private M model;
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class Robot {
	@Override
	public String toString() {
		return "나는 ";
	}
}
class Car {}
class TV {}
class Student {}





