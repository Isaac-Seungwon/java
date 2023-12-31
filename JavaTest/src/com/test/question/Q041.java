package com.test.question;

public class Q041 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 조건
		- 누적값이 1000을 넘어가는 순간 루프를 종료하시오.
		
		● 출력
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 
		+ 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22
		+ 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 + 32 + 33 + 34
		+ 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43 + 44 + 45 = 1035
		*/
		
		int sum = 0; // 누적 합계
		
		for (int i = 1;; i++) {
			sum = sum + i;
			System.out.printf("%d %s ", i, sum > 1000 ? "=" : "+");
			
			// 누적 합계가 1000을 넘으면 종료
			if (sum > 1000) {
				// 누적 합계 출력
				System.out.printf("%d", sum);
				break;
			}
		}
	}
}
