package com.test.question;

import java.util.Scanner;

public class Q005 {
	
	public static void main(String[] args) {
		/*
		● 요구사항
		자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다.
		사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		
		● 조건
		- 기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
		- 모든 출력 숫자는 천단위 표기하시오.
		
		● 입력
		사용자가 페달을 밟은 횟수: 1000 
		
		● 출력
		사용자가 총 1,000회 페달을 밟아 자전거가 총 2,074.708m를 달렸습니다.
		*/

		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int pressedPedal; // 페달을 밟은 횟수
		double wheelDiameter; // 자전거 지름(cm)
		double wheelCircumference; // 자전거 휠 크기(cm)
		double distanceTraveledBicycle; // 자전거로 이동한 거리(m)
		
		// 페달을 밟은 횟수 입력
		System.out.printf("사용자가 페달을 밟은 횟수: ");
		pressedPedal = scan.nextInt();

		// 자전거 지름 계산
		wheelDiameter = 26 * 0.0254;
		
		// 자전거 휠 크기 계산
		wheelCircumference = wheelDiameter * Math.PI;

		// 자전거로 이동한 거리 계산
		distanceTraveledBicycle = wheelCircumference * pressedPedal;
		
		// 자전거로 이동한 거리 출력
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", pressedPedal, distanceTraveledBicycle);
		
		scan.close();
	}
}
