package com.test.question;

public class Q075 {
	public static void main(String[] args) {
		/*
        ● 요구사항
        주어진 규칙에 따라 아래와 같이 출력하시오.
        
        ● 출력 패턴
        1   2   3   4   10
        5   6   7   8   26
        9   10  11  12  42
        13  14  15  16  58
        28  32  36  40  136
        */

		int[][] nums = new int[5][5];

		// 데이터 입력 > 문제
		int n = 1; // 시작 숫자

		// 숫자 배열을 채우는 반복문
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				nums[i][j] = n; // 현재 숫자를 배열에 채움
				n++; // 다음 숫자로 증가
				
				/*
				nums[i][j] = n;
				nums[i][4] += n;
				nums[4][j] += n;
				nums[4][4] += n;
				n++;
				*/
			}
		}

		// 마지막 행과 마지막 열을 계산하여 채우는 반복문
		int rowSum, colSum;
		for (int i = 0; i < nums.length; i++) {
			rowSum = 0; // 행의 합을 초기화
			colSum = 0; // 열의 합을 초기화

			// 각 행과 열의 합을 구함
			for (int j = 0; j < nums.length - 1; j++) {
				rowSum += nums[i][j]; // 행의 합 계산
				colSum += nums[j][i]; // 열의 합 계산
			}

			// 행의 합을 배열에 채움
			nums[i][nums.length - 1] = rowSum;
			// 열의 합을 배열에 채움
			nums[nums.length - 1][i] = colSum;
		}

		// 마지막 행과 마지막 열의 합을 구하여 채우는 반복문
		int totalSum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			totalSum += nums[nums.length - 1][i]; // 마지막 행의 합 계산
		}
		// 마지막 행과 마지막 열의 합을 배열에 채움
		nums[nums.length - 1][nums.length - 1] = totalSum;

		/*
		// 다른 방법
		int[][] nums = new int[5][5];

		int n = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				if (i < nums.length - 1 && j < nums[0].length - 1) {
					nums[i][j] = n;
					n++;
				} else {
					for (int k = 0; k < nums.length - 1; k++) {
						nums[i][j] += (i == nums.length - 1) ? nums[k][j] : nums[i][k];
					}
				}
			}
		}
		*/

		// 출력 > 수정 없이 그대로 사용
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.printf("%5d", nums[i][j]); // 숫자 배열을 출력
			}
			System.out.println(); // 한 행이 끝나면 줄바꿈
		}
	}
}


/*
package com.test.question;

public class Q075 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];

		// 데이터 입력 > 문제
		int n = 1;
		int sum = 0;
		
		for (int i=0; i<nums.length; i++) {
			sum = 0;
			for (int j=0; j<nums.length - 1; j++) {
				nums[i][j] = n;
				n++;
				sum += nums[i][j];
			}
			nums[i][nums.length - 1] = sum;

			// i가 마지막일 때 아래로 더함
			if (i == nums.length - 1) {
				for (int k=0; k <nums.length; k++) {
					sum = 0;
					for (int j=0; j<nums.length - 1; j++) {
						sum += nums[j][k];
					}
					nums[i][k] = sum;
				}
			}
		}

		// 출력 > 수정 없이 그대로 사용
		for (int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
*/
