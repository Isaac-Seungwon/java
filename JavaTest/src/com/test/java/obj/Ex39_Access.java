package com.test.java.obj;

import java.util.Calendar;

import com.test.question.Mouse;

public class Ex39_Access {

	public static void main(String[] args) {
		
		// Ex39_Access.java
		
		/*
			접근 지정자(제어자), Access Modifier
			- 주로 클래스 멤버에 붙여서 사용한다. > 멤버 변수, 멤버 메소드 > 오늘 수업할 내용
			- 혹은 클래스 자체에 붙여서 사용한다. 
			- 지역 변수에는 사용이 불가능하다.
			- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지 통제하는 역할을 한다. > 보안 수준 제어
			
			1. public
			2. private
			----------
			3. protected > 상속
			4. default > 패키지

			public과 private는 양 끝단에 있다.
			
			public
			- 
			
			private
			- 
		
		*/
		
		Box box = new Box();
		
		box.color = "갈색"; // public
		// box.size = 100; // private 값을 수정할 수 없다.
		
		box.aaa();
		// box.bbb(); // private 호출조차도 안 된다.
		
		
		// Book 객체
		Book book = new Book();
		
		/*
		public -> private
		book.title = "자바의 정석";
		book.author = "Isaac";
		book.publisher = "아이작출판";
		book.price = 30000;
		book.page = 1000;
		
		System.out.println(book.price);
		*/
		
		/*
		int temp = 30000; // 책 가격
		
		// 유효성 검사 (값으로 적합한 데이터가 들어갔는지 검사)
		if (temp >= 0 && temp <= 100000) {
			book.price = temp;
		} else {
			
		}
		*/
		book.aaa("자바의 정석");
		book.bbb(30000); // 쓰기 > Setter (설정한다고 해서 Setter라고 부른다.)
		
		System.out.println("책 가격: " + book.ccc()); // 읽기 > Getter (얻는 행위를 한 것이므로
		
		
		book.setTitle("자바의 정석");
		System.out.println(book.getTitle());
		
		
		Mouse m1 = new Mouse();
		
		m1.setModel("M910");
		System.out.println(m1.getModel());
		
		// 쓰기 전용
		// m1.price = 50000;
		m1.setPrice(50000);
		// System.out.println(m1.getPrice());
		
		// 읽기 전용
		m1.getColor();
		
		
		// Getter/Setter 역할
		// 1. private 멤버 > 인터페이스 역할
		// 2. 읽기 전용 멤버, 쓰기 전용 멤버
		
		/*
		Calendar date = Calendar.getInstance();
		date.add(Calendar.YEAR,  -3);
		
		m1.setDate(date);
		
		System.out.printf("마우스 제조년월일: %tF\n", m1.getDate());
		*/
		
		m1.setDate(2020, 7, 31); 
		System.out.println(m1.getDate()); // 2020-07-31
		
		// m1.getState > private String state;
		System.out.println(m1.getState()); // 구형
		
		
		// 개발자가 객체의 상태를 확인하고 싶을 때 사용하는 메소드 > dump
		System.out.println(m1.info()); // [M910,50000,white,2020-07-31]
	}
	
}
