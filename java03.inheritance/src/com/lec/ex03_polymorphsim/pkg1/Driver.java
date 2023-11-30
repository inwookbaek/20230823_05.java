package com.lec.ex03_polymorphsim.pkg1;

public class Driver {

	public void drive() {
		System.out.println("차량을 운전할 수 있습니다.");
	}
	
	public void drive(Vechile vechile) {
		vechile.run();
	}
	
	public void drive(Bus bus) {
		bus.run();
	}
	
	public void drive(Taxi taxi) {
		taxi.run();
	}
}
