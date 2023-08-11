package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		/*
		● 요구사항
		섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		
		● 조건
		- ℉ = ℃ × 1.8 + 32
		- 소수 입력 가능
		- 소수 이하 1자리까지 출력하시오.
		
		● 입력
		섭씨(℃): 29 
		
		● 출력
		섭씨 29.0℃는 화씨 84.2℉입니다.
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		double celsiusTemperatureScale; // 섭씨 온도(℃)
		double fahrenheitTemperatureScale; // 화씨 온도(℉)
		
		// 섭씨 입력
		System.out.printf("섭씨(℃): ");
		celsiusTemperatureScale = scan.nextInt();
		
		// 섭씨 온도를 화씨 온도로 변환
		fahrenheitTemperatureScale = celsiusTemperatureScale * 1.8 + 32;
		
		// 섭씨 온도와 화씨 온도 출력
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℃입니다.", celsiusTemperatureScale, fahrenheitTemperatureScale);
		
		scan.close();
	}
	
}
