package com.test.question;

import java.util.Scanner;

public class Q028 {
	public static void main(String[] args) {
		/*
		● 요구사항
		근무 년수를 입력받아 아래와 같이 출력하시오.
		
		● 조건
		- 1 ~ 4년차: 초급 개발자
		- 5 ~ 9년차: 중급 개발자
		- 10년차 이상: 고급 개발자
		- 유효성 검사를 하시오.(1 미만 입력 예외 처리)
		
		● 입력 1
		근무 년수: 2 
		
		● 출력 1
		2년차 초급 개발자입니다.
		앞으로 3년 더 근무를 하면 중급 개발자가 됩니다. 
		
		● 입력 2
		근무 년수: 5 
		
		● 출력 2
		5년차 중급 개발자입니다.
		당신은 1년전까지 초급 개발자였습니다.
		앞으로 5년 더 근무를 하면 고급 개발자가 됩니다.
		
		● 입력 3
		근무 년수: 11 
		
		● 출력 3
		11년차 고급 개발자입니다.
		당신은 2년전까지 중급 개발자였습니다.

		● 입력 4
		근무 년수: -5 
		
		● 출력 4
		입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int workExperience; // 근무 년수
		String title = ""; // 초급, 중급, 고급 판단
		
		
		// 근무 년수 입력
		System.out.print("근무 년수: ");
		workExperience = scan.nextInt();
		
		
		// 초급, 중급, 고급 판단 및 출력
		if (workExperience >= 1) {
			if (workExperience >= 1 && workExperience <= 4) {
				title = "초보 개발자";
			} else if (workExperience >= 5 && workExperience <= 9) {
				title = "중급 개발자";
			} else if (workExperience >= 10) {
				title = "고급 개발자";
			}
			// 경력 출력
			System.out.printf("%d년차 %s입니다.\n", workExperience, title);
		} else {
			// 예외 처리
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}
		
		// 경력 출력
		if (workExperience >= 1 && workExperience <= 4) {
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", 5 - workExperience);
		} else if (workExperience >= 5 && workExperience <= 9) {
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", workExperience - 5);
		} else if (workExperience >= 10) {
			title = "고급 개발자";
			System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", workExperience - 10);
		}
		
		scan.close();
	}
}