package com.lec.ex03_array;

public class ArrayMain2 {

	public static void main(String[] args) {
		// 2. 배열의 생성 및 초기화 - new 객체생성연산자
		int scores[]; // 선언
		scores = new int[] {90,95,80,88,78,89,90,88,99,77};
		
		int total = 0;
		for(int score : scores) {
			total += score;
		}
		System.out.println("총점 = " + total);			
	}

}
