package java02_class.ex04_class;

public class Human {

	String name;
	String gender;
	int age;
	
	public Human() {}
	
	public Human(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	void speak() {}
	void move() {}
}
