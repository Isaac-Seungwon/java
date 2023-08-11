package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {

	public static void main(String[] args) {
		
		// Ex72_TreeMap.java
		
		// TreeMap
		// - Tree > 이진 탐색 트리 > 자동 정렬
		// - Map > 키 + 값 > 연관 배열
		
		// HashMap은 정렬이 안 되는 반면, TreeMap은 정렬이 된다는 차이가 있다.

		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("green", "초록");
		map.put("orange", "주황");
		
		System.out.println(map.size()); // 7
		System.out.println(map); // {black=검정, blue=파랑, green=초록, orange=주황, red=빨강, white=흰색, yellow=노랑}
		
		// key가 A~Z 순으로 정렬이 되어 있다. (Value를 정렬해봤자 의미가 없기 때문이다.)
		
		
		// 요소 읽기
		System.out.println(map.get("green")); // 초록
		
		
		// 요소 수정하기
		map.put("green", "녹색");
		System.out.println(map.get("green")); // 녹색
		
		
		System.out.println(map.firstKey()); // black
		System.out.println(map.lastKey()); // yellow
		System.out.println(map.headMap("m")); // {black=검정, blue=파랑, green=녹색}
		System.out.println(map.tailMap("m")); // {orange=주황, red=빨강, white=흰색, yellow=노랑}
		System.out.println(map.subMap("r", "y")); // {red=빨강, white=흰색}

		
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0)); // 10
		// Vector는 ArrayList로 보면 된다.
		// 정확한 차이점이 있긴 하다. Vector는 자동으로 동기화된다는 특징이 있다. > 스레드 작업에 차이가 있다.
		
		
		/*
			List
			- ArrayList > 배열이 필요할 때 / 삽입, 삭제 (X)
			- LinkedList > ArrayList 대체제 / 삽입, 삭제 (O)
			- Stack > 스택 구조 필요
			- Queue > 큐 구조 필요
			- Vector
			
			Set
			- HashSet > 중복값 배제, 유일한 집합
			- TreeSet > HashSet + 정렬
			
			Map
			- HashMap > 키/값 연관 배열이 필요할 때
			- TreeMap > HashMap + 정렬
			- HashTable
			
			- Properties > 
		
		
		*/
		
	}
}
