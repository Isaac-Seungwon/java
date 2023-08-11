package com.test.java.obj.inheritance;

public class Ex53_interface {

	public static void main(String[] args) {
		
		
	}
}

// *** Keyboard는 객체를 생성할 수 없다. > 실체화할 수 없다. > 자식들에게 구현할 것들을 제시하는 역할
interface Keyboard {
	
	// 키보드로서 갖춰야 할 행동들을 정의
	void keyDown(char c);
	void powerOn();
	void powerOff();
	int checkBatter();
	// static void aaa();
	// static을 붙일 수 없다.
}

class MxKeys implements Keyboard {

	@Override
	public void keyDown(char c) {
		// 구현 > 내 마음대로
		System.out.println(c + "눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
	}

	@Override
	public int checkBatter() {
		return 10;
	}
	
}