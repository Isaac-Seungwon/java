package com.test.java.obj.inheritance;

public class Ex47_Overriding {
	
	public static void main(String[] args) {
		
		// Ex47_Overriding
		
		/*
			메소드 오버로딩, Method Overloading
			- 메소드 이름 동일 >  N개 생성 > 인자 리스트 변화
			
			메소드 오버라이딩, Method Overriding
			- 클래스 상속 시에 발생
			- 메소드 재정의 > 상속받은 메소드를 수정하는 기술
			
			
		*/
		// 직접적인 관계가 있는 기술은 아니지만, 어감상 비슷하다보니까 면접 때 잘 물어본다.
		
		OverrideParent hong = new OverrideParent();
		
		hong.name = "홍게";
		hong.hello();
		
		OverrideChild hongchild = new OverrideChild();
		
		hongchild.name = "홍소라게";
		hongchild.hello();
		
	}
}


// 상황) 동네 사람
class OverrideParent {
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
	
}

class OverrideChild extends OverrideParent {
	
	// 홍소라게는 홍게가 알려준 인사 방식이 마음에 들지 않았다.
	//	> 부모 클래스가 물려준 hello() 메소드를 사용하기 싫다.
	// *** 클래스 상속은 부모가 물려준 멤버를 자식이 거부할 방법이 없다!
	// 이럴 때 사용하는게 메소드 재정의이다.
	
	/*
	public void hi() {
		System.out.printf("하이~ 난 %s야~.\n", this.name);
	}
	*/
	
	// 메소드 재정의 (오버라이드)
	// 동일한 hello()를 2개 가지고 있다. 하지만 에러가 발생하지 않는다.
	// > 무조건 자식이 우선한다 > 자식의 hello()가 호출된다.
	// 이름이 똑같을 뿐이지 사실 다른 메소드이다. 그럼에도 불구하고 수정했다고 표현하는 이유는 겉으로 보기에 물려 준 것을 고쳐 쓰는 것처럼 보이기 때문이다.
	
	@Override
	public void hello() {
		System.out.printf("하이~ 난 %s야~.\n", this.name);
	}
}