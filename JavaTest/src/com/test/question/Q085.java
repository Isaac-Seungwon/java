package com.test.question;

import java.util.Scanner;

public class Q085 {
	public static void main(String[] args) {
		/*
		● 요구사항
		주민 등록 번호 유효성 검사를 하시오.
		
		● 조건
		- '-'의 입력 유무 상관없이 검사하시오.
		
		● 입력 1
		주민등록번호: 951220-1021547
		
		● 출력 1
		올바른 주민등록번호입니다.
		
		● 입력 2
		주민등록번호: 951220-1234567
		
		● 출력 2
		올바르지 않은 주민등록번호입니다.
		*/
		// *** 면접 때 잘 나오는 문제
		
		Scanner scan = new Scanner(System.in);
		
		String jumin; // 주민 등록 번호
		int[] digit = new int[14]; // 검증 번호
		int pass;
		
		// 주민 등록 번호 입력
		System.out.print("주민등록번호: ");
		jumin = scan.nextLine();
		jumin = jumin.replace("-", ""); // 주민 등록 번호 '-' 제거
		
		// digit[]에 순차적으로 주민 등록 번호 저장
		for (int i=0; i<13; i++) {
			digit[i] = Integer.parseInt(jumin.substring(i, i+1));
			// System.out.println(digit[i]);
		}
		
		// 주민 등록 번호 유효성 검사
		pass = (11 - ((2 * digit[0]
					+ 3 * digit[1]
					+ 4 * digit[2]
					+ 5 * digit[3]
					+ 6 * digit[4]
					+ 7 * digit[5]
					+ 8 * digit[6]
					+ 9 * digit[7]
					+ 2 * digit[8]
					+ 3 * digit[9]
					+ 4 * digit[10]
					+ 5 * digit[11]) % 11)) % 10;
		
		if (pass == 10) {
			pass = 0;
		} else if (pass == 11) {
			pass = 1;
		}
		
		// 주민 등록 번호 결과 검증 및 출력
		if (pass == Integer.parseInt(jumin.substring(12, 13))) {
			System.out.println("올바른 주민등록번호입니다.");			
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
		scan.close();
		
		// System.out.println(pass);
		// System.out.println(Integer.parseInt(jumin.substring(12, 13)));
		
		/*
		int[] pass = new int[6];
		int digit;
		
		// 출생년도 검사 (1 ~ 100)
		digit = Integer.parseInt(jumin.substring(0, 2));
		if (digit > 0 && digit < 100) {
			pass[0] = 1;
		}
		
		// 출생 월 검사 (1 ~ 12)
		digit = Integer.parseInt(jumin.substring(2, 4));
		if (digit > 0 && digit < 13) {
			pass[1] = 1;
		}
		
		// 출생 일 검사 (1 ~ 31)
		digit = Integer.parseInt(jumin.substring(2, 4));
		if (digit > 0 && digit < 32) {
			pass[2] = 1;
		}
		
		// 성별 검사 (1 ~ 4)
		digit = Integer.parseInt(jumin.substring(7, 8));
		if (digit > -1 && digit < 5) {
			pass[3] = 1;
		}
		*/
	}
}
