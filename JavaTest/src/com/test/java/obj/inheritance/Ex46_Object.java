package com.test.java.obj.inheritance;

public class Ex46_Object {

	public static void main(String[] args) {
		// Ex46_Object.java
		
		/*
			Object 클래스 (****)
			- JDK에서 제공하는 클래스
			- 자바를 통틀어 가장 중요한 클래스이다.
			- 사용 빈도가 높지는 않다.
			- 눈으로는 보이지 않는 경우가 많은데, 우리가 사용하는 것에 밀접하게 관계되어 있는 경우가 많다.
			- 모든 클래스의 근원이 된다고 해서 Root Class, 루트 클래스라고 부른다.
			- Object클래스의 9개 메소드 > 모든 클래스들에게 공통으로 필요하다고 생각되는 기능이 구현되어 있다.
			
			- Class Object is the root of the class hierarchy.Every class has Object as a superclass.
			- All objects,including arrays, implement the methods of this class.
			
		*/
		
		Object o1 = new Object();

		
		TestChild testC = new TestChild();
		
		// 어떤 멤버를 쓸 수 있는가?
		// - a, b
		// - c, d
		testC.a = 10;
		testC.b = 10;
		testC.c = 10;
		testC.d = 10;
		
		// 그런데 쓸 수 있는 게 더 있다.. Object 클래스이다.
		
	}
}

// extends Object
// 두둥탁 나도 모르는 출생의 비밀
// 개발자가 만드는 모든 클래스는 명시적으로 상속을 구현하지 않으면 자동으로 Object 클래스의 자식 클래스가 된다.
// 부모 클래스에 보이지는 않아도 extends Object가 되어 있는 상태라는 것이다.

class TestParent extends Object {
    public int a;
    public int b;
}

class TestChild extends TestParent {
    public int c;
    public int d;
}
