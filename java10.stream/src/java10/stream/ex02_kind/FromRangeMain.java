package java10.stream.ex02_kind;

import java.util.stream.IntStream;

public class FromRangeMain {

	// stream에서 사용되는 변수는 static으로 정의해야 한다.
	// 즉, 클래스멤버로 선언되어야 한다.
	static int sum = 0;

	public static void main(String[] args) {
		// 3. range()함수에서 stream을 얻기		
		// IntStream.range(start, end-1), LongStream.range()
		// DoubleStream에는 range함수는 없다.
		IntStream stream = IntStream.range(1, 11);
		stream.forEach(n -> sum += n);
		System.out.println("1~10까지의 합 = " + sum);
		
		// IntStream.rangeClosed(start, end)
		sum = 0;
		stream = IntStream.rangeClosed(1, 10);
		stream.forEach(n -> sum += n);
		System.out.println("1~10까지의 합 = " + sum);
	}

}
