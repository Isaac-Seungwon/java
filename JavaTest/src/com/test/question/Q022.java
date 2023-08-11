package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
	public static void main(String[] args) {
		/*
		● 요구사항
		남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.

		● 입력
		남자 이름: 하하하 
		여자 이름: 호호호 
		만난날(년): 2023 
		만난날(월): 7 
		만난날(일): 21 
		
		● 출력
		'하하하'과(와) '호호호'의 기념일
		100일: 2023-10-29
		200일: 2024-02-06
		300일: 2024-05-16
		500일: 2024-12-02
		1000일: 2026-04-16
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		Calendar coupleDate = Calendar.getInstance(); // 만난 날짜
		String boyName;		// 남자 이름
		String girlName;	// 여자 이름
		int coupleYear;		// 만난날(년)
		int coupleMonth;	// 만난날(월)
		int coupleDay;		// 만난날(일)
		
		
		// 남자, 여자, 만난날 입력
		System.out.printf("남자 이름: ");
		boyName = scan.nextLine();
		
		System.out.printf("여자 이름: ");
		girlName = scan.nextLine();
		
		System.out.printf("만난날(년): ");
		coupleYear = scan.nextInt();
		
		System.out.printf("만난날(월): ");
		coupleMonth = scan.nextInt();
		
		System.out.printf("만난날(일): ");
		coupleDay = scan.nextInt();

		
		// 기념일 출력
		System.out.printf("'%s'과(와) '%s'의 기념일\n", boyName, girlName);

		dateSet(coupleDate, coupleYear, coupleMonth, coupleDay, 100);
		dateSet(coupleDate, coupleYear, coupleMonth, coupleDay, 200);
		dateSet(coupleDate, coupleYear, coupleMonth, coupleDay, 300);
		dateSet(coupleDate, coupleYear, coupleMonth, coupleDay, 500);
		dateSet(coupleDate, coupleYear, coupleMonth, coupleDay, 1000);
		
		scan.close();
	}
	
	// 만난 날짜 초기화 및 기념일 출력 메소드
	private static void dateSet(Calendar date, int year, int month, int day, int addDay) {
		// 만난 날짜 초기화
		date.set(year, month - 1, day);
		
		// 기념일 설정
		date.add(Calendar.DATE, addDay);
		
		// 기념일 출력
		System.out.printf("%d일: %tF\n", addDay, date);
	}
}
