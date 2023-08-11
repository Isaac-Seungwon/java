package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {

	public static void main(String[] args) {
		
		// Ex48_Override.java
		
		// 대중적인 오버라이드
		
		Time t1 = new Time(2, 30);
		
		// com.test.java.obj.inheritance.Time@5aaa6d82 <- 오브젝트 클래스가 구현한 내용
		System.out.println(t1);
		// t1을 찍어서 보인 게 아니다. 컴파일러가 이 코드를 만나면 코드를 수정한다.
		// 사실 화면에 찍힌 문자열은 toString() 메소드가 돌려준 값이다.

		System.out.println(t1.toString());	// 2:30 전 세계 개발자가 아는 이름
		System.out.println(t1.info()); // 2:30 > 나밖에 모르는 이름
		
		
		Date now = new Date();
		
		// Wed Aug 02 11:49:24 KST 2023
		System.out.println(now);
		System.out.println(now.toString()); // 자기가 toString() 메소드로 재정의한 것이다.
		
	}
	
}

class Time {
	
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	
	// 덤프 메소드
	public String info() {
		return this.hour + ":" + this.minute;
	}


	
	// 어노테이션 (Annotation)
	// 일종의 주석으로, 프로그램의 기능이 있는 주석이다.
	// 재정의 되고 있는 메서드라는 것을 확실하게 알려주는 기능을 한다. - 가독성을 높여주기 위한 코드 관리 차원의 주석이다.
	// 코드 자동완성 기능을 사용했을 때 자동으로 붙는다.
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}