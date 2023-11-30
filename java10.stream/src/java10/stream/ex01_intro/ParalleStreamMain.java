package java10.stream.ex01_intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleStreamMain {

	public static void main(String[] args) {
		
		List<String> list = 
				Arrays.asList("홍길동", "홍길순", "홍길자", "홍길상", "소향");
		
		// 1. 직렬처리(stream)
		Stream<String> stream = list.stream();
		stream.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		
		stream = list.stream();
		stream.forEach(n -> ParalleStreamMain.print(n + ", "));
		System.out.println();
		
		stream = list.stream();
		stream.forEach(ParalleStreamMain::print);
		System.out.println();
				
		// 2. 병렬처리(paralleStream)
		Stream<String> p_stream = list.parallelStream();
		p_stream.forEach(ParalleStreamMain::print);	
	} 

	private static void print(String name) {
		System.out.println(name + " : " + Thread.currentThread().getName());

	}
	
}
