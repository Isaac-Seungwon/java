package com.test.java;

import java.util.Scanner;

public class Ex16_Operator {

	public static void main(String[] args) {
		
		// Ex16_Operator.java
		
		/*
			비교 연산자
			- >, >=, <, <=, ==(equals), !=(not equals)
			- 2항 연산자
			- 피연산자들의 우위(동등) 비교하는 연산자
			- 피연산자는 숫자형을 가진다.
			- 연산의 결과가 항상 boolean이다.	
		*/
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d > %d = %b\n", a, b, a > b);
		System.out.printf("%d >= %d = %b\n", a, b, a >= b);
		System.out.printf("%d < %d = %b\n", a, b, a < b);
		System.out.printf("%d <= %d = %b\n", a, b, a <= b);
		System.out.printf("%d == %d = %b\n", a, b, a == b);
		System.out.printf("%d != %d = %b\n", a, b, a != b);
		

		try {
			// 요구사항) 사용자의 나이 입력: 19세 이상일 경우 통과, 미만일 경우 거절
			Scanner scan = new Scanner(System.in); // Ctrl + Shirt + O;
			
			System.out.printf("나이: ");
			
			int age = scan.nextInt();
			
			System.out.println(age >= 19);
			System.out.println();
		} catch(Exception ex)
		{
		}
		

		// character의 비교
		System.out.println('A' == 'A'); // true
		System.out.println('A' == 'a'); // false
		
		
		
		// 비교 연산자
		// 1. 모든 값형은 안전하다.
		// 2. 문자열(참조형)의 비교는 주의해야 한다.
		
		String s1 = "Samsung";
		String s2 = "Samsung";
		String s3 = "Apple";
		String s4 = "Sam";
		
		s4 = s4 + "sung";
		System.out.println(s4); // Samsung
		
		System.out.println(s1 == s2); // true	"Samsung" == "Samsung"
		System.out.println(s1 == s3); // false
		System.out.println(s1 == s4); // false	"Samsung" == "Samsung"
		
		// 같은 Samsung인데 왜 전자는 true이고 후자는 false일까?
		
		// *** 문자열의 비교는 ==, != 연산자를 사용하면 절대 안 된다!
		// 문자열의 비교는 equls() 메소드를 사용한다.
		
		System.out.println(s1.equals(s2)); // true	s1 == s2
		System.out.println(s1.equals(s3)); // false	s1 == s3
		System.out.println(s1.equals(s4)); // true	s1 == s4
	}
	
}
