// 패키지 선언
// 현재 자바 파일이 어떤 패키지 내에 위치하는지를 표현한다
package com.test.java;

// 클래스 Class
// - 코드의 집합을 의미한다.
// - public class Ex01: 클래스 선언부(Header)
// - {}: 클래스 몸통(Body), 구현부

public class Ex01 {

	// 메소드 Method
	// - 코드의 집합을 의미한다.
	
	public static void main(String[] args) {

		// 명령어의 문장 단위 구성
		// 자바의 문장 종결자: ;
		// 클래스: System 
		// 멤버 접근 연산자: . (부모.자식으로 연결한다)
		// 필드(field): out
		// 메소드 호출: println
		// 문자 리터럴: 안녕하세요
		
		System.out.println("안녕하세요.");
	}
	
	/*
		# 특수문자(영문 표현)
		~ , !, @, #, $, %, ^ (caret, xor)
		&, *, -, _, +, =,
		;, :, ", ', ?, /, \ (back slash)
		` (역따옴표, back quote, back tick)
		| (pipe, vertical bar, or)
		( ), { }, [ ], < >
		
		# 코드 자동 완성
		이클립스 > 코드 자동 완성 > Ctrl + Space
		- 현재 상태에서 사용 가능한 문법만 보여준다는 점에서 중요하다.
		- 이클립스 버그로 인해 나타나지 않는 경우도 있으므로 주의한다.
		
		# 단축키
		Ctrl + Alt + 방향키 (위/아래): 코드 복사
		Ctrl + Space: 코드 자동 완성
		Alt + 방향키 (위/아래): 코드 위치 치환
		Ctrl + D: 코드 한 줄 삭제
		Ctrl + Shift + L: 단축키 모음
		Ctrl + F6: 페이지 전환(Ctrl + Tab으로 변경)
		F3: 변수의 선언부로 이동
		sysout + Ctrl + Space: System.out.println 입력
		
		프로그램 = 데이터 + 행동 -> 흐름
		
		# 자바의 자료형, Data Type
		- 데이터(자료)의 형태
		- 데이터의 길이(범위)와 생김새를 미리 정의하고, 그 정의에 따라 분류해놓은 규칙
		- 형태 + 길이
		
		*** 명확하게 답변할 수 있어야 한다.
		1. 원시형 (Primitive Type)
			a. 숫자형
				1. 정수형
				
				2. 실수형
				
			b. 문자형
			
			c. 논리형
		2. 참조형 (Reference Type)
		
	*/
}
