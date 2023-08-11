package com.test.question;

import java.util.Scanner;

public class Q088 {
	public static void main(String[] args) {
		/*
		● 요구사항
		금지어를 마스킹 처리 하시오.
		
		● 조건
		- 금지어
		- 바보
		- 멍청이
		
		● 입력 1
		입력: 너랑 안놀아 바보야!!
		
		● 출력 1
		너랑 안놀아 **야!!
		금지어를 1회 마스킹했습니다.

		● 입력 2
		입력: 잘 생각해봐 바보 멍청이
		
		● 출력 2
		잘 생각해봐 ** ***
		금지어를 2회 마스킹했습니다.
		*/

		Scanner scan = new Scanner(System.in);

		String content; // 입력할 문장
		String[] words = { "바보", "멍청이" }; // 금지어
		String[] replace = { "", "" }; // 마스킹 '*' 공간 초기화
		int useWords = 0; // 금지어 사용 횟수

		// 문장 입력
		System.out.print("입력: ");
		content = scan.nextLine();

		// 금지어 마스킹
		String newContent = content;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				// 금지어 글자수 만큼 '*' 입력
				replace[i] = replace[i] + "*";
			}

			// 금지어 사용 횟수 계산
			if (content.indexOf(words[i]) > -1) {
				useWords++;
			}
			
			// 금지어를 '*'로 마스킹
			newContent = newContent.replace(words[i], replace[i]);
		}

		// 금지어 결과 출력
		System.out.println(newContent);
		System.out.printf("금지어를 %d회 마스킹했습니다.", useWords);

		scan.close();
	}
}
