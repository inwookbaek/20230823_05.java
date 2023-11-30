package java02_class.ex01_class;

public class HumanMain {

	public static void main(String[] args) {
		
		// 객체생성 - 클래스(참조타입)으로 생성
		String name1 = new String();       // 생성자 - 기본생성자
		String name2 = new String("소향"); // 생성자 - 시그니처 즉, 인수가 String타입으로 전달 받는 생성자
		String name3 = "소향";
		
		Human adam = new Human();
		Human eve = new Human();
		
		Human hong1 = new Human();
		Human hong2 = new Human("임꺽정");
		Human hong3 = new Human(1000);
		Human hong4 = new Human("성춘향", 23);
		Human hong5 = new Human(25, "이몽룡");
		
		hong1.name = "홍길동";
		hong1.age = 1000;
		System.out.println("hong1 = " + hong1.name + ", " +  hong1.age);
		System.out.println("hong2 = " + hong2.name + ", " +  hong2.age);
		System.out.println("hong3 = " + hong3.name + ", " +  hong3.age);
		System.out.println("hong4 = " + hong4.name + ", " +  hong4.age);
		System.out.println("hong5 = " + hong5.name + ", " +  hong5.age);
		System.out.println();
		
		hong3.gender = "남자";
		hong3.ssn = "991118-1234567";
		
		System.out.println(hong3.gender + ", " + hong3.ssn);
		System.out.println();
		
		// 메서드
		hong1.think();
		hong2.eat();
		hong3.speak();
		hong4.move();
		hong5.think();
		System.out.println();
		
		System.out.println("hong1 = " + hong1.toString());
		System.out.println("hong2 = " + hong2.toString());

		Human hong6 = new Human("이강인", "남자", 23, "20100101-1234567");
		System.out.println("hong6 = " + hong6.toString());
	}

}









