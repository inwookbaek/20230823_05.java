package com.lec.ex03_array;

public class ArrayMain1 {

	public static void main(String[] args) {
		// 1. 배열의 초기화 및 생성
		// 타입[] 변수 or 타입 변수[]
		int[] scores = {90,95,80,88,78,89,90,88,99,77};
		
		// 1) heap영역의 메모리주소
		System.out.println(scores);            // 16진수
		System.out.println(scores.hashCode()); // 10진수
		System.out.println(scores.toString()); // 문자열(16진수)
		
		// 2) index접근
		System.out.println(scores[0]);
		// System.out.println(scores[-1]); // 인덱스는 음수 허용하지 않음
		
		// 3) 배열의 크기 length속성 - read only
		System.out.println("배열의 크기 = " + scores.length);
		// scores.length = 10; // 변경불가 즉, read only
		
		// 4) for문과 array
		int total = 0;
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
			total += scores[i];
		}
		System.out.println("총점 = " + total);
		
		total = 0;
		for(int score : scores) {
			total += score;
		}
		System.out.println("총점 = " + total);			
		
	}
}
