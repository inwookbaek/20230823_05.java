package com.lec.ex04_arrays;

import java.util.Arrays;

public class ArraysCopyMain {

	public static void main(String[] args) {
		// 배열의 복사
		char[] arr1 = {'J','A','V','A'};
		
		// 1. Arrays.copyOf()
		char[] chr1 = Arrays.copyOf(arr1, arr1.length-2);
		System.out.println(chr1);
		
		// 2. Arrays.copyOfRange(object, from, to)
		char[] chr2 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(chr2);
		
		// 3. System.arraycopy();
		char[] chr3 = Arrays.copyOf(arr1, arr1.length);
		char[] chr4 = new char[arr1.length];
		System.arraycopy(chr3, 0, chr4, 0, arr1.length);
		System.out.println(chr4);
	}

}
