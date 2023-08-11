package com.test.java.obj.casting;

public class Ex55_Casting {
	public static void main(String[] args) {
		
		// Ex55_Casting
		
		/*
			형변환, Type Casting
			
			1. 값형 형변환
			 	- integer형을 character형으로 바꾸고 double형을 float형으로 바꾼다.
				- 값형끼리 형변환 (boolean 제외)
				- 사실상 숫자형끼리 형변환 (character도 따지고 보면 숫자형이기 때문)
			
			2. 참조형 형변환
				- 참조형끼리 형변환
				- 클래스끼리 형변환
				
			# 참조형 형변환
			Student 클래스를 member로 바꾸고 Calendar 클래스를 User로 만들고,,
			
			- 전제 조건
				- 상속 관계에 있는 클래스간의 형변환만을 지원한다.
				- 그것도 직계(부모 자식 관계 - 위아래로 이어지는 관계)끼리만 가능하다. (방계 - 같은 부모의 자식들 간의 관계 - 끼리는 불가능하다.)
			
			- A 클래스 > B 클래스로 바꾸는 행동
				- 클래스도 하나의 자료형이다. 하나의 자료형을 또다른 자료형으로 바꾼다고 해서 형변환이라고 부른다.
			
			1. 업캐스팅, Up Casting
				- 암시적인 형변환 (안전하다는 뜻, 생략해도 된다는 뜻)
				- 부모 클래스 타입을 자식 클래스 타입으로 변환 
			
			2. 다운캐스팅, Down Casting
				- 명시적 형변환 (불안정하다는 듯)
				- 자식 클래스 타입을 부모 클래스 타입으로 변환
		*/
		
		Parent p1;
		Child c1;
		
		c1 = new Child(); // 원본
		
		// # 복사
		// Parent = Child
		p1 = c1;
		p1 = (Parent)c1; // 원형
		// *** 업캐스팅(암시적인 형변환) 발생
		// 자식 클래스를 부모 클래스에 복사를 하면 항상 암시적인 형변환이 발생한다.
		// 100% 안전하다.
		
		// 복사 후 검증
		// > 복사된 참조 변수(p1)을 테스트 해본다.
		// > 모든 멤버가 정상적으로 동작하는지 접근 테스트를 하면 된다.
		// 검증은 코드로는 알아보기 힘들다.
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		
		
		Parent p2;
		Child c2;
		
		p2 = new Parent(); // 원본
		
		// Chile = Parent
		// 다운캐스팅(명시적인 형변환) 발생
		// 자식 클래스 = 부모 클래스
		// 불안정하다.
//		c2 = (Child)p2;
//		
//		// 복사 후 검증
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30; // 있다고 해서 갔더니 데이터를 넣을 변수가 없음
//		c2.d = 40; // ClassCastException
//		
//		System.out.println(c2.a);
//		System.out.println(c2.b);
//		System.out.println(c2.c);
//		System.out.println(c2.d);
		
		// 전체가 안 된다고 오류가 나기도 하지만, 다운캐스팅이 될 때가 있다.
		
		
		Parent p3;
		Child c3;
		
		c3 = new Child(); // 원본
		
		// 업캐스팅
		p3 = c3;
		
		
		
		Child c4;
		
		// 다운캐스팅 > 100% 불가능하다고 했다.
		c4 = (Child)p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
	}
}

class Parent {
	public int a;
	public int b;
}

class Child extends Parent {
	public int c;
	public int d;
}