package com.test.java;

public class Ex19_Method {

	/*
	main 메소드
	- 특수 메소드
	- 이름이 예약어이다. (main)
	- 프로그램이 시작되면 자바가 자동으로 호출하는 메소드
	- 프로그램의 시작점(Start
	- 프로그램의 종착점(End
	*/
	
	public static void main(String[] args) {
		
		// Ex19_method.java 5:6
	
		/*
		메소드, Method
		- 함수(Function), 프로시저(Procedure), 서브 루트(Sub Routine)
		- 코드의 집합이자 행동의 단위이다.
		- 같은 목적을 가진 코드의 집합을 의미한다.
		- 코드 재사용의 단위이다.
		
		변수 사용 절차
		1. 변수 선언
		2. 변수 사용
		
		메소드 사용 절차
		1. 메소드 선언
		2. 메소드 사용(호출): 실행
		
		메소드 사용 목적
		1. 코드의 분리: 목적에 맞는 코드를 각각 따로 관리하겠다는 의미이다.
		2. 코드의 재사용
		3. 유지보수가 쉬워진다.
		*/
		
		// 요구사항) "안녕하세요." 출력 x 5회
		// 수정사항) "반갑습니다." 수정
		// 같은 코드를 반복적으로 작성하면 수정해야 할 때 번거로울 수 있다.
		
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요\n");
		
		// 메소드 호출(실행)
		hello();
		hello();
		hello();
		hello();
		hello();
		
		
		// 요구사항) 숫자를 한글로 1 ~ 10까지 출력
		printNumber();
		
		// 메소드는 메소드끼리 독립적인 관계이다.
		// 메소드는 클래스 밖으로 나갈 수 없다. 메소드는 클래스가 소유한 자식이기 때문이다.
	} // main
	
	// 메소드 선언
	// 1. 클래스 내부에 선언해야 함
	// 2. 메소드 간의 순서는 무관함
	// 3. 보통 메인 메소드를 가장 상단부에 위치시키는 편이다.
	
	/*
		메소드 선언 구문
		
		public static void hello() {
		
			(메소드 내용)
		
		}
		
		- public static void hello(): 선언부(header)
			이 메소드의 성격, 성질 등을 나타낸다.
		- {}: 구현부(body)
			실제로 해당 메소드의 내용을 나타낸다.
		
		- public: 접근 지정자(제한자) Access Modifier
		- static: 정적 키워드
		- void: 반환 자료형
		- hello: 메소드명
		- (): 인자 리스트
		
		- void와 hello 부분에 대해서 알아보도록 한다.
	*/
	
	// 특정한 목적을 가지는 코드의 집합
	
	public static void hello() {
		
		// 해당 메소드가 하려는 업무 구현
		System.out.println("반갑습니다");
		
	}
	
	public static void printNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		System.out.println("");
		
	}
	
} // class
		