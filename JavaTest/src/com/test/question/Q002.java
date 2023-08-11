package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		/*
		● 요구사항
		숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		
		● 조건
		- 출력 숫자에 천단위 표기 하시오.
		- 결과값은 소수 이하 1자리까지 표기 하시오.
		
		● 입력
		첫번째 숫자: 5
		두번째 숫자: 3
		
		● 출력
		5 + 3 = 8
		5 - 3 = 2
		5 * 3 = 15
		5 / 3 = 1.7
		5 % 3 = 2
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		double num1, num2; // 입력한 숫자 저장
		
		// 첫 번째 숫자 입력
		System.out.printf("첫번째 숫자: ");
		num1 = scan.nextDouble();
		
		// 두 번째 숫자 입력
		System.out.printf("두번째 숫자: ");
		num2 = scan.nextDouble();
		
		// 연산 결과 출력
		System.out.printf("%,.1f + %,.1f = %,.1f\n", num1, num2, num1 + num2);
		System.out.printf("%,.1f - %,.1f = %,.1f\n", num1, num2, num1 - num2);
		System.out.printf("%,.1f * %,.1f = %,.1f\n", num1, num2, num1 * num2);
		System.out.printf("%,.1f / %,.1f = %,.1f\n", num1, num2, num1 / num2);
		System.out.printf("%,.1f %% %,.1f = %,.1f\n", num1, num2, num1 = num2);
		
		scan.close();
	}
}
