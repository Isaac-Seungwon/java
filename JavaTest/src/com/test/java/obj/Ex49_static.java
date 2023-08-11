package com.test.java.obj;

import java.util.concurrent.CountDownLatch;

public class Ex49_static {

	public static void main(String[] args) {
		
		// Ex49_static.java
		
		// 요구사항)
		// 1. 펜을 생성하시오.
		// 2. 생산된 펜의 개수를 세시오.
		
		
		// Case 1.
		// - Pen 객체(클래스)와 count간의 관계가 약하다.
		// - 오차 발생(count++ 누락 가능성이 있다.)
		// - 단점이 있긴 하지만 쉽기 때문에 많이 사용하는 방식이다.
		/*
		int count = 0;
		
		Pen p1 = new Pen("MonAmi", "black");
		count++;
		
		Pen p2 = new Pen("MonAmi", "black");
		count++;
		
		Pen p3 = new Pen("MonAmi", "black");
		count++;
		
		System.out.printf("펜 개수: %d", count);
		*/
		
		
		// Case 2.
		// - Pen과 count간의 결합을 강하게 만든다. (더이상 남남이 아니게 한다)
		//	> count 변수를 Pen 클래스 안에 만든다.
		// 객체 변수로 만들다보니 여러 개가 발생하고, 그중 1개를 사용한다고 해도 왜 그 객체의 count를 사용하는지에 대한 당위성이 없다.
		/*
		Pen p1 = new Pen("MonAmi", "black");
		p1.count++;
		
		Pen p2 = new Pen("MonAmi", "black");
		p1.count++;
		
		Pen p3 = new Pen("MonAmi", "black");
		p1.count++;
		
		System.out.printf("펜 개수: %d", p1.count);
		*/
		
		
		// Case 3.
		// - Pen과 count간의 관계를 강하게 만든다.
		//	> count 변수를 딱 1개만 만든다. (count 변수를 static 정적 변수로 만들면 된다)
		/*
		Pen p1 = new Pen("MonAmi", "black");
		Pen.count++;
		
		Pen p2 = new Pen("MonAmi", "black");
		Pen.count++;
		
		Pen p3 = new Pen("MonAmi", "black");
		Pen.count++;
		
		System.out.printf("펜 개수: %d", Pen.count);
		*/
		
		
		// Case 4.
		// public Pen(String mode1, String color) 안에 넣는다.
		// Pen을 호출만 하면 count가 된다.
		// 공통적인 변수를 쓸 때, static 변수를 사용하라!
		Pen p1 = new Pen("MonAmi", "black");
		
		Pen p2 = new Pen("MonAmi", "black");
		
		Pen p3 = new Pen("MonAmi", "black");
		
		System.out.printf("펜 개수: %d", Pen.count);
	}
	
}

class Pen{
	// public int count = 0; // getter setter를 만들어야 하므로 public으로 열음
	public static int count = 0;
	
	private String mode1;
	private String color;
	
	public Pen(String mode1, String color) {
		this.mode1 = mode1;
		this.color = color;
		Pen.count++; // 여기보다 적합한 위치가 없다.
	}

	@Override
	public String toString() {
		return "Pen [mode1=" + mode1 + ", color=" + color + "]";
	}
}