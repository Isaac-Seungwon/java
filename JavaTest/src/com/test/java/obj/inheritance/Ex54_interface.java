package com.test.java.obj.inheritance;

public class Ex54_interface {
	
	public static void main(String[] args) {
		
		// Ex54_interface.java
		
		/*
			상속
			1. 단일 상속 > (기준이 자식) 부모가 1개
			2. 다중 상속 > (기준이 자식) 부모가 2개 이상
			
			*** 자바는 다중 상속을 허용하지 않는다.
			
			*** 인터페이스에 한해서 다중 상속을 허용한다.
				> 인퍼페이스는 구현부가 없기 때문이다.
				> 인터페이스는 껍데기만 만들어 놓기 때문에 문제가 생기면 클래스보다 훨씬 찾기 편하다.
		*/
		
		사람 isaac = new 사람();
		
		isaac.출근();
		isaac.업무();
		isaac.퇴근();
		
		isaac.요리();
		isaac.청소();
		isaac.수면();
	}
}

interface 회사 {
	void 출근();
	void 퇴근();
	void 업무();
}

interface 가정 {
	void 요리();
	void 청소();
	void 수면();
}

// 인터페이스에서는 다중 상속의 가능하다.
// 인터페이스는 때와 장소에 따른 자격 (role)으로 볼 수 있다.
// 어떤 객체는 꼭 하나의 역할만 하는 것이 아니다. 때에 따라 다른 역할을 할 수 있다는 점을 기억하자.
// 이처럼 사람 클래스로 만든 isaac 객체는 회사와 가정에서 하는 역할을 각각 다르게 할 수 있다.

class 사람 implements 회사, 가정 {
	@Override
	public void 출근() {
	}

	@Override
	public void 퇴근() {
	}

	@Override
	public void 업무() {
	}

	@Override
	public void 요리() {
	}

	@Override
	public void 청소() {
	}

	@Override
	public void 수면() {
	}
}

// 새로운 클래스가 만들어지면 그 부모가 누구인지를 먼저 확인하는데, 이렇게 구분할 경우 자식 클래스가 어떤 성격인지 이해하기 쉽고, 유연하게 대처가 가능하다.
//class Lee implements 회사 {
//	
//}
//
//class Park implements 가정 {
//	
//}