package java02_class.ex05_class;

public class HumanMain {

	public static void main(String[] args) {
		
		American american = new American();
		Korean korean = new Korean();
		
		american.speak();
		american.move();
		american.think();
		System.out.println();
		
		korean.speak();
		korean.move();
		korean.think();

	}

}
