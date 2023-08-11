package com.test.question;

public class Q071 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		25	24	23	22	21
		20	19	18	17	16
		15	14	13	12	11
		10	9	8	7	6
		5	4	3	2	1
		*/
		
		int[][] nums = new int[5][5];
		
		// 데이터 입력 > 문제
		int n = 1;
		
		for (int i=4; i>=0; i--) {
			for (int j=4; j>=0; j--) {
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
