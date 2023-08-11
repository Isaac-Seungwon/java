package com.test.question;

public class Q072 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.

		● 출력
		1	6	11	16	21
		2	7	12	17	22
		3	8	13	18	23
		4	9	14	19	24
		5	10	15	20	25
		*/
		
		int[][] nums = new int[5][5];
		
		// 데이터 입력 > 문제
		int n = 1;
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				nums[j][i] = n;
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
