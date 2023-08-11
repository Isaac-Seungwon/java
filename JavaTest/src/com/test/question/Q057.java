package com.test.question;

public class Q057 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		1 ~  10:   55
		1 ~  20:  210
		1 ~  30:  465
		1 ~  40:  820
		1 ~  50: 1275
		1 ~  60: 1830
		1 ~  70: 2485
		1 ~  80: 3240
		1 ~  90: 4095
		1 ~ 100: 5050
		*/
		
		int sum = 0; // 누적 합계
		int j; // j는 출력해야 하므로 main메소드의 지역변수로 선언
		
		// 실행을 10번 반복
		for (int i = 1; i <= 10; i++) {
			sum = 0; // 합계 초기화
			
			for (j = 1; j <= 10 * i; j++) {
				sum = sum + j;
			}

			// 출력
			System.out.printf("1 ~ %3d: %4d\n", j - 1, sum);
		}
	}
}
