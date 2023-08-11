package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		/*
		● 요구사항
		사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		
		● 조건
		- 사각형 넓이 = 너비 * 높이
		- 사각형 둘레 = 너비 * 2 + 높이 * 2
		
		● 입력
		너비(㎝): 20 
		높이(㎝): 10 
		
		● 출력
		사각형의 넓이는 200㎠입니다.
		사각형의 둘레는 60㎝입니다.
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int rectangleWidth; // 사각형 너비(cm)
		int rectangleHeight; // 사각형 높이(cm)
		
		// 너비 입력
		System.out.printf("너비(cm): ");
		rectangleWidth = scan.nextInt();

		// 높이 입력
		System.out.printf("높이(cm): ");
		rectangleHeight = scan.nextInt();
		
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n", rectangleWidth * rectangleHeight);
		System.out.printf("사각형의 둘레는 %d㎝입니다.", rectangleWidth * 2 + rectangleHeight * 2);
		
		scan.close();
	}
	
}
