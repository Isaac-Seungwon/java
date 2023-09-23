package com.test.summary;

public class S0003_Casting {
	
	public static void main(String[] args) {
		
		int a = 10;
		long b;
		
		// 암시적 형변환
		b = a;
		
		
		int c;
		long d = 10;
		
		// 명시적 형변환
		c = (int)d;
	}
	
}
