package com.test.question.q105;

import java.util.Arrays;
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
*/

//문자열 배열을 이용한 Queue 구현
class MyQueue {

	// Queue<String>
	private String[] list;	// 큐의 요소들을 담을 문자열 배열
	private int index;		// 큐에 추가될 요소의 위치 인덱스

	// 생성자
	public MyQueue() {
		this.list = new String[4];	// 초기 크기가 5인 문자열 배열로 큐 생성
		this.index = 0;				// 인덱스 초기화
	}

	// 덤프 메소드 (객체 정보를 문자열로 표현하는 메소드)
	@Override
	public String toString() {

		String temp = "";
		
		temp = "MyQueue [list =";
		
		for (int i = 0; i < this.index; i++) {
			temp += " " + this.list[i];
		}
		temp += ", index : " + this.index;
		temp += ", length : " + this.list.length;
		temp += "]";
		
		return temp;
	}

	// 큐에 요소 추가
	public boolean add(String value) {
		try {
			// 배열이 가득 차 있는 경우 배열 크기를 확장하여 재할당
			if (this.index >= this.list.length) {
				String[] temp = new String[this.list.length * 2];

				// 기존 배열의 요소들을 새 배열로 복사
				for (int i = 0; i < this.index; i++) {
					temp[i] = this.list[i];
				}
				
				this.list = temp; // 새로운 배열로 기존 배열 참조 변경
			}
			
			// 요소를 추가하고 인덱스 증가
			this.list[this.index] = value;
			this.index++;

			return true;
		} catch (Exception e) {
			// System.out.println("오류 호록");
			return false;
		}
	}

	// 큐의 맨 앞 요소를 제거하고 반환하는 메소드
	public String poll() {

		String temp = this.list[0]; // 첫 번째 요소 저장

		// 큐의 요소들을 한 칸씩 앞으로 이동하여 재정렬
		for (int i = 0; i < this.index - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.index--;

		return temp; // 제거된 요소 반환
	}

	// 큐의 맨 앞 요소를 반환하는 메소드
	public String peek() {
		
		return this.list[0];
	}

	public int size() {

		return this.index;
	}

	void clear() {
		
		this.index = 0;
	}

	// 큐의 내부 배열 크기를 현재 요소 개수에 맞게 조절하는 메소드
	void trimToSize() {

		String[] temp = new String[this.index]; // 현재 요소 개수만큼의 배열 생성

		// 기존 배열의 요소들을 새 배열로 복사
		for (int i = 0; i < temp.length; i++) {
			temp[i] = this.list[i];
		}

		this.list = temp; // 큐의 내부 배열 참조 변경
	}
}
