package java10.stream.ex05_sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PeekMain {

	public static void main(String[] args) {
		// 스트림을 반복처리 peek, forEach
		// peek는 중간처리, forEach는 최종처리
		// peek가 최종처리에 오거나 forEach가 중간처리에 오면 에러발생
		int[] int_array = {1,2,3,4,5,6,7,8,9,10};
		
		// 짝수의 합계를 stream.filter().sum()
		int sum = Arrays.stream(int_array).filter(n -> n%2 == 0).sum();
		System.out.println("1~10까지 짝수의 합 = " + sum);
		System.out.println();
		
		// 1. peek()를 마지막에 호출하는 경우
		// 중간처리이기 때문에 최종처리가 호출되지 않으면 실행되지 않음
		System.out.println("1. 중간처리인 peek가 호출되는 경우");
		Arrays.stream(int_array)
			.filter(n -> n%2 == 0)
			.peek(n -> System.out.print(n + ", "));  		
		System.out.println();
		
		
		// 2. 최종처리인 forEach가 호출되는 경우
		System.out.println("2. 최종처리인 forEach가 호출되는 경우");
		Arrays.stream(int_array)
			.filter(n -> n%2 == 0)
			.forEach(n -> System.out.print(n + ", ")); 
		System.out.println("\n\n");
		
		// 3. 최종처리가 마지막에 호출하는 경우, sum()
		int tot = Arrays.stream(int_array)
					.filter(n -> n%2 == 0)
					.peek(n -> System.out.print(n + ", "))
					.sum();
		System.out.println("\n1~10까지 짝수의 합 = " + tot); 			
	}
}