package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	public static void main(String[] args) {
		/*
		● 요구사항
		배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
		
		● 조건
		- 원본 배열 길이: 사용자 입력
		- 원본 배열 요소: 난수(1~9)
		- 결과 배열 길이: 사용자 입력 / 2
		
		● 입력 1
		배열 길이: 10 
		
		● 출력 1
		원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
		결과: [ 6, 9, 9, 10, 11 ]
		
		● 입력 2
		배열 길이: 5
		
		● 출력 2
		원본: [ 1, 5, 3, 2, 7 ]
		결과: [ 6, 5, 7 ]
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int number; // 숫자 개수
		
		// 난수 개수 입력
		System.out.printf("난수 개수: ");
		number = scan.nextInt();
		// scan.skip("\r\n"); // 버퍼 개행 제거
		
		// 난수 개수만큼 배열 생성
		int[] list = new int[number];
		int[] listPlus = new int[number % 2 == 0 ? number / 2 : number / 2 + 1];
		
		// 난수 값 할당 (1~9)
		for (int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 9) + 1;
		}
		
		// 순차적으로 숫자 2개씩 덧셈 연산
		for (int i = 0; i < list.length; i += 2) {
			if(number % 2 == 1 && i == list.length - 1){
				// java.lang.ArrayIndexOutOfBoundsException 오류 발생 방지
				// 난수 개수가 홀수 && 덧셈할 수 있는 난수가 마지막 1개만 남음
				listPlus[listPlus.length - 1] = list[list.length - 1];
				break;
			}
			
			// 숫자 2개씩 덧셈
			listPlus[i / 2] = list[i] + list[i + 1];
		}

		// 출력
		System.out.printf("원본: %s\n", Arrays.toString(list));
		System.out.printf("결과: %s\n", Arrays.toString(listPlus));
		
		scan.close();
	}
}

/*
입력이 10일때만 작동

// 학생 수 만큼 배열 생성
int[] list = new int[number];
int[] listPlus = new int[number / 2];

// 배열 값 생성
for (int i = 0; i < 10; i++) {
	list[i] = (int)(Math.random() * 9) + 1;
}

for (int i = 0; i < list.length; i += 2) {
	listPlus[i / 2] = list[i] + list[i + 1];
}
*/