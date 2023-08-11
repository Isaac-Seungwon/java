package com.test.java.obj;

// import com.test.java.obj.Student;

public class Ex38_Class {

	public static void main(String[] args) {
		
		// Ex38_Class.java
		
		// 학생 클래스
		// - 이름
		// - 나이
		// - 국어
		// - 영어
		// - 수학
		
		Student2 student = new Student2();

		student.name = "John";
		student.age = 20;
		student.kor = 90;
		student.eng = 85;
		student.math = 95;

		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
		System.out.println("Korean: " + student.kor);
		System.out.println("English: " + student.eng);
		System.out.println("Math: " + student.math);
        	
		/*
			# 반드시 지킬 규칙
			- 파일의 이름과 클래스의 이름이 반드시 동일해야 한다. > 컴파일 에러
			
			# 클래스 선언 > 권장 사항
			- 클래스 1개당 물리적인 파일 1개를 만든다.
			- 하나의 *.java 안에 여러 개의 클래스를 선언하지 말 것!!
			- 클래스를 한 파일에 여러 개 만들면 관리가 힘들다.
			
			한 파일 내에서 2개의 클래스를 만들 때
			- 파일 내의 모든 클래스 중 public 키워드를 가지는 클래스는 반드시 1개만 있어야 한다.
			- public 클래스가 대표 클래스 역할을 하며, 대표 클래스의 이름이 파일명이 되기 때문이다. <- 자바 파일의 이름이 되어야 하기 때문!
			
			클래스는 같은 패키지 내에서 동일한 이름을 2개 이상 가질 수 없다.
			- 클래스의 영역은 패키지이다.
			- *** 클래스의 영역은 물리적인 파일이 아니다. 작성하는 파일이 바뀌었다고 남남이 아니다.
		*/
	}
	
}//class