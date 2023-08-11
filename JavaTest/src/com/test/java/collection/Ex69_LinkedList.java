package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex69_LinkedList {

	public static void main(String[] args) {

		// Ex69_LinkedList.java
		
		/*
			- Array		+ List
			- Linked	+ List
			- Hash		+ Map
			- Tree		+ Map
			- Hash		+ Set
			- Tree		+ Set
			앞에 단어는 물리 구조(메모리의 모양)를 나타내는 단어이고, 뒤에 단어는 인터페이스(사용법)을 나타낸다.
			
			
			*** 컬렉션에 대한 면접 질문이 많다.
			ArrayList
			- 모든 컬렉션 중에서 요소에 접근하는 속도가 가장 빠르다.
			- 요소 삽입/삭제(Shift 발생)에 대한 비용이 많이 든다.

			LinkedList
			- 요소에 접근하는 속도가 상대적으로 느리다.
			- 요소 삽입/삭제(Shift 발생)에 대한 비용이 거의 없다.
			
			
		*/
		
		m1();
		m2();
		
	}

	private static void m2() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
		
		// 순차적으로 데이터 추가하기, Append
		System.out.println("[순차적으로 데이터 추가하기, Append]");
		
		// ArrayList
		begin = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list1.add(i); // 배열 끝에 추가
		}
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		// LinkedList
		begin = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list2.add(i); // 배열 끝에 추가
		}
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);

		/*
		[순차적으로 데이터 추가하기, Append]
		ArrayList 작업 시간: 22ms
		LinkedList 작업 시간: 172ms
		// 1,000,000번 시행한 결과 ArrayList는 약 0.22초, LinkedList는 약 1.72초 정도 걸렸다. 이는 컴퓨터 사양에 따라서 달라진다.
		// 특수한 경우가 아닌 이상 이 정도 차이는 거의 차이가 없다고 결론을 내릴 수 있는 정도이다.
		*/
		

		// 순차적으로 데이터 삭제하기 > Shift 발생이 되지 않는 삭제
		System.out.println("[순차적으로 데이터 삭제하기, Delete]");

		// ArrayList
		begin = System.currentTimeMillis();
		for(int i=list1.size()-1; i>=0; i--) {
			list1.remove(i); // 끝 > 시작
		}
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		// LinkedList
		begin = System.currentTimeMillis();
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(i); // 끝 > 시작
		}
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		/*
		[순차적으로 데이터 삭제하기, Delete]
		ArrayList 작업 시간: 5ms
		LinkedList 작업 시간: 18ms
		// 1,000,000번 시행한 결과, ArrayList는 약 0.07초, LinkedList는 약 0.18초 정도 걸렸다.
		// 순차적으로 삭제하는 것은 둘 다 빠르다.
		*/
		
		
		// 중간에 데이터 삽입하기, Insert
		// Shift 비용이 발생하는 경우에는 어떤 차이가 있는지를 확인한다.
		
		System.out.println("[중간에 데이터 삽입하기, Insert]");
		
		// ArrayList
		begin = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list1.add(0, i); // 삽입하기
		}
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		// LinkedList
		begin = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list2.add(0, i); // 삽입하기
		}
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		/*
		[중간에 데이터 삽입하기, Insert]
		ArrayList 작업 시간: 1,823ms
		LinkedList 작업 시간: 1ms
		// 10,000번 시행한 결과, ArrayList는 약 1.823초, LinkedList는 약 0.01초 정도 걸렸다.
		// 배열을 만들 때 사이에 끼워 넣는 일이 주 업무일 경우 LinkedList를 사용하는 것이 좋다.
		*/
		
		
		// 중간에 데이터 삭제하기 > Shift 발생
		System.out.println("[중간에 데이터 삭제하기, Delete]");
		
		// ArrayList
		begin = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list1.remove(0); // 삭제하기
		}
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
		
		// LinkedList
		begin = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list2.remove(0); // 삭제하기
		}
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
		/*
		[중간에 데이터 삭제하기, Delete]
		ArrayList 작업 시간: 1,293ms
		LinkedList 작업 시간: 1ms
		// 10,000번 시행한 결과, ArrayList는 약 1.293초, LinkedList는 약 0.01초 정도 걸렸다.
		// Shift가 발생하는 경우, LinkedList를 사용하는 게 훨씬 좋다.
		*/
		
	}

	private static void m1() {

		// Collection(I) > List(I) > ArrayList(C), LinkdedList(C)

		// ArrayList vs LinkedList
		// - List > 구현 > 사용법 아주 유사 > 개발자 경험
		// - 겉으로 보기에 사용법은 같지만 내부 구조가 완전히 다르다.
		// - 내부 구조가 다르다는 것은 사용 목적이 다르다는 의미이다.

		// 링크드리스트(LinkedList)종류
		// 1. LinkedList
		//	- 일방통행 구조이다. (앞으로만 갈 수 있음)
		//	- 첫 번째 값을 확인할 수 있으면서 두 번째 값의 주소도 알아낼 수 있다.
		
		// 2. Double LinkedList
		//	- 양방향 통행이 가능한 구조이다. (뒤로도 갈 수 있음)
		
		// 3. Double Circle LinkedList
		//	- 양방향 + 처음~끝 연결한 구조이다.
		//	- 시작 방에서 끝 방에 갈 수 있고, 끝 방에서 시작 방에 갈 수 있는 원형 구조이다.
		
		// 자바의 링크드리스트는 3. DOuble Circle LinkedList이다.
		
		// 배열의 계산할 수 있는 구조: 100 + 4 * 2 = 108
		// 링크드리스트는 방을 접근하는 속도가 느리다.
		// 결론: 내가 이 배열을 만들어서 무슨 일을 할것인지에 따라서 효율이 달라진다. 그러므로 내부구조에 따라 결정하도록 한다.
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		
		System.out.println(list1.size());
		System.out.println(list2.size());

		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
	}
}
