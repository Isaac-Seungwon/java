package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
		● 입력
		아빠 생일(년): 1970 
		아빠 생일(월): 5 
		아빠 생일(일): 10 
		딸 생일(년): 1998 
		딸 생일(월): 7 
		딸 생일(일): 22 
		
		● 출력
		아빠는 딸보다 총 10,300일을 더 살았습니다.
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		Calendar fatherBirthday = Calendar.getInstance(); // 아빠 생일
		Calendar daughterBirthday = Calendar.getInstance(); // 딸 생일
		int fatherYear;		// 아빠 생일(년)
		int fatherMonth;	// 아빠 생일(월)
		int fatherDay;		// 아빠 생일(일)
		int daughterYear;	// 딸 생일(년)
		int daughterMonth;	// 딸 생일(월)
		int daughterDay;	// 딸 생일(일)
		
		
		// 아빠 생일 입력
		System.out.printf("아빠 생일(년): ");
		fatherYear = scan.nextInt();
		System.out.printf("아빠 생일(월): ");
		fatherMonth = scan.nextInt();
		System.out.printf("아빠 생일(년): ");
		fatherDay = scan.nextInt();
		
		// 딸 생일 입력
		System.out.printf("딸 생일(년): ");
		daughterYear = scan.nextInt();
		System.out.printf("딸 생일(월): ");
		daughterMonth = scan.nextInt();
		System.out.printf("딸 생일(년): ");
		daughterDay = scan.nextInt();
		
		
		// 생일 초기화
		fatherBirthday.set(fatherYear, fatherMonth - 1, fatherDay);
		daughterBirthday.set(daughterYear, daughterMonth - 1, daughterDay);
		
		
		// epoch time 계산
		long fatherTick = fatherBirthday.getTimeInMillis();
		System.out.println(fatherTick); // 11152697415ms
		
		long daughterTick = daughterBirthday.getTimeInMillis();
		System.out.println(daughterTick); // 901072697424ms

		// 아빠와 딸의 나이 차이 계산
		long gap = daughterTick - fatherTick;
		
		
		// 아빠와 딸의 나이 차이 출력
		System.out.printf("아빠는 딸보다 총 %d일을 더 살았습니다.\n", gap / 1000 / 60 / 60 / 24); 
	
		scan.close();
	}
}
