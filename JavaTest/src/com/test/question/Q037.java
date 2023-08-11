package com.test.question;

import java.util.Scanner;

public class Q037 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
		
		● 입력 1
		숫자: 5 
		
		● 출력 1
		1 ~ 5 = 15
		
		● 입력 2
		숫자: 10  
		
		● 출력 2
		1 ~ 10 = 55
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num; // 입력한 숫자
		int sum = 0; // 누적 합계
		
		System.out.printf("숫자: ");
		num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.printf("%d ~ %d = %d", 1, num, sum);
		
		scan.close();
	}
}
