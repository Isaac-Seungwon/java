package com.test.summary;

public class S0004_Method {

	public static void main(String[] args) {
		
		// 인자값 X, 반환값 X 형태
		m1();
		
		// 인자값 O, 반환값 X 형태
		m2(100);
		
		// 인자값 X, 반환값 O 형태
		int result = m3();
		
		// 인자값 O, 반환값 O 형태
		result = m4(100);
	}
	
	public static void m1() {
		
	}
	
	public static void m2(int n) {
		
	}
	
	public static int m3() {
		return 100;
	}
	
	public static int m4(int n) {
		return n;
	}
}
