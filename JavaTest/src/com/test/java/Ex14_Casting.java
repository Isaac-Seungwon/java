package com.test.java;

public class Ex14_Casting {
	
	public static void main(String[] args) {
		
		// Ex14_Casting.java
		
		// 정수형 리터럴은 int이다.
		// 실수형 리터럴은 double이다.
		
		// byte = int
		// 작은형(1byte) = 큰형(4byte)
		byte b1 = 10;	// 서비스 문법: 원래는 문법에 맞지 않아 오버플로우가 발생하지만, 자잘한 것까지 신경쓰지 않아도 되도록 해준다.
		
		// 작은형(2byte) = 큰형(4byte)
		short s1 = 10;	// 서비스 문법
		
		// int = int
		int n1 = 10;
		
		// long = int
		// 큰형(8byte) = 작은형(4byte)
		long l1 = 10;
		
		
		// float = double
		// 작은형(4) = 큰형(8)
		float f1 = (float)3.14;
		f1 = 3.14F;	// f, F가 명시적인 형변환을 대신한다.
		
		// double = double
		double f2 = 3.14d;

		// ------------------------------------------------------------------------------------
		
		int n2 = 100;	// 원본(4byte)
		float n3;		// 복사본(4byte)
		
		// 형변환
		// float = int
		// 4byte = 4byte
		// 암시적 형변환
		n3 = n2;
		
		System.out.println(n3); // 100.0
		
		
		int n4;			// 복사본
		float n5 = 100;	// 원본

		// 형변환
		// int = float
		// 4byte = 4byte
		// 명시적 형변환
		n4 = (int)n5;
		
		System.out.println(n4); // 100
		
		/*
		Type mismatch: cannot convert from float to int 같은 4byte인데 왜 float를 더 크게 보고
		integer를 더 작게 보는 이유는 이것이 물리적인 크기가 아니기 때문이다.
		float에는 50억을 넣을 수 있다. integer에는넣을 수 없다. 그것 때문에 같은 4byte라도 float가 더 크다고 보는 것이다.
		
		*** 정수와 실수간의 크기 비교는 단순하게 byte로 하는 것이 아니다.
		실제 표현 가능한 숫자의 범위로 비교해야 한다.
		따라서 다음의 등호도 성립한다.
		
		int(4) < float(4)
		long(8) < float(4)
		
		크기 정리
		byte(1) < short(2) < int(4) < long(8) <<<|넘을 수 없는 벽|<<< float(4) < double(8)
		*/
		
		
		// char > 겉보기는 문자, 속으로는 숫자 > 프로그램 입장 > 숫자 취급
		char m1;	// 2byte
		short m2;	// 2byte
		
		m1 = 'A';
		
		// 형변환
		// short = char
		// 2byte = 2byte
		
		m2 = (short)m1;
		System.out.println(m2);
				
		char m3;
		short m4;
		
		m4 = 65;
		
		// 형변환
		// char = short
		// 2byte = 2byte
		m3 = (char)m4;
		
		char m6 = '가';
		System.out.println((int)m6);
		
		// *** 값형끼리 형변환할 수 있다.
		// *** 값형과 참조형끼리는 형변환이 절대 불가능하다.
		// 정수 > 정수
		// 실수 > 실수
		// 정수 > 실수
		// 실수 > 정수
		// 문자 > 정수
		// 정수 > 문자
		
		// 값형 <- (형변환O) -> 값형
		// 값형 <- (형변환X) -> 참조형
		
		String a1 = "100";
		int a2;
		
		// "100" -> 200
		a2 = Integer.parseInt(a1); // parse는 형변환을 하는 게 아니다. 내부적으로 동작되는 방식이 완전히 다르다!
		
		System.out.println(a2);
		
		
		// 100 -> "100"
		String a3;
		int a4;
		
		a4 = 100;
		
		// String.valueOf(값형 데이터)
		// 값형을 문자열로 바꿀 때에는 valueOf를 쓰거나 빈 문자열("")을 쓰면 된다.
		a3 = String.valueOf(a4); // 100 -> "100"
		
		a3 = a4 + ""; // 100 + "" > "100" + "" > "100"
	}
	
}
