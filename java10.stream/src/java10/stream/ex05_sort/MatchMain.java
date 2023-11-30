package java10.stream.ex05_sort;

import java.util.Arrays;

public class MatchMain {

	public static void main(String[] args) {
		// 1. allMatch() - 모든 요소들이 매개값으로 주어진 조건에 만족하면 true 아니면 false
		// 2. anyMatch() - 최소한 한개의 요소가 주어진 조건에 만족하면 true 아니면 false
		// 3. noneMatch()- 모든 요소들이 만족하지 않으면 true 아니면 false
		
		boolean result = false;
		int[] int_arr = {2,4,6};
		
		// 1. allMatch
		result = Arrays.stream(int_arr).allMatch(n -> n%2 == 0);
		System.out.println("모든요소가 짝수? " + result);
		result = Arrays.stream(int_arr).allMatch(n -> n%3 == 0);
		System.out.println("모든요소가 3의 배수? " + result);
		System.out.println();
		
		// 2. anyMatch
		result = Arrays.stream(int_arr).anyMatch(n -> n%3 == 0);
		System.out.println("최소한 1개의 요소가 3의 배수? " + result);
		System.out.println();
		
		// 3. noneMatch
		result = Arrays.stream(int_arr).noneMatch(n -> n%3 == 0);
		System.out.println("3의 배수가 없는가? " + result);
	}

}








