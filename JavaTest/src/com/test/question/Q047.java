package com.test.question;

import java.util.Scanner;

public class Q047 {
	public static void main(String[] args) {
		/*
		● 요구사항
		자판기 프로그램을 구현하시오..
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int drink; // 마실 음료
		int money; // 투입한 금액
		
		// 자판기
		while(true) {
			System.out.println("=======================");
			System.out.println("        자판기");
			System.out.println("=======================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("-----------------------");
			
			// 금액 투입
			System.out.printf("금액 투입(원) : ");
			money = scan.nextInt();
			
			// 음료 선택
			System.out.println("-----------------------");
			System.out.printf("음료 선택(번호) : ");
			drink = scan.nextInt();
			
			// 잔돈, 음료 판단
			if (drink >= 4) {
				System.out.printf("콜라, 사이다, 비타500중에서 선택해주세요.\n");
			}
			else if (money >= 700 || (drink  >= 2 && money >= 600) || (drink >= 3 && money >= 500)) {
				System.out.printf("+%s를 제공합니다.\n", drink == 1 ? "콜라" : drink == 2 ? "사이다" : drink == 3 ? "비타500" : "");
				System.out.printf("+잔돈 %d를 제공합니다.\n", drink == 1 ? money - 700 : drink == 2 ? money - 600 : drink == 3 ? money - 500 : "0");
			}
			else {
				System.out.printf("돈이 부족합니다.\n");
			}
			
			System.out.printf("\n계속하시려면 엔터를 입력하세요.\n");
			scan.nextLine();
			scan.nextLine();
			
			scan.close();
		}
	}
}
