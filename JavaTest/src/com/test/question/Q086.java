package com.test.question;

import java.util.Scanner;

public class Q086 {
	public static void main(String[] args) {
		/*
		● 요구사항
		숫자를 입력받아 3자리마다 , 를 붙이시오.
		
		● 조건
		- %,d 사용 금지
		
		● 입력 1
		숫자: 1234 
		
		● 출력 1
		결과: 1,234
		
		● 입력 2
		숫자: 1234567 
		
		● 출력 2
		결과: 1,234,567
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String number; // 입력할 숫자
		
		// 숫자 입력
		System.out.print("숫자: ");
		number = scan.nextLine();
        StringBuilder result = new StringBuilder(number);
		
        // 필요한 ',' 개수 계산
        int numCommas = (number.length() - 1) / 3;
        
        // 숫자 3자리마다 ',' 삽입
        for (int i = 1; i <= numCommas; i++) {
            int position = number.length() - i * 3;
            result.insert(position, ",");
        }
        
        // 결과 출력
        System.out.println("결과: " + result);
        
        scan.close();
	}
}
