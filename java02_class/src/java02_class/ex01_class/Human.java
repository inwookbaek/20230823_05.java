package java02_class.ex01_class;

public class Human {

	// 1. 속성(필드) - 변수
	String name;
	String gender;
	int age;
	String ssn;

	// 2. 생성자
	// 생성자의 시그니처가 다르면 복수개의 생성자를 정의할 수 있다.
	// 시그니처 - 매개변수의 갯수, 타입, 순서가 다를 경우
	// 지정된 생성자가 하나도 없다면 기본생성자는 자동을 생성된다.
	// 기본생성자이외의 생성자가 정의되었다면 기본생성자는 자동으로 생성되지 않는다.
	// 객체의 초기화를 담당
	Human() {}
	Human(String name) {
		this.name = name;
		age = 999;
	}
	Human(int age) {
		name = "손흥민";
		this.age = age;
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Human(int age, String name) {
		this.name = name;
		this.age = age;
	}
	// Human(String gender) {} // 에러, 시그니처가 동일
	
	public Human(String name, String gender, int age, String ssn) {
		// super() 부모 즉, Object의 기본생성자
		// 부모없는 자식은 없는 개념이기 때문에 super() 기본생성자호출은
		// 맨 첫줄에 정의되어야 한다. 아니면 문법에러
		super();            
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.ssn = ssn;
	}	
	
	// 3. 메서드
	void think() { System.out.println("생각을 한다!"); }
	void eat() { System.out.println("음식을 한다!"); }
	void speak() { System.out.println("말을 한다!"); }
	void move() { System.out.println("움직인다!"); }
	
	// 메서드재정의(Overriding)
	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + ", ssn=" + ssn + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		// return super.toString();
//		return this.name + ", " + this.age + ", " + this.gender + ", " + this.ssn;
//	}
	
	
}
