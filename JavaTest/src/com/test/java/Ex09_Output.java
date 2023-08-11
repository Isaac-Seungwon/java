package com.test.java;

public class Ex09_Output {

	public static void main(String[] args) {
		
		// Ex09_Output
		
		/*
			CLI > Command Line Interface > 텍스트 기반 명령 입출력 환경
			GUI > Graphic User Interface > 화면 기반 입출력 환경
			
		 	콘솔 입출력, Console Input Output
		 	- 기본 입력 장치: 키보드
		 	- 기본 출력 장치: 모니터
		 	
		 	콘솔 출력
		 	- 클래스.필드.메소드(인자);
		 	
		 	1. System.out.println(값);
		 		- println 메소드
		 		- print line
		 	
		 	2. System.out.print(값);
		 		- print 메소드
		 	
		 	3. System.out.printf(값);
		 		- printf 메소드
		 		- print format 메소드
		 		- 형식 문자를 제공
		 		- 편리, 가독성
		 	
		*/
		
		// 성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "아무개";
		int kor2 = 100;
		int eng2 = 90;
		int math2 = 80;
		
		
		// 요구사항) "안녕하세요. Isaac님" 문장을 출력하시오.
		
		String name = "Isaac";
		
		System.out.println("안녕하세요. " + name + "님");
		
		System.out.printf("안녕하세요. %s님", name); // $s: 형식 문자
		
		// printf는 출력하는 모습을 한 번에 미리 볼 수 있다는 장점이 있다.
		
		
		// 요구사항) "안녕하세요. Isaac님. 안녕히 가세요. Isaac님."
		System.out.printf("안녕하세요. %s님. 안녕히 가세요. %s님.", name, name);
		
		
		// 형식 문자
		// 1. %s: String
		// 2. %d: Decimal(모든 정수) > byte, short, int, long
		// 3. %f: Float(모든 실수) > float, double
		// 4. %c: Char
		// 5. %b: Boolean
		
		System.out.printf("저는 %s입니다. 나이는 %d살입니다. 키는 %fcm입니다. 혈액형은 %c형입니다. %b\n"
				, "Isaac"
				, 25
				, 171.1
				, 'O'
				, true);
		
		
		// 형식 문자의 확장 기능
		// %숫자s, %숫자d, %숫자f, %숫자c, %숫자b
		// - 출력할 너비를 지정한다.
		// - 탭 문자와 유사한 역할을 한다.
		
		int num = 123;
		
		System.out.printf("[%d]\n", num); // [123]
		System.out.printf("[%10d]\n", num); // [       123] 10칸을 확보하고 그 안에서 데이터를 출력한다.
		System.out.printf("[%-10d]\n", num); // [123       ]
		System.out.printf("[%3d]\n", num); // [123]
		
		// %.숫자f
		// - 소수점 이하 자릿수 지정
		// - %f 를 그대로 쓰면 소수 이하 6자리를 강제로 출력한다.
		
		double num2 = 3.14;
		
		System.out.printf("%f\n", num2); // 3.140000
		System.out.printf("%.2f\n", num2); // 3.14
		System.out.printf("%.1f\n", num2); // 3.1
		System.out.printf("%.0f\n", num2); // 3
		
		
		// %d, %f
		// - 자릿수 표기(3자리)
		
		int price = 1000000;
		System.out.printf("금액: %d원\n", price); // 금액: 1000000원
		System.out.printf("금액: %,d원\n", price); // 금액: 1,000,000원
		
		
		// 천단위 + 소수 이하 2자리 + 전체 너비(20자리 + 우측정렬)
		double num3 = 1234567.89012345;
		
		System.out.printf("[%f]\n", num3);
		System.out.printf("[%.2f]\n", num3);
		System.out.printf("[%20.2f]\n\n\n", num3);

		
		// 카페 메뉴판 출력 > 열 정렬 > \t + 형식문자
		
		System.out.println("==========================");
		System.out.println("   음료 가격 (단위: 원)");
		System.out.println("==========================");

		System.out.printf("콜라: \t\t%,6d\n", 2500);
		System.out.printf("사이다: \t%,6d\n", 3500);
		System.out.printf("라떼: \t\t%,6d\n", 500);
		System.out.printf("아메리카노: \t%,6d\n", 15000);

		// *** 단위가 없으면 2500원인지, 500원인지 알 수 없다. 단위를 반드시 넣어야 한다.
	
	}
}