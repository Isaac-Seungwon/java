package com.test.java.obj;

public class Ex42_Constructor {

	public static void main(String[] args) {
		
		// Ex42_Constructor.java
		
		/*
			생성자, Constructor
			- (특수한 목적을 가지고 있는) 메소드
			- 멤버를 초기화하는 역할
		*/
		
		// 자료형 변수명 = new 생성자();
		Box box = new Box();
		
		
		// 모든 참조형(배열 포함)은 객체 생성 직후 자동으로 멤버가 초기화된다.
		// 생성자가 우리 몰래 알아서 초기화 하므로, 생성자를 미리 정해두면 중간 단계를 거치지 않고 원하는 모양의 객체를 만들 수 있게 된다.
		// 생성자를 쓰는 이유: 갓 만들어진 객체를 내가 원하는 상태를 갖게끔 초기화하려는 의도이다.
		
		// #실행순서: new -> Cup()
		// 1. new > 객체 생성 연산자: 객체를 생성한다.
		// 2. Cup() > 메소드 호출
		
		// 1: new > yellow, 300
		// 2: new > null, 0 > yellow, 300 (순서) 생성자를 한 번 거치고 나서 초기화가 된다.
		// 1
		Cup c1 = new Cup();
		
		// 2
		// c1.setColor("yellow");
		// c1.setSize(300);

		System.out.println(c1.info());
		
		
		// new > (생성자 기본값) yellow, 300 > green, 500
		// 생성자를 호출하지 않고는 객체를 만들 수 없다. > 무조건 거쳐야 함
		// 다른 색의, 다른 용량이 필요할 때에는 생성자가 걸림돌이 된다.
		// 이를 효과적으로 바꾸는 방법 > 생성자 오버로딩 (생성자도 메소드이다)
		Cup c2 = new Cup();
		c2.setColor("green");
		c2.setSize(500);
		System.out.println(c2.info());
		
		
		// new > pink, 300
		Cup c3 = new Cup("pink");
		System.out.println(c3.info());
		
		
		// new > yellow, 350
		Cup c4 = new Cup(350);
		System.out.println(c4.info());
		
		
		// new > orange, 350
		Cup c5 = new Cup("orange", 350);
		System.out.println(c5.info());
		
		
		// Cup(); // The method Cup() is undefined > Cup()을 일반 메소드로 취급하여 발생하는 오류
		// *** 생성자는 반드시 new와 함께 사용이 가능하다.
		//	> *** 생성자는 평생 딱 1번만 호출이 가능하다. (초기화 목적이므로 태어날 때만 호출되는 메소드이고, 그 이후에는 호출할 수 없다.)
		
		
	}// main
}
