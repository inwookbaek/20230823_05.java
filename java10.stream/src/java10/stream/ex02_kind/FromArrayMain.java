package java10.stream.ex02_kind;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FromArrayMain {

	public static void main(String[] args) {
		
		String[] names = {"홍길동","홍길순","홍길자","홍길성","홍길녀"};
		Stream<String> stream = Arrays.stream(names);
		stream.forEach(System.out::print);
		System.out.println();
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		IntStream numbs = Arrays.stream(numbers);
		numbs.forEach(System.out::print);
		System.out.println();
		
		double[] d_nums = {1,2,3,4,5,6,7,8,9,10};
		DoubleStream ds = Arrays.stream(d_nums);
		ds.forEach(System.out::print);
		System.out.println();
		
		
		long[] l_nums = {1,2,3,4,5,6,7,8,9,10};
		LongStream ls = Arrays.stream(l_nums);
		ls.forEach(System.out::print);
		System.out.println();		

	}

}
