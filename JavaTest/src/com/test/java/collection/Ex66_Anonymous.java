package com.test.java.collection;

public class Ex66_Anonymous {

	public static void main(String[] args) {
		
		// Ex66_Anonymous.java
		
		/*

			익명 객체, Anonymous Object
			- 익명 클래스, Anonymous Class
			- 이름 없는 클래스
		
		*/
		
		// 요구사항) 인터페이스를 구현한 클래스 선언 > 객체 생성
		
		// 1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		
		// 2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		
		// 3. 구현부가 없는 메소드이므로 불가능하다고 했었지만..?
		// AAA b3 = new AAA();
		// b3.aaa();
		
		
		// AAA b3 = new AAA() {};
		// 중괄호를 넣었다. 여전히 에러가 발생한다.

		// The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		// 인터페이스를 상속받는 일반 클래스가 인터페이스가 반드시 만들라고 하는 추상 메소드를 구현하지 않았을 때 발생하는 에러가 발생했다.
		
		// new AAA()는 없다고 생각한다. <- 임시 머리통 역할
		// 머리통이 없는 클래스 선언이라고 생각하면 된다. (몸통만 있는 클래스)
		// 클래스에서 머리통의 역할은 이름을 붙이는 것 뿐이다.
		// 본인의 이름이 없어서 자기 타입을 만들 수 없다. 이게 바로 '익명 클래스'이다.
		AAA b3 = new AAA() {
			@Override
			public void aaa() {
				System.out.println("aaa");
			}
		};
		
		
		// b2 vs b3
		
		// b2
		// - AAA 인터페이스 선언
		// - BBB 클래스 구현
		
		// b3
		// - AAA 인터페이스 선언
		// - 실명 클래스를 구현하지 않았다. > 익명 클래스를 구현했다.
		// - 익명 클래스를 구현하는 이유는 클래스의 재사용성 때문이다.
		
		// - 실명 클래스는 클래스를 재사용할 의사가 있다는 의미이다.
		// - 익명 클래스는 클래스를 재사용할 의사가 없다는 의미이다.
		
		// 클래스(틀) 사용 목적 > 객체 생성
		
		// 익명 클래스도 붕어빵 틀은 맞는데, 붕어빵을 딱 1개만 만들기 위한 틀이다.
		// 애써서 붕어빵 틀을 만들었는데, 평생 단 1개의 붕어빵만을 찍어낼 수 있다.
		// 대중적인 클래스는 아니지만, 특별한 상황에서 사용하면 편한 상황을 만들어낼 수 있다.
		AAA t4 = new AAA() {
			@Override
			public void aaa() {
				// 이 부분을 다시 부를 수 있는 방법이 없다.
			}
		};
		
		AAA t5 = new AAA() {
			@Override
			public void aaa() {
				// 생김새는 똑같다고 하더라도 서로 다르다.
				// 이는 동명이인같은 것이지, 서로 전혀 상관없는 별도의 클래스이다.
			}
		};
		
		
		
	}// main
}// class

interface AAA {
	void aaa();
}

// The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA {
	@Override
	public void aaa() {
		System.out.println("aaa");
	}
}

