package com.test.question;

public class Q079 {
	public static void main(String[] args) {
    	/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		2	7	6
		9	5	1
		4	3	8

		● 마방진
		동서남북 어디서 보더라도 15명의 군인이 보일 수 밖에 없는 구조이다.
		9칸 중에 아무데나 1을 적는다.
		2시, 5시, 8시, 11시로 방향을 정하고 해당 방향으로 이동한다.
		*/

		int[][] nums = new int[5][5];
		int n = 1;

		// 마방진 생성
		createMagicSquare(nums, 1, 2);

		/*
		// 다른 방법
		int[][] nums = new int[3][3];
		int n = 1;
		int rowPlus = -1; // 이동할 행 인덱스의 증감
		int colPlus = 1; // 이동할 열 인덱스의 증감
		int a = (int) (Math.random() * nums.length); // 랜덤한 행 인덱스 초기화
		int b = (int) (Math.random() * nums.length); // 랜덤한 열 인덱스 초기화

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[a][b] = n;
				++n;

				// 다음 위치 계산
				a = a + rowPlus < 0 ? nums.length - 1 : a + rowPlus;
				b = b + colPlus > nums[0].length - 1 ? 0 : b + colPlus;
			}
			// 마지막 행이 짝수
			if (nums.length % 2 == 0) {
				b = b + 1 > nums.length - 1 ? 0 : b + 1;
			} else { // 마지막 행이 홀수
				a = a + 1 > nums.length - 1 ? 0 : a + 1;
				b = b + 1 > nums.length - 1 ? 0 : b + 1;
			}
		}
		*/

		// 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}

	private static void createMagicSquare(int[][] arr, int x, int y) {
		int size = arr.length;
		int n = size * size;
		int count = 1;

		arr[x][y] = count;

		while (count < n) {
			int nextX = (x - 1 + size) % size; // 위로 이동
			int nextY = (y + 1) % size; // 오른쪽으로 이동

			if (arr[nextX][nextY] == 0) {
				x = nextX;
				y = nextY;
			} else {
				x = (x + 1) % size; // 아래로 이동
			}

			count++;
			arr[x][y] = count;
		}
	}
}
