package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 클래스가 어떤 패키지에 들어 있는지를 함께 작성해야 한다.
// 보통 document를 보면 어떤 패키지에 들어 있는지 알 수 있다.
// 마우스를 올렸을 때, import가 가능하다.
// Ctrl + Shift + O 단축키로 빠르게 import가 가능하다.

public class Ex11_BufferedReader {

	public static void main(String[] args) {
		
		// Ex11_BufferedReader.java
		
		// BufferedReader 클래스

		// reader: 콘솔 입력 도구
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자 입력: ");

		try {
			
			// 한글 입력 가능
			// int code = reader.read();
			// System.out.printf("%c\n", code);
			
			// 문장 단위 입력 가능
			String line = reader.readLine();
			System.out.println(line);
			
		} catch(Exception ex)
		{
		}
		
		
		// readLine(): 입력 버퍼에서 처음부터 ~ 엔터(\r\n)를 만나기 전까지 모두 읽어오는 메소드
		// enter 입력이 사용자가 원해서 넣은 게 아니라는 것을 안다.
		
		try {
		
			// String name = reader.readLine();
			// System.out.println("안녕하세요. %s님\n", name);
			
			System.out.println("숫자 입력");
			
			String num = reader.readLine(); // 100입력 > 숫자가 아닌 문자열 "100"을 돌려준다.
			
			// System.out.println(num * 2); // 문자열을 입력할 떄는 좋지만, 숫자를 연산하는 과정에서는 쓸모가 없지 않나?
			// 이때 사용하는 기능이 Wrapper Class이다.
			
			// Wrapper Class (Utility CLass)
			// -원시형 데이터를 도와주는 기능을 하는 클래스
			
			// Integer, Long, Double을 주로 사용한다.
			// Boolean, Character도 자주 사용하긴 하지만, parse 클래스를 쓸 일은 많이 없다.
			
			int intnum = Integer.parseInt("num"); 
			// integer 타입으로 변환시켜준다.
			
			System.out.println(intnum * 2);

			
		} catch(Exception ex)
		{
		}


		try {
		
			// 요구사항) 숫자 2개 입력> +연산 > 연산 과정과 결과 모두 출력
			
			// 숫자1: 5
			// 숫자2: 3
			// 5 + 3 = 8
			
			System.out.println("첫 번째 숫자: ");
			String input1 = reader.readLine(); 
			
			System.out.println("두 번째 숫자: ");
			String input2 = reader.readLine(); 
			
			int n1 = Integer.parseInt(input1);
			int n2 = Integer.parseInt(input1);
			
			System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
			
		
		} catch(Exception ex)
		{
		}
		

		try {
		
			System.out.println("숫자: ");
	
			String input = reader.readLine();
			
			int num = Integer.parseInt(input);

			System.out.println(100 / num); // 이 코드는 문법적으로는 괜찮지만, 0이 들어가면 오류가 난다.
			// java.lang.ArithmeticException: / by zero
			// 피제수 / 제수
			// 제수는 0이 될 수 없다.
			
			/*
			에러, Error
			- 오류, 버그(Bug), 예외(Exception) 등..
			
			1. 컴파일 에러
			2. 런타임 에러
			3. 논리 에러
			
			1. 컴파일 에러
				- 컴파일 작업 중에 발생하는 에러 (번역 중에 발생하는 에러)
				- 컴파일러가 발견한다. (javac.exe)
				- 발생하는 순간 모든 번역 작업을 중단시킨다.
				- 컴파일 에러는 100% 해결하지 않으면 안 되는 에러이다. 프로그램 생성이 불가하며 반드시 해결해야 한다.
				- 이클립스가 연동이 되며, 빨간 밑줄을 통해 컴파일 에러가 발생한 부분을 알 수 있다.
				- 컴파일러가 알려주는 오류로, 발견이 쉬우므로 난이도가 가장 낮다. 또한, 고치기도 쉽다.
				- 오타로 인해 발생하는 경우가 대부분이다.
			
			2. 런타임 에러
				- 런타임(Runtime): 프로그램이 실행 중임을 의미한다.
				- 컴파일 작업 중에는 에러가 없었다. 하지만 실행 중에 발생하는 에러를 의미한다.
				- 문법에는 오류가 없으나, 다른 원인으로 발생하는 에러이다. (100을 0으로 나눔)
				- 예외(Exception), (상황 상) 예상하지 못한 사건이라고도 부른다.
				- 난이도는 중간 정도 된다.
				- 발견을 할 수도 있고, 못할 수도 있다. 찾으면 고칠 수 있지만 영영 발견되지 않는 경우도 있다.
				- 충분히 테스트하여 에러를 최소화해야 한다.
				- 많은 사람들이 다양한 사용을 하면서 오류를 발견할 수 있도록 해야 한다. 별의 별 일이 많기 때문에 개발자가 모두 예상하는 것이 어렵다.
				- 게임 출시 > 클로즈드 알파, 클로즈드 베타 > 오픈 알파, 오픈 베타
				- 런타임 에러를 전문적으로 에러를 발견하는 프로그램도 있다.
				
			3. 논리 에러
				- 컴파일도 성공하고, 실행 중에도 아무 문제가 없다. 그런데 결과가 이상하다.
				- a (10), b (5)를 더하려고 한다. 그런데 소스코드에서는 빼기로 작업한 경우이다.
				- 정신을 바짝 차리고 개발해야 한다. 그렇지 않으면 개발자가 밤을 새게 된다.
			*/
			
		} catch(Exception ex)
		{
		}
	}
	
}
