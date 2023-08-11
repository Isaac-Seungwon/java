	package com.test.question;

import java.util.Scanner;

public class Q027 {
	public static void main(String[] args) {
		/*
		● 요구사항
		문자 1개를 입력받아 아래와 같이 출력하시오.
		
		● 조건
		- f, F → Father
		- m, M → Mother
		- s, S → Sister
		- b, B → Brother
		- 유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
		
		● 입력 1
		문자: f 
		
		● 출력 1
		Father
		
		● 입력 2
		문자: F 
		
		● 출력 2
		Father
		
		● 입력 3
		문자: s 
		
		● 출력 3
		Sister
		
		● 입력 4
		문자: a 
		
		● 출력 4
		입력한 문자가 올바르지 않습니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		char input; // 문자 입력
		
		// 문자 입력
		System.out.printf("문자: ");
		input = scan.nextLine().charAt(0);
		
		// 문자 출력
		switch (input){
			case 'f': case 'F':
				System.out.println("Father");
				break;
			case 'm': case 'M':
				System.out.println("Mother");
				break;
			case 's': case 'S':
				System.out.println("Sister");
				break;
			case 'b': case 'B':
				System.out.println("Brother");
				break;
			default:
				// 예외처리
				break;
		}
		
		scan.close();
	}
}
