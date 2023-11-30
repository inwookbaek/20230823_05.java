package com.lec.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		// animalSound(new Animal()); // 인터페이스는 객체를 생성할 수 없다.
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Bird());
	}

	private static void animalSound(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.sound();
			dog.keepFamily();
		} else if(animal instanceof Cat) { 
			Cat cat = (Cat) animal;
			cat.sound();
			cat.walk();
		} else if(animal instanceof Bird) {
			Bird bird = (Bird) animal;
			bird.sound();
			bird.fly();
		}		
	}

}

class 돌고래 {
	String kind = "동물";
	public void sound() {
		System.out.println("??????!!");
	}	
}
