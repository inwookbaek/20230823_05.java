package java10.stream.ex08_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
	수집(collect())
	
	스트림은 요소들을 필터링 or 매핑한 후에 요소들을 수집하는 최종처리메서드인 collect()를 제공한다.
	Stream의 collect(Collectors<T,A,R> collector)메서드는 필터링 or 매핑된 요소들을 새로운 컬렉션타입
	으로 수집하고 그 결과인 Collection(List, Set, Map)으로 리턴한다.
	
	매개값인 Collector는 어떤 요소를 어떤 컬렉션타입으로 수집할 것인지를 정의한다. Collectors의 타입
	파라미터인 T는 스트림의 요소, A는 누적기(accumulator), R은 스트림요소들이 저장될 컬렉션을 의미한다.
	
	리턴값인 Collectors에는 Collector<T, ? R>처럼 누적기(A)가 ?로 되어 있는 경우도 있는데 이 의미는
	Collector가 T(스트림의 요소)를 R(컬렉션)에 저장하는 방법을 알고 있어서 A가 필요없다는 의미이다.
	
	Map과 ConcurrentMap의 차이점은 Map은 쓰레드에 안전하지 않고 ConcurrentMap은 쓰레드에 안전하다.
	따라서 멀티쓰레드환경에서는 Map보다는 ConcurrentMap을 사용하는 것이 좋다.
*/
public class CollectMain1 {

	public static void main(String[] args) {
		// Collector에는 toList(), toSet(), toMap()메서드를 제공
		// 즉, Collection 타입으로 리턴(저장)할 수 있다.
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90, Student.Gender.MALE),
				new Student("홍길순", 80, Student.Gender.FEMALE),
				new Student("홍길녀", 70, Student.Gender.FEMALE),
				new Student("홍길상", 88, Student.Gender.MALE));
		
		// 1. Collector로 남학생으로만 이루어진 List컬렉션을 생성
		List<Student> 남학생 = list.stream()
				.filter(std -> std.getGender() == Student.Gender.MALE)
				.collect(Collectors.toList());
		System.out.println(남학생.getClass());
		남학생.stream().forEach(s -> System.out.print(s.getName() + " ,"));
		System.out.println();
		
		// 2. Collector로 여학생으로만 이루어진 set컬렉션을 생성
		// a. toSet
		Set<Student> 여학생 = list.stream()
				.filter(std -> std.getGender() == Student.Gender.FEMALE)
				.collect(Collectors.toSet());
		System.out.println(여학생.getClass());
		여학생.stream().forEach(s -> System.out.print(s.getName() + " ,"));
		System.out.println();	
		
		// b. Collectors.toCollection(HashSet::new) -> 생성자호출
		여학생 = list.stream()
				.filter(s -> s.getGender() == Student.Gender.FEMALE)
				// .collect(Collectors.toCollection(HashSet::new));
				// .collect(Collectors.toCollection(HashSet<Student>::new));
				.collect(Collectors.toCollection(() -> new HashSet<Student>()));
		System.out.println(여학생.getClass());
		여학생.stream().forEach(s -> System.out.print(s.getName() + " ,"));
		System.out.println();		
	}

}

class Student {
	
	public enum Gender {MALE, FEMALE};
	public enum City {SEOUL, PUSAN};
	
	private String name;
	private int score;
	private Gender gender;
	private City city;
	
	public Student(String name, int score, Gender gender) {
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public Student(String name, int score, Gender gender, City city) {
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}

	public City getCity() {
		return city;
	}
}












