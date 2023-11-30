package com.lec.ex01_system;

public class TimeMain {

	public static void main(String[] args) {
		// 1~1000000까지의 합을 구하는데 소요시간은?
		// long start = System.nanoTime(); 
		long start = System.currentTimeMillis();
		
		int sum = 0;
		for(int i=1;i<=100000000;i++) {
			sum += i;
		}
		long end = System.currentTimeMillis(); 
		
		System.out.println("1~1000000까지의 합 = " + sum);
		System.out.println("1~1000000까지의 소요시간 = " + (end - start) + "ms");
		
	}

}
