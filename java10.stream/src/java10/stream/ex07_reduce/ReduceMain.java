package java10.stream.ex07_reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceMain {

	public static void main(String[] args) {
		// map -> reduce : MapAndReduce
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("홍길순", 80),
				new Student("홍길저", 95)
			);

		// 1. sum() - 합계구하기(1), 리턴타입 int
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("합계구하기(1) = " + sum);
		
		// 2. reduce(BinarayOperator) - 합계구하기(2) - 예외처리(X), 리턴타입 OptionalXXX, 중간처리
		sum =  list.stream().mapToInt(Student::getScore).reduce((x, y) -> x + y).getAsInt();
		System.out.println("합계구하기(2) = " + sum);
		
		// 3. reduce(int, BinaryOperator) - 합계구하기(3) - 예외처리(O), 리턴타입 int, 최종처리
		// int는 예외가 발생되면 대체되는 값을 정의
		sum =  list.stream().mapToInt(Student::getScore).reduce(0, (x, y) -> x + y);
		System.out.println("합계구하기(3) = " + sum);
	}

}

class Student {
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}	
}