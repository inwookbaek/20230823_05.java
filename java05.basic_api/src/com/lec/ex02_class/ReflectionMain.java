package com.lec.ex02_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) throws Exception {
		Class car = Class.forName("com.lec.ex02_class.Car");
		
		Class _class = Class.forName("java.lang.String");
		// 1. 클래스의 정보
		System.out.print("1. 클래스의 이름 = ");
		System.out.println(_class.getName());
		System.out.println();
		
		// 2. 생성자의 정보 - getDeclaredConstructors()
		System.out.println("2. 생성자의 정보");
		Constructor[] constructors = _class.getDeclaredConstructors(); 
		System.out.println("생성자의 갯수 = " + constructors.length);
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 3. 메서드의 정보 - getDeclaredMethods()
		System.out.println("3. 메서드의 정보");
		Method[] methods = _class.getDeclaredMethods();
		System.out.println("메서드의 갯수 = " + methods.length);
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();			
		
		// 4. 필드정보 - getDeclaredFields()
		System.out.println("4. 필드정보 정보");
		Field[] fields = _class.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();		
	}

	private static void printParameter(Class[] parameters) {
		for(int i=0;i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<parameters.length-1) System.out.print(",");
		}
		
	}
}

class Car {
	String name;
	int age;
	
	Car() {}
	Car(String name) {}
}











