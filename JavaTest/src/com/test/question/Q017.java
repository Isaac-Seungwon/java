package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		/*
		● 요구사항
		인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		
		● 조건
		- 사원 → 대리 → 과장 → 부장
		- void position(String)
		- void position(String, String)
		- void position(String, String, String)
		- void position(String, String, String, String)
		
		● 입력
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
		
		● 출력
		사원 : 홍길동
         
		사원 : 홍길동
		대리 : 유재석
		
		사원 : 홍길동
		대리 : 유재석
		과장 : 박명수
		
		사원 : 홍길동
		대리 : 유재석
		과장 : 박명수
		부장 : 정형돈
		*/
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	}
	
	public static void position(String staff) {
		System.out.printf("사원: %s\n", staff);
		System.out.println();
	}
	
	public static void position(String staff, String assistantManager) {
		System.out.printf("사원: %s\n", staff);
		System.out.printf("대리: %s\n", assistantManager);
		System.out.println();
	}
	
	public static void position(String staff, String assistantManager, String manager) {
		System.out.printf("사원: %s\n", staff);
		System.out.printf("대리: %s\n", assistantManager);
		System.out.printf("과장: %s\n", manager);
		System.out.println();
	}
	
	public static void position(String staff, String assistantManager, String manager, String departmentManager) {
		System.out.printf("사원: %s\n", staff);
		System.out.printf("대리: %s\n", assistantManager);
		System.out.printf("과장: %s\n", manager);
		System.out.printf("부장: %s\n", departmentManager);
		System.out.println();
	}
}
