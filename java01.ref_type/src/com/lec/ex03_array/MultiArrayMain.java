package com.lec.ex03_array;

public class MultiArrayMain {

	public static void main(String[] args) {
		// 1. 2행 3열인 배열
		int[][] mathScores = new int[2][3]; // 정방형배열생성
		
		// 배열의 크기 확인
		System.out.println(mathScores.length);
		System.out.println(mathScores[0].length);
		System.out.println(mathScores[1].length);
		
		// 정방형배열
		for(int i=0;i<mathScores.length;i++) {
			for(int j=0;j<mathScores[i].length;j++) {
				System.out.println("mathScores[" + i + "][" + j + "]");
			}
		}
		System.out.println();
		
		// 비정방형배열
		int[][] engScores = new int[3][]; // 행만선언
		System.out.println(engScores.length);
		// System.out.println(engScores[0].length); // 에러 
		engScores[0] = new int[2];
		engScores[1] = new int[10];
		engScores[2] = new int[5];
		
		for(int i=0;i<engScores.length;i++) {
			for(int j=0;j<engScores[i].length;j++) {
				System.out.println("engScores[" + i + "][" + j + "]");
			}
		}		
	}

}
