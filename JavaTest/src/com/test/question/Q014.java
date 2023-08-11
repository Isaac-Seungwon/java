package com.test.question;

import java.util.Scanner;

public class Q014 {
	public static void main(String[] args) {
		/*
		● 요구사항
		지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		
		● 조건
		- int getTime(int station, int change, int time)
		- 각 역간 소요 시간: 2분 소요
		- 환승 소요 시간: N분 소요
		- 시간대에 따라 환승 소요 시간이 다르다.
		- 평상시: 3분
		- 출근시: 4분
		- 퇴근시: 5분
		
		● 입력 1
		역의 개수: 15 
		환승역의 횟수: 1 
		시간대(1.평상시, 2.출근시, 3.퇴근시): 1 
		
		● 출력 1
		총 소요 시간은 33분입니다.
		
		● 입력 2
		역의 개수: 22 
		환승역의 횟수: 2 
		시간대(1.평상시, 2.출근시, 3.퇴근시): 3 

		● 출력 2
		총 소요 시간은 54분입니다.
		*/
	
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int inputStations; // 지나가는 역의 개수
		int inputChange ; // 환승역의 횟수
		int inputTime; // 시간대
		
		// 지나가는 역의 개수 입력
		System.out.printf("역의 개수: ");
		inputStations = scan.nextInt();

		// 환승역의 횟수 입력
		System.out.printf("환승역의 횟수: ");
		inputChange = scan.nextInt();

		// 시간대 입력
		System.out.printf("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		inputTime = scan.nextInt();
		
		// 총 소요 시간 출력
		System.out.printf("총 소요 시간은 %d분 입니다.", getTime(inputStations, inputChange, inputTime));
		
		scan.close();
	}
	
	public static int getTime(int station, int change, int time) {
		int timeRequired = 0; // 소요 시간
		int transferTime; // 환승 소요 시간 판단
		
		// 각 역간 소요 시간 적용
		timeRequired = timeRequired + station * 2;
		
		// 환승 소요 시간 계산
		transferTime = time == 1 ? 3 : time == 2 ? 4 : 5;
		// change = change * (time + 2);

		// 환승 소요 시간 적용
		timeRequired = timeRequired + change * transferTime;
		
		return timeRequired;
	}
	
}
