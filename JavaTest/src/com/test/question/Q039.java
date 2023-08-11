package com.test.question;

import java.util.Scanner;

public class Q039 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 입력
		시작 숫자: 1 
		종료 숫자: 10 
		
		● 출력
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int startNum; // 시작 숫자
		int endNum; // 종료 숫자
		int sum = 0; // 누적 합계
		
		
		// 시작, 종료 숫자 입력
		System.out.printf("시작 숫자: ");
		startNum = scan.nextInt();

		System.out.printf("종료 숫자: ");
		endNum = scan.nextInt();
		
		
		// startNum ~ endNum까지의 합계 출력
		for (int i = startNum; i <= endNum; i++) {
			System.out.printf("%d %s ", i, i == endNum ? "=" : "+");
			sum = sum + i;
		}
		
		// 누적 합계 출력
		System.out.printf("%d", sum);
		
		scan.close();
	}
}
