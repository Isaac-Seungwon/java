package com.test.java.obj.inheritance;

public class Ex68 {

	public static void main(String[] args) {
		
		// Ex68.java
		// super라는 단어는 this와 대응되는 단어이다.
		
		// this vs super
		// - 둘 다 객체 지정 연산자이다.
		// - this: 자기 자신
		// - super: 부모
		
		CupParent p1 = new CupParent();
		p1.check();
		
		
	}
}

class CupParent {
	
	private int a = 10;
	private int b = 20;
	
	// 자기가 자기 자신을 접근할 때 this
	public void check() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
}

class CupChild extends CupParent {
	
	private int c = 30;
	private int d = 40;
	
	public void check() {
		
		System.out.println(this.c);
		System.out.println(this.d);
//		System.out.println(this.a); // 부모의 private를 접근하려면 public을 하는 방법밖에 없다.
//		System.out.println(this.b);
		
		super.check(); // 부모의 메소드를 호출하는 방법
	}
}
