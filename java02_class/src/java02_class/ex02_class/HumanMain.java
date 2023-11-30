package java02_class.ex02_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human adam = new Human("아담", 10000);
		Human eve = new Human("이브", 9999);
		System.out.println(adam.toString());
		System.out.println(eve.toString());
		
		adam.speak();
		eve.speak();
		
		adam.speak("영어");
		eve.speak("불어");
		
		adam.speak(25);
		eve.speak(23);
	}

}
