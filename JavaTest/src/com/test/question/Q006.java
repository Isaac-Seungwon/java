package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		/*
		● 요구사항
		사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		
		● 조건
		- 세금: 수입의 3.3%
		
		● 입력
		한달 수입 금액(원): 1000000
		
		● 출력
		세후 금액(원): 967,000원
		세금(원) : 33,000원
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int incomeMonth; // 한 달 수입(원)
		double taxAmount; // 세금(원)
		
		// 한달 수입 입력
		System.out.printf("한달 수입 금액(원): ");
		incomeMonth = scan.nextInt();
		
		// 세금 계산
		taxAmount = incomeMonth * 0.033;
		
		// 세후 금액, 세금 출력
		System.out.printf("세후 금액(원): %,d원\n", incomeMonth - (int)taxAmount);
		System.out.printf("세금(원): %,d원", (int)taxAmount);
		
		scan.close();
	}
}
