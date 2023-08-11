package com.test.question;

import java.util.Scanner;

public class Q051 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 조건
		- 행의 갯수를 입력받으시오.
		
		● 입력 1
		행: 5 
		
		● 출력 1
		    *
		   ***
		  *****
		 *******
		*********	
		
		● 입력 2
		행: 7 
		
		● 출력 2
		      *
		     ***
		    *****
		   *******
		  *********
		 ***********
		*************
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
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.printf("*");
			}
			// (조건) k <= i -> k < 1 + i
			
			System.out.println(); // 개행
		}
		
		scan.close();
	}
}
