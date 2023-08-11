package com.test.java;

public class Ex21_Method {

	public static void main(String[] args) {
		
		// Ex21_Method
		
		// public static void hello(String name){}
		
		// 메소드 반환값(리턴값)
		// - 메소드가 실행 후 호출한 곳으로 돌려주는 값
		
		System.out.println(getNum()); // 100
		
		String result = getName("Isaac");
		System.out.println(result);
			
	}
	
	public static String getName(String name) {
		
		return "고객명: " + name;
	}
	
	// void가 아닌 자료형을 넣으면 return이 필요하다.
	public static int getNum() {
		
		// return문
		// - 메소드를 종료시킴
		// - 값을 반환함
		return 100;
	}
	
}
