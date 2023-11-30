package java10.stream.ex01_intro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
	Stream?
	
	1. 스트림은 java8버전부터 추가된 클래스
	2. 스트림을 얻는 방법은 Collection, 배열, 숫자범위, Files에서 얻을 수 있다.
	3. Stream vs Iterator
	   1) 내부반복자를 이용해서 병렬처리 가능(성능업)
	   2) lambda식으로 처리할 수 있다.
	   3) 중간처리, 최종처리등을 할 수 있다.	
	
*/
public class StreamMain {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "홍길순", "소향");
		
		// 1. iterator
		Iterator<String> names =  list.iterator();
		while(names.hasNext()) {
			String name = names.next();
			System.out.print(name + ", ");
		}
		System.out.println();
		
		// 2. stream
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.print(name + ", "));
	}

}











