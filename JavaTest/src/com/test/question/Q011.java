package com.test.question;

import java.util.Scanner;

public class Q011 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		
		● 조건
		- String add(int, int)
		- String subtract(int, int)
		- String multiply(int, int)
		- String divide(int, int)
		- String mod(int, int)
		
		● 입력
		첫번째 숫자: 5 
		두번째 숫자: 3 
		
		● 호출
		result = add(n1, n2); 
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		
		● 출력
		5 + 3 = 8
		5 - 3 = 2
		5 * 3 = 15
		5 / 3 = 1.7
		5 % 3 = 2
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int num1; // 첫 번째 숫자
		int num2; // 두 번째 숫자
		
		// 첫 번째 숫자 입력
		System.out.printf("첫번째 숫자: ");
		num1 = scan.nextInt();
		
		// 두 번째 숫자 입력
		System.out.printf("두번째 숫자: ");
		num2 = scan.nextInt();
		
		// 사칙연산 출력
		System.out.println(add(num1, num2));
		System.out.println(subtract(num1, num2));
		System.out.println(multiply(num1, num2));
		System.out.println(divide(num1, num2));
		System.out.println(mod(num1, num2));
		
		scan.close();
	}
	
	// String.valueOf
	public static String add(int n1, int n2) {
	    int result = n1 + n2;
	    String msg = n1 + " + " + n2 + " = " + result;
	    		
	    return msg;
	}
	
	public static String subtract(int n1, int n2) {
	    int result = n1 - n2;
	    String msg = n1 + " - " + n2 + " = " + result;
	    
	    return msg;
	}

	public static String multiply(int n1, int n2) {
	    int result = n1 * n2;
	    String msg = n1 + " * " + n2 + " = " + result;
	    
	    return msg;
	}

	public static String divide(int n1, int n2) {
		double result = (double)n1 / n2;
		String msg = n1 + " * " + n2 + " = " + String.format("%.1f", result); // 소수점 한자리까지 출력
	    return msg;
	}

	public static String mod(int n1, int n2) {
	    int result = n1 % n2;
	    String msg = n1 + " % " + n2 + " = " + result;
	    
	    return msg;
	}
}
