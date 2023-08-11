package com.test.question;

public class Q074 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		0	0	1	0	0
		0	2	3	4	0
		5	6	7	8	9
		0	10	11	12	0
		0	0	13	0	0
		
				0,2
			1,1 1,2 1,3
		2,0 2,1 2,2 2,3 2,4
			3,1 3,2 3,3
				4,2
		2
		1 2 3
		0 1 2 3 4
		1 2 3
		2
		*/

		// 데이터 입력 > 문제
		int[][] nums = new int[5][5];

		int n = 1; // 시작 숫자
		int stac = nums.length / 2; // 시작 열 인덱스
		int count = 1; // 중앙에서부터 시작하여 오른쪽으로 증가시킬 숫자 개수

		for (int i = 0; i < nums.length; i++) {
			for (int j = stac; j < stac + count; j++) {
				nums[i][j] = n; // 해당 위치에 숫자 채우기
				n++; // 숫자 증가
			}

			if (i < nums.length / 2) {
				stac--; // 중앙으로부터 시작 열 인덱스 왼쪽으로 이동
				count += 2; // 숫자를 오른쪽으로 증가시킬 개수 늘리기
			} else {
				stac++; // 중앙으로부터 시작 열 인덱스 오른쪽으로 이동
				count -= 2; // 숫자를 오른쪽으로 증가시킬 개수 줄이기
			}
		}
		
		/*
		// 다른 방법
		int[][] nums = new int[5][5];
		int n = 1;

		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 2 - i; j < 3 + i; j++) {
					nums[i][j] = n;
					n++;
				}
			} else {
				for (int j = i - 2; j < 7 - i; j++) {
					nums[i][j] = n;
					n++;
				}
			}
		}
		*/
		
		// 출력 > 수정 없이 그대로 사용
		for (int[] row : nums) {
			for (int num : row) {
				System.out.printf("%5d", num);
			}
			System.out.println();
		}
        
		/*
		// 데이터 입력 > 문제
		int n = 1;
		int stac = nums.length/2 + nums.length%2;
		
		for (int i=0; i<nums.length; i++) {
			if (i < nums.length/2 + 1) {
				stac--;
				
				for (int j=stac; j<=stac + i*2; j++) {
					nums[i][j] = n;
					n++;
				}
			}
			else {
				stac++;
				
				for (int j=stac; j<nums.length+2-i; j++) {  
					nums[i][j] = n;
					n++;
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
		*/
	}
}
