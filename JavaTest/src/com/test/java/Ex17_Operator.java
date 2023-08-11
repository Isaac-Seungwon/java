package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {

	public static void main(String[] args) {
			
		// Ex17_Operator.java
		
		/*
			논리 연산자
			- &&(and), ||(or), !(not), ^(not)
			- 2항 연산자인 게 있고, 1항 연산자인 게 있다.
			- 2항 연산자: &&, ||, ^
			- 1항 연산자: !
			- 피연산자를 대상으로 정해진 규칙을 따라 연산 결과를 반환하는 역할을 한다.
			- 피연산자의 자료형은 반드시 boolean이어야 한다.
			
			
			논리곱
			T && T = T
			T && F = F
			F && T = F
			F && F = F
			
			부정: 논리를 반대로 뒤집는다.
		*/
		
		System.out.println(true && true); // 이렇게 사용하지 않는다.
		
		int age = 20;
		
		System.out.println((age > 19) && (age < 30));
		

		// 복합 대입 연산자
		
		int n = 10;
		
		// 기존 n에 1을 추가하시오. (n값을 11로 바꾸시오)
		
		n = n + 1;
		System.out.println(n);
		
		n -= 2;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		/*
			대입 연산자, 할당 연산자
			- =
			- +=, -=, *=, /=, %=: 복합 대입 연산자
			- LValue(변수) = RValue(상수, 변수) 방식으로 작성한다.
			- LValue와 RValue의 자료형은 반드시 동일해야 한다. 만약 다를 경우 형변환을 통해 똑같이 맞춰줘야 한다.
			- 대입 연산자는 모든 연산자 중 우선 순위가 가장 낮다.
			
		*/
		
		/*
			# 연산자 우선 순위
			- 이 규칙을 지키지 않으면 값 자체가 달라지기 때문에 절대적이다.
			- 산술(*, / > +, -) > 비교 > 논리 > 대입
			- 대입 연산자가 모든 연산자 중 우선 순위가 가장 낮은 것을 기억하자.
			- 우선 순위가 같을 경우, 왼쪽에 있는 것부터 실행한다.
			
			# 연산자 연산 방향
		*/
		
		int sum = 10 + 20 * 3;
		
		System.out.println(sum);
		
		
		/*
		증감 연산자
		- ++(증가), --(감소)
		- 1항 연산자
		- 피연산자는 숫자형을 가진다.
		- 누적 연산을 한다. 기존의 값에 1을 더하거나 1을 빼는 연산을 한다.
		- 무조건 1씩만 더하거나 뺄 수 있다. 2를 더하거나 뺄 수 없다.
		
		*** 연산자와 피연산자의 위치를 바꿀 수 있다. 위치에 따라 연산자의 우선 순위가 달라진다는 점에서 중요하다.
		1. ++n: 전위 배치(전치): 연산자 우선 순위가 가장 높다.
		2. n++: 후위 배치(후치): 연산자 우선 순위가 가장 낮다.
		*/
		
		
		// 전치
		++n;
		System.out.println(n);
		
		// 후치
		n++;
		System.out.println(n);
		
		// 전위연산일때와 후위연산일 때 결과는 같지만 연산자 우선순위가 달라지므로 주의한다.
		
		n = 10;
		int result = 0;
		
		result = 10 + ++n;
		System.out.println(result); // 21
		
		// 연산자가 =, +, ++ 이렇게 3개가 있다.
		// 전위 연산의 경우 증감 연산자가 1등이 된다. n은 11이 되고, 산술 연산자 +가 실행된 후 대입 연산자 =가 실행되어 result에 21이 저장된다.
		
		++ n;
		result = 10 + n;
		
		// 한 문장에 넣으면 헷갈리므로 따로 작성하면 된다.
		// *** 증감 연산자를 다른 연산자와 한 문장에서 같이 사용하지 않는다!!
		
		n = 10;
		result = 0;
		
		result = 10 + n++;
		System.out.println(result); // 20
		
		// 후위 연산의 경우 산술 연산자가 먼저 실행되어 10 + 10이 대입 연산자로 인해 result에 저장되고, 증감 연산자가 실행되어 20이 저장된다.
		
		
		/*
		조건 연산자
		- ?:
		- A ? B : C
		- 3항 연산자 (유일한 3항 연산자로, 피연산자를 3개 필요로 한다)
		
		- A: boolean값을 가진다.
		- B, C: 상수 혹은 변수 값(데이터 값)을 가진다. 문장이 오는 경우도 있지만 보통 데이터 값을 가진다.
		- A 조건이 참이면 B를 반환하며, 거짓이면 C를 반환한다.
		*/
		
		boolean flag = true;
		String m1 = "참";
		String m2 = "거짓";
		
		// flag ? m1 : m2;
		// 반환 값을 가지고 아무것도 하지 않으면 에러가 난다.
		
		String result2 = flag ? m1 : m2;
		
		System.out.println(result2); // 참
		
		// A 조건이 참이므로 B(참)가 출력된다. 반면 거짓일 경우 C(거짓)이 출력된다.
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.printf("나이: ");
			
			age = scan.nextInt();
			
			// 19세 이상 60세 미만이면 통과 or 거절
			result2 = (age >= 19 && age < 60) ? "통과" : "거절";
			
			System.out.printf("입력한 나이 %d세는 %s입니다.\n", age, result2);
		} catch(Exception ex)
		{
		}
		
		
		// 비트 연산자
		int a = 10;
		int b = 5;
		
		System.out.println(a & b); // 0
		
		a = 10;
		b = 3;
		System.out.println(a | b); // 11
		
		// 비트 대 비트를 연산한다.
		// And 연산은 양쪽 다 1이어야 1을 돌려준다.
		// a는 1010, b는 0101 이므로 10 & 5는 0이 된다.
		
		// Or 연산은 하나라도 1이면 1을 돌려준다.
		// a는 1010, 0011 이므로 10 | 3은 11이 된다.
		// 일반적인 프로그래밍에서는 사용하지 않고, 네트워킹 프로그래밍에서 사용된다.
	}
}
