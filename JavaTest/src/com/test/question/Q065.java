package com.test.question;

import java.util.Scanner;

public class Q065 {
	public static void main(String[] args) {
		/*
		● 요구사항
		난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		
		● 조건
		- 난수를 20개 발생 후 배열에 넣는다.
		- 난수는 1 ~ 20 사이
		- 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		
		● 입력
		최대 범위: 15 
		최소 범위: 5 
		
		● 출력
		원본: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
		결과: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] randomList = new int [20]; // 난수 20개
		int maxRange; // 최대 범위
		int minRange; // 최소 범위
		
		// 난수 20개 값 할당 (1~20)
		for (int i = 0; i < randomList.length; i++) {
			randomList[i] = (int)(Math.random() * 20) + 1;
		}
		
		// 최대 범위 입력
		System.out.printf("최대 범위: ");
		maxRange = scan.nextInt();
		
		// 최소 범위 입력
		System.out.printf("최소 범위: ");
		minRange = scan.nextInt();
		
		// 원본 출력
		System.out.print("원본: ");
		for (int i = 0; i < randomList.length; i++) {
			System.out.printf("%d, ", randomList[i]);
		}
		
		// 결과 출력
		System.out.print("\n결과: ");
		for (int i = 0; i < randomList.length; i++) {
			if (randomList[i] <= maxRange && randomList[i] >= minRange) {
				System.out.printf("%d, ", randomList[i]);
			}
		}
		
		scan.close();
	}
}
