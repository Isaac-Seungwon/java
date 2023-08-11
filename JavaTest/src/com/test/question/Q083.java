package com.test.question;

import java.util.Scanner;

public class Q083 {
	public static void main(String[] args) {
		/*
		● 요구사항
		파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
		
		● 조건
		- 확장자는 다음으로 제한한다.
			- mp3
			- jpg
			- java
			- hwp
			- doc
		
		● 입력
		파일명: 인기가요.mp3 
		파일명: cat.jpg 
		파일명: Ex01.java 
		파일명: icon.jpg 
		파일명: 수업_정리.doc 
		파일명: Scanner.java 
		파일명: food.jpg 
		파일명: 공지사항.hwp 
		파일명: 이력서.hwp 
		파일명: 출금내역.doc 
		
		● 출력
		mp3 : 1개
		jpg : 3개
		java : 2개
		hwp : 2개
		doc : 2개
		*/
		
		Scanner scan = new Scanner(System.in);

		String[] file = new String[10]; // 파일명
		int[] sum = new int[5]; // 확장자 누적 합계
		String[] extension = { "mp3", "jpg", "java", "hwp", "doc" }; // 확장자 리스트

		// 파일명 입력
		for (int i = 0; i < file.length; i++) {
			System.out.print("파일명: ");
			file[i] = scan.nextLine();

			// 파일 확장자 추출
			int index = file[i].lastIndexOf(".");
			String fileExtension = file[i].substring(index);

			// 확장자 누적 합계
			for (int j = 0; j < extension.length; j++) {
				if (fileExtension.replace(".", "").equals(extension[j])) {
					sum[j]++;
				}
			}
		}

		// 확장자 누적 합계 출력
		for (int i = 0; i < extension.length; i++) {
			System.out.printf("%s : %d개\n", extension[i], sum[i]);
		}
		
		scan.close();
	}
}
