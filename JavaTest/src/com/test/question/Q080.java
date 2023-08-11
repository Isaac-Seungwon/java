package com.test.question;

import java.util.Scanner;

public class Q080 {
	public static void main(String[] args) {
		/*
		● 요구사항
		문장을 입력받아 역순으로 출력하시오.
		
		● 입력
		문장 입력 : 가나다 
		
		● 출력
		역순 결과 : "다나가"
		
		● 입력
		문장 입력 : 안녕하세요. 홍길동입니다. 
		
		● 출력
		역순 결과 : ".다니입동길홍 .요세하녕안"
		*/
		
		Scanner scan = new Scanner(System.in);
		
		// 문장 입력
		System.out.printf("문장 입력: ");
		String txt = scan.nextLine();
		
		// 역순 결과 출력
		System.out.printf("역순 결과: ");
		for (int i=txt.length() - 1; i>=0; i--) {
			char c = txt.charAt(i);
			
			System.out.printf("%c", c);
		}
		
		scan.close();
	}
}
