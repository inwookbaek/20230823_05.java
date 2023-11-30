package com.lec.pkg.getset;

public class CarMain {

	public static void main(String[] args) {
	
		Car car = new Car();
		// car.speed = 500;
		// car.setSpeed();
		car.setSpeed(500);
		car.setSpeed(-100);
		car.setSpeed(60);
		
		// 현재 자동차의 속도를 알고 싶을 경우
		// System.out.println("현재 자동차의 속도는 " + car.speed + "km입니다!");
		System.out.println("현재 자동차의 속도는 " + car.getSpeed() + "km입니다!");
		
		// 현재 자동차가 운행중인 여부는?
		car.setStop(true);
		// System.out.println("현재 자동차가 운행중여부는 " + car.stop);
		System.out.println("현재 자동차가 운행중여부는 " + car.isStop());
		
	}

}
