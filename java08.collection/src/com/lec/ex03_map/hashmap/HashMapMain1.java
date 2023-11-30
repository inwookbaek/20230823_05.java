package com.lec.ex03_map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map Collection
	
	1. Map컬렉션은 Key와 Value의 한쌍으로된 Map.Entry객체를 저장하는 구조
	2. Key는 중복불가(동일객체여부는 hashCode, equals를 재정의), Value 중복가능
	3. 만약, 동일키를 저장할 경우에 Key는 변동없이 값만 덮어써진다.
	4. HashMap, HashTable, TreeMap, Properties가 있다.
	5. 저장하려면 put(), 읽을려면 get(키)메서드를 사용
	6. ketSet()  : key를 Set으로 저장한 후에 Iterator를 통해서 값을 읽는 방법
	7. entrySet(): Map.Entry객체를 Set으로 저장후 Iterator를 통해서 getKey(),
	               getValue()메서드를 이용
*/
public class HashMapMain1 {

	public static void main(String[] args) {

		// 1. Map객체 생성
		Map<String, Integer> map = new HashMap<>();
				
		// 2. 객체저장 - put()
		map.put("홍길동", 85);
		map.put("홍길순", Integer.valueOf(80));
		map.put("홍길자", 95);
		map.put("홍길녀", 75);
		map.put("홍길성", 88);
		map.put("홍길동", 90);
		System.out.println("총 객체수 = " + map.size());
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "소향");
		map2.put(2, "나얼");
		map2.put(2, "거미");
		System.out.println("총 객체수 = " + map2.size());
		System.out.println();
		
		// 3. 객체읽기(1) - get()
		System.out.println("홍길동의 점수 = " + map.get("홍길동"));
		System.out.println("2번학생의 이름 = " + map2.get(Integer.valueOf(2)));
		System.out.println();
		
		// 4. 객체읽기(2) - keySet()
		Set<String> keySet1 = map.keySet();
		Iterator<String> names = keySet1.iterator();
		while(names.hasNext()) {
			String name = names.next();
			Integer score = map.get(name);
			System.out.println(name + "의 점수 = " + score);
		}
		System.out.println();
		
		Set<Integer> keySet2 = map2.keySet();
		Iterator<Integer> students = keySet2.iterator();
		while(students.hasNext()) {
			Integer student = students.next();
			String name = map2.get(student);
			System.out.println(student + "번 학생의 이름 = " + name);
		}
		System.out.println();
		
		// 5. 객체읽기(3) - entrySet()
		Set<Map.Entry<String, Integer>> entrySet1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>>  entry1 = entrySet1.iterator();
		while(entry1.hasNext()) {
			Map.Entry<String, Integer> entry = entry1.next();
			String name = entry.getKey();
			Integer score = entry.getValue();
			System.out.println(name + "의 점수 = " + score);
		}
		System.out.println();
		
		Set<Map.Entry<Integer, String>> entrySet2 = map2.entrySet();
		Iterator<Map.Entry<Integer, String>> entry2 = entrySet2.iterator();
		while(entry2.hasNext()) {
			Map.Entry<Integer, String> entry = entry2.next();
			Integer student = entry.getKey();
			String name = entry.getValue();
			System.out.println(student + "번 학생의 이름 = " + name);
		}
		System.out.println();
		
		// 6. 객체삭제 - remove()
		map.remove("홍길동");
		map2.remove(2);
		System.out.println(map.size() + ", " + map2.size());
		
		// 7. 전체삭제 - clear()
		map.clear();
		map2.clear();
	}
}