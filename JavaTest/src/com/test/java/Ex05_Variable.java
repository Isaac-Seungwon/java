package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
	
		// Ex05_Variable
		
		// 모든 자료형(8종류) + 변수 생성하기
		
		// 정수: byte 1, short 2, int 4, long 8
		
		byte b1;
		b1 = 100;
		System.out.println(b1);
		
		// Type mismatch: cannot convert from int to byte
		// b1 = 128;
		// b1 = -129;
		// 해당 범위를 벗어나는 값은 못 쓴다.
		
		// 자바가 미리 만들어서 제공하는 변수로, 이 안에는 숫자가 들어있다.
		b1 = Byte.MAX_VALUE;
		System.out.println(b1); // 127
		// byte가 가질 수 있는 최대값이 127을 의미한다.
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1); // -128
		// byte가 가질 수 있는 최소값이 -128을 의미한다.
		
		
		short s1;
		s1 = Short.MAX_VALUE;
		System.out.println(s1); // 32767
		
		s1 = Short.MIN_VALUE;
		System.out.println(s1); // -32768
		
		
		int n1;
		n1 = 1000000;
		System.out.println(n1);
		
		// int는 자료형 풀네임을 써야 한다.
		n1 = Integer.MAX_VALUE;
		System.out.println(n1); // 2147483647
		
		
		long l1;
		l1 = 100;
		System.out.println(l1);
		
		l1 = 1000000000;
		System.out.println(l1);
		
		// The literal 3000000000 of type int is out of range
		// int가 기본형이어서 오류가 난다. long형의 리터럴 뒤에 L또는 l을 써서 데이터 타입을 인식시켜야 한다.
		
		l1 = 3000000000L;
		
		l1 = Long.MAX_VALUE;
		System.out.println(l1);
		
		
		// 1. 변수
		// 2. 상수
		//	a. 이름이 있는 상수 > final 변수
		//	b. 이름이 없는 상수 > 순수 데이터 > 리터럴 (Literal)
		
		System.out.println(100); // 정수형 리터럴 (이름이 없는 상수)
		
		final byte KOR = 100; // 상수, final 변수, final 상수라고도 한다. 공식적으로는 final 변수이다.
		
		// The final local variable kor cannot be assigned
		// kor = 90;
		// 모든 final 변수는 대문자로 약속했다. 상수는 무조건 대문자인 게 관습적인 약속이다.
		
		
		// LValue(변수) = RValue(상수, 변수)
		// *********** LValue와 RValue는 자료형이 동일해야 한다.
		
		b1 = 10; // byte
		s1 = 10; // short
		n1 = 10; // int (정상)
		l1 = 10; // long
		
		// 오른쪽의 모든 10의 자료형은 integer이다.
		// 이 4가지가 모두 에러가 나지 않는 이유는 눈 감고 넘어가기 때문이다. (예외적인 상황)
		
		// 값을 할당하기 위해 상수 10을 임시로 메모리에 integer로 10을 만든다.
		// 그리고 변수에 임시로 만든 10을 부여한다.
		// 임시로 메모리를 부여할 때 자료형이 기본적으로 integer이기 때문에 long에 부여하려고 할 때 오류가 나는 것이다.
		// 상수 뒤에 L을 쓰면 인티저 범위를 벗어난 long 타입으로 잡는다.
		
		
		// *** 정수형 상수가 int일까?
		// - 운영체제 + CPU
		// - 운영체제가 한 번 처리하는 양
		
		// 운영체제
		// - 8비트 운영체제  > int > 1byte
		// - 16비트 운영체제 > int > 2byte
		// - 32비트 운영체제 > int > 4byte
		// - 64비트 운영체제 > int > 8byte (x) > 4byte (o)
		
		// 32비트에서 64비트로 넘어은 게 10년이 되었는데, 인티저에 대한 정의를 바꾸었을 때 위험부담이 심하다.
		// 그래서 운영체제를 32비트에서 64비트로 바꾸어도 4byte로 동결하게 되었다.
		
		
		// 실수
		
		// 단정도형
		float f1 = 3.14f;	// Type mismatch: cannot convert from double to float
		System.out.println(f1);
		
		// 배정도형
		double d1 = 6.28d;	// d, D는 생략해도 된다.
		System.out.println(d1);
		
		f1 = 123.123456789012345678901234567890f;
		d1 = 123.123456789012345678901234567890;
		
		System.out.println(f1); // 소수 이하 5자리 (123.12346) 
		System.out.println(d1); // 소수 이하 14자리 (123.12345678901235)
		
		// 이러한 현상은 정수에서도 똑같이 나타난다.
		
		f1 = 123456789012345678901234567890f;
		d1 = 123456789012345678901234567890d;
		
		System.out.println(f1); // 1.2345679E29 (1234567890000000000000000000000) 유효자리수에 따라 절삭됨
		System.out.println(d1); // 1.2345678901234568E29
		
		
		double d2 = 0.25;
		System.out.println(d2);
		
		double d3 = 0.1;
		System.out.println(d3);
		
		System.out.println(0.1 + 0.2); // 0.30000000000000004 우리가 코딩을 할 때 크게 영향을 주진 않음
		
		// 실수가 불완전하고 쓰면 안될 것 처럼 보이기도 하는데, 실수의 특징으로만 생각하면 된다.
		
		
		// 정수형 > 4가지 > int(주력), long(21억보다 큰 값일 때) 두 가지만 쓴다. byte, short는 거의 쓰지 않는다.
		// 실수형 > 2가지 > double(주력), float는 거의 쓰지 않는다.
				
		
		// ------------------------------------------------------------------------------------
		
		
		// 문자형
		char c1;
		c1 = 'A'; // A cannot be resolved to a variable > 문자 리터럴
		
		c1 = '가';

		c1 = '@';

		c1 = '1'; // 숫자 1과 문자 '1'은 똑같지 않다. (문자 코드 값 49)
		// 둘 다 아라비안 숫자 1을 사용해 표현했지만, 전혀 다른 데이터로 인식한다.
		// 문자를 바로 표현 할 수 없으니까 문자 코드 표로 매칭한다고 했는데, 숫자 1은 49이다.
		
					// 문자 1						 0011 0001
		int n = 1;	// 0000 0000 0000 0000 0000 0000 0000 0001
		
		
		// Invalid character constant
		// c1 = '홍길동';
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		
		// ------------------------------------------------------------------------------------

	
		// 논리형
		// - true or false
		
		boolean flag;
		
		flag = true; // 논리형 상수(리터럴)
		flag = false;
		
		System.out.println(flag);
		
		
		// ------------------------------------------------------------------------------------
		
		
		// 참조형
		// - String

		// String
		// - 문자열
		// - 문자들이 열을 지어있는 형태 > 문자 집합
		
		String name;
		name = "홍길동";
		
		System.out.println(name);
		
		
		String nick = " "; // 스페이스바도 문자코드 32에 해당하는 글자값이다.
		// 빈문자열, Empty String
		
		
		// 연산자 일부
		// - 대입 연산자
		// - 산술 연산자
		
		int a1 = 10;
		int a2 = 20;
		int a3 = a1 + a2; // 산술 연산자 (+)
		
		System.out.println(a3);
		// 10과 20을 더해서 30이 되었다.
		
		
		String t1 = "홍";
		String t2 = "길동";
		String t3 = t1 + t2; // 문자열 연산자 (+) concat 연산자
		
		System.out.println(t3);
		// "홍"과 "길동"을 붙여서 "홍길동"이 되었다.
		
		// 연산자로 쓸만한 문자가 많지 않다. 상황을 봐서 양쪽이 숫자면 더하고, 문자면 붙인다.
		
		
		// 요구사항) 숫자 2개를 연산과정과 함께 결과를 출력하시오.
		// 10 + 20 = 30
		
		a1 = 10;
		a2 = 20;
		a3 = a1 + a2;
		
		System.out.println("10 + 20 = 30");
		System.out.println(a1 + " + " + a2 + " = " + a3);
		
	}
}