package com.test.java;

import java.util.Scanner;

public class Ex29_for {

	public static void main(String[] args) {
		
		// Ex29_for
		// 제어문 > 조건문
		// 제어문 > 반복문
		
		/* 반복문
		- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
		- 생산성 향상 + 유지보수성 향상
		
		for문
		
		for (초기식; 조건식; 증감식){
			문장
		}
		- for의 소괄호 안에 문장을 3개를 넣을 수 있다.
		
		1. 초기식: 루프 변수(i)를 초기화한다.
		2. 조건식: 루프 지속 유무를 결정한다.
		3. 증감식: 루프 변수에 변화를 주는 역할을 한다. (언젠가 루프를 탈출할 수 있도록-false)
		
		 
		*/
		/*
		m1();
		m2();
		m3();
		m4();
		m5();
		//m6();
		m7();
		m8();
		m9();
		m10();
		m11();
		m13();
		m14();
		*/
		m15();
	} // main

	private static void m15() {

		// 난수 만들기, Random
		// - 임의의 수

		// 1. Math 클래스 > 대중화 방법(다른 언어)
		// 2. Random 클래스 > 자바에서만 이용하는 방법(훨씬 더 편하다)
	

		System.out.println(3.14);
		System.out.println(Math.PI);
		

		System.out.println(Math.abs(10)); // 절대값
		System.out.println(Math.abs(-10)); // 절대값
		
		
		// Returns a double value with a positive sign,
		// greaterthan or equal to 0.0 and less than 1.0.
		
		// 0.0 ~ 0.99999999999999
		// 실제 난수는 아니고, 유사 난수(난수에 가까운 값)이다.
		// 일련의 숫자를 미리 배치해 놓고, 그것을 순서대로 가져오는 작업을 한다.
		// 난수를 약간의 가공을 해서 쓸만한 값으로 바꾼다.
		
		// 가장 대중화된 난수 생성 방법
		for (int i = 0; i < 10; i++) {
			// System.out.println(Math.random());
			
			// 0 ~ 9 사이의 난수
			System.out.println((int)(Math.random() * 10));
			
			// 1 ~ 10 사이의 난수
			System.out.println((int)(Math.random() * 10) + 1);
			
			// 4 ~ 7 사이의 난수
			// 0 ~ 3 사이의 난수 + 4
			System.out.println((int)(Math.random() * 4) + 4);
		}
	}

	private static void m14() {

		// 빈 리턴문
		// 실제로 값을 돌려주지 않는 void이다.
		/// 값을 반환하는 목적이 아니라 메소드를 중단하는 역할을 한다.
		
		return;
	}

	// This method must return a result of type int
	// > 모든 경우의 수 > 반드시 return문이 존재
	private static int m13() {
		int num = 10;
		
		// 이 조건이 true일지 false일지 모른다.
		// 이 조건은 실행을 해봐야 아는 조건이다.
		// true일 때와 false일 때 모두 return문이 존재하므로 안정화가 된다.
		
		if(num % 2 == 0) {
			// break;
			return 10;
		}
		else {
			return 0;
		}
		
		// System.out.println(num);
	}

	private static void m11() {
		
		// 요구사항) 사용자의 숫자 입력을 누적하여 저장
		// 추가사항) 홀수만 입력할 수 있게 함 (짝수일 경우 종료)
		
		int sum = 0; // 누적 변수
		int num = 0; // 입력
		
		Scanner scan = new Scanner(System.in);
		
		// 회전 수를 예측하기 힘들 때 무한루프를 사용한다.
		for (;;) {
			
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) { // 짝수 입력시 종료
				break;
			}
			sum += num;
		}
		System.out.println(sum);
	}

	private static void m10() {
		
		// 학교 담임 선생님 > 학생 상담 > 1번 ~ 30번
		
		for(int i = 1; i<= 30; i++) {
			
			// 오늘은 15번 학생까지만 상담을 진행한다.
			if (i == 16) {
				break;
			}
			
			// 결석한 10번, 15번 학생은 건너뛴다.
			if (i == 10 || i == 15) {
				continue;
			}
			
			System.out.printf("%d번 학생 상담중..\n", i);
		}
		
	}

	private static void m9() {
		
		// break, continue
		// 다른 제어문과 함께 사용하며, 독립적인 사용이 불가능하다.
		// 반복문과 특히 많이 쓰인다.
		
		/*
		for (int i = 1; i <= 10; i++) {
			break;
			System.out.println(i);
		}
		*/
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				break; // 반복문을 탈출한다.
				// continue; // 반복문의 처음으로 돌아간다.
			}
			
			System.out.println(i);
		}
		// break는 자신이 속해 있는 제어문을 탈출하는 역할을 한다.
		// 하던 일을 멈추고 무조건 탈출을 한다. 여기서 오류가 나는 이유는 들어오자마자 탈출하기 때문에 도달할 수 없는 코드가 되었기 떄문이다.
		// 그래서 break문은 이렇게 사용할 수 없고, 조건문과 묶어서 사용한다.
		// break문은 if문을 인식하지 않는다. 때문에 break문이 if문 안에 있지만, for문을 탈출할 대상으로 인식한다.
		
	}

	private static void m8() {

		// 무한 루프, Infinite Loop
		// 1. 사용자의 실수 > 수정
		// 2. 사용자의 의도 > 어떻게?
		
		int num = Integer.MIN_VALUE;
		System.out.println(num);
		
		num--; // 언더플로우
		System.out.println(num);
		
		
		// 무한 루프(X) > 21억 바퀴
		/*
		for (int i = 0; i < 10; i--) {
			System.out.println(i);
		}
		*/
		
		// 무한 루프: 조건문을 true로 만들면 된다. (아무것도 적지 않아도 true) 보통은 안 적는다.
		/*
		for (int i = 0; true; i++) {
			System.out.println(i);
		}
		*/
		/*
		for (;;) {
			System.out.println("반복문");
		}
		*/
		
	}

	private static void m7() {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
		
		// 요구사항) 사용자가 원하는 단 출력
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사용자가 원하는 단: ");
		int dan = scan.nextInt();
		
		for(int i = 1; i<= 9; i++) {
			
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
			
		}
	}

	private static void m6() {
		
		// 요구사항) 사용자로부터 숫자10개를 입력받아 누적한 값은?
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; // 누적 변수
		int num;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("숫자: ");
			num = scan.nextInt();
			sum += num; // 사용자 입력 숫자 > 누적
		}
	}

	private static void m5() {
		
		// 요구사항) 1 ~ 사용자가 원하는 숫자까지의 합은?
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; // 누적 변수
		int num; // 입력할 숫자
		
		System.out.printf("숫자: ");
		num = scan.nextInt();
		
		// 몇 회전을 하는지는 컴파일할 때는 알 수 없고, 런타임 할 때는 알 수 있다.
		// -> 지연된다고 표현한다. (나중에 알게된다는 뜻)
		for (int i = 1; i <= num; i++) {
			sum += i;
			// System.out.println(sum);
		}
		
		System.out.printf("1 ~ %d = %d\n", num, sum);
		
	}

	private static void m4() {

		// 요구사항) 1 ~ 10 까지의 합 > 누적
		
		// 누적하기
		// - 누적 변수(반드시 초기화를 해야 한다!)
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
	
	}

	private static void m3() {

		// 반복문 > 루프 변수
		// 2. 루프 변수의 역할 > 회전수 or 값
		
		// 요구사항) 숫자 1 ~ 10 출력
		
		// 루프변수 > 회전수 or 값
		// for문은 수열 등을 표현할 때, 내가 원하는 숫자의 패턴 값을 수월하게 공급받기 위해 사용할 수 있다.
		
		// 1. 원하는 횟수 만큼 반복하는 목적
		// 2. 원하는 패턴대로 루프변수를 얻는 목적
		// 따라서 for문은 위의 두 가지 목적으로 사용한다는 것을 알 수 있다.
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}

	private static void m2() {

		// 반복문 > 회전수?
		// 반복문을 사용할 때 나에게 필요한 능력
		// 1. 반복문의 실행 횟수를 내가 제어할 수 있는가?
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("실행문");
		}
		System.out.println("");
		
		for (int i = 5; i <= 9; i++) {
			System.out.println("실행문");
		}
		System.out.println("");
		
		for (int i = 1; i <= 9; i = i + 2) {
			System.out.println("실행문");
		}
		System.out.println("");
		
		for (int i = 5; i > 0; i--) {
			System.out.println("실행문");
		}
		System.out.println("");
	}

	private static void m1() {

		// 요구사항) "안녕하세요" x 5회 출력
		
		// Case 1.
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println();
		
		
		// Case 2.
		hello();
		hello();
		hello();
		hello();
		hello();
		// 호출을 반복함으로써 출력하며, 수정하기 용이하다.
		
		
		// Case 3.
		for(int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요.");
		}
		/*
		1. 초기식: 메모리에 i라는 변수를 만들고 1로 초기화한다.
		2. 조건식: i가 3보다 작거나 같은지 검사한다.
		3. 문장: 블럭(문장)을 실행한다.
		4. 증감식: i에 1을 더해 저장한다.
		*/
	}
	
	public static void hello() {
		System.out.println("안녕하세요.");
	}
}
