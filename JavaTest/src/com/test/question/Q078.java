package com.test.question;

public class Q078 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		1	2	3	4	5
		16	17	18	19	6
		15	24	25	20	7
		14	23	22	21	8
		13	12	11	10	9
		
		달팽이 문제
		ㄱ패턴, ㄴ패턴, ㄱ패턴, ㄴ패턴
		ㄱ패턴은 방번호가 증감한다.
		ㄴ패턴은 방번호가 감소한다.
		
		ㄱ패턴: 0,0 0,1 0,2 0,3 0,4 
		ㄱ패턴: 1,4 2,4 3,4 4,4
		ㄴ패턴: 4,3 4,2 4,1 4,0
		ㄴ패턴: 3,0 2,0 1,0
		*/

		int[][] nums = new int[6][6];
		int n = 1;
		int a = 0, b = -1;
		int turn = 0;

		for (int i = nums.length; i > 0; i--) {
			int num = i * 2 - 1;

			for (int j = 0; j < num; j++) {
				if (turn % 2 == 0) {
					if (b < nums.length - 1 - turn / 2)
						b++;
					else
						a++;
				} else {
					if (b > turn / 2)
						b--;
					else
						a--;
				}
				nums[a][b] = n;
				n++;
			}
			turn++;
		}
		
		/*
		// 다른 방법
		int[][] nums = new int[5][5];
        int n = 1;

        int top = 0, bottom = 4, left = 0, right = 4;

        while (n <= 25) {
            // Fill top row left to right
            for (int i = left; i <= right; i++) {
                nums[top][i] = n++;
            }
            top++;

            // Fill right column top to bottom
            for (int i = top; i <= bottom; i++) {
                nums[i][right] = n++;
            }
            right--;

            // Fill bottom row right to left
            for (int i = right; i >= left; i--) {
                nums[bottom][i] = n++;
            }
            bottom--;

            // Fill left column bottom to top
            for (int i = bottom; i >= top; i--) {
                nums[i][left] = n++;
            }
            left++;
        }
        */
        
        // 출력 > 수정 없이 그대로 사용
 		for (int i=0; i<5; i++) {
 			for(int j=0; j<5; j++) {
 				System.out.printf("%5d", nums[i][j]);
 			}
 			System.out.println();
 		}
 		
        /*
		int[][] nums = new int[5][5];
		int chase = 1;

		for (int i=0; i<5; i++) {
			if (chase == 1) {
				// ㄱ자 패턴
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n++;
				}
				for (int j=1; j<5; j++) {
					nums[j][i+4] = n;
					n++;
				}
				
				// ㄴ자 패턴
				for (int j=3; j>-1; j--) {
					nums[i+4][j] = n;
					n++;
				}
				for (int j=3; j>0; j--) {
					nums[j][0] = n;
					n++;
				}
				
				// ㄱ자 패턴
				for (int j=1; j<4; j++) {
					nums[i+1][j] = n;
					n++;
				}
				for (int j=2; j<4; j++) {
					nums[j][i+3] = n;
					n++;
				}
				
				// ㄴ자 패턴
				for (int j=2; j>0; j--) {
					nums[i+3][j] = n;
					n++;
				}
				for (int j=2; j>1; j--) {
					nums[j][1] = n;
					n++;
				}
				
				// ㄱ자 패턴
				for (int j=2; j<3; j++) {
					nums[i+2][j] = n;
					n++;
				}
				for (int j=3; j<3; j++) {
					nums[j][i+2] = n;
					n++;
				}
				
				chase = 0;
			}
		}
		
		// 출력 > 수정 없이 그대로 사용
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		*/
	}
}
