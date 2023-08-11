package com.test.java;

public class Ex15_Operator {

	public static void main(String[] args) {
		
		// Ex15_Operator.java
		
		/*
			연산자, Operator
			- 수학 연산자의 대부분이 프로그래밍 연산자로 넘어왔다.
			- 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동(연산)의 결과를 반환하는 요소이다.
			- 주로 기호를 많이 사용하지만, 단어도 많이 사용한다.
			
			1. 문장, Statement
			2. 표현식, Expression
			3. 연산자, Operator
			4. 피연산자, Operand
			5. 연산자 우선 순위
			6. 연산자 연산 방향
			
			
			1. 문장, Statement
			- 1개 이상의 표현식이 모여서 문장을 만든다.
			- int sum = 10 + 20;
			
			2. 표현식, Expression
			- 문장을 구성하는 최소 단위로, 하나의 완성된 문장을 만들 수 있는 최소 표현이다.
			- int sum;
			- 10 + 20
			- sum = 30
			- 이것들을 하나의 표현식이라고 부를 수 있다. 쪼갰을 때 그 자체만으로도 말이 되는 것을 의미한다.
			- 코딩을 할 때 크게 간섭되는 내용은 아니다.
			
			3. 연산자, Operator
			- +
			- =
			
			4. 피연산자, Operand
			- +: 10, 20
			- =: sum, 30
			
			5. 연산자 우선 순위
			- 1 + 2 * 3
			- 하나의 문장에 속해 있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙이다.
			
			6. 연산자 연산 방향
			- 1 + 2 + 3
			- 하나의 문장에 속해 있는 연산자들 중 우선 순위가 동일하면 누가 먼저 실행하는지에 대한 규칙
			- 우선 순위를 판가림하지 못할 때에 2차적인 규칙이 있다.
			- 대부분 왼쪽에서 오른쪽 순으로 실행한다. (반대로 가는 것이 몇 가지 있다.)
			
			
			연산자 종류
			
			1. 행동(목적)
				a. 산술 연산자
				b. 비교 연산자
				c. 논리 연산자
				d. 대입 연산자
				e. 증감 연산자
				f. 조건 연산자
				g. 비트 연산자
			
			2. 용법(피연산자 개수)
				a. 1항 연산자
				b. 2항 연산자
				c. 3항 연산자
			
			산술 연산자
			- +, -, *, / (사칙 연산), % (mod, 나머지)
			- 2항 연산자
			- 피연산자를 숫자형으로 가진다. (정수, 실수)
		*/
		
		int a = 10;
		int b = 3;
			
		System.out.printf("%d + %d = %d\n", a, b, a + b); // 10 + 3 = 13
		System.out.printf("%d - %d = %d\n", a, b, a - b); // 10 - 3 = 7
		System.out.printf("%d * %d = %d\n", a, b, a * b); // 10 * 3 = 30
		System.out.printf("%d / %d = %d\n", a, b, a / b); // 10 / 3 = 3
		System.out.printf("%d %% %d = %d\n\n", a, b, a % b); // 10 % 3 = 1, printf에서 %를 하나만 쓰면 에러가 난다.
		
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%f / %f = %f\n\n", c, d, c/d); // 10.000000 / 3.000000 = 3.333333

		System.out.println(10 / 3);		// 3, 정수끼리의 연산은 정수가 된다.
		System.out.println(10.0 / 3);	// 3.3333333333333335, 실수가 들어간 연산은 실수가 된다.
		System.out.println(10.0 / 3.0);	// 3.3333333333333335
		System.out.println(10 / 3.0);	// 3.3333333333333335
		System.out.println();
		
		
		// System.out.println(100 / 0);
		System.out.println(100 / 0.0);	// Infinity
		System.out.println(-100 / 0.0);	// -Infinity
		
		
		// *** 모든 산술 연산자의 결과 자료형은 두 피연산자의 자료형 중 더 큰 크기가 큰 자료형으로 반환된다.
		
		System.out.println(10 / 3);		// int / int = int
		System.out.println(10.0 / 3);	// double / int = double
		System.out.println(10.0 / 3.0);	// double / double = double
		System.out.println(10 / 3.0);	// int / double = double
		System.out.println();
		
		
		// 오버플로우, 언더플로우 발생 (형변환으로 해결)
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println(e + f); // 30억이 아니라 -1294967296이 출력된다.
		// int + int 이므로 오버플로우가 난다. 엉뚱한 숫자가 나오는데 오류가 나지 않는다.
		System.out.println((long)e + f); 
		// 피연산자 중 하나를 long형으로 만들었더니 논리에러가 사라졌다.
		
		e = 300000;
		f = 500000;

		System.out.println(e * f);			// -323855360
		System.out.println((long)e * f);	//150000000000
		
		e = -210000000;
		f = 10000000;
		
		System.out.println(e - f);	// -220000000
		
		
		// 예외 상황: byte, short 연산 결과는 무조건 int이다.
		// CPU 처리 단위가 4바이트이기 때문에 4바이트보다 작은 byte와 short에 추가 작업이 들어간다.
		// 그 로스를 막고 효율성을 높이기 위해 CPU가 처리하는 걸 모두 integer로 만든 것이다.
		
		// byte + byte = byte (X)
		// byte + byte = int (O)
		// short + short = int (O)
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		
		// Type mismatch: cannot convert from int to byte
		// b3 = b1 + b2;
		// 명시적 형변환이 필요하다.
		// 결과가 integer가 되어버리기 떄문에 byte로 형변환을 시켜준다.
		
		b3 = (byte)(b1 + b2);
		
		// *** 위와 같은 이유 때문에 정수를 사용할 떄, byte와 short를 거의 사용하지 않는 것이다.
		
		
		// 나머지 연산자 사용
		// - 패턴을 만들 때 주로 사용한다.
		// - 달력
		
		System.out.println();
		System.out.println(10 % 3);		// 1
		System.out.println(10 % 4);		// 2
		System.out.println(10 % 5);		// 0
		System.out.println(10 % 10);	// 0
		System.out.println(10 % 11);	// 10
	}
	
}
