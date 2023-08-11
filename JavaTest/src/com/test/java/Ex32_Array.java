package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {

	public static void main(String[] args) {
		
		// Ex32_Array.java
		
		/*
			배열, Array
			- 자료 구조의 하나이다.
			- 자료형의 기준으로 따지자면 참조형의 하나이다.
			- 변수는 하나의 데이터만을 저장할 수 있는 반면, 배열은 여러 개의 데이터를 저장할 수 있는 집합 자료형이다.
			- 배열에는 같은 자료형과 같은 성격을 가지고 있는 데이터를 집합으로 넣을 수 있다.
			
			
			1. 자료형 + 변수
			2. 콘솔 입출력
			3. 제어문(***)
			4. 배열(***)
			
			
			# 프로그래머에게 요구되는 필수 요소
			- 알고리즘 (어떻게 문제를 해결할 수 있는가?)
			- 자료구조 (데이터를 어떤 식으로 관리하고 저장해야 효율적인가?)
			
			그리고 배열은 중요한 자료구조 중에 하나이다.
			
			
		*/
		
		m1();
		m2();
		m2_2();
		m3();
		m4();
		m5();
		// m6();
		m7();
		m8();
		m9();
		m10();
		m11();
		m12();
		m13();
		
		
	}

	private static void m13() {

		int[] nums = { 5, 3, 1, 4, 2 };
		
		Arrays.sort(nums); // Quicksort implementations 퀵정렬
		System.out.println(Arrays.toString(nums));
	}

	private static void m12() {

		// 정렬
		// - 요소간의 크기를 비교하고 재배치하는 작업을 말한다.
		
		// 1. 오름차순
		//	a. 숫자: 작은 수 > 큰수
		//	b. 문자열: 문자코드값 순으로
		//	c. 날짜시간: 과거 > 미래

		// 2. 내림차순
		//	b. 숫자: 큰수 > 작은 수
		//	b. 문자열: 문자코드값 역순으로
		//	c. 날짜시간: 과거 > 미래
		
		// 정렬 구현
		// 1. 개발자 구현
		// 2. JDK or Library 사용
		
		
		// 버블 정렬
		// 오름차순 정렬
		int[] nums = {5, 3, 1, 4, 2};
		
		// 5 3: 5와 3을 비교, 위치를 3 5 바꾼다. -> 3 1 4 2 / 5
		// 3 1: 3과 1을 비교, 위치를 1 3 바꾼다. -> 1 3 2 / 4 5
		// 1 3: 1과 3을 비교 -> 1 2 / 3 4 5
		// 1 2: 1과 2를 비교 -> 1 2 3 4 5
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		for (int i = 0; i < nums.length - 1; i++) { // 0, 1, 2, 3 > Cycle
			
			for (int j = 0; j < nums.length - 1 - i; j++) { // 비교 후 스왑
				
				if (nums[j] > nums[j+1]) { // 오름차순
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(nums));
	}

	private static void m11() {

		// 배열 초기화 리스트
		
		int[] nums = new int[3];
		System.out.println(Arrays.toString(nums));
		
		// 초기화
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		System.out.println(Arrays.toString(nums));
		
		
		// 초기화 리스트 방식
		int[] nums2 = new int[] { 100, 200, 300 }; // 배열의 길이를 적게 되면 에러가 난다.
		System.out.println(Arrays.toString(nums2)); // [100, 200, 300]
		
		int[] nums3 = new int[] { 0, 1, 2 };
		System.out.println(Arrays.toString(nums3)); // [0, 1, 2]
		
		String[] names1 = new String[3];
		names1[0] = "Isaac";
		names1[1] = "Isaa";
		names1[2] = "Isa";
		System.out.println(Arrays.toString(names1)); // [Isaac, Isaa, Isa]
	}

	private static void m10() {
		
		// int a; // null
		// System.out.println(a);
		
		
		// 배열의 자동 초기화
		// - 배열(참조형)은 생성 직후에 자동으로 초기화된다.
		
		// 초기화 규칙 (가장 최소로 초기화한다)
		// 1. 정수 배열 > 0
		// 2. 실수 배열 > 0.0
		// 3. 문자 배열 > \0
		// 4. 논리 배열 > false
		// 5. 참조형 배열 > null
		
		int[] nums = new int[3]; // int x 3
		System.out.println(nums[0]); // 0
		
		// 0도 엄연한 데이터 중에 하나이다.
		// 배열 내에 이미 데이터 '0'이 들어가 있다.
		
		double[] nums2 = new double[3];
		System.out.println(Arrays.toString(nums2)); // [0.0, 0.0, 0.0]
		
		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1)); // [, , ]
		
		boolean[] islist = new boolean[3];
		System.out.println(Arrays.toString(islist)); // [false, false, false]
		
		String[] islist2 = new String[3];
		System.out.println(Arrays.toString(islist2)); // [null, null, null]
	}

	private static void m9() {

		// 유틸리티 클래스
		// - int > Integer
		// - double > Double
		
		// Arrays 클래스
		// - 배열 유틸리티 클래스
		
		int[] nums = new int[3];
		
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		
		// 배열의 상태가 궁금 > 출력해본다!
		printArray(nums);
		
		
		// 덤프(dump): 프로그래밍 쪽에서는 객체의 상태를 하나의 문자열로 풀어내는 행동을 의미한다.
		
		System.out.println(nums); // 해시코드: [I @ 17c68925 [: 배열, I: 인티저, @이후 16진수: 메모리 주소 - 자바가 임의로 작업한 공간이고 써먹을 곳은 없다
		// 결론: 배열은 그냥 출력했을 때, 아무 의미가 없다.
		

		System.out.println(Arrays.toString(nums)); // [111, 222, 333]
		
		// 배열의 상태를 한 눈에 알아보기 쉽게 문자열로 돌려주는데, 이를 덤프(dump)한다고 한다.
		
		
		// 깊은 복사 메소드
		
		int[] copy;
		
		copy = Arrays.copyOfRange(nums, 0, nums.length);
				
		nums[0] = 1000;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
	}

	// 배열 변수끼리의 복사가 일어나는데, 이 경우 값을 복사하는 게 아니라 주소값을 복사하게 된다.
	// 지역변수, 매개변수에 모두 결과가 같다.
	public static void printArray(int[] nums) { // 배열도 매개변수, 일반변수 모두 쓰일 수 있다.
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	private static void m8() {

		// 배열 복사
		// 1. 얕은 복사, Shallow Copy
		// - 주소값 복사
		// - Side Effect 발생
		
		// 2. 깊은 복사, Deep Copy
		// - 요소 복사
		// - Side Effect 발생하지 않음
		
		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		
		for (int i = 0; i < nums.length; i++) {
			
			// 배열 = 배열 X
			// int = int > 값형 복사 1대1카피
			copy[i] = nums[i];
		}
		
		copy[0] = 50;
		
		System.out.println(copy[0]);
		System.out.println(nums[0]);
		System.out.println(copy[1]);
	}

	private static void m7() {
		
		// 배열 복사
		
		// 값형 복사 > Side Effect가 발생하지 않는다.
		int a = 10;
		int b;
		
		b = a;
		
		// 원본 수정 > 복사본에 영향을 미치는지 확인
		a = 20;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		
		// *** 개발자가 만드는 모든 지역 변수는 Stack에 생성한다.
		
		int n = 10;
		
		
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy;
		
		// int[] = int[]
		copy = nums;
		
		// 원본 수정
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
	
		// 왜 건들지도 않은 copy의 값도 바뀌는 걸까?
		
	}

	private static void m6() {

		// 배열의 길이는 런타임 때 정할 수도 있다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생수: ");
		int count = scan.nextInt();
		
		int[] kors = new int[count]; // 런타임 때 배열의 길이가 정해진다.
	}

	private static void m5() {
		
		// 메모리의 공간은 한번 할당되면, 절대로 공간을 더 늘리거나 줄일 수 없다.
		
		int n; // 4byte
		
		int[] nums = new int[3]; // 4byte x 3 = 12byte
		// 변수의 크기를 예측해서 선언해야 한다.
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		// 갑자기 방이 하나 더 필요하다!
		// num[3] = 400; // 100% 불가능
		
	}

	private static void m4() {
		
		// 각 자료형
		
		// 정수 배열(byte, short, int ,long)
		long[] list1 = new long[5];
		list1[0] = 100;
		System.out.println(list1[0]);
		
		// 실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		// 문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		// 논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		// 참조형
		String[] list5 = new String[5];
		list5[0] = "Isaac";
		System.out.println(list5[0]);
		
		
		// 주의할 점
		
		// Calendar c1;
		 // 캘린더를 5개 생성한 게 아니라 캘린더를 저장할 수 있는 변수 5개를 만든 것이다.
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF\n", list6[0]);
	}

	private static void m3() {

		int[] nums = new int[3];
		
		// 길이(방의 개수): 3
		// 인덱스(방 번호): 0 ~ 2, 0 ~ 길이 - 1
		// 방 1개(데이터): 요소(Element)
		
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 없는 방 번호를 사용한 경우 발생하는 오류
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		//nums[3] = 400;
		
		
		// 입력
		// 배열을 방을 원하는 순서대로 접근하는 것을 탐색한다고 표현한다. > for문을 자주 사용한다.
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}
		
		// 출력
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
	}

	private static void m2_2() {
		int[] kors = new int[300];
		int total = 0;

		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
		}
		
		double avg = total / (double)kors.length;
		
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %f\n", avg);
		
		// 배열의 변수는 일련번호처럼 숫자가 부여되어 저장되므로, 일괄적으로 처리하는 게 가능하다.
		
		// # 배열의 길이 
		// 상수를 적지 않고 length 속성을 이용해 배열로부터 length를 받아내면 배열의 길이가 바뀔 때 추가적인 수정 작업이 사라지게 된다.
	}

	private static void m2() {

		// 요구사항)학생 3명의 국어 점수를 입력받고, 총점과 평균을 구하시오.
		// 추가사항) 학생 수를 300명으로 늘리시오.
		
		// # 배열 선언하기 (배열의 생성)
		// 자료형[] 배열명 = new 자료형[길이];
		
		int[] kors = new int[3];
		// JVM에서 new 예약어를 사용하면 메모리 어딘가에 int[3]을 기준으로 공간을 확보한다.
		// 이때 중요한 것은 확보되는 공간이 연속적이며, 서로 인접하다는 점이다.
		// 이 변수가 저장되는 주소값은 kors에 저장된다.
		
		// 자료형[] 은 '[](배열 첨자)'까지 하나의 자료형으로 봐야 한다. 따라서 int[]는 integer배열이라고 볼 수 있다.
		// 배열 첨자가 1개일 경우 int[]이면 1차원 배열이며, int[][]로 2개일 경우 2차원 배열을 의미한다.
		
		
		// # 배열의 길이 확인하기
		System.out.println(kors.length);
		// new int[3]에서 3은 배열의 길이(배열의 방 개수)인데, 이를 이클립스에서 바로 확인하는 방법이 있다.
		// 나중에 배열의 길이를 잘 모르는 경우가 생길 수 있으므로 있는 속성이다.
		
		
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		int total = kors[0] + kors[1] + kors[2];
		double avg = total / 3.0;
		
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %f\n", avg);
	}

	private static void m1() {

		// 요구사항) 학생 3명의 국어 점수를 입력받고, 총점과 평균을 구하시오.
		
		int kor1;
		int kor2;
		int kor3;
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		
		int total = kor1 + kor2 + kor3;
		double avg = total / 3.0;
		
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %f\n", avg);
		
		// 학생이 3명인 경우 배열을 사용했을 때 메리트는 크게 보이지 않는다.
		// 하지만 학생이 3명이 아니라 300명이라면? 변수는 297개를 더 선언해야 하고, 점수도 297개 더 입력해야 하며, 계산식도 훨씬 길어질 것이다.
		// 이처럼 하나씩 만들어서 따로 관리하는 방식은 인원이 늘어나면 증가 비용이 일정하게 올라가게 되는데, 노가다성이 짙은 방식이다.
		// 이러한 작업에 배열을 사용하면 조직적이고 효과적으로 표현할 수 있다.
		
	}
	
}
