package com.test.question;

import java.util.Date;
import java.util.Scanner;

public class Q042 {
	public static void main(String[] args) {
		/*
		● 요구사항
		서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		
		● 조건
		- Calendar 클래스 사용 금지
		
		● 출력
		2023년 7월 24일은 738,725일째 되는 날이고 월요일입니다.
		*/

		Scanner scan = new Scanner(System.in);
		
		int sum = 0;	// 누적 합계
		int inputYear;	// 입력 날짜(년)
		int inputMonth;	// 입력 날짜(월)
		int inputDay;	// 입력 날짜(일)
		String day = "";	// 요일
		
		
		// 오늘 날짜 입력 (년, 월, 일)
		System.out.printf("오늘 날짜(년): ");
		inputYear = scan.nextInt();
		
		System.out.printf("오늘 날짜(월): ");
		inputMonth = scan.nextInt();
		
		System.out.printf("오늘 날짜(년): ");
		inputDay = scan.nextInt();
		
		
		// 입력한 월의 전 월까지 누적
		for (int month = 1; month < inputMonth; month++) {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				sum = sum + 31;
				break;
			case 2:
				sum += isLeafYear(inputYear) ? 29 : 28;
				break;
			case 4: case 6: case 9: case 11:
				sum = sum + 30;
				break;
			}
		}
		
		/*
		if (inputMonth == 1) {
			// 1월
			sum = sum + 31; // 1월
		}
		if (inputMonth == 2) {
			// 2월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
		}
		else if (inputMonth == 3) {
			// 3월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
		}
		else if (inputMonth == 4) {
			// 4월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
		}
		else if (inputMonth == 5) {
			// 5월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
		}
		else if (inputMonth == 6) {
			// 6월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
		}
		else if (inputMonth == 7) {
			// 7월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
			sum = sum + 31; // 7월
		}
		else if (inputMonth == 8) {
			// 8월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
			sum = sum + 31; // 7월
			sum = sum + 31; // 8월
		}
		else if (inputMonth == 9) {
			// 9월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
			sum = sum + 31; // 7월
			sum = sum + 31; // 8월
			sum = sum + 30; // 9월
		}
		else if (inputMonth == 10) {
			// 10월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
			sum = sum + 31; // 7월
			sum = sum + 31; // 8월
			sum = sum + 30; // 9월
			sum = sum + 31; // 10월
		}
		else if (inputMonth == 11) {
			// 11월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
			sum = sum + 31; // 7월
			sum = sum + 31; // 8월
			sum = sum + 30; // 9월
			sum = sum + 31; // 10월
			sum = sum + 30; // 11월
		}
		else if (inputMonth == 12) {
			// 12월
			sum = sum + 31; // 1월
			sum = isLeafYear(inputYear) ? 29 : 28; // 2월
			sum = sum + 31; // 3월
			sum = sum + 30; // 4월
			sum = sum + 31; // 5월
			sum = sum + 30; // 6월
			sum = sum + 31; // 7월
			sum = sum + 31; // 8월
			sum = sum + 30; // 9월
			sum = sum + 31; // 10월
			sum = sum + 30; // 11월
			sum = sum + 31; // 12월
		}
		*/
		// System.out.printf("월 합계: %d\n\n", sum);

		
		// 입력한 일 누적
		sum = sum + inputDay;
		// System.out.printf("월 + 일 합계: %d\n\n", sum);
		
		
		// 1년 1월 1일부터~작년 12월 31일까지 누적
		for (int year = 1; year < inputYear; year++) {
			if (isLeafYear(year)) {
				// 윤년
				sum = sum + 366;
			}
			else {
				// 평년
				sum = sum + 365;
			}
		}
		// System.out.printf("월 + 일 + 년: %d\n\n", sum);
		
		
		// 요일 계산
		if (sum % 7 == 0) {
			day = "일요일";
		}
		else if (sum % 7 == 1) {
			day = "월요일";
		}
		else if (sum % 7 == 2) {
			day = "화요일";
		}
		else if (sum % 7 == 3) {
			day = "수요일";
		}
		else if (sum % 7 == 4) {
			day = "목요일";
		}
		else if (sum % 7 == 5) {
			day = "금요일";
		}
		else {
			day = "토요일";
		}
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.", inputYear, inputMonth, inputDay, sum, day);
		
		scan.close();
	}
	
	private static boolean isLeafYear(int year) {
	/*
	● 윤년, 평년 조건
	a. 년도를 4로 나눈다.
		떨어지면 b 검사
		떨어지지 않으면 "평년"
	b. 년도를 100으로 나눈다.
		떨어지면 c 검사
		떨어지지 않으면 "윤년"
	c. 년도를 400으로 나눈다.
		떨어지면 "윤년"
		떨어지지 않으면 "평년"	
	*/
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					// 윤년
					return true;
				}
				else {
					// 평년
					return false;
				}
			}
			else {
				// 윤년
				return true;
			}
		}
		else {
			// 평년
			return false;
		}
	}
}
