package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex62_Map {

	public static void main(String[] args) {
		
		// Ex62_Map.java
		
		/*
			ArrayList
			- 요소에 접근할 때 첨자(index)를 사용한다.
			- 그래서 순서가 있는 데이터 집합(방 번호 == 요소의 순서)라고 부른다.
			ex) 강의실 6개 > 1강의실, 2강의실 ... 6강의실
			- 스칼라 배열(Scalar Array)이다.
			- 요소 일괄 접근 > 반복문을 돌릴 수 있다.
			- 요소끼리 구분이 힘들다 > 방번호 > 의미가 없다.
			- 첨자(index)는 유일하다.
			- 값(value)은 중복이 가능하다. > 방 번호가 유일하기 때문이다.
			
			
			HashMap
			- 요소에 접근할 때 키(key)를 사용하는 방식이다.
			- 방 번호가 없다는 뜻은 순서가 없다는 뜻이기도 하다.
			ex) 강의실 6개 > 햇님반, 달님반, 별님반 ... 지구반 <- 이 이름을 key라고 한다.
		
			- 키(key) -> 값(value)
			- 맵(Map), 딕셔너리(Dictionary) 사전 구조이다.
			- key의 형태로 데이터 구조가 되어 있다.
			- blue > 파란 색상을 나타내는 말
			- 연관 배열
			- 요소 일괄 접근 > 반복문이 불가능하다. (성질이 다를 뿐이지 HashMap 용도에 맞는 게 있다. - 좋고 나쁜 게 없다)
			- 요소끼리 구분이 용이하다 > 식별자(key) > 방의 의미를 알 수 있게 된다 > 가독성이 굉장히 좋다.
			- 값을 직접 확인하지 않더라도 거기에 뭐가 들어 있는지 밖에 적혀 있기 때문이다.
			- 키(key)는 유일하다.
			- 값(value)은 중복이 가능하다. 키가 유일해서.
			
		*/
		
		// 타입 변수가 2개인 이유
		// String - key 자료형 > 방의 이름
		// Integer - value 자료형 > 데이터
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		
		// 1. 요소 추가
		// - V put(K key, V value)
		map.put("국어", 100); // int 국어 = 100
		map.put("영어", 90);
		map.put("수학", 80);
			
		
		// 2. 요소 개수
		// - int size()
		System.out.println(map.size());
		
		
		// 3. 요소 읽기
		// - V get(K key)
		System.out.println(map.get("국어")); // 100
		System.out.println(map.get("영어")); // 90
		System.out.println(map.get("수학")); // 80
		
		
		// 4. 일괄 탐색 > 불가능 > 존재하긴 함
		// HashMap은 루프를 잘 돌리지 않는다.
		
		
		// 5. 요소 수정
		// - V put(K key, V value)
		map.put("국어", 95); // 추가하는 게 아니라 수정하는 코드이다.
		System.out.println(map.get("국어")); // 95
		// 앞서 key는 유일하다고 했다. 이미 국어라는 key를 가지고 있기 때문에 
		
		
		// 6. 요소 검색하기
		// - boolean containsKey(K key)
		// - boolean containsValue(V value)
		
		System.out.println(map.containsKey("국어")); // true
		System.out.println(map.containsKey("과학")); // false
		
		System.out.println(map.get("과학")); // null
		
		System.out.println(map.containsValue(90)); // true
		System.out.println(map.containsValue(100)); // false
		// 배열 > 국어 점수 받은 게 있니?
		// 배열 > 90점 맞은 게 있니?
		
		
		// 7. 요소 삭제하기
		// - V remove(K key)
		map.remove("국어");
		System.out.println(map.size()); // 2
		System.out.println(map.get("국어")); // null
		
		
		// 8. 초기화
		map.clear();
		
		
		// 일괄 탐색하기
		map.put("국어", 100); // int 국어 = 100
		map.put("영어", 90);
		map.put("수학", 80);
		
		Set<String> set = map.keySet();
		
		System.out.println(set); // [국어, 수학, 영어]
		
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		// 교실
		HashMap<String,String> list = new HashMap<String,String>();
		
		list.put("반장", "홍길동");
		list.put("부반장", "아무개");
		list.put("미화부장", "하하하");
	}
}
