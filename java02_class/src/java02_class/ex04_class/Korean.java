package java02_class.ex04_class;

public class Korean extends Eve {

	public Korean(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void speak() {
		System.out.println("한국어로 말을 합니다!");
	}
	
	@Override
	void move() {
		System.out.println("통번역을 합니다!");
	}

}
