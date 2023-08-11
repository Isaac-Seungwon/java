package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex61_Stack {

	public static void main(String[] args) {
		
		/*
		
			자료구조(컬렉션)
			- 물리적인 특징(내부 구조)
			- 추상적인 특징(사용법)
			
			ADT
			- Abstact Data Type
			- Stack, Queue
			
			List
			- ArrayList
			- LinkedList
			- Queue
			- Stack	
		
			Stack
			- 후입선출
			- LIFO, Last Input First Output
			- 저장소에 나중에 들어간 요소가 가장 먼저 나온다.
			- 시간 순서의 업무를 할 때 적용하기 좋은 구조이다.
			ex) 메모리 구조 (Stack)
			ex) 되돌리기(Ctrl + Z), 다시하기(Ctrl + Y)
			
			Queue
			- 선입선출
			- FIFO
			- First Input First Output
			- 저장소에 먼저 들어간 요소가 가장 먼저 나온다.
			- 마우스, 키보드
			
		*/
		
		m1();
		m2();
		m3();
		
		
		
	}

	private static void m3() {

		// Queue
		// 선입 선출
		// Queue<String> queue = new Queue<String>();
		Queue<String> queue = new LinkedList<String>();
		
		// 자바는 Queue를 Class가 아닌 Interface로 인식한다.
		// 따라서 Queue는 껍데기이며, LinkedList를 본체로 생성해야 한다.
		
		// 1. 요소 추가하기
		// - boolean add(T value)
		queue.add("커피");
		queue.add("에이드");
		queue.add("라테");
		
		
		// 5. 요소 확인
		System.out.println(queue.peek()); // 커피
		
		
		// 2. 요소 개수
		// - int size()
		System.out.println(queue.size()); // 3
		// interface이기 때문에 새로운 것을 하는데도 불구하고 같은 메소드로 기능을 구현할 수 있다.
		
		
		// 3. 요소 읽기
		System.out.println(queue.poll()); // 커피
		System.out.println(queue.size()); // 2
		
		System.out.println(queue.poll()); // 에이드
		System.out.println(queue.size()); // 1
		
		System.out.println(queue.poll()); // 라테
		System.out.println(queue.size()); // 0
		
		System.out.println(queue.poll()); // null
		
		
		// 4. 스택이 비었는지 확인
		if (queue.size() != 0) {
			System.out.println(queue.poll());
		}
		
		if (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

	private static void m2() {
		Stack<String> stack = new Stack<String>();
		
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		
		// 5. 요소 확인
		System.out.println(stack.peek());
		
		// pop과 peek는 비슷해 보이지만 완전히 다르다.
		// peek는 데이터를 읽기만 하고 꺼내지 않는다. 다르게 말하면 파이프의 뚫린 구멍을 구경만 하는 메소드이다.
		
	}

	private static void m1() {

		Stack<String> stack = new Stack<String>();
		
		// 후입선출
		// 1. 요소 추가하기
		// - T push(T value)
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		
		// 2. 요소 개수 확인
		// -int size()
		System.out.println(stack.size());
		
		
		// 3. 요소 읽기
		// -T pop()
		System.out.println(stack.pop()); // 볶음밥
		System.out.println(stack.size()); // 2
		
		System.out.println(stack.pop()); // 짬뽕
		System.out.println(stack.size()); // 1
		
		System.out.println(stack.pop()); // 짜장면
		System.out.println(stack.size()); // 0
		
		// System.out.println(stack.pop()); // EmptyStackException
		System.out.println(stack.size());
		// Stack은 읽는 행동과 제거 행동이 동시에 이루어진다.
		// 스택이 비어 있는데 데이터를 가져오려고 하면 EmptyStackException 오류가 난다.
		
		
		// 4. 스택이 비었는지 확인
		if (stack.size() != 0) {
			System.out.println(stack.pop());
		}
		
		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
