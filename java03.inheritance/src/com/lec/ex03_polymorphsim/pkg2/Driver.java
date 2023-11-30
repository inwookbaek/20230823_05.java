package com.lec.ex03_polymorphsim.pkg2;

public class Driver {

	public void drive(Vechile vechile) {
		vechile.run();
		System.out.println(vechile.getClass());
	}

	public void drive(비행기 비행기) {
		비행기.run();
		System.out.println(비행기.getClass());	}
	
}
