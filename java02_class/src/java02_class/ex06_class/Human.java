package java02_class.ex06_class;

public interface Human {

	// 1. interface는 생성자를 가질 수 없다. 즉, 인터페이스로 객체를 생성할 수 없다.
	// 2. interface에 선언된 변수들은 모두 상수로 선언된다. 즉, final static으로 명시적으로
	//    선언하지 않아도 컴파일시에 자동으로 final static으로 선언된다.
	// 3. interface에 선언된 메서드는 모두 추상메서드로 선언된다. 즉, abstract으로 명시적으로
	//    선언하지 않다도 컴파일시에 자동으로 abstract으로 선언된다.
	// 4. interface가 하는 역할은 상속받는 클래스에서는 인터페이스에서 선언된 메서드(추상)들을
	//    반드시 구현하도록 강제화하는 역할을 한다.
	// 5. interface는 다중상속(구현)이 가능하다.
	String NATION = "천국"; // final static 생략
	// final static String NAME = "소향";
	// String GENDER = "여자";
	// int AGE = 44;
	
	void speak();  // abstract 생략
	void move();
	void think();
}