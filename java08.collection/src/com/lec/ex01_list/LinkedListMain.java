package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		// 속도비교 - add, remove
		List<String> arrList = new ArrayList<>();
		List<String> lnkList = new LinkedList<>();
		
		long start, finish;
		start = System.nanoTime();
		
		for(int i=0;i<100000;i++) {
			arrList.add(0, String.valueOf(i));
		}
		
		finish = System.nanoTime();
		System.out.println("ArrayList 소요시간 = " + (finish - start) + " ns");
			
		start = System.nanoTime();
		
		for(int i=0;i<100000;i++) {
			lnkList.add(0, String.valueOf(i));
		}
		
		
		finish = System.nanoTime();
		System.out.println("LinkedList 소요시간 = " + (finish - start) + " ns");

	}
}
