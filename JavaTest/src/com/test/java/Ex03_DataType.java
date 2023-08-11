package com.test.java;

public class Ex03_DataType {

	public static void main(String[] args) {
		
		//Ex03_DataType.java
		
		/*
		변수 (Variable)
		- 개발자가 명령어를 사용해서 메모리에 할당받은 공간
		
		변수 생성하기
		- 공간을 할당 받는 방법
		
		1. 생성
			- 자료형 변수명
	
		학생 1명의 국어 점수를 저장한 후 화면에 출력하시오.
		1. 데이터 성질 파악
			a. 형태 파악 > 정수이므로 byte, short, int, long 중에서 선택
			b. 길이 파악 > 점수이므로 0 ~ 100을 저장 > byte 선택
			
		*/
		
		// 변수 생성 및 선언
		// 변수명: 메모리 주소 번지의 별명 (이를 참조한다고 표현한다.)
		// 7823468672 kor을 찾아서 들어간 메모리, 이 때 메모리를 가리키는 숫자는 컴퓨터가 기억한다.
		
		byte kor;
		
		// 변수 초기화
		// 변수 = 값 ('='는 비교연산자가 아니라 대입연산자, 할당 연산자로 쓰인다.)
		
		kor = 100;
		
		// 변수 호출 및 사용
		System.out.println(kor);
		
		// Ctrl + F11을 눌러  컴파일
	}
	
}
