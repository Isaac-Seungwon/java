package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {
	public static void main(String[] args) {
		/*
		● 요구사항
		학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		
		● 조건
		- 이름을 오름차순 정렬하시오.
		
		● 입력
		학생 수: 6 
		학생명: 홍길동 
		학생명: 아무개 
		학생명: 하하하 
		학생명: 호호호 
		학생명: 후후후 
		학생명: 헤헤헤 
		
		● 출력
		입력한 학생은 총 6명입니다.
		1. 아무개
		2. 하하하
		3. 헤헤헤
		4. 호호호
		5. 홍길동
		6. 후후후
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int studentNum; // 학생 수
		
		// 학생 수 입력
		System.out.printf("학생 수: ");
		studentNum = scan.nextInt();
		scan.skip("\r\n"); // 입력에 개행 제거
		
		// 학생 수 만큼 배열 생성
		String[] student = new String[studentNum];
		
		// 한 사람 입력 후 스페이스바 하고 다시 입력 다 입력 시 엔터
		// String[] str = scan.nextLine().split(" ");
		
		// 학생 이름 입력
		for (int i = 0; i < student.length; i++) {
			System.out.printf("학생명: ");
			student[i] = scan.nextLine();
		}
		
		// 학생 이름 정렬 (오름차순)
		Arrays.sort(student);
		
		// 학생 이름 출력
		System.out.printf("입력한 학생은 총 %d명입니다. \n", studentNum);
		for (int i = 0; i < student.length; i++) {
			System.out.printf("%d. %s\n", i + 1, student[i]);
		}
		
		scan.close();
	}
}
