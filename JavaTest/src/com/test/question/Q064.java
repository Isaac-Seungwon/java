package com.test.question;

public class Q064 {
	public static void main(String[] args) {
		/*
		● 요구사항
		1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		
		● 조건
		- 난수를 20개 발생 후 배열에 넣는다.
		- 난수는 1 ~ 20 사이
		
		● 출력
		원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
		최댓값: 18
		최솟값: 3
		*/
		
		int[] randomList = new int [20]; // 난수 20개
		int max = 0;	// 최댓값
		int min = 20;	// 최솟값
		
		// 난수 20개 값 할당 (1~20)
		for (int i = 0; i < randomList.length; i++) {
			randomList[i] = (int)(Math.random() * 20) + 1;
			
			// 최댓값 연산
			if (max < randomList[i]) {
				max = randomList[i];
			}
			// 최솟값 연산
			if (min > randomList[i]) {
				min = randomList[i];
			}
		}
		
		// 원본 출력
		System.out.print("원본: ");
		for (int i = 0; i < randomList.length; i++) {
			System.out.printf("%d, ", randomList[i]);
		}
		
		// 최댓값, 최솟값 출력
		System.out.printf("\n최댓값: %d\n", max);
		System.out.printf("최솟값: %d\n", min);
	}
}
