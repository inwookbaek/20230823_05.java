package com.lec.ex07_inheritance;

/*
	제네릭타입의 상속(extends)과 구현(implements)
*/
public class ExtendsMain {

	public static void main(String[] args) {
		// 1. class
		ChildProduct<String, TV, String> tv = new ChildProduct<>();
		tv.setCompany("LG전자");         // 자식의 제네릭타입
		tv.setKind(new TV());            // 부모의 제네릭타입
		tv.setModel("스마트TV(86inch)"); // 부모의 제네릭타입
		System.out.println(tv.toString());
		
		ChildProduct<String, Car, String> car = new ChildProduct<>();
		car.setCompany("포르쉐");          // 자식의 제네릭타입
		car.setKind(new Car());            // 부모의 제네릭타입
		car.setModel("911 카레라");        // 부모의 제네릭타입
		System.out.println(car.toString());
				
		// 2. interface
		Strorage<TV> TV창고 = new StorageImpl<>(100);
		TV창고.add(new TV(), 10); // 10번위치
		// TV창고.add(new Car(), 2); // 2번위치
		TV smartTV = TV창고.get(10);
		System.out.println(smartTV.getClass());
		
		Strorage<Car> 자동차창고 = new StorageImpl<>(100);
		// 자동차창고.add(new TV(), 10); // 10번위치
		자동차창고.add(new Car(), 2); // 2번위치
		Car porche = 자동차창고.get(2);
		System.out.println(porche.getClass());
	}

}

class Product<K, M> {
	private K kind;
	private M model;
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
}

class Car {}

class TV {}

class ChildProduct<C, K, M> extends Product<K, M> {
	private C company;
	public C getCompany() { return company; }
	public void setCompany(C company) { this.company = company; }
}

interface Strorage<T> {
	void add(T item, int loc);
	T get(int loc);
	
}

class StorageImpl<T> implements Strorage<T> {

	private T[] location;
		
	public StorageImpl(int capacity) {
		this.location = (T[]) new Object[capacity];
	}
	
	@Override
	public void add(T item, int loc) {
		location[loc] = item;
	}

	@Override
	public T get(int loc) {
		return location[loc];
	}
}

