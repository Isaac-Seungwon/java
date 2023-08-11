package com.test.question;

import java.util.Scanner;

public class Q032 {
	public static void main(String[] args) {
		/*
		● 요구사항
		주차 요금을 계산하시오.
		
		● 조건
		- 무료 주차: 30분
		- 초과 10분당: 2,000원
		
		● 입력
		[들어온 시간]
		시: 13 
		분: 30 
		
		[나간 시간]
		시: 14 
		분: 20 
		
		● 출력
		주차 요금은 4,000원입니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int inParkingHour;		// 들어온 시간(시)
		int inParkingMinute;	// 들어온 시간(분)
		int outParkingHour;		// 나간 시간(시)
		int outParkingMinute;	// 나간시간(분)
		int parkingDuration;	// 총 주차 시간(분)
		int parkingCharge;		// 주차 요금(원)
		
		// 들어온 시간 입력
		System.out.println("[들어온 시간]");
		System.out.printf("시: "); 
		inParkingHour = scan.nextInt();
		
		System.out.printf("분: ");  
		inParkingMinute = scan.nextInt();
		System.out.println();
		
		// 나간 시간 입력
		System.out.println("[나간 시간]");
		System.out.printf("시: "); 
		outParkingHour = scan.nextInt();
		
		System.out.printf("분: ");  
		outParkingMinute = scan.nextInt();
		
		// 총 주차 시간 계산(분)
		parkingDuration = (outParkingHour * 60 + outParkingMinute) - (inParkingHour * 60 + inParkingMinute);

		// 주차 요금 계산(원)
		parkingCharge = ((parkingDuration - 30) / 10) * 2000;
		
		// 주차 요금 출력
		if(parkingDuration <= 30) {
			System.out.println("무료 주차입니다");
		}else {
			System.out.printf("주차 요금은 %,d원입니다.", parkingCharge);
		}
		
		scan.close();
	}
}
