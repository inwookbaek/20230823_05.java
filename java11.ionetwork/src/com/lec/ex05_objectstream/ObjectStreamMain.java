package com.lec.ex05_objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamMain {

	public static void main(String[] args) throws Exception {
		// 객체를 저장하는 방법
		FileOutputStream fos = new FileOutputStream("src/com/lec/ex05_objectstream/student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Integer.valueOf(100));
		oos.writeObject(Double.valueOf(10.0));
		oos.writeObject(new int[] {1,2,3,4,5});
		oos.writeObject(new String("홍길동"));
		oos.writeObject(new Student("홍길동", 1, "남"));
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("src/com/lec/ex05_objectstream/student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		Student obj5 = (Student) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3 + ", " + obj3[0]);
		System.out.println(obj4);
		System.out.println(obj5);
	}

}

class Student implements Serializable {
	
	public String name;
	public int sno;
	transient public String gender;
	
	public Student(String name, int sno, String gender) {
		this.name = name;
		this.sno = sno;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sno=" + sno + ", gender=" + gender + "]";
	}

	
}