package com.lec.ex03_polymorphsim.pkg2;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Vechile());
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new 자전거());
		driver.drive(new 오토바이());
		driver.drive(new 비행기());
	}
}
