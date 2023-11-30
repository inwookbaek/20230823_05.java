package java02_class.ex04_class;

public class Eve extends Human {

	public Eve(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	void speak() {
		System.out.println("천국말을 합니다!");;
	}
	
	void makeBaby() {
		System.out.println("아이를 낳습니다!!");
	}
	
	
	@Override
	public String toString() {
		return "나는 이브입니다!";
	}

	@Override
	void move() {
		System.out.println("요리를 합니다!!");
	}

}
