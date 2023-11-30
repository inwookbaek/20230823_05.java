package java10.stream.ex04_mapping;

import java.util.Arrays;
import java.util.List;

// 매핑 : mapXXX, flatMapXXX, asXXXStream, boxed
public class FlatMapMain {

	public static void main(String[] args) {
		// 2. FlatMap
		List<String> list1 = Arrays.asList("Java8 Lambda", "stream mapping");
		list1.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(System.out::println);
		System.out.println();
		
		// 3. flatMapToInt
		List<String> list2 = Arrays.asList("1,2,3,4", "5,6,7,8,9,10");
		// flatMap - String으로 전달, flatMapToInt은 Integer로 전달
		list2.stream().flatMap(s -> Arrays.stream(s.split(","))).forEach(System.out::println);
		System.out.println();
		
		list2.stream().flatMapToInt(data -> {
			String[] str_arr = data.split(",");
			int[] int_arr = new int[str_arr.length];
			for(int i=0;i<int_arr.length;i++) {
				int_arr[i] = Integer.parseInt(str_arr[i].trim());
			}
			return Arrays.stream(int_arr);
		}).forEach(System.out::println);
		
		
	}

}
