package java10.stream.ex04_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsStreamMain {

	public static void main(String[] args) {
		
		int[] int_arr = {1,2,3,4,5};
		
		// 1. asXXXStream
		IntStream int_stream = Arrays.stream(int_arr);
		int_stream.asDoubleStream().forEach(System.out::println);
		System.out.println();
		
		// 2. boxed : int -> Integer, double -> Double, long - >Long
		int_stream = Arrays.stream(int_arr);
		int_stream.boxed().forEach(obj -> System.out.println(obj.intValue()));
		System.out.println();
		
		int_stream = Arrays.stream(int_arr);
		int_stream.boxed().forEach(
				obj -> {
					System.out.print(obj.intValue() + " -> ");
					System.out.println(obj.getClass());
				});

	}
}
