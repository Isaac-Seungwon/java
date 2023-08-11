package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
		/*
		● 요구사항
		오늘 태어난 아이의 백일과 첫돌을 출력하시오.

		● 출력
		백일: 2023-10-29
		첫돌: 2024-07-21
		*/
		
		Calendar oneHundredthDay = Calendar.getInstance(); // 백일
		Calendar firstBirthday = Calendar.getInstance(); // 첫돌
		
		oneHundredthDay.add(Calendar.DATE, 100);
		firstBirthday.add(Calendar.YEAR, 1);

		System.out.printf("백일: %tF\n", oneHundredthDay);
		System.out.printf("첫돌: %tF\n", firstBirthday);
	}
	
}
