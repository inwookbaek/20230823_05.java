package com.lec.ex03_array;

public class StringArgMain {

	public static void main(String[] scores) {
		
		System.out.println(scores.length);
		
		int total = 0;
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		System.out.println(total);
	}
}
