package com.test.question;

import java.util.Calendar;

public class Mouse {
	
	private String model = "M301";
	private int price = 30000;
	private String color = "white";
	private Calendar date; // 마우스 제조 날짜
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	/*
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	*/
	
	// 계산된 프로퍼티 > getter와 setter는 기본적으로 private 멤버 변수를 조작하지만, 그게 필수가 아니다.
	// 					> 멤버 변수와 무관(?)한 getter와 setter를 만들기도 한다. * 어느 정도는 연결이 되어 있어야 한다.
	public String getState() {
		
		if (this.date.get(Calendar.YEAR) <= 2021) {
			return "구형";
		} else {
			return "신형";
		}
	}
	
	
	public void setDate(int year, int month, int date) {
		
		// 캘린더를 안에서 선언해준다. > 이 클래스를 가지고 오브젝트를 만드는 사람이 편해졌다.
		Calendar c = Calendar.getInstance();
		c.set(year,  month - 1, date);
		
		this.date = c;
		
	}
	
	public String getDate() {
		
		// System.out.printf("%tF", this.date); // 출력 > 자바 콘솔에서만 사용이 가능하다 (제한적
		
		return String.format("%tF", this.date); // 반환 > 모든 분야에서 사용이 가능하다
	}
	

	// 덤프(dump) 메소드
	// 어떤 데이터의 집합을 한 줄의 문자열로 변환하는 작업
	public String info() {
		
		String temp = "[";
		
		temp += this.model + ",";
		temp += this.price + ",";
		temp += this.color + ",";
		temp += String.format("%tF", this.date);
		
		temp += "]";
		
		return temp;
	}
	
}
