package java02_class.ex06_class;

public class American implements Human {

	@Override
	public void speak() {
		System.out.println("영어로 말을 합니다.");
	}

	@Override
	public void move() {
		System.out.println("프로그램을 개발합니다.");
	}

	@Override
	public void think() {
		System.out.println("생각을 합니다.");
	}

}
