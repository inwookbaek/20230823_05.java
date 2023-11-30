package java02_class.ex05_class;

public class Korean extends Human {

	@Override
	void speak() {
		System.out.println("한국어로 말을 합니다");
	}

	@Override
	void move() {
		System.out.println("통번역을 합니다!");
	}

}
