package com.test.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex26_DateTime {

	public static void main(String[] args) {
		
		// Ex26_DateTime.java
		
		/*
			자바 자료형
			1. 값형
				- 8가지
			2. 참조형
				- 클래스
					- String
					- 날짜시간
					
			자바 날짜 / 시간 자료형
			1. Date 클래스
			2. Calendar 클래스
			3. 추가 클래스 > 'JDK 1.8'에 출시되었다.(2014년도)
			
			- 시각: 2023.7.23. PM 4:9:15 (시간의 흐름을 나타내는 점)
			- 시간: 8시간 (서로 다른 시간까지의 거리, 양)
			
			시각 != 시간: 시각과 시간은 다르다
			
			* 시각, 시간 > 연산
			
			시각 + 시각 = X
			시각 - 시각 = O(시간)
			
			시간 + 시간 = O(시간)
			시간 - 시간 = O(시간)
			
			시각 + 시간 = O(시각)
			시각 - 시간 = O(시각)
		*/

		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
		m7();
		m8();
	}// main

	private static void m8() {

		// 현재 시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		// 전용 메소드 (현재 시각의 tick을 구하는 전용 메소드)
		System.out.println(System.currentTimeMillis());
		
		
		Calendar currentDate = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일 E요일 HH시 mm분 ss초");
		System.out.println(dateFormat.format(currentDate.getTime()));
		
	}

	private static void m7() {
		
		// 연산
		// 시간 + 시간 = 시간
		// 시간 - 시간 = 시간
		
		// *** 시간 단위를 구할 때에는 Calendar를 쓰지 않고 정수 타입을 쓴다.
		
		// 점심시간이 1시간이다. 이를 프로그램 상에서 표현을 하려고 한다.
		Calendar a = Calendar.getInstance();
		a.set(Calendar.HOUR, 2); // 2'시간'이 아닌 2'시각'을 의미한다. 양으로서의 시간이므로 다르다.
		
		System.out.printf("%tF %tT\n", a, a);
		// 위에 처럼 사용하면 절대 안 된다.
		
		
		// 점심시간이 1시간이다. + 1시간
		int hour = 1;
		int add = 1;
		
		System.out.println(hour + add);
		
		// 2시간 30분
		hour = 2;
		int min = 30;
		
		// 2시간 30분 + 10분 = 2시간 40분
		System.out.printf("%d시간 %d분\n", hour, min);
		
		// 2시간 40분 + 30분 = 2시간 70분 = 3시간 10분
		hour = 2;
		min = 40;
		
		min += 30;
		
		System.out.printf("%d시간 %d분\n", hour, min);

		hour = hour + (min / 60);
		min = min % 60;
		
		System.out.printf("%d시간 %d분\n", hour, min);
	}

	private static void m6() {

		// 연산
		// 시각 - 시각 = 시간
		// 기준점을 만들어 주어야 한다. 이 기준점은 보통 과거로 삼으며, 자바는 1970.01.01. 00:00:00을 기준으로 한다.
		
		// 현재
		Calendar now = Calendar.getInstance();
		
		// 종강일
		Calendar end = Calendar.getInstance();
		end.set(2023, 11, 27);
		
		// - epoch time
		// - tick값
		long nowTick = now.getTimeInMillis();
		System.out.println(nowTick); // 1689898948436ms 기준 시점부터 지금까지의 시간
		
		long endTick = end.getTimeInMillis();
		System.out.println(endTick); // 1703636710776ms

		long gap = endTick - nowTick;
		
		System.out.printf("수업 남은 시간: %,d일\n", gap / 1000 / 60 / 60 / 24); // ms > second > minute > hour > day
		
		
		// 크리스마스
		Calendar christmas = Calendar.getInstance();
		christmas.set(2023, 11, 25);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("올해 크리스마스는 %d일 남았습니다.\n", (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
		
		
		// 생일: 프로젝트 마감까지 -시간 남았습니다.
		Calendar birthday = Calendar.getInstance();
		birthday.set(2000, 2, 3);
		
		long birthdayTick = birthday.getTimeInMillis();
		
		System.out.printf("살아온 시간: %d년\n", (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 365);
		System.out.printf("살아온 시간: %d월\n", (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 30); // 근사치
		System.out.printf("살아온 시간: %d일\n", (nowTick - birthdayTick) / 1000 / 60 / 60 / 24);
		System.out.printf("살아온 시간: %d시\n", (nowTick - birthdayTick) / 1000 / 60 / 60);
		
	}

	private static void m5() {
		
		// 현재 시각
		Calendar now = Calendar.getInstance();
		
		
		// 읽기 + 출력
		System.out.println(now.get(Calendar.YEAR));
		System.out.printf("%tF %tA %tT\n", now, now, now);
		
		
		// 특정 시각 (개강일)
		Calendar start = Calendar.getInstance();
		start.set(Calendar.HOUR_OF_DAY, 9);
		start.set(2023, 6, 14);
		System.out.printf("%tF %tA %tT\n", start, start, start);
		
		
		// 시각 + 시각 (특정 시각으로 부터 몇 달 후, 몇 시간 전)
		start.add(Calendar.DATE, 3);
		System.out.printf("%tF %tA %tT\n", start, start, start);
		
	}

	private static void m4() {
		
		// 연산
		// - 시각 + 시간
		// - 시각 - 시간
		
		// 오늘 만난 커플의 100일 기념일
		
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일차: %tF\n", now);
		
		// 수정
		now.add(Calendar.DATE, 100);
		System.out.printf("100일차: %tF\n", now);
		
		
		// 10일 전은 언제인가?
		now = Calendar.getInstance(); // 현재 시간으로 다시 초기화
		
		now.add(Calendar.DATE, -10);
		
		System.out.printf("10일 전: %tF\n", now);
		
		
		// 지금으로부터 3시간 25분 뒤에 약 복용
		now = Calendar.getInstance();
		
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 30);

		System.out.printf("3시간 30분 뒤: %tF\n", now);
	}

	private static void m3() {
		
		// 특정 시각을 생성하기 > 원하는 시각 생성
		// 올해 크리스마스를 만들어 보자.
		
		Calendar christmas = Calendar.getInstance(); // 현재 시각

		//System.out.printf("%tF %tT\n", christmas, christmas);
		
		// 수정 set
		// - void set(오버로딩이 여러 개 되어 있다)
		
		// 2023-07-20
		christmas.set(Calendar.MONTH, 11);
		christmas.set(Calendar.DATE, 25);
		christmas.set(Calendar.HOUR_OF_DAY, 19);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);
		// int field: the given calendar field.
		// int value: the value to be set for the given calendar field.
		// 수정하려는 게 년도인지, 월인지, 일인지 알려주기 위한 게 field이고, value가 수정하는 값이다.
		// 월은 0 ~ 11까지 표현하며, 12를 입력할 경우 내년 1월이 입력된다. 12월을 입력하려면 11을 입력해야 한다.
		// get은 데이터를 가져온다면, set은 항목을 수정하는 작업을 한다.

		System.out.printf("christmas: %tF %tT\n", christmas, christmas);
		
		
		// 내 생일
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(1999, 4, 27);
		System.out.printf("birthday: %tF\n", birthday);
		
		birthday.set(1999, 4, 27, 10, 30);
		System.out.printf("birthday: %tF\n", birthday);
		
		
		// 돌잔치
		birthday.add(Calendar.YEAR, 1);

		System.out.printf("birthday: %tF\n", birthday);
	}

	private static void m2() {

		// 두 번째 예제
		
		// Calendar 클래스
		Calendar c1 = Calendar.getInstance();
		
		/*
		java.util.GregorianCalendar[time=1689838475429,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util
		.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null]
		,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=4,DAY_OF_MONTH=20
		,DAY_OF_YEAR=201,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=34,SECOND=35
		,MILLISECOND=429,ZONE_OFFSET=32400000,DST_OFFSET=0]
		*/
		
		System.out.println(c1);
		// 집합 데이터로서 내가 원하는 항목만 추출할 수 있다.
		// - int get(int)
		
		System.out.println(c1.get(1)); // 2023 연도 값 꺼내기
		System.out.println(c1.get(2));
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));
		
		int year = 1;
		
		System.out.println(c1.get(year));

		
		// 어떤 항목을 추출할지에 따라 필요한 숫자가 있었다.
		// 이것을 Calendar에서 상수로 제공하며, Calendar 상수라고 부른다. 
		System.out.println(Calendar.YEAR);
		
		System.out.println(c1.get(Calendar.YEAR)); // 실제 사용 예
		
		System.out.println();
		
		System.out.println(c1.get(Calendar.YEAR));			// 년
		System.out.println(c1.get(Calendar.MONTH));			// * 1월이 아니라 0부터 시작한다.
		System.out.println(c1.get(Calendar.DATE));			// 일
		System.out.println(c1.get(Calendar.HOUR));			// 4 > 시(12H)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));	// 16 > 시(24H)
		System.out.println(c1.get(Calendar.MINUTE));		// 분
		System.out.println(c1.get(Calendar.SECOND));		// 초
		System.out.println(c1.get(Calendar.MILLISECOND));	// ms, 1/1000초(자바 시간 최소 단위) 10억분의 1도 가능하지만 특수한 경우이다.
		System.out.println(c1.get(Calendar.AM_PM));			// 오전(0), 오후(1)
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));	// 올해까지 일
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));	// 이번달까지 일
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));	// 요일, 1(일) ~ 7(토) (메소드 반환값이 Integer라서 숫자로 나온다.)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR));	// 올해까지 주차
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH));	// 이번달까지 주차
		System.out.println();
		
		
		// 요구사항) "오늘은 2023년 7월 20일 입니다."
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", c1.get(Calendar.YEAR), c1.get(Calendar.MONTH) + 1, c1.get(Calendar.DATE));
		System.out.println();
		
		
		// 요구사항) "지금은 17시 05분 50초 입니다." - 24H
		//			 "지금은 오후 5시 05분 50초 입니다." - 12H
		System.out.printf("지금은 %d시 %02d분 %d초 입니다.\n"
				, c1.get(Calendar.HOUR_OF_DAY)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		
		System.out.printf("지금은 %s %d시 %02d분 %d초 입니다.\n"
				, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		
		System.out.println();
		
		// printf() 날짜시간과 관련한 형식 문자
		System.out.printf("%tF\n", c1); // 2023-07-20
		
		System.out.printf("%tT\n", c1); // 17:17:36

		System.out.printf("%tA\n", c1); // 목요일 > Locale > 지역 설정
	}

	private static void m1() {
		
		// 첫 번째 예제
		
		// Date 클래스
		
		// 날짜시간을 저장하는 변수
		Date date = new Date();
		// 컴퓨터의 시각을 가져온다. (실제 표준 시를 나타내는 게 아니다.)
		// 근사치로는 믿을 만 하다. 사용 X (대략적으로 신뢰해도 되지만, 정각에 맞춰야 하는 일이 있을 경우 신뢰해서는 안 된다.)
		
		System.out.println(date); // Thu Jul 20 16:29:20 KST 2023
	}
	
}
