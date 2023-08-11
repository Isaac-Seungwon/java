package com.test.question;

import java.util.Scanner;

public class Q035 {
	public static void main(String[] args) {
		/*
		● 요구사항
		사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
		
		● 입력
		이름: 홍길동 
		횟수: 3 
		
		● 출력
		홍길동님 안녕하세요~
		홍길동님 안녕하세요~
		홍길동님 안녕하세요~
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("횟수 : ");
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.printf("%s님 안녕하세요~\n",name);
		}
		
		scan.close();
	}
}
