package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
	public static void main(String[] args) {
		/*
		● 요구사항
		배열에 요소를 삽입하시오.
		
		● 조건
		- 배열 길이: 10
		- 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		
		● 입력 1
		삽입 위치: 2 
		값: 100 
		
		● 출력 1
		원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		결과: [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
		
		● 입력 2
		삽입 위치: 5 
		값: 100 
		
		● 출력 2
		원본: [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
		결과: [5, 6, 1, 3, 2, 100, 8, 7, 4, 10]
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] list = new int [10]; // 난수 10개
		int[] copy;
		int insert; // 삽입 위치
		int number; // 삽입할 값
		
		// 난수 10개 값 할당 (0~10)
		for (int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 10) + 0;
		}
		
		// 원본 배열 copy
		copy = Arrays.copyOfRange(list, 0, list.length);
		
		// 삽입 위치 입력	
		System.out.printf("삽입 위치: ");
		insert = scan.nextInt();
		
		// 삽입할 값 입력
		System.out.printf("값: ");
		number = scan.nextInt();
		
		// 삽입할 위치까지 숫자를 뒤로 옮김
		for (int i = list.length - 2; i >= insert; i--) {
			list[i + 1] = list[i];
			/*
			insert가 0일 경우 i: 8 7 6 5 4 3 2 1 0
			insert가 5일 경우 i: 8 7 6 5
			insert가 9일 경우 i:
			*/
		}
		
		// 삽입할 위치에 삽입할 값 할당
		list[insert] = number;
		
		// 출력
		System.out.printf("원본: %s\n", Arrays.toString(copy));
		System.out.printf("결과: %s\n", Arrays.toString(list));
		
		scan.close();
	}
}
