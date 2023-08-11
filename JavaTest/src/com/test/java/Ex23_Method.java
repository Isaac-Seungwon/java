package com.test.java;

public class Ex23_Method {

	public static void main(String[] args) {
		
		// Ex23_Method.java
		
		/*
			*** 메소드 오버로딩, Method Overloading
			- 같은 이름의 메소드를 여러개 만드는 기술
			- 메소드의 인자 리스트를 다양한 형태로 구성하여, 같은 이름의 메소드를 여러 개 만드는 기술.
			
			
			메소드 오버로딩 구현 조건 가능
			1. 매개변수의 개수
			2. 매개변수의 자료형
			
			메소드 오버로딩 구현 조건 불가능
			1. 매개변수의 이름
			2. 반환값의 자료형
			
			
			메소드를 여러개 선언할 예정!!!
			1. public static void test() {}			// O
			2. public static void test() {}			// X. 1번
			3. public static void test(int n) {}	// O, 매개변수가 다르므로 인정
			4. public static void test(int m) {}	// X. 3번
			5. public static void test(String s) {}	// O
			6. public static void test(int n, int m) {}	// O, 매개변수의 개수가 다르므로 인정
			7. public static int test() {}			// X, 반환값의 자료형
			
			메소드를 호출하여 검증한다.
			test();			// 1번 호출
			test(10);		// 3번 호출, 이름만 가지고는 식별을 못하지만, 매개변수를 가지고 식별이 가능하므로 메소드 이름을 똑같이 만들 수 있다.
			test("Isaac");	// 5번 호출, 매개변수의 자료형이 달라 5번을 호출한다는 것이 분명하기 때문에 가능하다.
			test(10, 20);	// 6번 호출
			
		*/
		
		drawLine();
		drawLine("*");
		
		// 이름이 같은 메소드를 만들 수 있게 하는 것이 메소드 오버로딩이다.
		
		System.out.println(100);
		System.out.println("문자열");
		
	}// main
	
	public static void print(int num) {
		
	}
	
	public static void print(String num) {
		
	}
	
	public static void test() {
		
	}
	
	public static void test(int n) {
		
	}
	
	
//	public static void test() {
//		
//	}
	
	// 요구사항) 선을 그리는 메소드를 선언하시오.
	public static void drawLine() {
		System.out.println("============================================================");
	}
	
	// drawLine2 이런 방식으로 숫자를 붙이는 건 아주 좋지 않다.
	/*
	public static void drawLine() {
		System.out.println("****************************************");
	}
	*/
	
	// 메소드 오버로딩
	public static void drawLine(String s) {
		System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s);
		System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s);
		System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s);
		System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s);
		System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s);
		System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s); System.out.print(s);
	}
	
}
