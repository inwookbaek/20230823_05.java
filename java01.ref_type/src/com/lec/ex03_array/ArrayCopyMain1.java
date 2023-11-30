package com.lec.ex03_array;

public class ArrayCopyMain1 {

	public static void main(String[] args) {
		// 배열의 복사(참조타입복사)
		String[][] names = {{"소향", "나얼"},{"손흥민", "이강인", "김민재"}}; 
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println("names[" + i + "][" + j + "] = " + names[i][j]);
			}
		}
		System.out.println();
		
		// 얕은 복사
		String[][] names1 = names;
		System.out.println(names.hashCode() + " : " + names1.hashCode());

		names[0][0] = "거미";
		names[1][2] = "황희찬";
		
		System.out.println(names[0][0] + " : " + names1[0][0]);
		System.out.println(names[1][2] + " : " + names1[1][2]);
		System.out.println("-------------------------");
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println("names[" + i + "][" + j + "] = " + names[i][j]);
			}
		}
		System.out.println();
		
		for(int i=0;i<names1.length;i++) {
			for(int j=0;j<names1[i].length;j++) {
				System.out.println("names1[" + i + "][" + j + "] = " + names1[i][j]);
			}
		}
	}

	
			
}
