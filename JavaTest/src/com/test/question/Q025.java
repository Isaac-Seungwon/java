package com.test.question;

import java.util.Scanner;

public class Q025 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
		
		● 조건
		- 두 숫자가 얼마의 차이를 보이는지 출력하시오.
		
		● 입력 1
		첫번째 숫자: 5 
		두번째 숫자: 3 
		
		● 출력 1
		큰수는 5이고, 작은수는 3입니다. 두 숫자는 2(가)이 차이납니다.
		
		● 입력 2
		첫번째 숫자: 2
		두번째 숫자: 10
		
		● 출력 2
		큰수는 10이고, 작은수는 2입니다. 두 숫자는 8(가)이 차이납니다.
		
		● 입력 3
		첫번째 숫자: 3
		두번째 숫자: 3 
		
		● 출력 3
		두 숫자는 동일합니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("첫번째 숫자: ");
		num1 = scan.nextInt();
		
		System.out.printf("두번째 숫자: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", num1, num2, num1 - num2);
		} else if (num1 < num2) {
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", num2, num1, num2 - num1);
		} else {
			System.out.printf("두 숫자는 동일합니다.");
		}
		
		scan.close();
	}
}
