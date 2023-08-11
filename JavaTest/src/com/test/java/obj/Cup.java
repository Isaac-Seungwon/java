package com.test.java.obj;

public class Cup {

	private String color;
	private int size;
	
	/*
	컴파일러가 자동으로 생성한다. > ***기본(default) 생성자***
	개발자가 직접 생성자를 구현하면, 컴파일러는 생성자를 만들지 않는다.
	
	얼핏 보면 메소드처럼 생겼는데, 좀 특이하다.
	1. 메소드명이 클래스명과 동일하다.
	2. 반환형이 생략되어 있다. (접근지정자 public과 Cup() 사이에 void라는 키워드 조차 없다.)
		> 반환값을 가질 수 없다.
	3. 구현부 > 일반 메소드
	
	*/

	public Cup() {
		
		// *** 생성자의 역할
		// - 멤버를 초기화하는 전용 메소드
		// - 방금 new가 만든 갓 태어난 객체를 초기화하는 역할을 한다.
		// - 공장의 생산라인에서 앞 사람이 부품을 끼워 넣으면 그 다음 사람이 케이스를 끼워 넣는 것처럼 아무것도 가지지 않는 객체 원본을 가지고 나면 그 객체의 초기 값을 세팅해주는 역할을 한다. 그래서 new가 객체를 만들면 생성자가 초기화하는 역할을 한다.
		
		// this.color = "yellow";
		// this.size = 300;
		
		this("yello", 300); // 생성자끼리 호출할 때에는 this를 사용한다.
		// * 생성자 위임
		// 유효성 검사를 몰아주었기 때문에 생성자 안에서 반복적인 일들을 여러 번 구현하지 않아도 된다.
	}
	
	// 생성자 (메소드) 오버로딩
	// 인자값을 이용해서 서로 구분할 수 있게 한다. > 생성자도 골라서 호출할 수 있다!
	// 컵을 만드는 방법을 4가지를 제공할 수 있다.
	// 생성자 오버로딩이 잘 되어있으면 골라서 쓸 수 있으므로 객체를 만들어서 쓰는 입장에서 사용하기 훨씬 편하다.
	public Cup(String color) {
		this(color, 300);
	}
	
	public Cup(int size) {
		this("yellow", size);
	}
	
	public Cup(String color, int size) {
		this.color = color;
		
		// 유효성 검사
		if (size > 0 && size < 3000) {
			this.size = size;
		}
	}

	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public String info() {
		return "색상 " + this.color + ", 크기: " + this.size ;
	}
}
