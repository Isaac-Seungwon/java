package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {

	public static void main(String[] args) {
		// 예외 미루기: 진짜 예외가 나면 프로그램이 뻑이 난다. 그래서 main메소드마저 예외를 미뤄버리면 처리할 수가 없다.
		// 그래서 절대로 main메소드에서는 throws Exception를 하지 않는다.
		
		// Ex59_Exception.java
	
		/*
			예외, Exception
			- 런타임 오류
			- 컴파일 발견(X) > 실행 중 발견(O)
			- 개발자 미리 예측(O) or 예측(X)
			
			
			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용 (조건문)
			
				if (조건) {
					참 > 실행
				} else{
					거짓 > 실행
				}
		
			2. 전용 방식
				- try catch finally 문 사용
			
		*/
		
//		m1();
//		m2();
//		m3();
//		m4();
		try {
			m5();
		} catch (Exception e) {
			
		}
		m6();
		
		
		try {
			int num = 0;
			System.out.println(100 / num);
		} catch (Exception e) {
			
		}
		
		try {
			
		} catch (Exception e) {
			System.out.println("at Ex59_Exception.main");
			e.printStackTrace();
		}
		
	}// main

	private static void m6() {

		// 예외 던지기
		
		// 요구사항) 숫자 입력 > 처리
		// 조건) 반드시 짝수만 입력
		//				홀수 입력> 에러 처리
		
		int num = 10;
		
		if (num % 2 == 0) {
			System.out.println("업무 진행..");
		} else {
			System.out.println("예외 처리..");
		}
		
		// try 구현
		try {
			if (num % 2 == 1) {
				throw new Exception(); // 예외 던지기 (s가 없으니 주의)
				// 이 구문을 만나는 순간 자바는 냅다 catch 절로 이동한다.
			}
			System.out.println("업무 진행..");
		} catch (Exception e) {
			System.out.println("예외 처리..");
			System.out.println(e.getMessage());
		}
		
	}

private static void m5() throws Exception {

	// 예외 미루기 throws Exception
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
//		try {
//			String input = reader.readLine();
//		} catch (Exception e){
//			
//		}
	
	
}

	private static void m3() {
		// Surround With > try/catch Block
		
		// 0으로 나누기 > ArithmeticException
		try {
			int num = 10;
			System.out.println(100 / num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 배열 첨자 > ArrayIndexOutOfBoundsException
		
		try {
			int[] nums = new int[3];
			nums[5] = 10;
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		// 널참조 > NullPointerException
		try {
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
private static void m4() {
	// try catch 구문을 한 번에 묶는다. > 다중 캐치문
	try {
		
		// 0으로 나누기 > ArithmeticException
		int num = 10;
		System.out.println(100 / num);
		
		// 배열 첨자 > ArrayIndexOutOfBoundsException // ArrayIndexOutOfBoundsException를 휙 던져서 catch 절에서 해당하는 게 있는지 확인한다. 공을 던지면 -> catch절에서 잡는다
		int[] nums = new int[3];
		nums[0] = 10;
				
		// 널참조 > NullPointerException
		Scanner scan = null;
		scan.nextLine();
		
		// 예측 가능한 에러들
	} catch (ArithmeticException e) {
		
		System.out.println("0으로 나누기");
		
	} catch (ArrayIndexOutOfBoundsException e) {
		
		System.out.println("배열 첨자");
		
	} catch (NullPointerException e) {
		
		System.out.println("널참조");
		
	} catch (Exception e) {
		
		// 우리가 미리 준비하지 못한 예외처리가 발생한 경우 (공이 마지막 사람에게 옴)
		// 이 세상의 모든 공을 다 받을 수 있는 사람이다. if문으로 치면 else 절로 볼 수 있다.
		// 자세한 예외처리는 못 해도 두루뭉실한 예외처리가 가능하다.
		// 마지막의 이 캐치절은 위에 올라가면 안 된다. 모든 공을 잡기 때문에 아래로 내려갈 수 없기 때문이다.
		System.out.println("예외 처리");
		
	}
}

	private static void m2() {
		
		
		int num = 10;
		
		try { 
			// 비즈니스 영역
			System.out.println(100 / num);
		} catch (Exception e) {
			// 예외처리 영역
			System.out.println("예외 처리");
		} finally {
			// 마무리 영역 > 무조건 실행되는 블럭 > 뒷수습
			// - 예외와 상관없이 항상 실행해야 하는 코드 블럭
			System.out.println("마지막");
			
			// test.txt 파일 닫기
		}
		
		// try를 실행한 뒤에 finally를 실행하고 종료한다. 비즈니스 영역을 실행하던 중에 오류가 나면 예외처리 영역을 실행하고 마무리 영역이 실행된다.
		// 마무리 영역은 에러가 나던 안 나던 무조건 실행되며, 예외와 상관없이 항상 실행해야 하는 코드가 있을 경우 작성한다.
	}

	private static void m1() {

		// 요구사항) 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		// 권장 > 비즈니스 코드는 참일 때 많이 한다.
		if (num != 0) {
			// 비즈니스 코드 (업무 코드) > 원래 목적
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {
			System.out.println("0을 입력하지 마십시오.");
		}
		
		// 비권장 > 가독성
		if (num == 0) {
			System.out.println("0을 입력하지 마십시오.");
		} else {
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		}
		
		
		// if문 vs try문
		// - if문: 사전에 미리 검사를 해서 사고가 안 나게 처리한다.
		// - try문: 일단 실행하고 감시한다. 그리고 사고가 터지면 그 때 뒷수습을 한다.
		
		
		// try 영역 > 감시!! (CCTV) > 예외가 발생하는지 감시!
		try {
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(2);
		} catch (Exception e) { // 예외 처리 구문
			System.out.println("0을 입력하지 마십시오.");
			
			// Exception e
			// - 예외 객체
			// - 예외의 상황을 전달
			System.out.println(e.getMessage()); // / by zero
		}
		
		System.out.println("종료");
	}

}// class




