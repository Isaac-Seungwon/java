package com.test.question;

public class Q077 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		1	2	4	7	11
		3	5	8	12	16
		6	9	13	17	20
		10	14	18	21	23
		15	19	22	24	25
		*/
		
		int[][] nums = new int[5][5];
	    int n = 1;
		
	    // 데이터 입력
        for (int k = 0; k <= 8; k++) {
            for (int i = 0; i <= k; i++) {
                int j = k - i;
                if (i < 5 && j < 5) {
                    nums[i][j] = n++;
                }
            }
        }

        // 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", nums[i][j]);
            }
            System.out.println();
        }
    }
}