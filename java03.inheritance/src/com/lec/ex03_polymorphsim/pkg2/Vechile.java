package com.lec.ex03_polymorphsim.pkg2;

public class Vechile {
	
	public void run() {
		System.out.println("승용차를 운전합니다!");
	}
}

class Bus extends Vechile {
	@Override
	public void run() {
		System.out.println("버스를 운전합니다!");
	}	
}
class Taxi extends Vechile {
	@Override
	public void run() {
		System.out.println("택시를 운전합니다!");
	}	
}

class 자전거 extends Vechile {
	@Override
	public void run() {
		System.out.println("자전거를 운전합니다!");
	}	
}

class 오토바이 extends Vechile {
	@Override
	public void run() {
		System.out.println("오토바이를 운전합니다!");
	}	
}

class 비행기 {
	public void run() {
		System.out.println("비행기를 조정합니다!!");
	}	
}














