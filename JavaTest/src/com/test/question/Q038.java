package com.test.question;

import java.util.Scanner;

public class Q038 {
	public static void main(String[] args) {
		/*
		● 요구사항
		입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		
		● 입력
		입력 횟수: 10 
		숫자: 5 
		숫자: 2 
		숫자: 12 
		숫자: 3 
		숫자: 11 
		숫자: 8 
		숫자: 1 
		숫자: 7 
		숫자: 23 
		숫자: 10 
		
		● 출력
		짝수 4개의 합: 32
		홀수 6개의 합: 50
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int sumOdd = 0;		// 홀수 합계
		int sumEven = 0;	// 짝수 합계
		int numOdd = 0;
		
		int n;		// 입력 횟수
		int num;	// 입력한 숫자
		
		
		// 입력할 숫자 개수 입력
		System.out.printf("입력 횟수: ");
		n = scan.nextInt();
		
		
		// 숫자 입력, 짝수 홀수 검증
		for (int i = 0; i < n; i++) {
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				sumEven = sumEven + num;
			}
			else {
				sumOdd = sumOdd + num;
				numOdd++;
			}
		}
		
		
		// 짝수, 홀수의 개수와 합 출력
		System.out.printf("짝수 %d개의 합: %d\n", n - numOdd, sumEven);
		System.out.printf("홀수 %d개의 합: %d", numOdd, sumOdd);
		
		scan.close();
	}
}
