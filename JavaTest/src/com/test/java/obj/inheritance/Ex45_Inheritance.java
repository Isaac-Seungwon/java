package com.test.java.obj.inheritance;

public class Ex45_Inheritance {

	public static void main(String[] args) {
		
		// Ex45_Inheritance
		
		/*
			상속, Inheritance
			- 업무의 규모가 커지면 난이도가 높아지는 기술이 있는데, 상속이 그중 하나이다.
			
			- 현실 정의: 부모가 가지는 재신을 자식에게 물려주는 행동
			- 자바 정의: 부모 클래스가 가지는 멤버 변수, 멤버 메소드를 자식 클래스에게 물려주는 행동
			
			# 상속은 부모 클래스에 있는 100% 모든 내용을 복사해서 자식 클래스에 붙여넣기 하는 것으로 이해할 수 있다.
			- 정확히 말하면 주는 게 아니라 카피하는 것이다.
			
			- 자식 클래스가 코드를 구현하지 않아도 부모 클래스로부터 구현된 코드를 물려받는 행동이다.
			
			# 왜 상속을 사용하는가?
			- 비용 절감이 된다.
			- 코드 재사용이 된다. (************) <- 이게 결국 돈이기 때문이다.

			# 상속 관계에 있는 클래스 호칭
			// 상속을 어떤 목적으로 하느냐에 따라 부르는 말이 조금씩 달라진다.
			- 부모 클래스 <- 자식 클래스
			- 슈퍼 클래스 <- 서브 클래스
			- 기본 클래스 <- 확장 클래스
			- 기본 클래스 <- 파상 클래스
			
			
		*/
		
		
		Parent p = new Parent(); // Parent 클래스의 객체 p 만들기
		p.a = 10;
		p.b = 20;

		
		Child c = new Child();
		c.a = 10; // 부모 클래스가 물려 준 멤버
		c.b = 20;
		c.parentMethod();
		// Child 클래스에서는 아무것도 구현한 것이 없지만, 부모 클래스에서 물려받은 것들을 사용할 수 있다.
		
	}
} // class


// Parent 클래스와 Child 클래스를 만들어서 부모 자식 관계로 묶어보도록 하자.
// 부모 자식 관계를 표시하는 방법으로 부모가 자식을 보고 자기 자식이라고 가리키거나 자식이 부모를 보고 자기 부모라고 가리키는 방법을 생각할 수 있다.
// 이때 부모 클래스부터 만들어지고, 자식 클래스를 만들어지므로 나중에 태어난 자식 클래스가 부모 클래스를 가리키는 방법으로 사용하고 있다.
// 관계를 표시하는 방법은 자식 클래스 뒤에 extends를 쓰고, 부모 클래스가 될 클래스의 이름을 쓰면 된다.
// extends는 확장이라는 의미지만, 통상적으로 상속이라고 부른다.

// 부모 클래스
class Parent {

	public int a;
	public int b;
	// private로 만드는 게 맞지만, 그러면 getter와 setter도 만들어야 하므로 간단하게 설명하기 위해 public으로 선언
	
	public void parentMethod() {
		System.out.println("부모가 구현한 메소드");
	}
}

// 자식 클래스
class Child extends Parent {

	// 부모가 물려준 것은 물려준 거고, 자식 클래스가 따로 구현할 수도 있다.
	// 겉으로 보기에는 멤버가 3개밖에 없는 거 같지만, 부모가 물려준 것까지 합하면 6개가 된다.
	
	public int c;
	public int d;
	
	public void childMethod() {
		System.out.println("자식이 구현한 메소드");
	}
}


// 회원
// 1. 일반 회원
//	- 이름
// 	- 아이디
//	- 암호
// 	- 이메일

// 2. 관리자 회원
//	- 이름
//	- 아이디
//	- 암호
//	- 등급

// 부모 클래스
class Member {
	public String name;
	public String id;
	public String pw;
}

// 일반 회원
class User extends Member {
	public String email;
}

// name, id, pw 멤버 변수 3개가 회원으로서 가지는 공통점으로 볼 수 있다. 공집합인 부분을 재사용할 수 있게 바꿔야 한다.
// 머릿속으로 염두에 둬야 하는 것은 내가 만든 코드가 지금 당시 생각으로는 완벽할지라도 분명히 무언가 나중에 뜯어고쳐야 하는 일이 생긴다는 것이다.
// 부모는 자식을 여러 명 가질 수 있다. (제한이 없다.)

// 관리자 회원
class Administrator extends Member {
	public String name;
	public String id;
	public String pw;
	public String lv;
}


class AAA {
	public int a = 10;
}

class BBB extends AAA {
	public int b = 20;
}

class CCC extends BBB {
	public int c = 30;
}

class DDD extends CCC {
	public int d = 40;
}

// 부모와 자식에서 끝났는데, 그 밑에 세대가 하나 더 생겼다. 조부모, 부모, 자식 관계가 형성되었다.
// 이처럼 상속은 세대와 상관없이 계속 물려받을 수 있다.