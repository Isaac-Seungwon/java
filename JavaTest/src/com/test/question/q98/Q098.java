package com.test.question.q98;

public class Q098 {

	public static void main(String[] args) {
		/*
		● 요구사항
		학생 클래스를 구현하시오.
		
		● 조건
		- 생성자 오버로딩을 구현하시오.
		- Student
		- 학생 클래스
		- 상태
			name: 이름
			age: 나이
			grade: 학년
			classNumber: 반
			number: 번호
		- 행동
			public Student()
				기본 생성자
				이름("미정"), 나이(0), 학년(0), 반(0), 번호(0)
			public Student(String name, int age, int grade, int classNumber, int number)
				생성자 오버로딩
			public Student(String name, int age)
				생성자 오버로딩
			public Student(int grade, int classNumber, int number)
				생성자 오버로딩
			String info()
				이름(나이 : 0세, 학년 : 0, 반 : 0, 번호 : 0)
		
		● 호출
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());
		
		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());
		
		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());
		
		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
		
		● 출력
		미정(나이 : 미정, 학년 : 미정, 반 : 미정, 번호 : 미정) //s1.info();
		홍길동(나이 : 13세, 학년 : 미정, 반 : 미정, 번호 : 미정) //s2.info();
		미정(나이 : 미정, 학년 : 3, 반 : 10, 번호 : 30) //s3.info();
		아무개(나이 : 12세, 학년 : 1, 반 : 5, 번호 : 11) //s4.info();
		*/
		
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());
		
		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());
		
		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());
		
		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
	}
}
