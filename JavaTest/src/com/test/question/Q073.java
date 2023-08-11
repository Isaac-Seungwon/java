package com.test.question;

public class Q073 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		1	2	3	4	5
		6	7	8	9	0
		10	11	12	0	0
		13	14	0	0	0
		15	0	0	0	0
		*/
		
		int[][] nums = new int[5][5];

		// 데이터 입력 > 문제
		int n = 1;

		for (int i=0; i<5; i++) {
			for (int j=0; j<5-i; j++) {
				nums[i][j] = n;
				n++;
			}
		}

		// 출력 > 수정 없이 그대로 사용
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
