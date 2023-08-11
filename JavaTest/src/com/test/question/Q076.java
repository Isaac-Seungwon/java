package com.test.question;

import java.util.Scanner;

public class Q076 {
	public static void main(String[] args) {
		/*
		● 요구사항
		성적을 입력받아 아래와 같이 출력하시오.
		
		● 조건
		- String[][] score = new String[10][3];	
		
		● 입력
		국어 점수: 80 
		영어 점수: 50 
		수학 점수: 70 
		
		● 출력
				 	 	 
		 	 	 
		■		
		■		■
		■		■
		■	■	■
		■	■	■
		■	■	■
		■	■	■
		■	■	■
		국어	영어	수학
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String[][] score = new String[10][3];	
		int studentScore[][] = new int[1][3]; // 국어 점수

		// 점수 입력
		System.out.print("국어 점수: ");
		studentScore[0][0] = scan.nextInt();
		System.out.print("수학 점수: ");
		studentScore[0][1] = scan.nextInt();
		System.out.print("영어 점수: ");
		studentScore[0][2] = scan.nextInt();

		for (int i=0; i<10; i++) {
			for (int j=0; j<3; j++) {
				if (studentScore[0][j] > 90 - i * 10) {
					score[i][j] = "■";
				}
				else {
					score[i][j] = " ";
				}
			}
		}

		// 출력
		for (int i=0; i<10; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("%s\t", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("국어\t영어\t수학");
		
		scan.close();
	}
}
