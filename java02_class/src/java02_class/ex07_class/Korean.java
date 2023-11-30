package java02_class.ex07_class;

public class Korean {

	// 1. static으로 선언된 속성 및 메서드는 메서드영역에 저장 
	static String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	static void sayHello() {
		System.out.println("안녕하세요? 나는 " + Korean.nation + "사람입니다!");
	}
	@Override
	public String toString() {
		return "Korean [nation=" + nation + ", name=" + name + ", ssn=" + ssn + "]";
	}
}
