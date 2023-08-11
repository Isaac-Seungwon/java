package com.test.question;

import java.util.Scanner;

public class Q050 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 조건
		- 행의 갯수를 입력받으시오.
		
		● 입력
		행: 5 
		
		● 출력
		    *
		   **
		  ***
		 ****
		*****
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num; // 행의 개수
		
		// 행의 개수 입력
		System.out.printf("행: ");
		num = scan.nextInt();
		
		// 출력
		for (int i = 0; i < num; i++) {
			// ' ' 출력
			for (int j = num - i; j > 0; j--) {
				System.out.printf(" ");
			}
			
			// '*' 출력
			for (int k = 0; k <= i; k++) {
				System.out.printf("*");
			}
			
			System.out.println(); // 개행
		}
		
		scan.close();
	}
}
