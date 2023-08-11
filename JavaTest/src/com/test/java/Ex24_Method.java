package com.test.java;

public class Ex24_Method {

	public static void main(String[] args) {
		
		// Ex24_Method
		
		// Swap
		// - 2개의 공간의 값을 서로 교환하는 작업
		
		int a = 10;
		int b = 20;
		
		swap(a, b); // quick fix available
		
		
	}

	// 변수, 메소드 등에서 Ctrl + 1을 누르면 Rename in file, Rename in workspace가 뜬다.
	// 해당 변수, 메소드를 호출하고 있는 곳에서 10개든 100개든 동시에 이름이 변경된다.
	// 이름을 직접 바꾸면 실수가 생길 수 있으므로, 해당 기능을 이용하는 것이 좋다.
	
	private static void swap(int a, int b) {
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		int temp; // 빈 컵
		
		temp = a;
		a = b;
		b = temp;

		System.out.printf("a: %d, b: %d\n", a, b);
	}

	private static void swap(String a, String b) {
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		String temp; // 빈 컵
		
		temp = a;
		a = b;
		b = temp;

		System.out.printf("a: %d, b: %d\n", a, b);
	}
}
