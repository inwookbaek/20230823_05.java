package java02_class.ex04_class;

public class Adam extends Human {

	public Adam(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("사냥을 합니다!!");;
	}
}
