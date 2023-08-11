package com.test.question;

import java.util.Scanner;

public class Q043 {
	public static void main(String[] args) {
		/*
		● 요구사항
		컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		
		● 조건
		- 시도 횟수가 10회가 넘어가면 프로그램을 종료하시오.
		
		● 입/출력
		컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.
		
		숫자: 1 
		틀렸습니다.
		
		숫자: 3 
		틀렸습니다.
		
		숫자: 7 
		틀렸습니다.
		
		숫자: 2 
		틀렸습니다.
		
		숫자: 5 
		맞았습니다.
		
		컴퓨터가 생각한 숫자는 5입니다.
		정답을 맞추는데 시도한 횟수는 5회입니다. / 모든 기회를 실패했습니다.
		
		프로그램을 종료합니다.
		*/
		
		Scanner scan = new Scanner(System.in);

		int inputNum;	// 입력 숫자
		int randomNum;	// 랜덤 숫자
		
		
		// 컴퓨터가 1~10 사이의 숫자 생각
		randomNum = (int)(Math.random() * 10) + 1;
		System.out.printf("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.\n\n");
		
		
		// 정답, 오답 검증 및 출력
		for (int i = 1; i <= 10; i++) {
			System.out.printf("숫자: ");
			inputNum = scan.nextInt();
			
			if (inputNum == randomNum) {
				System.out.printf("맞았습니다.\n\n");
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", randomNum);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", i);
				break;
			}
			else {
				System.out.printf("틀렸습니다.\n\n");
				
				// 10개의 모든 기회를 실패
				if (i == 10) {
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", randomNum);
					System.out.println("모든 기회를 실패했습니다.\n");
				}
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}
}
