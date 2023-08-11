package com.test.java;

import java.util.Calendar;
import java.util.Scanner;

public class Ex18_Operator {

	public static void main(String[] args) {
		
		// Ex18_Operator
		
		// 요구사항) 사용자로부터 문자 1개 입력하여 영소문자인지 검사
		// - 유효성 검사(Validation)
		
		// 1. 스캐너 생성하기
		// 2. 안내 메시지 출력
		// 3. 문자 입력
		// 4. 영어 소문자 검사(문자 코드값)
		// 5. 결과 출력
		
		
		// 1. 스캐너 생성하기
		Scanner scan = new Scanner(System.in);
		
		// 2. 안내 메시지 출력
		System.out.printf("문자: ");
		
		// 3. 문자 입력
		String input = scan.nextLine();
		
		// 4. 영어 소문자 검사(문자 코드값)
		int code = (int)input.charAt(0);
		
		System.out.println(code >= 97 && code <= 122);
		
		// 5. 결과 출력
		System.out.printf("입력한 문자 '%c'는 소문자가 %s\n", code, (code >= 97 && code <= 122) ? "맞습니다." : "아닙니다.");
				
		
		// 입력한 문자의 문자코드값이 필요
		// System.out.println((int)input); // 참조형 <-> 값형 (X)
		
		// "ABC" > 'A'
		System.out.println((int)input.charAt(0));
		
		// A(65) ~ Z(90)
		// a(97) ~ z(122)
		// 0(48) ~ 9(57)
		// 가(44032) 힣(55203) - 10000여자 정도 등록이 되어 있다.
		
		
		// 한글
		// 1. 완성형 한글: 가, 나, 갈, 곽, 갑.. (그림과 같다. 만들지 않으면 사용할 수 없다.)
		// 2. 조합형 한글: ㄱ, ㅏ, 초성, 중성.. 쓸 때마다 조합하는 한글 체계 (조합하므로 처리가 복잡하다.)
		
		// 모든 해외에서는 조합형 한글을 지원하지 않는다.
		// 지금은 조합형 한글은 존재하지 않으며, 완성형 한글만 사용한다.
		// 한글은 '가'부터 시작한다.

		
		System.out.println(code >= 97 && code <= 122);
		
		System.out.println(code >= (int)'a' && code <= (int)'z');
		
		// int >= char
		System.out.println(code >= 'a' && code <= 'z'); // 형변환을 안 해도 된다.
	}
}
