package com.test.question;

public class Q054 {
	public static void main(String[] args) {
		/*
		● 요구사항
		2부터 100사이의 소수를 구하시오.
		
		● 조건
		- 소수: 1과 자기자신으로밖에 나눠지지 않는 수
		
		● 출력
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
		*/
		
		boolean isMinority = false; // 소수 판별
		
		// 2부터 100사이의 수
		for (int i = 2; i <= 100; i++) {
			
			// isMinority 초기화
			isMinority = false;
			
			// 소수 판별
			for (int j = 2; j < 10; j++) {
				if (i != j && i % j == 0) {
					isMinority = true;
				}
			}
			
			// 소수 출력
			if (isMinority == false) {
				System.out.printf("%d, ", i);
			}
		}
	}
}
