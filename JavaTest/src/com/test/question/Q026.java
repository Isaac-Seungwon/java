package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
		/*
		● 요구사항
		학생의 국어 점수를 입력받아 성적을 출력하시오.
		
		● 조건
		- 90 ~ 100: A
		- 80 ~  89: B
		- 70 ~  79: C
		- 60 ~  69: D
		- 0 ~   59: F
		- 유효성 검사를 하시오.(점수: 0 ~ 100점 이내)
		
		● 입력 1
		점수: 85 
		
		● 출력 1
		입력한 85점은 성적 B입니다.
		
		● 입력 2
		점수: 55 
		
		● 출력 2
		입력한 55점은 성적 F입니다.
		
		● 입력 3
		점수: 123 
		
		● 출력 3
		점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int kor = 0; // 국어 점수
		String score = ""; // 성적
		
		while (true) {
			//국어 점수 입력
			System.out.printf("점수: ");
			kor = scan.nextInt();
			
			// 성적 계산 및 유효성 검사 (점수: 0 ~ 100점 이내)
			if (kor >= 0 && kor <= 100) {
				if (kor >= 90 && kor <= 100) {
					score = "A";
				} else if (kor >= 80 && kor <= 89) {
					score = "B";
				} else if (kor >= 70 && kor <= 79) {
					score = "C";
				} else if (kor >= 60 && kor <= 69) {
					score = "D";
				} else if (kor >= 0 && kor <= 59) {
					score = "F";
				}
				System.out.printf("입력한 %d점은 성적 %s입니다.", kor, score);
				break;
			} else {
				System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.\n");
			}
		}
		
		scan.close();
	}
}
