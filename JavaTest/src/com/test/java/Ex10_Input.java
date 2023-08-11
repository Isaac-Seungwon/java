package com.test.java;

public class Ex10_Input {
	
	public static void main(String[] args) {
		
		// Ex10_Input.java
		
		/*
			콘솔 출력 > 모니터
			1. System.out.print();
			2. System.out.println();
			3. System.out.printf();
			
			
			콘솔 입력 > 키보드
			1. System.in.read(); > 손이 많이 가고 불편하다.
			2. BufferedReader 클래스
			3. Scanner 클래스
		*/
		
		
		// 1. 안내 메시지 출력
		System.out.println("문자 입력: ");
		
		// 2. 키 입력
		// - 입력 대기 상태 > 블럭이 걸렸다고 표현한다.
		// - 사용자의 키 입력을 기다리고 있는 상태
		// - 콘솔 > 키 입력 완료 > 엔터 입력
		
		try {
			int code = System.in.read(); // a 입력
			
			// 3. 키를 화면에 출력
			System.out.println("출력: " + code);
			System.out.printf("출력: %c\n", code); // 출력: 97 (a)
			
			code = System.in.read(); // 문자 코드
			System.out.println("출력: " + code);
			System.out.printf("출력: %c\n", code); // 출력: 13 (\r) 
			
			code = System.in.read(); // 문자 코드
			System.out.println("출력: " + code);
			System.out.printf("출력: %c\n", code); // 출력: 10 (\n)

			// a 하나만 입력했다고 생각했지만, 사실 enter를 칠 때 \r, \n도 함께 입력되어 있다.
			
			// read는 불편해서 잘 사용하지 않는다.
			// read라는 메소드는 한 번에 1byte씩 읽으므로 한글을 쓸 때 오류가 생긴다.
		} catch(Exception ex)
		{
		}
		
		
		System.out.println("프로그램 종료");
		
	} // main
}
