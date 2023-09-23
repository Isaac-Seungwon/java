package com.test.java.calendar;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		
		//일정 불러오기
		//- item.txt > Data.list (데이터 관리)
		Data.load();
		
		
		//Main.java: 달력 출력
		//Item.java: 일정(상자)
		//Data.java: 일정 처리(읽기
		//JavaTest > data > item.txt
		
		//달력 + 일정 출력
		
		//달력
		//1. 년월 > 1일이 무슨 요일인지 알아야 한다.
		//2. 년월 > 마지막 날짜가 며칠로 끝나는지 알아야 한다.
		
		int year = 2023;
		int month = 8;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1); // 2023-08-01
		
		int lastDate = c.getActualMaximum(Calendar.DATE); //해당 월의 마지막 날짜
		int firstDay = c.get(Calendar.DAY_OF_WEEK); //해당 월 1일의 요일
		
		//System.out.println(lastDate);
		//System.out.println(firstDay);
		
		/*
		// 만년달력
		for (month = 1; month < 13; month++) {
			System.out.println("\t\t\t" + month + "월");
			System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
			
			for (int i=1; i<firstDay; i++) {
				System.out.print("\t");
			}
			
			for (int i=1; i<=lastDate; i++) {
				System.out.printf("%3d\t", i);
				
				if ((i + firstDay) % 7 == 1) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
		}
		*/
		
		System.out.println("\t\t\t" + month + "월");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		for (int i=1; i<firstDay; i++) {
			System.out.print("\t");
		}
		
		for (int i=1; i<=lastDate; i++) {
			System.out.printf("%3d\t", i); //날짜 출력
			
			if ((i + firstDay) % 7 == 1) {
				System.out.println();
				
				//일정 출력
				// 현재 출력되는 날짜의 한 주
				for (int j=i+1-7; j<i+8-7 && j<=lastDate; j++) {
					System.out.printf("%s\t", getItem(String.format("%d-%02d-%02d", year, month, j)));
				}
				System.out.println();
				System.out.println();
			}
		}
	}//main
	
	private static Object getItem(String date) {
		for (Item item : Data.list) {
			if (item.getDate().equals(date)) {
				return item.getTitle();
			}
		}
		
		return "";
	}
}
