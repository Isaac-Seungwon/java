package com.test.question;

import java.util.Scanner;

public class Q007 {
	
	public static void main(String[] args) {
		/*
		● 요구사항
		영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		
		● 조건
		- 대문자와 소문자의 문자 코드값의 관계
		
		● 입력 1
		문자 입력: a 
		
		● 출력 1
		소문자 'a'의 대문자는 'A'입니다.
		
		● 입력 2
		문자 입력: g 
		
		● 출력 2
		소문자 'g'의 대문자는 'G'입니다.
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		String lowerCase; // 소문자
		int lowerCaseCode; // 소문자 코드값
		int upperCaseCode; // 대문자 코드값
		
		// 소문자 입력
		System.out.printf("문자 입력: ");
		lowerCase = scan.nextLine();
		
		// 영어 소문자 검사(문자 코드값)
		lowerCaseCode = lowerCase.charAt(0);
		
		/*
			lowerCaseCode = scan.nextLine().charAt(0);
			위와 같이 입력과 문자 코드값 검사를 바로 할 수 있다.
		*/
		
		// 소문자를 대문자로 변환
		upperCaseCode = lowerCaseCode - 32;
		
		// A(65) ~ Z(90)
		// a(97) ~ z(122)
		
		// 소문자를 대문자 변환한 결과 출력
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", lowerCaseCode, upperCaseCode);
		
		scan.close();
	}
}
