package com.test.java;

public class Ex22_LocalVariable {

	// 멤버 변수
	int a;
	
	public static void main(String[] args) {
		
		//Ex22_LocalVariable.java
		
		/*
			자바 변수의 종류 (자바 기준)
			1. 멤버 변수, Member Variable
				- 클래스에서 나오는 개념
			
			2. 지역 변수, Local Variable
				- 메소드 내에 선언한 변수
				- *** 변수의 선언 위치
			
			
			지역 변수의 생명 주기, Life Cycle
			- 언제 태어나서(메모리에 생성) ~ 언제 죽는지(메모리에 소멸)를 나타낸다.
			- 생성: 변수 선언문이 실행되는 순간 태어난다. (메모리의 효용성을 높이기 위해 필요할 때 만들어서 쓴다.)
			- 소멸: 변수 선언문이 포함된 자신의 영역에서 제어를 벗어나는 순간
			
			
			지역 변수의 영역(Scope)
			- 선언문이 포함된 블럭({})을 의미한다.
			- 메소드가 끝나 제어를 벗어나면 지역 변수는 소멸한다.
		 */
		
		int c; // 변수가 생성되는 시점
		
		
		String name = "Isaac";
		// String name = "Sopia"; X
		// 지역 변수의 특징: 메소드가 다르면 동일한 이름의 식별자가 있어도 오류가 나지 않는다. (중복 가능)
		
		m1();
		
		// System.out.println(age);
		// 서로 다른 메소드에 있는 자원은 사용 할 수 없다.
		
		
		int num;
		// int result = num + 10;

		// The local variable num may not have been initialized
		// 지역변수는 초기화하지 않으면 사용할 수 없다.
		// 지역변수를 생성한 직후 상태는 NULL 상태이다.
		// System.out.println(num);

	}// main
	
	// 매개변수도 지역변수이다.
	// 인자값을 넘길 때 생성되고, 메소드가 끝날 때 소멸한다.
	public static void m2(String gender) {
		
		// 매개변수 == 지역변수
		// String gender; X
		
	}
	
	public static void m1() {

		String name = "Sopia";
		int age = 20;
		
		System.out.println(age);
		
	} // name과 age변수를 없애고 돌아간다.
}
