package com.test.java.obj;

public class Ex44_static {
	
	// 메인 메소드가 실행되기 전에 여러가지 작업이 일어나는데, 그 중에 하나가 '클래스 로딩'이라는 작업이다.
	
	// 1. 클래스 로딩, Class Loading
	// - 프로그램을 실행하기 전에 클래스의 정의를 미리 읽는 작업 (인식하는 작업)
	// - 클래스의 정의를 메모리에 얹는 작업 (사용할 수 있도록 메모리에 잠시 기억)
	// - 클래스 로딩 과정에서 모든 static 키워드를 인식 > static을 만나는 순간 메모리 실체화(구현)
	
	// 2. main() 메인 메소드 실행
	public static void main(String[] args) {
		
		// Ex44_static.java
		
		/*
			static 키워드
			- 클래스 or 클래스 멤버에 붙이는 키워드
		
		*/
		
		// static int a;
		// 지역변수에는 붙일 수 없다.
		
		// 상황) 학생 3명
		// - 역삼 중학교
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		// s1.setSchool("역삼 중학교"); // static 멤버를 객체 참조 변수를 통해서 접근하려고 시도 > 불가능한 작업!!	
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(15);
		// s2.setSchool("역삼 중학교");

		Student s3 = new Student();
		s3.setName("이순신");
		s3.setAge(16);
		// s3.setSchool("역삼 중학교");
		
		Student.setSchool("역삼 중학교");
		// setName은 3번 호출한다. 각자 자신의 이름을 세팅하기 위해 3번을 호출했지만, setSchool은 하나밖에 없다.
		// 학생이 3명이든 100명이든 학교 이름은 하나이다. 그래서 학교 이름을 초기화하는 것도 한 번만 하면 된다.
		// 그래서 객체 변수를 개인 데이터, 정적 변수는 하나의 데이터를 같이 쓴다고 해서 공용데이터라고 한다.
		// 사람마다 다른 값을 가져야 한다면 객체 변수를 사용하고, 사람이 달라도 같은 값을 가져야 한다면 정적 변수를 사용하면 된다.
		// 그 예로 이름, 나이, 주소, 전화, 성별은 객체 변수로 구현하고, 사람들이 속한 공동체 이름은 정적 변수로 구현할 수 있다.
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		
		/*
		Util util = new Util();
		
		int result = util.add(10, 20);
		System.out.println(result);
	
		result = util.add(30, 40);
		System.out.println(result);
		
		// 멤버 변수가 없고 객체 메소드만 있는 상태, 그래서 util과 uril2가 완벽하게 똑같다.
		// 상태 값(개인 값)을 가지지 않기 때문이다. 이는 낭비이며, 좋은 상황이 아니다.
		
		Util util2 = new Util();
		
		result = util.add(50, 60);
		System.out.println(result);
		*/
		
		int result = Util.add(10, 20);
		System.out.println(result);
		
		result = Util.add(30, 40);
		System.out.println(result);
	}
	
	/*
	빨간색 사각형 private
	녹색 동그라미 public

	빨간색 S는 static의 S를 의미하며, 정적 메소드를 의미한다.
	안 붙어 있는 건 객체 메소드를 의미한다.

	메소드도 private는 빨간색으로 나온다.
	*/
}

class Student{
	
	// 객체 변수 (static이 붙지 않은 변수)
	// > 개인 데이터
	private String name;
	private int age;
	// private String school; // *** 중요 포인트 (어떤 학교에 다니는가?)
	
	// 정적 변수, 공용 변수 (다같이 쓴다), 클래스 변수 (식별자가 붙어있다 보니 가끔 클래스 변수라고도 한다.)
	// > 공용데이터
	private static String school; // main()가 만들어지기 전에 만들어진다.
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	*/

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		return String.format("%s(%d) %s", this.name, this.age, Student.school);
	}
	
	public void objectMethod() {
		// 객체 메소드
		// - 개인과 관련된 작업 > 가능
		// - 집합(정적 멤버)과 관련된 작업 > 가능
		System.out.println(this.name);		// 객체 변수
		System.out.println(Student.school);	// 정적 변수
		this.setAge(20);					// 객체 메소드
		Student.setSchool("A School");		// 정적 메소드
	}
	
	public static void staticMethod() {
		// 정적 메소드
		// - 개인과 관련된 작업 > 불가능
		// - 집합(정적 멤버)과 관련된 작업 > 가능
		System.out.println(Student.school);	// 정적 변수
		// System.out.println(this.name);	// 객체 변수(X)
		Student.setSchool("A School");		// 정적 메소드
		// this.setAge(15);					// 정적 메소드(X)
		// 정적 메소드 안에서는 객체 메소드를 접근할 수 없으며, this를 사용하여 호출할 수 없다.
	}
}

class Util {
	
	//public int add(int a, int b)
	public static int add(int a, int b) {

		// 정적인 성격의 기능만 필요할 때에는 클래스를 만들고, 모든 메소드를 static으로 만들어버리면 단 한 곳에서만 선언되어 관리되며 메모리가 절약된다.
		return a + b;

	}
}

class Phone {
	// 객체 멤버 변수
	private String color;
	private String number;
	public int size;
	
	// 정적 멤버 변수
	private static int weight;
	public static int battery;

	public Phone() {
		
	}
	
	public Phone (String color, String number) {
		
	}
	
	private String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		Phone.weight = weight;
	}

	public static int getBattery() {
		return battery;
	}

	public static void setBattery(int battery) {
		Phone.battery = battery;
	}
}