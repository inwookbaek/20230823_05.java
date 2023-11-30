package com.lec.ex03_polymorphsim.pkg1;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive();
		Vechile vechile = new Vechile();
		driver.drive(vechile);
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
