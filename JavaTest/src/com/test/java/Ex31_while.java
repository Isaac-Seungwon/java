package com.test.java;

import java.util.Scanner;

public class Ex31_while {

	public static void main(String[] args) {
		
		// Ex31_while
		
		/*
		반복분
		1. for문
		
		2. while문
		
		3. do while문
		
		4. for문(foreach)
		
		
		while (조건식) {
			문장
		}
		
		while은 조건식을 만족하면 다시 올라가 실행하며, if를 반복하는 구조라고 생각하면 편하다.
		
		
		do {
			문장;
		} while (조건식);
		
		while문은 선조건 후조건인 반면, do while문은 선실행 후조건이다.
		do while문을 이용하는 작업이 많이 없기 때문에 자연스럽게 도태되었다.
		*/

		// 리팩토링: 프로그램의 결과의 변경 없이 코드의 구조를 재조정하는 행동
		// 목적: 가독성을 높이거나 유지보수를 편하게 하기 위해 사용하며, 버그를 없애거나 기능을 개선하는 행위가 아니다.
		// 프로그램을 다 짜고 나면 더 잘 하는 사람들이 보기 좋게 재정비하는 경우가 있다.
		// Refactor > Extract Method
		
		m1();
		m2();
		m3();
	}

	private static void m3() {

		// 콘솔 > UI
		// 자판기
		// 1. 메뉴 출력
		// 2. 선택
		// 3. 결과
		// 1 ~ 3 반복
		
		Scanner scan = new Scanner(System.in);
		
		int sel = 0; // 사용자 선택 메뉴 번호
		boolean loop = true; // 반복 조건 > 루프 변수
		
		// 반복문에는 상수를 집어 넣는 것보다 변수를 넣는 게 좋다.
		while (loop) {
			
			System.out.println("============");
			System.out.println("   자판기");
			System.out.println("============");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 커피");
			System.out.println("4. 종료");
			System.out.println("------------");
			System.out.println("선택(번호):");
			
			sel = scan.nextInt();
			scan.skip("\r\n"); // 엔터 버림
			
			if (sel == 1) {
				// 콜라
				m1(scan);
			}
			else if (sel == 2) {
				// 사이다
				m2(scan);
			}
			else if (sel == 3) {
				// 커피
				m3(scan);
			}
			else {
				// 루프 종료
				loop = false;
			}
		}
	}

	private static void m3(Scanner scan) {
		System.out.println("커피");
		pause(scan);
	}

	private static void m2(Scanner scan) {
		System.out.println("사이다");
		pause(scan);
	}

	private static void m1(Scanner scan) {
		System.out.println("콜라");
		pause(scan);
	}

	private static void pause(Scanner scan) {
		// 일시 정지
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();
	}

	private static void m2() {
		
		int num = 1;
		
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		
		num = 1;
		
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
	}

	private static void m1() {

		// 요구사항) 1 ~ 10까지 출력하시오.
		
		for (int i = 1; i <=10; i++) { // 초기식, 조건식, 증감식
			System.out.println(i);
		}
		System.out.println();
		
		
		int num = 1; // 초기식
		while (num < 10) { // 조건식
			System.out.println(num);
			num++; // 증감식
		}
		// 따지자면 for문과 while문은 같다.
		// while도 초기식과 증감식을 필요로 하기 때문이다.
		// for문은 양식이 정해진 딱딱한 코드라고 하면, while문은 그보다 유연한 코드라고 할 수 있다.
	}
}
