package com.test.java;

public class Ex35_String {

	public static void main(String[] args) {
		
		// Ex35_String
		
		/*
			문자열
			- 물리적으로는 참조형이지만, 약간의 값형의 성질을 가진다.
			- 박쥐
			
			*** 면접 때 질문하기 딱 좋다. (20~30초 내외로 답변할 수 있도록)
			1. 메모리의 공간은 한 번 할당되면 더 이상 늘리거나 줄일 수 없다.
			2. 문자열은 불변(Immutable) 하다. 한 번 만들어진 문자열은 절대 수정할 수 없다.
			3. 문자열은 참조형이다.
		*/
		
		m1();
		m2();
		m3();
		
	}

	private static void m3() {

		// String vs StringBuilder
		
		String s1 = "Isaac"; // 문자열 리터럴 사용 > 특혜
		String s2 = new String("Isaac"); // 참조형으로 불리는 것들은 원래 이런 식으로 만들어야 정석이다.
		
		// StringBuilder s3 = "Isaac";
		StringBuilder s3 = new StringBuilder("Isaac");
		
		System.out.println(s1); // Isaac
		System.out.println(s3); // Isaac
		
		System.out.println(s1.length()); // 5
		System.out.println(s3.length()); // 5
		
		
		// StringBuilder > 수정 작업에 강하다!
		// 문자열은 잦은 수정이나 덩치 큰 작업에 적합하지 않다고 하는데, 그것에 대한 해결책을 제시한다.

		long begin = System.nanoTime(); // 훨씬 더 세밀한 시간 계산 가능

		// 작업 > String		
		String txt1 = "Isaac";
		
		for (int i=0; i<100000; i++) {
			txt1 = txt1 + "."; // 수정 작업
		}
		
		long end = System.nanoTime();
		
		System.out.println(txt1.length());
		System.out.println(end - begin + "ns"); // 1080262700ns
		
		
		
		begin = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder("Isaac");
		
		for (int i=0; i<100000; i++) {
			txt2.append("."); // 수정 작업
			// 연산자 대신에 메서드를 사용한다.
		}
		
		end = System.nanoTime();
		
		System.out.println(txt2.length());
		System.out.println(end - begin + "ns"); // 838400ns
		
	}

	private static void m2() {
		
		// 문자열은 불변이다 > 되도록 하지 말아야 하는 행동은?
		// 1. 문자열의 잦은 수정
		// 2. 커다란 문자열의 수정
		
		String txt1 = "Isaac";
		
		txt1 = txt1 + "님"; // 수정
		// 새로운 "Isaac" 상수와 기존의 "님" 상수를 합한 새로운 "Isaac님" 상수 생성
		// 참조를 잃어버리다: 쓰레기(garbage)를 주기적으로 참조가 끊어진 것들을 소멸시킨다. (가비지 컬렉터)
		// 쓰레기를 없애는 데 비용이 발생한다.
		
		/*
		for (int i=0; i<100; i++) {
			txt1 = txt1 + "님";
		}
		만들고 버리는 작업을 100번 하면 메모리가 쓰레기로 찼다가 다시 줄어들게 된다.
		여기에 비용이 꽤 들어간다. 그래서 문자열을 자주 수정하지 말라고 하는 것이다.
		*/
		System.out.println(txt1);
		
		
		// 아주 큰 데이터
		txt1 = "Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.Isaac입니다.";
		
		txt1 = txt1 + "!"; // 이런 것도 하지 말아야 한다!
		// 결과적으로 글자 하나를 더 붙이는 게 아니라, 큰 덩어리 하나를 또 만드는 것이다.
		// 이것 역시 메모리 낭비이다. 이 방법을 자주 반복적으로 하지 않더라도 전체가 쓰레기가 되므로 선호하는 작업은 아니다.
		// 어느 정도까지 상황에 따라서 괜찮은지 모른다.
	}

	private static void m1() {

		// *** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변하다.
		
		int n1 = 10;			// 4byte
		int n2 = 2000000000;	// 4byte
		
		
		String s1 = "Isaac";
		String s2 = "안녕하세요. Isaac입니다.";
		String s3 = "Isaac";
		String s4 = "I";
		s4 = s4 + "saac";
		
		// 문자열과 문자열의 비교를 할 때 절대 사용 금지!!
		// 어떨 때는 우리가 원하는 결과가 나오지만, 어떨 때는 반대로 나온다.
		// 그럴 바에는 차라리 둘 다 잘못된 결과라고 생각하고 쓰지 않게 된 것이다.
		// 왜 결과가 다른걸까?
		// 메모리 내에서 "Isaac"을 두 번 만들지 않고, 한 번만 할당한다.
		// "Isaac" 메모리 주소 100을 복사하여 데이터를 넣는다.
		// "I"와 "saac"은 메모리에 없기 떄문에 새로 넣고, 주소 100, 200을 부여한다.
		// 문자열 리터럴로 만들어진 Isaac과 문자열 연산으로 만들어진 Isaac은 같지 않다.
		// 문자열 연산으로 만들어진 Isaac은 메모리에 새롭게 만든다.
		// 메모리 절약을 위해서 이런 체계를 만든 것이다.
		
		System.out.println(s1 == s3); // true
		System.out.println(s1 == s4); // false
		
	}
}
