package com.test.java.obj;

public class Ex37_Class {

	public static void main(String[] args) {
		
		// Ex37_Class.java
		
		User u1 = new User();
		
		u1.name = "Isaac";
		u1.age = 20;
		u1.hello();
		
		
		User u2 = new User();
		
		u2.name = "Sopia";
		u2.age = 22;
		u2.hello();
		
		
		// 행동 클래스 > 객체를 여러 개 생산하지 않는다.
		// 메소드만을 가지고 있는 행동 클래스는 동일한 상황에서 동일한 목적에서 쓰인다면 두 개 이상 만들지 않는다.
		MyMath m1 = new MyMath();
		
		m1.add(10, 20);
		m1.subtract(50, 30);
		
		MyMath m2 = new MyMath();
		m2.add(10, 20);
		m2.subtract(50, 30);
		
	}
	
}// class


//public static void hello() 에서 static을 붙이지 않는 이유는?

// 클래스(객체) = 데이터 + 행동
class User {
	
	// 클래스 멤버
	// 1. 변수
	// 2. 메소드
	
	
	// 클래스 멤버 변수 > 프로퍼티 (특성)
	// 개성있게 만들어주는 것과 동시에 유일하게 만들어주기 때문에 프로퍼티(특성)라고 부른다.
	public String name;
	public int age;
	
	
	// 클래스 멤버 메소드 > *** 호출되는 객체에 따라 다른 결과가 발생되어야 한다.
	// ********* 클래스 멤버 메소드는 멤버 변수를 활용해서 행동해야 한다.
	public void hello() {
		// System.out.println("안녕하세요.");
		System.out.printf("안녕하세요. 저는 %s입니다.\n", name);
	}
	
	// 이 메소드는 굳이 따지자면 잘못 만들어진 메소드이다.
	// 왜 잘못되었냐면 u1에서 hello메소드를 호출하든 u2에서 hello 메소드를 호출하든 결과가 똑같다는 건 낭비가 된다는 것이기 때문이다.
	// 두 사람에게 호출받는데 아무런 차이가 없다면 굳이 가지고 있을 필요가 없는 것이다. (활용 가치가 떨어진다.)
	// 멤버 메소드에 멤버 변수를 활용하면 행동에 변화가 생기고 활용 가치가 생기게 된다.
}


class MyMath {
	
	// 멤버 변수 (X)
	// 멤버 메소드 (O)
	// 굉장히 드문 형식의 클래스지만, 사용은 할 수 있다.
	
	// 개성이 없는 메소드 > 객체간의 행동 구분이 불가능하다.
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

}
