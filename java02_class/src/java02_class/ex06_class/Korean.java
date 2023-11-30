package java02_class.ex06_class;

public class Korean implements Human {

	@Override
	public void speak() {
		System.out.println("한국어로 말을 합니다.");
	}

	@Override
	public void move() {
		System.out.println("통번역을 합니다.");		
	}

	@Override
	public void think() {
		System.out.println("생각을 합니다.");		
	}

}
