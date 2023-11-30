package java02_class.ex05_class;

public class American extends Human {

	@Override
	void speak() {
		System.out.println("영어로 말을 합니다");
		
	}

	@Override
	void move() {
		System.out.println("프로그램을 개발합니다");
	}

}
