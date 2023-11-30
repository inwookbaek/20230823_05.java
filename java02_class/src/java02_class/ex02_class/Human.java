package java02_class.ex02_class;

public class Human {

	String name;
	int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	// 메서드 오버로딩
	// 메서드의 이름은 동일하지만 시그니쳐가 다른 것
	void speak() {
		System.out.println("말을 합니다!");
	}
	
	void speak(String lang) {
		System.out.println(
				this.name + "이(가) " + lang + "로 말을 합니다!");
	}
	
	void speak(int age) {
		System.out.println(
				"저는 " + this.name 
				+ "입니다 나이는 " 
						+ age + "살 입니다!");
	}	
}
