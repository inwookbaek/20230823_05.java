package java10.stream.ex03_pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
	pipeline : 중간처리와 최종처리를 연속적으로 이어 놓은 것
	
	1. 중간처리메서드
	
	   1) 필터링 : distinct(), filter()
	   2) 매핑   : flatMap(), flatMapToxxx(), xxx = Int, Double, Long
	               map(), mapToxxx()
	   3) 정렬   : sorted()
	   4) 루핑   : peek() 
	
	2. 최종처리메서드
	
	   1) 매칭 : allMatch(), anyMatch(), noneMatch()
	   2) 집계 : count(), sum(), average(), max(), min(), findFirst(), reduce()
	   3) 루핑 : forEach()
	   4) 수집 : collect()
	    
*/
public class PipeLineMain {

	public static void main(String[] args) {
		
		List<Member> members = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("홍길순", Member.FEMALE, 34),
				new Member("홍길녀", Member.FEMALE, 32),
				new Member("홍길상", Member.MALE, 25),
				new Member("홍길성", Member.MALE, 27),
				new Member("홍길자", Member.FEMALE, 29)
			);
		
		// 남자회원의 평균나이는?
		// 1. 일반로직
		double sum = 0.0;
		for(Member member:members) {
			if(member.getGender() == Member.MALE) {
				sum += member.getAge();
			}
		}
		System.out.println("일반로직 : 남자회원의 평균나이 = " + (sum / (members.size()-3)));
		
		// 2. stream로직
		OptionalDouble avgAge = members
							   	  .stream()
							   	  .filter(m -> m.getGender() == Member.MALE) // 남자회원만 전달
							   	  .mapToInt(Member::getAge)                  // 나이만 전달
							   	  .average();                                // 평균값을 전달
		System.out.println("스트림 : 남자회원의 평균나이 : " + avgAge.getAsDouble());
		double avgAge1 = members
			   	  .stream()
			   	  .filter(m -> m.getGender() == Member.MALE) // 남자회원만 전달
			   	  .mapToInt(Member::getAge)                  // 나이만 전달
			   	  .average()                                 // 평균값을 전달
		          .getAsDouble();                            // 최종단계
		System.out.println("스트림 : 남자회원의 평균나이 : " + avgAge1);
		avgAge1 = members
			   	  .stream()
			   	  .filter(m -> m.getGender() == Member.FEMALE) // 남자회원만 전달
			   	  .mapToInt(Member::getAge)                  // 나이만 전달
			   	  .average()                                 // 평균값을 전달
		          .getAsDouble();                            // 최종단계
		System.out.println("스트림 : 여자회원의 평균나이 : " + avgAge1);		
		
		
	}

}

class Member {
	
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	private String name;
	private int gender;
	private int age;
	
	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}	
}






