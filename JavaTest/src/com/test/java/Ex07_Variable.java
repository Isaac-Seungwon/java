package com.test.java;

public class Ex07_Variable {
	

	public static void main(String[] args) {
		
		//Ex07_Variable
		
		// 숫자형 데이터
		// - 수치로서의 데이터 > 산술 연산의 대상 > 더하기 빼기
		// - 수치가 아닌 데이터 > 산술 연산의 대상이 아님
		// 실제 수치인지, 아니면 생김새가 숫자인거일 뿐인지?
		
		// 1. 몸무게
		int weight;
		weight = 70;
		
		// 2. 주민등록번호 앞자리
		int wrongJumin;
		wrongJumin = 000203;
		System.out.println("주민번호 수치 취급: " + wrongJumin);
		
		String jumin;
		jumin = "000203";
		System.out.println("주민등록번호: " + jumin);
		
		// 생긴 건 수치지만 숫자취급을 안 하는 경우
		// - 주민등록번호
		// - 학번
		// - 전화번호
		
		
		// 자바 기수 표기법: 숫자를 사용하여 기록해서 수를 적는 방법
		// 기수 표현에 상관 없이 출력하면 10진수로 출력된다.
		
		// 숫자 데이터 표기 > 3개의 기수법 지원
		// 1. 10진수 > 10
		System.out.println(10);
		
		// 2. 8진수 > 0으로 시작 > 010 (0으로 시작한다. 0 ~ 7표현)
		System.out.println(010);
		
		// 3. 16진수 > 0x로 시작 > 0x10 16 (0x로 시작한다.)
		System.out.println(0x10);
		
		
		
	}
}
