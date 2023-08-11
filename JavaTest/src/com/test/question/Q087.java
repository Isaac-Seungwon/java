package com.test.question;

import java.util.Scanner;

public class Q087 {
	public static void main(String[] args) {
		/*
		● 요구사항
		영단어를 입력받아 분리하시오.
		
		● 조건
		- 합성어를 입력한다.
		- 합성어는 파스칼 표기법으로 입력한다.
		- 출력은 각 단어를 공백으로 구분한다.
		
		● 입력
		단어: StudentName 
		
		● 출력
		결과: Student Name
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String compound; // 합성어
		
		// 합성어 입력
		System.out.print("합성어: ");
		compound = scan.nextLine();
		
		for (int i=0; i<compound.length(); i++) {
			// 입력한 글자를 한 글자씩 검증
			char c = compound.charAt(i);
			
			// 파스칼 표기법에 입각해 대문자를 만나면 띄어쓰기
			if (i != 0 && c >= 'A' && c <= 'Z') {
				System.out.print(" ");
			}
			
			// 합성어 출력
			System.out.print(c);
		}
		
		scan.close();
	}
}
