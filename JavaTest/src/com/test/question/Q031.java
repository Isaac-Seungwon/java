package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		
		● 입력
		숫자 입력: 3 
		숫자 입력: 2 
		숫자 입력: 7 
		숫자 입력: 1 
		숫자 입력: 8 
		
		● 출력
		짝수는 2개 홀수는 3개 입력했습니다.
		홀수가 짝수보다 1개 더 많습니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5]; // 입력할 숫자
		int odd;	// 홀수
		int even;	// 짝수
		
		
		// 변수 초기화
		odd = 0;
		even = 0;
		
		
		// 숫자 입력
		for (int i = 0; i < 5; i ++) {
			System.out.printf("숫자 입력: ");
			num[i] = scan.nextInt();
			
			if (num[i] % 2 == 0) {
				// 짝수
				even++;
			} else if (num[i] % 2 == 1) {
				// 홀수
				odd++; 
			}
		}
		
		
		// 홀수 짝수 개수 출력
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		
		
		// 홀수 짝수 개수 비교
		if (odd > even) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
		} else if (odd > even) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
		}
		
		scan.close();
	}
}
