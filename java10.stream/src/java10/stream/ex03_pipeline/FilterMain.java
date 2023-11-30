package java10.stream.ex03_pipeline;

import java.util.Arrays;
import java.util.List;

public class FilterMain {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "소향", "손흥민", "소향", "홍길녀");
		
		// 1. distinct()
		names.stream().distinct().forEach(System.out::println);
		System.out.println();
		
		// 2. filter()
		names.stream().distinct().filter(n -> n.startsWith("소")).forEach(System.out::println);
		System.out.println();
		
		names.stream().filter(n -> n.startsWith("소")).forEach(System.out::println);
	}

}
