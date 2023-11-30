package java10.stream.ex06_aggregate;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggregateMain {

	public static void main(String[] args) {
		// sum(), count(), average(), max(), min(), findFirst()
		
		int[] int_arr = {1,2,3,4,5};
		
		// 1. count() - 리턴타입이 long
		long cnt = Arrays.stream(int_arr).filter(n -> n%2 == 0).count();
		System.out.println("요소의 갯수 = " + cnt);
		
		// 2. sum - return타입이 int
		int sum = Arrays.stream(int_arr).filter(n -> n%2 == 0).sum();
		System.out.println("짝수 요소의 합계 = " + sum);

		// 3. average : 중간처리, 최종처리를 하려면 getAsDouble()
		// return타입이 OptionalDouble
		double avg = Arrays.stream(int_arr).filter(n -> n%2 == 0).average().getAsDouble();
		OptionalDouble o_avg = Arrays.stream(int_arr).filter(n -> n%2 == 0).average();
		System.out.println("짝수의 평균 = " + avg);
		System.out.println("짝수의 평균 = " + o_avg.getAsDouble());
		
		// 4. max(Comparator<T>) - 리턴타입이 OptionalXXX(Int, Long, Double)
		OptionalInt max = Arrays.stream(int_arr).filter(n -> n%2 == 0).max();
		System.out.println("요소의 최대값 = " + max.getAsInt() + ", " + max.getClass());
		
		// 5. min(Comparator<T>) - 리턴타입이 OptionalXXX(Int, Long, Double)
		System.out.println("요소의 최소값 = " 
				+ Arrays.stream(int_arr).filter(n -> n%2 == 0).min().getAsInt());
		
		// 6. findFirst - OptionalXXX
		OptionalInt first = Arrays.stream(int_arr).filter(n -> n%2 == 0).findFirst();
		System.out.println("요소의 첫번째 값 = " + first.getAsInt() + ", " + max.getClass());		
	}

}











