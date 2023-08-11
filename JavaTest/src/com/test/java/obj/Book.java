package com.test.java.obj;

public class Book {

	// *** 접근 지정자 > 가이드 라인
	// 1. 멤버 변수는 무조건 pritave을 사용한다.
	// 2. Getter / Setter를 구현한다.
	// 실무에서 늘상 사용하는 가이드라인이니 잊지 말 것!
	
	/*
	public String title;
	public String author;
	public String publisher;
	public int price;
	public int page;
	*/ 
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	private int page; // Create getter and setter for ...
	
	public void aaa(String a) {
		// title = a;
		this.title = a;
		// 지역 변수에 없으면 자바가 멤버 변수에서 알아서 찾는다.
		// 하지만 가독성을 위해서 this.를 써주는 게 좋다.
		// 지역 변수를 멤버 변수에 넣어준다는 것을 알 수 있다.
	}
	
	// 왜 접근해야 할 애는 private로 감추고 간접적으로 빙 에둘러서 값을 넣으려는 걸까?
	// 그 이유는 변수와 메소드의 차이 때문이다.
	// 메소드로 오픈했을 때 장점은 내부에 원하는 업무를 추가로 구현할 수 있다. 이곳에서 유효성 검사를 하는 것이다!
	// 이를 Getter / Setter를 구현한다고 하며, 안정성을 굉장히 많이 높일 수 있다.
	
	public void bbb(int b) {
		if (b>=0 && b<=100000) {
			price = b;
		} else {
			System.out.println("올바른 책 가격이 아닙니다.");
		}
	}
	
	public int ccc() {
		return price; // 읽기 > 데이터 손상을 발생시키지 않는다.
	}
	
	
	// Setter / Getter > 객체 내외부를 연결하는 통로 역할
	//					> 인터페이스 역할
	//					> 프로퍼티(Property) ** 멤버변수보다 프로퍼티로 불릴 확률이 더 높다. > 값을 건드리므로
	
	// 책 제목
	// Setter
	// 1. set 접두어
	// 2. void
	
	public void setTitle(String title) {
		// 멤버변수 = 매개변수
		// title = title;
		
		// title? > 무조건 누군가를 가리킨다. (이미 정해져 있음)
		
		//******* 영역이 큰 요소와 영역이 작은 요소가 충돌하면, 반드시 작은 영역의 요소를 우선한다. (대부분의 프로그래밍 환경)
		// 멤버 변수 > 클래스 전역 > title
		// 지역 변수 > 메소드 전역 > title
		
		// this 연산자
		// - 객체 접근 연산자
		// - '나' > 객체 자기 자신을 가리키는 표현
		this.title = title; // 좁은 범위가 훨씬 더 구체적이고 특정 짓기 좋은 편이라서 결과가 이렇게 나온다.
	}
	
	// Getter
	// 1. get 접두어
	// 2. return 값
	public String getTitle() {
		return title;
	}

	// Source > Generate Getters and Setters
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
