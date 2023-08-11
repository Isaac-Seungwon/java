package com.test.question;

import java.util.Scanner;

public class Q056 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
		
		● 조건
		- 공약수: 둘 이상의 정수에 공통된 약수
		
		● 입력
		첫번째 숫자: 12 
		두번째 숫자: 8 
		
		● 출력
		12의 약수: 1, 2, 3, 4, 6, 12,
		8의 약수: 1, 2, 4, 8,
		12와 8의 공약수: 1, 2, 4,
		*/
		
		Scanner scan = new Scanner(System.in);

		int num1, num2; // 입력한 숫자
		String commonDevisor = ""; // 공약수
		String devisorListNum1 = ""; // 약수 리스트
		String devisorListNum2 = ""; // 약수 리스트
		
		// 숫자 2개 입력
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		
		// 약수 검증
		devisorListNum1 = getdevisor(num1, devisorListNum1);
		devisorListNum2 = getdevisor(num2, devisorListNum2);
		
		// 공약수 검증
		commonDevisor = getCommon(num1, num2, commonDevisor);
		
		// 출력
		System.out.printf("%d의 약수: %s\n", num1, devisorListNum1);
		System.out.printf("%d의 약수: %s\n", num2, devisorListNum2);
		System.out.printf("%d와 %d의 공약수: %s\n", num1, num2, commonDevisor);
	}

	// 약수 검증 메소드
	private static String getdevisor(int num, String devisorList) {
		devisorList = "";
		
		for (int i = 1; i <= num; i++) {
			// 약수 계산
    		if (num % i == 0) {
    			devisorList += i + ", ";
    		}
    	}
		
		return devisorList;
	}
	
	// 공약수 검증 메소드
	private static String getCommon(int num1, int num2, String common) {
		for (int i = 1; i <= (num1 < num2 ? num1 : num2); i++) {
			common = "";
					
			for (int j = 1; j < (num1 < num2 ? num1 : num2); j++) {
				// 공약수 계산
				if (i % j == 0) {
					common = common + j + ", ";
				}
			}
		}
		
		return common;
	}
}
