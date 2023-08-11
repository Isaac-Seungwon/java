package com.test.question;

import java.util.Scanner;

public class Q048 {
	public static void main(String[] args) {
		/*
		● 요구사항
		최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		
		● 조건
		- int 양수만 입력하시오.
		
		● 입력
		숫자 입력: 273645281
		
		● 출력
		짝수의 합: 26
		홀수의 합: 12
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num; // 최대 9자리 정수
		int even = 0;	// 짝수의 합
		int odd = 0;	// 홀수의 합
		
		System.out.printf("숫자 입력: ");
		num = scan.nextInt();
		
		if (num <= 0 && num > 999999999) {
			System.out.println("잘못된 범위입니다.");
		}
		else {
			odd += num % 10;
			even += num / 10 % 10;
			odd += num / 100 % 10;
			even += num / 1000 % 10;
			odd += num / 10000 % 10;
			even += num / 100000 % 10;
			odd += num / 1000000 % 10;
			even += num / 10000000 % 10;
			odd += num / 100000000 % 10;
	
			System.out.printf("짝수의 합: %d\n", even);
			System.out.printf("홀수의 합: %d\n", odd);
		}
		
		scan.close();
		
		/*
		System.out.printf("%d\n", num);
		System.out.printf("%d\n", num % 10);
		System.out.printf("%d\n", num / 10 % 10);
		System.out.printf("%d\n", num / 100 % 10);
		System.out.printf("%d\n", num / 1000 % 10);
		System.out.printf("%d\n", num / 10000 % 10);
		System.out.printf("%d\n", num / 100000 % 10);
		System.out.printf("%d\n", num / 1000000 % 10);
		System.out.printf("%d\n", num / 10000000 % 10);
		System.out.printf("%d\n", num / 100000000 % 10);
		
		odd = odd + num % 10;
			even = even + num / 10 % 10;
			odd = odd + num / 100 % 10;
			even = even + num / 1000 % 10;
			odd = odd + num / 10000 % 10;
			even = even + num / 100000 % 10;
			odd = odd + num / 1000000 % 10;
			even = even + num / 10000000 % 10;
			odd = odd + num / 100000000 % 10;
		*/
	}
}
