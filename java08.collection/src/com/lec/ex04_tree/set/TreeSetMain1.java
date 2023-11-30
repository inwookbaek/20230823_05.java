package com.lec.ex04_tree.set;

import java.util.TreeSet;

public class TreeSetMain1 {

	public static void main(String[] args) {
		// 1. 추가
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		scores.add(80);  // 중복저장않됨
		System.out.println("총 객체수 = " + scores.size());
		System.out.println();
		
		// 2. 읽기(비교)
		// 가장 낮은 점수, 가장 높은점수, 95바로아래점수, 95바로위점수
		Integer score = 0;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 = " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 = " + score);
		
		score = scores.lower(95);
		System.out.println("95바로 아래점수 = " + score);
		
		score = scores.higher(95);
		System.out.println("95바로 위점수 = " + score);
		
		score = scores.floor(94);
		System.out.println("94 이거나 94 바로 아래점수 = " + score);
		
		score = scores.ceiling(96);
		System.out.println("96 이거나 바로 위 점수 = " + score);
		System.out.println();
		
		// 전체자료 읽기
		while(!scores.isEmpty()) {
			// score = scores.pollFirst(); // 가장 작은 값부터 꺼내온 후 삭제
			score = scores.pollLast(); // 가장 큰 값부터 꺼내온 후 삭제
			System.out.println(score + " 현재 남은 객체수 = " + scores.size());
		}

	}
}