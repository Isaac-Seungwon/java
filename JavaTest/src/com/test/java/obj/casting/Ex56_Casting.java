package com.test.java.obj.casting;

public class Ex56_Casting {

	public static void main(String[] args) {
		
		// Ex56_Casting
		
		// 프린터 기기
		// - LG500
		// - HP600

		// 같은 목적을 가지고 있는 클래스임에도 사용법이 다르다.
		
//		LG500 lg = new LG500();
//		HP600 hp = new HP600();
//		
//		lg.on();
//		hp.powerOn();
//		
//		lg.print();
//		hp.printing();
//		
//		lg.off();
//		hp.powerOff();

		
		LG500 lg = new LG500();
		HP600 hp = new HP600();
		
		lg.powerOn();
		hp.powerOn();
		
		lg.print();
		hp.print();
		
		lg.powerOff();
		hp.powerOff();
		
		
		Printer p1;
		LG500 lg2 = new LG500();
		
		// Printer = LG500
		// 부모 = 자식
		// 업캐스팅
		p1 = lg2;
		
		// 이렇게도 사용할 수 있다.
		Printer p2 = new HP600();
		Object o1 = new LG500();
		

		
		// 상황 ) 프린터 판매 대리점 운영
		//	- 재고
		//		- LG500 x 5대
		//		- HP600 x 3때
		//	- 매일 업무
		//		- 프린터가 제대로 동작하는지 기능 확인
		
		// m1();

		// 추가상황) LG500 x 500대, HP600 x 300대
		//m2();
		
		// 추가상황) BenQ700, Epson800 > 추가 브랜드 (상품)
		m3();
		
	}

	private static void m3() {

		Printer[] ps = new Printer[8]; // 프린트라는 타입을 넣을 수 있는 객체(껍데기)를 8개 생성
		
		// *** 서로 다른 클래스의 객체를 하나의 배열에 넣기!!!
		ps[0] = new LG500();
		ps[1] = new HP600();
		
		for (int i = 0; i < ps.length; i++) {
			if (i < 5) {
				ps[i] = new LG500();
			} else {
				ps[i] = new HP600();
			}
		}
		
		// 업무
		for (int i = 0; i < ps.length; i++) {
			ps[i].print();
			
			// 추가 업무
			// - LG500 > selfTest()
			// - HP600 > clena()
			
			// 업캐스팅: 서로 다른 형들끼리 하나의 배열에 넣기 위해서 사용
			// 그러나 자식들이 가지고 있는 개개인의 기능들은 사용할 수가 없게 된다. 이때 다운캐스딩을 쓰는 것이다.
			// 괄호로 묶어 형변환을 다시 해주면 selfTest를 쓸 수 있다. 이때 다운캐스팅을 쓴다.
			// ((LG500)ps[i]).selfTest();
			// ((HP600)ps[i]).cleaning();
			
			
			System.out.println(ps[i] instanceof LG500);
			
			if (i < 5) {
				((LG500)ps[i]).selfTest();
			} else {
				((HP600)ps[i]).cleaning();
			}
			
			if (ps[i] instanceof LG500) {
				((LG500)ps[i]).selfTest();
			} else if (ps[i] instanceof HP600){
				((HP600)ps[i]).cleaning();
			}
		}
		
		
	}

	private static void m2() {

		LG500[] lg = new LG500[5];
		
		for (int i = 0; i < lg.length; i++) {
			lg[i] = new LG500();
		}
		
		HP600[] hp = new HP600[3];
		
		for (int i = 0; i < hp.length; i++) {
			hp[i] = new HP600();
		}
		
		for (int i = 0; i < lg.length; i++) {
			lg[i].print();
		}
		
		for (int i = 0; i < hp.length; i++) {
			hp[i].print();
		}
		
	}

	private static void m1() {

		// 가장 단순한 방법, 비효율적인 방법
		LG500 lg1 = new LG500();
		LG500 lg2 = new LG500();
		LG500 lg3 = new LG500();
		LG500 lg4 = new LG500();
		LG500 lg5 = new LG500();
	
		HP600 hp1 = new HP600();
		HP600 hp2 = new HP600();
		HP600 hp3 = new HP600();
		
		// 업무
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
	}
}

interface Printer {
	void print();
	void powerOn();
	void powerOff();
}

class LG500 implements Printer {
	
	private String type;
	private int price;
	
	public void print() {
		System.out.printf("%s 방식 출력\n", this.type);
	}
	
//	public void on() {
//		System.out.println("프린터 전원 ON\n");
//	}
//	
//	public void off() {
//		System.out.println("프린터 전원 OFF\n");
//	}
	
	public void selfTest() {
		System.out.println("자가 점검 진행\n");
	}

	@Override
	public void powerOn() {
		System.out.println("프린터 전원 ON\n");
		
	}
	@Override
	public void powerOff() {
		System.out.println("프린터 전원 OFF\n");
		
	}
}

class HP600 implements Printer {
	
	private String color;
	private int price;
	
//	public void printing() {
//		System.out.printf("출력 진행\n");
//	}
	
	public void powerOn() {
		System.out.println("프린터 전원 켜짐\n");
	}
	
	public void powerOff() {
		System.out.println("프린터 전원 꺼짐\n");
	}
	
	public void cleaning() {
		System.out.println("헤더 청소 진행\n");
	}

	@Override
	public void print() {
		System.out.printf("출력 진행\n");
	}
}