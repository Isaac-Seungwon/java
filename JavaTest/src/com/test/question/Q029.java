package com.test.question;

import java.util.Scanner;

public class Q029 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		
		● 조건
		- 정수만 입력하시오.(유효성 검사 필요없음)
		- 나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
		- 연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
		
		● 입력 1
		첫번째 숫자: 5 
		두번째 숫자: 3 
		연산자: * 
		
		● 출력 1
		5 * 3 = 15
		
		● 입력 2
		첫번째 숫자: 10 
		두번째 숫자: 3 
		연산자: / 
		
		● 출력 2
		10 / 3 = 3.3
		
		● 입력 2
		첫번째 숫자: 3 
		두번째 숫자: 2 
		연산자: >= 
		
		● 출력 2
		연산이 불가능합니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2; // 입력할 숫자 2개
		char operator; // 연산자
		double result; // 연산 결과 값
		
		// 첫 번째 숫자 입력
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		
		// 두 번째 숫자 입력
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		
		// 개행 문자 제거
		// scan.skip("\r\n"); // 버퍼 비우기
        scan.nextLine();
		/*
		● java.lang.StringIndexOutOfBoundsException"
		
		● 오류 원인
		입력 받는 과정에서 문자열의 길이를 벗어난 인덱스에 접근
		
		● 발생 과정
		nextInt() 메소드를 이용해 정수를 입력받은 후에 nextLine() 메소드를 호출하면,
		입력 버퍼에는 아직 엔터키('\n')에 해당하는 개행 문자가 남아 있다.	
		따라서 nextLine()은 개행 문자를 읽어와서 바로 넘어가게 되는데,
		이때 입력 버퍼에 있는 개행 문자가 charAt(0)에 의해 읽히게 되면서 StringIndexOutOfBoundsException 오류가 발생한다.
		즉, 실제로는 연산자 문자를 입력받을 시기에 charAt(0)에서 예외가 발생하는 것이다.
		
		● 해결 방법
		nextInt() 이후의 개행 문자를 소비하는 코드를 추가해야 한다.
		이를 위해 scan.nextLine()을 한 번 더 호출하여 입력 버퍼에 남은 개행 문자를 제거해줄 수 있다.
		*/
        
		// 연산자 입력
		System.out.print("연산자 : ");
		operator = scan.nextLine().charAt(0);

		// 연산 및 연산 결과 출력
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%')
		{
			System.out.printf("%d %c %d = ", num1, operator, num2);
			
			if (operator == '+') {
				System.out.printf("%.1f", (double)num1 + num2);
			} else if (operator == '-') {
				System.out.printf("%.1f", (double)num1 - num2);
			} else if (operator == '*') {
				System.out.printf("%.1f", (double)num1 * num2);
			} else if (operator == '/') {
				System.out.printf("%.1f", (double)num1 / num2);
			} else if (operator == '%') {
				System.out.printf("%.1f", (double)num1 % num2);
			}
		}
		else {
			// 예외 처리
			System.out.println("연산이 불가능합니다.");
		}
		
		scan.close();
	}
}
