package com.test.question;

import java.util.Scanner;

public class Q036 {
	public static void main(String[] args) {
		/*
		● 요구사항
		시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
		
		● 입력
		시작 숫자: 5 
		종료 숫자: 12 
		증감치: 1 
		
		● 출력
		5
		6
		7
		8
		9
		10
		11
		12
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int startNum; // 시작 숫자
		int endNum;	// 종료 숫자
		int plus; // 증감치
		
		System.out.printf("시작 숫자: ");
		startNum = scan.nextInt();
		
		System.out.printf("종료 숫자: ");
		endNum = scan.nextInt();
		
		System.out.printf("증감치: ");
		plus = scan.nextInt();
		
		for (int i = startNum; i <= endNum; i += plus) {
			System.out.println(i);
		}
		
		scan.close();
	}
}
