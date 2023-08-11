package com.test.question;

public class Q059 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 조건
		- 마지막 숫자가 100이 넘기 전까지 출력하시오.
		
		● 출력
		1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
		*/
		
		int stac = 0; // 1, 2, 3, 4, 5...
		int sum = 1;  // 스택의 누적 합계
		int result = 1; // 누적 합계
		boolean loop = true; // 루프 변수
		
		while (loop) {
			// 스택의 누적 합계 출력
			System.out.printf("%d + ", sum);
			
			stac++;
			sum += stac;

			// 스택의 누적 합계의 숫자가 100이 넘는지 검증
			if (sum > 100) {
				loop = false;
			}
			else {
				result += sum;
			}
		}

		// 누적 합계 출력
		System.out.printf(" = %d", result);
		
		/*
		// 1 + 2 + 4 + 8 + 16 + 32 + 64 + 128 +
		for (int i = 1; i < 200; i++) {
			if (i == sum) {
				sum = sum + i;
				System.out.printf("%d + ", i);
			}
		}
		*/
	}
}
