package com.test.java;

import java.util.Scanner;

public class Ex27_if {

	public static void main(String[] args) {
		
		// Ex27_if
		
		/*
		제어문
		- 수많은 명령어들의 흐름(실행 순서)을 통제하는 수단이다.
		- 내가 원하는 흐름을 만들기 위해 분기점을 만들 수 있다.
		- 제어문의 종류로는 크게 조건 제어, 반복 제어, 분기 제어가 있다.
	
		1. 조건문
			- 개발자가 조건을 제시한 후 조건의 결과에 따라 흐름을 제어할 수 있다.
			a. if
			b. switch
			
		2. 반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어할 수 있다.
			a. for
			b. while
			c. do while
			d. for(for each), 향상된 for문(Enhanced for statement))
			
		3. 분기문
			- 개발자가 코드의 흐름을 원하는 곳으로 이동할 수 있다.
			a. break
			b. continue
			c. goto (가독성을 떨어트린다는 이유로 JDK 1.5 때 폐기되었다.)
			
		 */
		
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
	}

	private static void m6() {

		/*
			조건식
			- 조건식은 반드시 boolean을 가진다. (자바에 해당)
			- 자바는 C계열 언어이다.
			- 정수: 0(false), 1(true), 0이 아닌 모든 정수(true) - 있다 없다로 판단
			- 실수: 0.0(false), 0이 아닌 모든 실수(true)
			- 문자: \0(null 문자)(false), 그 이외에는 모두 true
			- 문자열: ""(빈문자열)(false), 그 이외에는 모두 true
			
			- C언어는 boolean 자료형이 없어서 if문에서 정수(1, 0)을 사용했다.
		*/
	}

	private static void m5() {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; // 누적 변수
		
		System.out.println("A. 어떤 개발툴을 선호합니까?");
		System.out.println("1. 메모장");	// +3
		System.out.println("2. 이클립스");	// +5
		System.out.println("3. 인텔리제이");// +7
		System.out.print("선택: ");
		
		int input = scan.nextInt();
		
		if (input == 1) {
			sum = sum + 3;
		} else if (input == 2) {
			sum = sum + 5;
		} else if (input == 3) {
			sum = sum + 7;
		}
		
		
		System.out.println("B. 어떤 프로그래밍 언어를 선호합니까?");
		System.out.println("1. Java");
		System.out.println("2. C#");
		System.out.println("3. Python");
		System.out.print("선택: ");
		
		input = scan.nextInt();
		
		if (input == 1) {
			sum = sum + 3;
		} else if (input == 2) {
			sum = sum + 5;
		} else if (input == 3) {
			sum = sum + 7;
		}
		
		System.out.println("완료되었습니다.");
		System.out.println("[결과]");
		
		if (sum > 10) {
			System.out.println("당신은 진취적인 개발자입니다.");
		} else if (sum > 5) {	// sum <= 10 && sum > 5
			System.out.println("당신은 평범한 개발자입니다.");
		} else { // sum >= 0 && sum <= 5
			System.out.println("당신은 개발자로서 적합하지 않습니다.");
		}
		
	}

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		// 쇼핑몰 > 의류 > 색상 선택

		System.out.print("색상 입력: ");
		
		String color = scan.nextLine();
		
		// color == "빨강" X 문자열의 비교는 =equal을 쓸 수 없다. 메소드를 써야 가능.
		if (color.equals("빨강")) {
			System.out.println("15,000원 입니다.");
		} else if (color.equals("파랑")) {
			System.out.println("15,000원 입니다.");
		} else if (color.equals("노랑")) {
			System.out.println("20,000원 입니다.");
		} else {
			System.out.println("재고가 없습니다.");
		}
		
		if (color.equals("빨강") || color.equals("파랑")) {
			System.out.println("15,000원 입니다.");
		} else if (color.equals("노랑")) {
			System.out.println("20,000원 입니다.");
		} else {
			System.out.println("재고가 없습니다.");
		}
		// 가격이 15000원으로 결과가 동일한 "빨강"과 "파랑"의 조건을 OR로 묶어주었다.
		// 블럭의 성질이 같을 경우 조건을 묶어주는 것이 좋다.
		
		
		// 조건문 중첩, Nested if문
		if (color.equals("빨강")
				|| color.equals("파랑")
				|| color.equals("노랑")) {
			
			if (color.equals("빨강") || color.equals("파랑")) {
				System.out.println("15,000원 입니다.");
			} else if (color.equals("노랑")) {
				System.out.println("20,000원 입니다.");
			}
		} else {
			System.out.println("재고가 없습니다.");
		}
	}

	private static void m3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("기상 시간(시): ");
		
		int hour = scan.nextInt();
		
		// 일어난 시간이 6시 전일 경우
		if (hour < 6) {
			System.out.println("지하철을 타고 출근합니다.");
		} else if (hour >= 6 && hour < 7) {
			System.out.println("버스를 타고 출근합니다.");
		} else if (hour >= 7 && hour < 8) {
			System.out.println("택시를 타고 출근합니다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		// 조건에 교집합이 생겨서 중첩이 되지 않도록 해야 한다.
		
		
		if (hour < 6) {
			System.out.println("지하철을 타고 출근합니다.");
		} else if (hour < 7) {
			System.out.println("버스를 타고 출근합니다.");
		} else if (hour < 8) {
			System.out.println("택시를 타고 출근합니다.");
		} else {
			System.out.println("병가를 낸다.");
		}
		// 조건문을 위에서부터 실행하기 때문에, else if의 조건문인 hour < 7 일 때에만 System.out.println("버스를 타고 출근합니다."); 코드를 실행하는 게 아니다.
		// else if (hour < 7)와 if (hour < 6) 둘 다 만족해야 한다.
	}

	private static void m2() {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이: ");
		
		int age = scan.nextInt();
		
		String result = "";
		
		result = (age >= 18) ? "성인" : "미성년자";
		System.out.println(result);
		
		if (age >= 18) {
			result = "성인";
		} else {
			result = "미성년자";
		}
	}

	private static void m1() {

		/*
		if문
		if (조건식) {
			문장;
		} else if (조건식) {
			문장;
		} else {
			문장;
		}
		
		- 개발자가 조건(boolean)을 제시한다는 의미이며, 결과에 따라 흐름을 제어하게 된다.
		- 제어문은 문장 종결자를 사용하지 않는다. { } 블럭이 문장 종결자를 대신하며, if의 body이다.
		- 선언부와 구현부로 구분되며, 조건식은 boolean을 가지는 표현식이 오면 된다.
		- if와 else는 두 블럭의 성질이 다르다. if는 조건이 참일 때 실행하는 블럭이고, else는 거짓일 때 실행하는 블럭이다. 이는 앞면과 뒷면이라고 생각하면 된다.
		
		*/

		// Dead Code
		if (true) {
			System.out.println("참");
		}
		if (false) {
			System.out.println("거짓");
		}
		// 조건식의 결과가 false일 경우 바깥으로 빠져나가는데, 이 경우 실행을 못 하고 끝나버리기 때문에 죽은 코드이다.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("숫자: ");
		int num = scan.nextInt();

		// 다중 조건문 / 다중 if문
		if (num > 0) {
			System.out.printf("입력한 %d는(은) 양수입니다.\n", num);
		} else if (num < 0 ) {
			System.out.printf("입력한 %d는(은) 음수입니다.\n", num);
		} else if (num == 0 ) {
			System.out.printf("입력한 %d는(은) 0입니다.\n", num);
		}
		
		/*
		if (조건문) {
			문장;
		}
		[else if (조건문) {]
				문장;
		}] x N
		[ else {]
				문장;
		}]
		*/	
		// 대괄호로 묶인 것은 쓰고 싶으면 써도 되고, 안 쓰고 싶으면 생략해도 된다는 의미이다.
	}
	
	
	
}
