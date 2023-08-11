package com.test.question;

import java.util.Scanner;

public class Q012 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		
		● 조건
		- String getNumber(int)
		
		● 입력 1
		숫자: 5 
		
		● 호출 1
		result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		● 출력 1
		입력하신 숫자 '5'는(은) '홀수'입니다.
		
		● 입력 2
		숫자: 2 
		
		● 호출 2
		result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		● 출력 2
		입력하신 숫자 '2'는(은) '짝수'입니다.
		*/
	
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int n; // 사용자 입력
		String result; // 짝수 홀수 계산 결과 저장
		
		// 숫자 입력
		System.out.printf("숫자: ");
		n = scan.nextInt();
		
		// 결과 출력
		result = getNumber(n);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		scan.close();
	}
	
	public static String getNumber(int num) {
		// 입력이 짝수인지 홀수인지 계산
		String evenOdd = num % 2 == 0 ? "짝수" : "홀수";
		
		return evenOdd;
	}
}
