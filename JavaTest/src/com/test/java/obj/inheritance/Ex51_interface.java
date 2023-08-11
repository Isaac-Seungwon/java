package com.test.java.obj.inheritance;

public class Ex51_interface {

	public static void main(String[] args) {
		
		// Ex51_interface.java
		
		/*
			인터페이스, interface
			- 클래스의 일종
			- 자료형 (클래스가 자료형인 것처러럼 인터페이스도 자료형이다.)
			- 객체를 생성할 수 없다.
			- 참조 변수는 생성할 수 있다.
			- 클래스의 부모 역할을 한다. > 상속 관계로 만들어진다.
			
			# 왜 클래스가 자료형일까?
		*/
		
		Mouse m1 = null; // new Mouse();
		// m1.click();
		
		
		// *** 인터페이스는 상속받는 여러 클래스들을 행동(사용법, 메소드)들을 통일시키는 역할을 하며, 이를 행동 규약을 정의한다고 한다.
		
		M705 m2 = new M705();
		m2.click();
		
		G304 m3 = new G304();
		// m3.click();
		// m3.push(); // *** 문제점! > 사용자 경험을 살리지 못함!!
		m3.click();
		
		
		// 추상 메소드, Abstract Method
		// - 구현부 없이 선언부만 가지는 메소드
		
	}// main
}// class

// 인터페이스 선언
interface Mouse {
	
	// 인터페이스 멤버
	// - 멤버 변수
	// - 멤버 메소드
	
	// ***** 인터페이스는 구현된 멤버를 가질 수 없다.
	// ***** 인터페이스는 구현부를 가진 메소드를 소유할 수 없다.
	// public int a;
	// public void aaa(){
	// 		// 구현부
	// }
	
	// 추상 메소드, Abstract Method
	// - 구현부 없이 선언부만 가지는 메소드
	public void click();
	
	
}

// The type M705 must implement the inherited abstract method Mouse.click()
// 상속받은 추상메소드 click()을 반드시 선언해야 합니다.
// *** 인터페이스를 상속받는 클래스는 반드시 인터페이스의 추상 메소드를 구현해야 합니다.
class M705 implements Mouse {
	
	// 추상메소드 구현: 없던 구현부를 구현했다고 해서 추상메소드를 구현헀다고 한다.
	//	> 일종의 오버라이드
	// 아버지가 자신이 가질 수 없는 메소드를 물려준 것이다. 일단 물려받고 나니 오버라이딩 형태로 보이는 것이다.
	public void click() {
		System.out.println("클릭");
	}
	
}

class G304 implements Mouse {
	
	// M705의 click()과 동일한 기능 > 제품 마다 사용법이 다 다르다
//	public void push() {
//		System.out.println("클릭!!");
//	}
	
	@Override
	public void click() {
		System.out.println("클릭!!");
	}
	// click을 만들지 않으면 선언이 되지 않는 강제성을 부여한다. 
}