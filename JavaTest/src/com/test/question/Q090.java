package com.test.question;

import java.util.Scanner;

public class Q090 {
	public static void main(String[] args) {
		/*
		● 요구사항
		입력받은 문장에서 숫자를 찾아 그 합을 구하시오.
		
		● 조건
		- 모든 숫자는 한자리 숫자로 처리한다.
		
		● 입력 1
		입력: 국어 점수는 95점입니다. 
		
		● 출력 1
		문장에 존재하는 모든 숫자의 합은 14입니다.
		
		● 입력 2
		입력: 홍길동의 나이는 20살입니다. 몸무게는 72kg이고, 전화번호는 010-2848-9372입니다. 
		
		● 출력 2
		문장에 존재하는 모든 숫자의 합은 55입니다.
		*/

		Scanner scan = new Scanner(System.in);

		String txt = ""; // 입력할 문장
		int sum = 0; // 합계

		System.out.print("입력: ");
		txt = scan.nextLine(); // 문장 입력

		// 문장내의 숫자 검증
		for (char c : txt.toCharArray()) {
			if (Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}

        /*
		// 다른 방법
		char c = '\0';

		for (int i = 0; i < txt.length(); i++) {
			// 문장 한 글자씩 받아오기
			c = txt.charAt(i);

			// 문장내의 숫자 검증
			if (c >= '0' && c <= '9') {
				sum += c - 48; // 아스키코드 48: 0
			}
		}
		*/
        
		// 문장에 들어간 숫자의 합 출력
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
		
		scan.close();
	}
}
