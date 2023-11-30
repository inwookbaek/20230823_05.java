package com.lec.ex04_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapMain3 {

	public static void main(String[] args) {
		// 4. 범위검색
		TreeMap<String, Integer> words = new TreeMap<>();
		words.put("apple", 10);
		words.put("orange", 20);
		words.put("banana", 25);
		words.put("cherry", 10);
		words.put("mango", 20);
		words.put("pea", 15);
		words.put("for", 11);
		words.put("c", 0);
		words.put("f", 0);
		
		// c~f사이의 단어검색
		NavigableMap<String, Integer> rm = words.subMap("c", false, "f", false);
		for(Map.Entry<String, Integer> entry:rm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
