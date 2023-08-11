package com.test.java.obj.inheritance;

public class Ex58_Generic {
	public static void main(String[] args) {
		
		// Ex58_Generic.java
		
		// Item is a raw type. References to generic type Item<T> should be parameterized
		//Item item = new Item();
	
		
		Item<String> item1 = new Item<String>(); // 현재 T는 String이다.
		item1.c = "문자열";
		
		Item<Integer> item2 = new Item<Integer>(); // 현재 T는 Integer이다.
		item2.c = 100;
		
		
		Pen<Boolean> pen = new Pen<Boolean>();
		pen.a = true;
		pen.b = false;
		pen.c = true;
		
		
		Note<String,Integer> note = new Note<String,Integer>("Isaac", 20);
		System.out.println(note.getA()); // String
		System.out.println(note.getB()); // Integer
	}
}

// 제네릭 클래스
// - T: 타입 변수(메소드의 '매개 변수' 역할) > 자료형을 전달하는 변수 (자료형을 마치 매개 변수처럼 취급한다.) > 반드시 참조형만 가능하다.
//대소문자를 가리지 않지만, 타입 변수는 보통 1글자 대문자로 적는다.
// - <>: 인자 리스트(메소드의 '()' 역할) 
class Item<T> {

	public int a;
	public int b;
	public T c;
	// 자료형이 들어갈 곳에 타입변수를 적었다. 호출하는 자료형에 따라서 String이 되기도 하고, Integer가 되기도 한다.
	// 선언할 때 까지는 결정이 안 되었다가 객체를 생성할 때 결정이 된다. > 어떤 것이든 다 넣을 수 있다는 점에서 Object 변수와 비슷하다.
	// Object와 차이점은 Generic은 한 번 정하면 죽을 때까지 자료형이 고정된다는 점이다. (런타임 시에 한 번 자료를 픽스하는 순간 지속됨)
	
}

class Pen<T> {
	
	public T a;
	public T b;
	public T c;
	
}

class Book<T> {
	
	public T a; // 멤버 변수의 자료형으로 쓸 수 있다.
	
	public void set(T a) { // 메소드 매개변수의 자료형으로 쓸 수 있다.
		this.a = a;
		
		T b; // 지역변수의 자료형으로 쓸 수 있지만, 권장되지 않는다.
	}
	
	public T get() { // 메소드 반환타입으로 쓸 수 있다.
		return this.a;
	}
}
// -> 자료형이 들어갈 수 있는 부분은 모두 쓸 수 있다.

class Note<T, U> {
	// 타입 변수는 여러 개 쓸 수 있다. 만약 이걸로 오브젝트를 만들면 마찬가지로 자료형을 여러 개 써줘야 한다. 그러나 타입변수는 많아야 2개, 보통은 1개를 쓰는 게 일반적이다.
	
	public T a;
	public U b;
	
	public Note(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
}

