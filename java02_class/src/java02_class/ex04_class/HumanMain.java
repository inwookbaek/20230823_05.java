package java02_class.ex04_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human human = new Human("사람", "남자", 25);
		System.out.println(human.toString());
		System.out.println();
		
		Adam adam = new Adam("아담", "남자", 10000);
		Eve eve = new Eve("이브", "여자", 9999);

		System.out.println(adam.toString());
		System.out.println(eve.toString());
		System.out.println();
		
		adam.speak();
		adam.move();
		eve.speak();
		eve.move();
		eve.makeBaby();
		System.out.println();
		
		American american = new American("스티브", "남자", 28);
		Korean korean = new Korean("에스더", "여자", 23);
		american.speak();
		american.move();
		korean.speak();
		korean.move();
		korean.makeBaby();
		System.out.println();
	}

}