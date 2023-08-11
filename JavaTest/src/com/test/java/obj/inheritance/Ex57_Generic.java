package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {
	public static void main(String[] args) {
		
		// Ex55_Generic.java
		
		// 클래스
		// 1. 클래스
		// 2. 인터페이스
		// 3. 추상 클래스
		// 4. enum
		// 5. 제네릭 클래스 (Generic)
		
		// 요구사항) 클래스 설계
		// 1. 멤버 변수 선언 > int
		// 2. 멤버 변수를 중심으로 여러 가지 행동을 하는 메소드 선언
		
		// 추가사항) String 중심으로 하는 클래스 설계
		// 추가사항) boolean 중심으로 하는 클래스 설계
		// 추가사항) double 중심으로 하는 클래스 설계
		// 추가사항) Student 중심으로 하는 클래스 설계
		// 추가사항) 무한대... > 자료형이 늘어날수록 비용이 같이 늘어나는 게 문제이다.
		
		// # 위의 문제점 해결 방안
		// 1. Object 클래스
		//	- 가장 오래 된 방식이며, 현재까지도 쓰인다.
		// 2. Generic 클래스
		//	- 가장 최신의 방식이다. (2014년)
		// 사용 빈도는 지금은 Generic이 더 많은 편이다. Object를 쓰는 방식에서 탈피하고자 나온 게 Generic 방식이며, 되도록 Generic을 쓰는 게 권장된다.
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString()); // [data=100]
		System.out.println(n1.getData() * 2); // 200
		System.out.println();
		
		// Object 클래스
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.toString()); // WrapperObject [data=200]
		System.out.println((int)n2.getData() * 2); // 400
		System.out.println();

		// Generic 클래스
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData() * 2);
		System.out.println();
				
				
		WrapperString s1 = new WrapperString("Isaac");
		System.out.println(s1.toString()); // [data=Isaac]
		System.out.println(s1.getData().length()); // 5
		System.out.println();
		

		// Object
		WrapperObject s2 = new WrapperObject("Sopia");
		System.out.println(s2.toString()); // [data=Sopia]
		System.out.println(((String)s2.getData()).length()); // 5
		System.out.println();
		
		
		// Generic
		Wrapper<String> s3 = new Wrapper<String>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString()); // [data=true]
		System.out.println(b1.getData() ? "참" : "거짓"); // 참
		System.out.println();
		
		
		// Object
		WrapperObject b2 = new WrapperObject(true);
		System.out.println(b2.toString()); // [data=true]
		System.out.println(((boolean)b2.getData()) ? "참" : "거짓"); // 참
		System.out.println();
		
		// *** '절대적으로' 값형과 참조형간에는 형변환이 불가능하다고 했다.
		// 그런데 어라? 인티저를 불리언으로 바꾸고 있다??! 이건 말이 안 되는데??
		
		// Object 변수 == 만능 주머니 (뭐든지 다 담을 수 있다. - 이 특성이 요긴하게 쓰인다.)
		// 업캐스팅
		Object o1 = new Object();
		Object o2 = new 사람();
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "Isaac";
		// ----------------------------------- 위와 아래는 다르다 (위는 참조형, 아래는 값형)
		// 박싱(Boxing) > 오토박싱 (뭔가를 상자에 담는 행동)
		Object o6 = 10; // = new Integer(10);
		Object o7 = true;

		System.out.println(o6); // 10
		// System.out.println(o6 * 2); // 주소값은 데이터가 아니므로 연산의 대상이 될 수 없다.
		
		// 언박싱(Unboxing) (상자 내부에 있는 것을 꺼내는 행동)
		// 앞에 형변환 연산자를 주고, 다시 원래 타입인 Integer 클래스나 값형으로 형변환을 하면 된다. (다운 캐스팅)
		System.out.println((Integer)o6 * 2);
		System.out.println((int)o6 * 2);
		
		Integer num = new Integer(10);
		System.out.println(num); // 10
		System.out.println(num + 100); // 110
		
		
		// o3이 오브젝트라서 원래 형으로 다운캐스팅을 해줘야 nextLine()이 보인다.
		// 내가 처음에 뭘 넣었었는지를 확인을 해야 한다. > 이클립스에서 찾는 걸 지원하지 않으므로 사람이 직접 찾아야 한다.
		((Scanner)o3).nextLine();
		
		// 오브젝트가 루트 클래스이므로 지구상에 있는 모든 데이터를 넣을 수 있다는 큰 장점이 있다.
		// 상당수의 자바 기능이 이 특성을 이용해서 구현이 되어 있는데, 상대적으로 꺼내 쓸 때 여기에 뭐가 들어있는지 확인이 어렵다는 큰 문제이다.
		// Object가 꺼내기가 불편한데, 그나마 해결책이 되었다고 할 수 있는 게 Generic 클래스이다.
		
	}// main
}

class WrapperInt {
	
	private int data; // 1. 클래스 중심
	
	// 2. data 중심 > 행동
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperString {
	
	private String data;
	
	// 생성자 이름은 class 이름과 동일해야 한다.
	public WrapperString(String data) {
		// this.data = data;
		this.setData(data);
		// 유효성 검사를 하게 되면 코드가 중복되므로 한 곳에 몰아주었다. <이클립스가 자동으로 설정하기도 함>
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperBoolean {
	
	private boolean data;
	
	// 생성자 이름은 class 이름과 동일해야 한다.
	public WrapperBoolean(boolean data) {
		// this.data = data;
		this.setData(data);
		// 유효성 검사를 하게 되면 코드가 중복되므로 한 곳에 몰아주었다. <이클립스가 자동으로 설정하기도 함>
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}


// 만능 클래스 생성!
class WrapperObject {
	
	private Object data; // ***
		
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WrapperObject [data=" + data + "]";
	}
}


// Generic
class Wrapper<T> {

	private T data;
	
	public Wrapper(T data) { // 생성자는 꺽새 타입 변수 <T>를 붙이지 않는다. 타입 변수는 클래스만 적는다.
		this.setData(data);
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
}
