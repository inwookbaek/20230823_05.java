package java10.stream.ex01_intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapAndReduceMain {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
					new Student("홍길동", 95),
					new Student("홍길순", 90),
					new Student("홍길자", 99),
					new Student("홍길상", 85));
		System.out.println("총객체수(List컬렉션) = " + students.size()); // 외부
		Stream<Student> stream = students.stream();
		System.out.println("총객체수(Stream) = " + stream.count());      // 내부
		System.out.println();
		
		// Stream은 더 이상 꺼내올 자료가 없을 경웨는 에러발생
		// 따라서 stream.count()처리도 stream객체를 다시 읽어서 처리해야 한다.
		System.out.println("총객체수(List컬렉션) = " + students.size()); // 외부
		stream = students.stream();
		System.out.println("총객체수(Stream) = " + stream.count());      // 내부
		System.out.println();
		
		// 1. Lambda
		// 학생이름과 점수를 출력
		// forEach()는 최종처리메서드이기ㅏ 때문에 중간처리를 할 수 없다.
		stream = students.stream();
		stream.forEach(student -> System.out.print(student.getName() + ", "));
		System.out.println();
		
		stream = students.stream();
		stream.forEach(student -> System.out.print(student.getScore() + ", "));
		System.out.println();
		
		stream = students.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "의 점수 = " + score);
		});
		System.out.println();
		
		// 2. MapAndReduce
		// stream의 
		// 중간처리(mapToInt, average)와 최종처리(getAsDouble)
		// 1) 학생들의 평균점수?
		double avg = students
						.stream()
						.mapToInt(s -> s.getScore())  // 중간처리
						.average()                    // 중간처리
						.getAsDouble();               // 최종처리
		
		System.out.println("학생들의 평균점수 = " + avg);
		
		avg = students
				.stream()
				.mapToInt(Student::getScore)  // 중간처리
				.average()                    // 중간처리
				.getAsDouble();               // 최종처리

		System.out.println("학생들의 평균점수 = " + avg);
		System.out.println();	
		
		// 2) 학생들의 총점은?	
		// 중간처리(mapToInt), 최종처리 sum()
		int sum = students
					.stream()
					.mapToInt(Student::getScore)
					.sum();
		System.out.println("학생들의 총합계점수 = " + sum);
		System.out.println();	
		
		// 3. 학생인원수?
		// mapToInt, count()
		long count = students
						.stream()
						.mapToInt(Student::getScore)
						.count();
		System.out.println("학생들의 총인원수 = " + count);		
	}

}
