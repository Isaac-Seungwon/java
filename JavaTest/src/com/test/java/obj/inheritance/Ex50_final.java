package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex50_final {

	public static void main(String[] args) {
	
		// Ex50_final.java
		/*
		
			final 키워드
			- 한 번 결정하면 바꿀 수 없다.
			- 안정성이 높다.
			
			1. 변수 적용 (지역 변수, 멤버 변수)
				- 초기화 이후 값을 변경할 수 없다.
				- 상수
			
			2. 메소드 적용
				- 상속
				- 오버라이드 금지!!
				- 부모 메소드 > 수정하지 못하게 한다.
				
			3. 클래스 적용
				- 상속
				- 부모 클래스 > 수정하지 못하게 한다.
		*/
		
		// 지역 변수
		int a = 10;
		a = 20;
		a = 30;

		// 권장 > 선언과 동시체 초기화
		// final 변수 = 상수
		final int b = 10;
		// b = 20; // final 변수는 값을 변경할 수 없다.
		
		// 비권장 > 변수처럼 보인다.
		final int c;
		c = 10; // 초기화를 나중에 하는 건 된다.
		
		
		Test t = new Test();
		t.a = 20;
		// t.b = 30;
		
		
		System.out.println(Calendar.YEAR); // 캘린더 상수
		// Calendar.Year = 2;
		
		
		int gender;
		
		gender = 1;
		gender = 2;
		
		int male = 1;
		int female = 2;
		
		male = 2;
		
		final int MALE = 1;
		final int FEMALE = 2;
		// 지역변수여서 메인메소드 안에서밖에 사용할 수 없다.
		
		
		System.out.println(Gender.MALE);
		
	}
	
	public static void test(final int a) {
		System.out.println(a);
		// a = 2;
	}
	
}

class Test {
	public int a = 10;
	public final int b = 20; // 멤버 변수
}

// 남자(1), 여자(2)
class Gender {
	static public final int MALE = 1;
	static public final int FEMALE = 2;
}


class FinalParent {
	// 부모 클래스 설계..
	// - test() > 나중에 상속받은 자식 클래스가 이 test() 메소드를 재정의 하면 안 될 거 같다.
	// 
	
	final public void test() { // final로 수정
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent {

	/*
	// final 키워드를 붙여서 상속을 시키면 자식 클래스가 오버라이드 할 수 없다.
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
	*/
	
}


// 부모 클래스 설계.. > 상속 불가능
final class FinalMember {
	
	
}

// The type FinalUser cannot subclass the final class FinalMember
//class FinalUser extends FinalMember {
//	
//}