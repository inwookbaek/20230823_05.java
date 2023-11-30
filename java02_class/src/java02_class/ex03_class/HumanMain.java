package java02_class.ex03_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Adam adam = new Adam();
		Eve eve = new Eve();
	
		System.out.println(adam.toString());
		System.out.println(eve.toString());
		System.out.println();
		
		adam.speak();
		adam.move();
		System.out.println();
		
		eve.speak();
		eve.move();
		eve.makeBaby();
	}

}
