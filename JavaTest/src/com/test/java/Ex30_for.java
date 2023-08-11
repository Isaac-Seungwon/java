package com.test.java;

public class Ex30_for {

	public static void main(String[] args) {
		
		// Ex30_for
		
		m1();
		m2();
		m3();
		m4();
		m5();
		
		// 다중 반복문을 잘 하려면 단일 반복문을 잘 해야 한다.
		
	}

	private static void m5() {

		// 별찍기

		for (int i = 0; i < 5; i++) { // 행 만들기
			for (int j = 0; j <= i; j++){ // 열 만들기
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}

	private static void m4() {

		// 루프: 분기문 개입(break, continue)
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				if (i == 5) {
					break; // 자신이 포함된 제어문을 탈출한다. (j루프 탈출)
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
		}
		
	}

	private static void m3() {

		// 상위 그룹: 강의실 (1강의실 ~ 6강의실)
		// 하위 그룹: 학생들 (30명)
		
		for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <= 30; j++) {
				
				System.out.printf("%d강의실의 %d번 학생\n", i, j);
				
			}
		}
		
	}

	private static void m2() {

		// 구구단 (2단 ~ 9단)
		
		for (int i = 1; i < 9; i++) {
			
			System.out.printf("%d단 입니다.\n", i);
			
			for (int j = 2; j <= 9; j++) {
				
				System.out.printf("%d x %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
		
	}

	// K&R
	public static void test(){
		
	}
	
	// Allman
	public static void test2() {
		
	}
	
	private static void m1() {
		
		// 모든 제어문은 중첩이 가능하다.
		
		// 중첩된 반복문
		// 이중 for문
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// System.out.println("실행문"); // 100회 실행
				System.out.printf("i: %d, j: %d\n", i, j); // 100회 실행
			}
		}
		
		
		// 3중 for문
		// 대회전 (시침)
		for (int i = 0; i < 10; i++) {
			
			// 중회전 (분침)
			for (int j = 0; j < 10; j++) {
				
				// 소회전 (초침)
				for (int k = 0; k < 10; k++) {
					
					// 실행문
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
					
				}
			}
		}
	}
}
