package com.test.question;

import java.util.Scanner;

public class Q089 {
	public static void main(String[] args) {
		/*
		● 요구사항
		입력받은 금액을 한글로 출력하시오.
		
		● 조건
		- 입력 범위(원): 0 ~ 99,999,999
		
		● 입력 1
		금액(원): 120 
		
		● 출력 1
		일금 일백이십원
		
		● 입력 2
		금액(원): 53216 
		
		● 출력 2
		일금 오만삼천이백일십육원
		
		● 입력 3
		금액(원): 12345678 
		
		● 출력 3
		일금 일천이백삼십사만오천육백칠십팔원
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String korean = "일이삼사오육칠팔구";
		String result = "";
		String money; // 입력할 금액
				
		// 금액(원) 입력
		System.out.print("금액(원): ");
		money = scan.nextLine();
		
		for (int i=0; i<money.length(); i++) {
			char c = money.charAt(i);
			
			result += getNum(c);
			result += getUnit(i, money.length(), getNum(c));
		}
		
		/*
		// 다른 방법
		// 숫자 10개 입력 및 변환
		for(int i = 0; i < money.length(); i++) {
			// 숫자 -> 한글 변환
			char c = money.charAt(i);
			
			for (int j = 0; j < 10; j++) {
				// 아스키코드 1(49)
				if (money.charAt(i) == 49 + j) {
					result += korean.charAt(j);
				}
			}
		}
		// 필요한 단위 개수 계산
        int numUnit = (result.length() - 1) / 3;
        StringBuilder value = new StringBuilder(result);
        
		// 한글 단위 삽입
        for (int i = 1; i <= numUnit; i++) {
            int position = result.length() - i * 3;
            value.insert(position, ",");
        }
        
		// 숫자 -> 한글 변환한 값 출력
		System.out.printf("일금 %s\n", value);
		*/
		
		// 숫자 -> 한글 변환한 값 출력
		System.out.printf("일금 %s", result);
		
		scan.close();
	}
	
	private static String getNum (char c) {
		if (c == '1') {
			return "일";
		} else if (c == '2'){
			return "이";
		} else if (c == '3'){
			return "삼";
		} else if (c == '4'){
			return "사";
		} else if (c == '5'){
			return "오";
		} else if (c == '6'){
			return "육";
		} else if (c == '7'){
			return "칠";
		} else if (c == '8'){
			return "팔";
		} else if (c == '9'){
			return "구";
		}
		
		return "";
	}
	
	private static String getUnit (int i, int length, String n) {
		// 단위
		String[] unit1 = {"원", "만"};
		String[] unit2 = {"천", "", "십", "백"};
		String temp = "";
		
		if ((length - i) % 4 == 1) {
			temp += unit1[(length - i) / 5];
		}
		
		if (!n.equals("")) {
			temp += unit2[(length - i) % 4];
		}
		
		return temp;
	}
}


/*
		Scanner scan = new Scanner(System.in);
		
		// 단위
		String korean = "일이삼사오육칠팔구";
		String[] unit1 = {"원", "만"};
		String[] unit2 = {"천", "", "십", "백"};
		
		String result = "";
		String money; // 입력할 금액

		// 금액(원) 입력
		System.out.print("금액(원): ");
		money = scan.nextLine();
		
		// 숫자 10개 입력 및 변환
		for(int i = 0; i < money.length(); i++) {
			// 숫자 -> 한글 변환
			char c = money.charAt(i);
			
			for (int j = 0; j < 10; j++) {
				// 아스키코드 1(49)
				if (money.charAt(i) == 49 + j) {
					result += korean.charAt(j);
				}
			}
		}
		
		// 필요한 단위 개수 계산
        int numUnit = (result.length() - 1) / 3;
        StringBuilder value = new StringBuilder(result);
        
		// 한글 단위 삽입
        for (int i = 0; i < numUnit; i++) {
            int position = result.length() - i * 3;
            
            if (!value.equals("")) {
            	value.insert(position, unit2[(numUnit - i) % 4]);
            }
            if ((numUnit - i) % 4 == 1) {
            	value.insert(position, unit1[(numUnit - i) / 5]);
            }
            // value.insert(position, "백");
        }
        
		// 숫자 -> 한글 변환한 값 출력
		System.out.printf("일금 %s", value);
		
		scan.close();
	}
}


*/