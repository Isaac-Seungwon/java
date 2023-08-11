package com.test.question;

import java.util.Scanner;

public class Q024 {
	public static void main(String[] args) {
		/*
		● 요구사항
		여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다.
		고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		
		● 조건
		- 전화를 걸면 짜장면은 10분 뒤에 도착합니다.
		- 전화를 걸면 치킨은 18분 뒤 도착합니다.
		- 전화를 걸면 피자는 25분 뒤 도착합니다.
		- 음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		
		● 입력
		음식을 받기 원하는 시각
		시: 12 
		분: 6 
		
		● 출력
		짜장면: 11시 56분
		치킨: 11시 48분
		피자: 11시 41분
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int orderHour; // 음식을 받기 원하는 시각(시)
		int orderMinute; // 음식을 받기 원하는 시각(분)
		boolean isorderTime; // 음식을 받기 원하는 시각 판단
		
		int jjajangmyeonRequiredTime = 10; // 짜장면 소요 시간
		int chickenRequiredTime = 18; // 치킨 소요 시간
		int pizzaRequiredTime = 25; // 피자 소요 시간
		
		// 음식을 받기 원하는 시각 입력
		System.out.println("음식을 받기 원하는 시각");
		System.out.printf("시: ");
		orderHour = scan.nextInt();
		System.out.printf("분: ");
		orderMinute = scan.nextInt();

		// 음식을 받기 원하는 시각이 오후 11시 이전인지 판단
		isorderTime = orderHour < 23 ? true : false;
		
		// 음식 주문 시간 계산 및 출력
        if (isorderTime) {
            // 음식 주문 시간 출력
            System.out.printf("짜장면: %d시 %d분\n"
            		, orderMinute - jjajangmyeonRequiredTime < 0 ? food(orderHour) : orderHour
            		, orderMinute - jjajangmyeonRequiredTime < 0 ? food(orderMinute, jjajangmyeonRequiredTime) : orderMinute);
            
            System.out.printf("치킨: %d시 %d분\n"
            		, orderMinute - chickenRequiredTime < 0 ? food(orderHour) : orderHour
            		, orderMinute - chickenRequiredTime < 0 ? food(orderMinute, chickenRequiredTime) : orderMinute);
            
            System.out.printf("피자: %d시 %d분\n"
            		, orderMinute - pizzaRequiredTime < 0 ? food(orderHour) : orderHour
            		, orderMinute - pizzaRequiredTime < 0 ? food(orderMinute, pizzaRequiredTime) : orderMinute);
        } else {
            // System.out.println("오후 11시 이후에는 음식을 주문할 수 없습니다.");
        }
	}

	private static int food(int hour) {
		return hour - 1;
	}

	private static int food(int minute, int deliveredTime) {
		return minute + 60 - deliveredTime;
	}
}


/*

package com.test.question;

import java.util.Scanner;

public class Q024 {
	public static void main(String[] args) {
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int orderHour;		// 음식을 받기 원하는 시각(시)
		int orderMinute;	// 음식을 받기 원하는 시각(분)
		boolean isorderTime;	// 음식을 받기 원하는 시각 판단
		
		int jjajangmyeonHour;	// 짜장면 주문 시각(시)
		int jjajangmyeonMinute;	// 짜장면 주문 시각(분)
	
		int chickenHour;	// 치킨 주문 시각(시)
		int chickenMinute;	// 치킨 주문 시각(분)

		int pizzaHour;		// 피자 주문 시각(시)
		int pizzaMinute;	// 피자 주문 시각(분)
		
		
		// 음식을 받기 원하는 시각 입력
		System.out.println("음식을 받기 원하는 시각");
		System.out.printf("시: ");
		orderHour = scan.nextInt();
		System.out.printf("분: ");
		orderMinute = scan.nextInt();

		
		// 음식을 받기 원하는 시각이 오후 11시 이전인지 판단
		isorderTime = orderHour < 23 ? true : false;
		
		
		// 음식 주문 시간 계산 및 출력
        if (isorderTime) {
            // 짜장면 주문 시간 계산
            jjajangmyeonHour = orderMinute - 10 < 0 ? food(orderHour) : orderHour;
            jjajangmyeonMinute = orderMinute - 10 < 0 ? food(orderMinute, 10) : orderMinute;

            // 치킨 주문 시간 계산
            chickenHour = orderMinute - 18 < 0 ? food(orderHour) : orderHour;
            chickenMinute = orderMinute - 18 < 0 ? food(orderMinute, 18) : orderMinute;

            // 피자 주문 시간 계산
            pizzaHour = orderMinute - 25 < 0 ? food(orderHour) : orderHour;
            pizzaMinute = orderMinute - 25 < 0 ? food(orderMinute, 25) : orderMinute;

            // 음식 주문 시간 출력
            System.out.printf("짜장면: %d시 %d분\n", jjajangmyeonHour, jjajangmyeonMinute);
            System.out.printf("치킨: %d시 %d분\n", chickenHour, chickenMinute);
            System.out.printf("피자: %d시 %d분\n", pizzaHour, pizzaMinute);
        } else {
            // System.out.println("오후 11시 이후에는 음식을 주문할 수 없습니다.");
        }
	}

	// orderMinute - '도착에 걸리는 시간'의 값이 0 미만일 경우 실행
	public static int food(int hour) {
		return hour - 1;
	}

	// orderMinute - '도착에 걸리는 시간'의 값이 0 미만일 경우 실행
	public static int food(int minute, int deliveredTime) {
		return minute + 60 - deliveredTime;
	}
}

*/