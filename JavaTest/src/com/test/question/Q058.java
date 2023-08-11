package com.test.question;

public class Q058 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		 1 ~  10:  55
		11 ~  20: 155
		21 ~  30: 255
		31 ~  40: 355
		41 ~  50: 455
		51 ~  60: 555
		61 ~  70: 655
		71 ~  80: 755
		81 ~  90: 855
		91 ~ 100: 955
		*/
		
		int sum = 0; // 누적 합계
		int j; // j는 출력해야 하므로 main메소드의 지역변수로 선언
		
		// 실행을 10번 반복
		for (int i = 1; i <= 100; i+= 10) {
			sum = 0; // 합계 초기화
			
			for (j = i; j < i + 10; j++) {
				sum = sum + j;
			}

			// 출력
			System.out.printf("%2d ~ %3d: %3d\n", i, j - 1, sum);
		}
	}
}
