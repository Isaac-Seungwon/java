package com.test.question;

import java.util.Scanner;

public class Q015 {
	public static void main(String[] args) {
		/*
		● 요구사항
		사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		
		● 조건
		- int getApple(int sunny, int foggy)
		- 사과 나무를 처음 심었을 때 나무의 길이: 0m
		- 맑은 날 사과 나무의 성장률: 5㎝
		- 흐린 날 사과 나무의 성잘률: 2㎝
		- 사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
		- 1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		
		● 입력
		맑은 날: 35 
		흐린 날: 10 
		
		● 출력
		사과가 총 9개 열렸습니다.
		*/
	
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int sunnyDay; // 맑은 날
		int foggyDay; // 흐린 날
		
		// 맑은 날 입력
		System.out.printf("맑은 날: ");
		sunnyDay = scan.nextInt();
		
		// 흐린 날 입력
		System.out.printf("흐린 날: ");
		foggyDay = scan.nextInt();
		
		// 사과 개수 출력
		System.out.printf("사과가 총 %d개 열렸습니다.", getApple(sunnyDay, foggyDay));
		
		scan.close();
	}
	
	public static int getApple(int sunny, int foggy) {
		int heightTree = 0; // 나무의 키
		int apples; // 사과 개수

		// 나무의 성장률 계산
		heightTree = heightTree + sunny * 5;
		heightTree = heightTree + foggy * 2;
		
		// 나무에 열린 사과 개수 계산
		apples = heightTree >= 100 ? (heightTree - 100) / 10 : 0;
				
		return apples;
	}
}
