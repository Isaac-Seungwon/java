package com.test.question;

import java.util.Scanner;

public class Q046 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		
		● 조건
		- 1~9까지만 입력하시오.
		
		● 입력
		숫자: 5 
		숫자: 7 
		숫자: 4 
		숫자: 3 
		숫자: 5 
		숫자: 7 
		숫자: 6 
		숫자: 2 
		숫자: 1 
		숫자: 3 
		
		● 출력
		오칠사삼오칠육이일삼
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String korean = "일이삼사오육칠팔구";
		
		String result = ""; // 한글 변환 저장
		int num; // 입력할 숫자
		
		
		// 숫자 10개 입력 및 변환
		for(int i = 0; i < 10; i++) {
			// 숫자 입력
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			// 숫자 -> 한글 변환
			for(int j = 0; j < 10; j++) {
				if(num == j + 1) {
					// 변환한 한글 값을 누적
					result += korean.charAt(j);
				}
			}
		}
		
		// 숫자 -> 한글 변환한 값 출력
		System.out.printf("%s", result);
		
		scan.close();
	}
}
