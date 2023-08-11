package com.test.question;

import java.util.Scanner;

public class Q082 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
		
		● 입력
		숫자: 314 
		
		● 출력
		결과: 3 + 1 + 4 = 8
		*/

		Scanner scan = new Scanner(System.in);

		String num; // 숫자 입력
		int sum = 0; // 누적 합계

		// 숫자 입력
		System.out.printf("숫자: ");
		num = scan.nextLine();

		// 첫 번째 자릿수 처리
		int firstDigit = Integer.parseInt(num.substring(0, 1));
		sum += firstDigit;

		// 나머지 자릿수 합 계산
		for (int i = 1; i < num.length(); i++) {
			String digitStr = num.substring(i, i + 1);
			int digit = Integer.parseInt(digitStr);

			// 누적 합계
			sum += digit;
		}

		// 결과 출력
		System.out.print("결과: " + num.charAt(0));
		for (int i = 1; i < num.length(); i++) {
			System.out.print(" + " + num.charAt(i));
		}
		System.out.println(" = " + sum);

		scan.close();
	}
}
