package com.test.question;

import java.util.Scanner;

public class Q052 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 조건
		- 행의 갯수를 입력받으시오.
		
		● 입력
		행: 5 
		
		● 출력
		    aa
		   abba
		  abccba
		 abcddbca
		abcdeedcba
		
		● 입력
		행: 7
		
		● 출력
		      aa
		     abba
		    abccba
		   abcddbca
		  abcdeedcba
		 abcdeffedcba
		abcdefggfedcba
		
		// 실행 예시
		입력(num): 3
		
		i: 1	k: 0			1
		Unicode:   97       	97
		i: 2	k: 0  1			2  3
		Unicode:   97 98    	98 97
		i: 3	k: 0  1  2		3  4  5
		Unicode:   97 98 99 	99 98 97
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num; // 행의 개수
		int stac = 0; // 순서
		
		// 행의 개수 입력
		System.out.printf("행: ");
		num = scan.nextInt();
		
		// 출력
		for (int i = 1; i <= num; i++) {
			// stac 초기화
			stac = 0;
			
			// ' ' 출력
			for (int j = num - i; j > 0; j--) {
				System.out.printf(" ");
			}
			
			// 'abc..' 출력
			for (int k = 0; k < i * 2; k++) {
				if (k - i < 0) {
					System.out.printf("%c", 'a' + stac);
					stac++;
					// stac++을 출력 뒤에 이유는 a + 1 = b가 되기 때문이다.
				}
				else {
					stac--;
					System.out.printf("%c", 'a' + stac);
					// stac--을 출력 앞에 하는 이유는 이미 stac에 1 이상이 있는 상태이므로 a + 1 - 1 = a가 되기 때문이다.
				}
			}

			System.out.println(); // 개행
		}
		
		scan.close();
	}
}
