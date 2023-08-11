package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q001 {
	public static void main(String[] args) {
		/*
		● 요구사항
		태어난 년도를 입력받아 나이를 출력하시오.
		
		● 조건
		- 우리나라 나이로 출력하시오.
		
		● 입력
		태어난 년도: 1998 
		
		● 출력
		나이: 26세
		*/
		
		// 객체 생성
		Calendar calendar = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		int currentYear; // 현재 년도
		int birthYear; //태어난 년도
		int currentAge; // 현재 나이
		
		// 현재 년도 저장
		currentYear = calendar.get(Calendar.YEAR); 
		
		// 태어난 년도 입력
		System.out.printf("태어난 년도: ");
		birthYear = scan.nextInt();
		
		// 현재 나이 계산
		currentAge = currentYear - birthYear + 1;
		
		// 현재 나이 출력
		System.out.printf("나이: %d세", currentAge);
		
		scan.close();
	}
}
