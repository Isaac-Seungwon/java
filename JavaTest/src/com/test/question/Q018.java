package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		/*
		● 요구사항
		인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		
		● 조건
		- int positive(int)
		- int positive(int, int)
		- int positive(int, int, int)
		- int positive(int, int, int, int)
		- int positive(int, int, int, int, int)
		
		● 입력
		count = positive(10);
		count = positive(10, 20);
		count = positive(10, 20, -30);
		count = positive(10, 20, -30, 40);
		count = positive(10, 20, -30, 40, 50);
		
		● 출력
		양수: 1개
		양수: 2개
		양수: 2개
		양수: 3개
		양수: 4개
		*/
		
		int count; // 양수 개수
		
		count = positive(10);
		count = positive(10, 20);
		count = positive(10, 20, -30);
		count = positive(10, 20, -30, 40);
		count = positive(10, 20, -30, 40, 50);
	}
	
	public static int positive(int n1) {
	    int count = 0; // 양수 개수

	    // 양수 개수 계산
	    count = n1 > 0 ? ++count : count;

	    System.out.printf("양수: %d개\n", count);

	    return count;
	}
	
	public static int positive(int n1, int n2) {
	    int count = 0; // 양수 개수

	    // 양수 개수 계산
	    count = n1 > 0 ? ++count : count;
	    count = n2 > 0 ? ++count : count;

	    System.out.printf("양수: %d개\n", count);

	    return count;
	}
	
	public static int positive(int n1, int n2, int n3) {
	    int count = 0; // 양수 개수

	    // 양수 개수 계산
	    count = n1 > 0 ? ++count : count;
	    count = n2 > 0 ? ++count : count;
	    count = n3 > 0 ? ++count : count;

	    System.out.printf("양수: %d개\n", count);

	    return count;
	}
	
	public static int positive(int n1, int n2, int n3, int n4) {
	    int count = 0; // 양수 개수

	    // 양수 개수 계산
	    count = n1 > 0 ? ++count : count;
	    count = n2 > 0 ? ++count : count;
	    count = n3 > 0 ? ++count : count;
	    count = n4 > 0 ? ++count : count;

	    System.out.printf("양수: %d개\n", count);

	    return count;
	}
	
	public static int positive(int n1, int n2, int n3, int n4, int n5) {
		int count = 0; // 양수 개수

	    // 양수 개수 계산
	    count = n1 > 0 ? ++count : count;
	    count = n2 > 0 ? ++count : count;
	    count = n3 > 0 ? ++count : count;
	    count = n4 > 0 ? ++count : count;
	    count = n5 > 0 ? ++count : count;

	    System.out.printf("양수: %d개\n", count);

	    return count;
	}
}
