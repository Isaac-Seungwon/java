package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
	public static void main(String[] args) {
		/*
		● 요구사항
		날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		
		● 조건
		- 입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		- 입력받은 날짜가 토/일요일이면 아무것도 안한다.
		
		● 입력 1
		년: 2022
		월: 3
		일: 14
		
		● 출력 1
		입력하신 날짜는 '평일'입니다.
		해당 주의 토요일로 이동합니다.
		이동한 날짜는 '2022-03-19' 입니다.
		
		● 입력 2
		년: 2022
		월: 3
		일: 6
		
		● 출력 2
		입력하신 날짜는 '휴일(토/일)'입니다.
		결과가 없습니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		Calendar inputDate = Calendar.getInstance();
		Calendar weekendDate = Calendar.getInstance();
		
		int inputYear;	// 입력 날짜(년)
		int inputMonth;	// 입력 날짜(월)
		int inputDay;	// 입력 날짜(일)
		
		// 날짜 입력(년)
		System.out.print("년: ");
		inputYear = scan.nextInt();
		
		// 날짜 입력(월)
		System.out.print("월: ");
		inputMonth = scan.nextInt();
				
		// 날짜 입력(일)
		System.out.print("일: ");
		inputDay = scan.nextInt();
		
		// 입력한 날짜로 초기화
		inputDate.set(inputYear, inputMonth - 1, inputDay);
		weekendDate.set(inputYear, inputMonth - 1, inputDay);
		
		// 요일, 1(일) ~ 7(토) (메소드 반환값이 Integer라서 숫자로 나온다.)
		// System.out.println(inputDate.get(Calendar.DAY_OF_WEEK));
		
		// 평일, 주말 검증 및 출력
		if (inputDate.get(Calendar.DAY_OF_WEEK) >= 2 && inputDate.get(Calendar.DAY_OF_WEEK) <= 6) {
			// 입력한 날짜가 평일
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			
			// 입력한 주의 토요일로 이동
			weekendDate.add(Calendar.DATE, 7 - inputDate.get(Calendar.DAY_OF_WEEK));
			
			// 입력한 주의 토요일 출력
			System.out.printf("이동한 날짜는 '%tF' 입니다.\n", weekendDate);
		} else if(inputDate.get(Calendar.DAY_OF_WEEK) == 1 || inputDate.get(Calendar.DAY_OF_WEEK) == 7) {
			// 입력한 날짜가 주말
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		}
		
		scan.close();
	}
}
