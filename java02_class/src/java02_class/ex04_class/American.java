package java02_class.ex04_class;

public class American extends Adam {

	public American(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void speak() {
		System.out.println("영어로 말을 합니다!");
	}
	
	@Override
	void move() {
		System.out.println("프로그램을 개발합니다!");
	}
}
