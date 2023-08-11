package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		
		// Ex20_Method.java
		
		// 인자 리스트
		// - 파라미터
		// - 인자
		// - 매개변수
		
		// 요구사항) 'Isaac'에게 인사하는 메소드를 구현하시오.
		// 추가사항) 'Sopia'에게 인사하는 메소드를 구현하시오.
		// 추가사항) 강의실에 있는 모든 사람마다 인사하는 메소드를 구현하시오. x 25
		// 추가사항) 대한민국 모든 사람에게 인사하는 메소드를 구현하시오. x 5000백만
		
		hello1();
		hello2();

		
		helloEveryOne("Isaac");
		helloEveryOne("Sopia"); // 인자 리스트에 값을 넣는 것은 선택이 아닌 필수이다.
		// 메소드의 가용성, 활용도, 재사용성을 높이는 작업
		// 인자값을 어떻게 하느냐에 따라서 메소드의 활용 가치가 완전히 달라진다.
		// 메소드를 어떻게 써먹을 수 있을지 고민할 수록 더 좋은 코드가 된다.
		// 같은 목적으로 하는 똑같이 생긴 코드가 2번 이상 발견되면 안 된다.
		
		
		checkAge(25);
		checkAge(15);
		
		checkScore("Isaac", 100, 90, 80); // 실인자
	}
	
	// 가인자
	public static void checkScore(String name, int kor, int eng, int math) {
		
		// 총점이 250점 이상이면 합격
		int total = 0;
		total = kor + eng + math;
		
		String result = total >= 250 ? "합격" : "불합격";
		
		System.out.printf("%s 학생: %d = %s\n", name, total, result);
	}
	
	public static void checkAge(int age) { // 메소드 이름도 캐멀 표기법을 따른다.
		
		String result = age >= 19 ? "성인" : "미성년자";
		
		System.out.printf("%d살은 %s입니다.\n", age, result);
	}
	
	public static void hello1() {
		System.out.println("Isaac님 안녕하세요.");
	}
	
	public static void hello2() {
		System.out.println("Sopia님 안녕하세요.");
	}
	
	public static void helloEveryOne(String name) {
		// String name = "이름";
		
		System.out.println(name + "님 안녕하세요.");
	}
}
