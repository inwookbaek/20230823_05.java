package java10.stream.ex02_kind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java10.stream.ex01_intro.Student;

public class FromCollectionMain {

	public static void main(String[] args) {
		
		// 1. Collection으로 부터 stream얻기
		List<Student> list = Arrays.asList(
				new Student("홍길동", 95),
				new Student("홍길순", 90),
				new Student("홍길자", 99),
				new Student("홍길상", 85));
		
		Stream<Student> students = list.stream();
		students.forEach(System.out::println);
	}

}














